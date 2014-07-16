package main;

import java.net.UnknownHostException;

import rieger.ui.MessageHandler;
import view.ui.LoginGUI;
import view.ui.MainGUI;

import com.mongodb.MongoException;

import database.DataBase;
import database.DatabaseConnector;

/**
 * Startclass, which starts the Grundbuchverwaltung.
 * At first GUI the {@link LoginGUI} is loading.
 * @author sebastian
 *
 */
public class GrundbuchVerwaltung {

	private static DatabaseConnector connector;

	public static DataBase database;
	private static LoginGUI gui = new LoginGUI();

	/**
	 * Starts the {@link LoginGUI}.
	 * @return <code>true</code> after a successful login otherwise <code>false</code>.
	 */
	public static int login(){
		System.out.println("===Login GUI START==");
		return gui.startGui();
	}

	/**
	 * Check all Inputs if you can Login.
	 * @return <code>true</code> if access graduate or <code>false</code> if access denied.
	 * @throws Exception
	 * @throws MongoException
	 * @throws UnknownHostException
	 */
	public static boolean loginCorrect() {
		//TODO: Test Login
		try{
			database = new DataBase(gui.getHostField(),gui.getPortField(),gui.getDatabaseNameField(), gui.getUserNameField(), gui.getPasswordField());
		}
		// Mongo Exception IP not exist
		catch( final UnknownHostException e ){
			MessageHandler.showErrorMessage(null, "Please check IP and Port-Number!");
			return false;
		}

		// Correct IP and Port but no Server found
		catch( final MongoException e ){
			Throwable cause = e.getCause();
			if( cause instanceof java.net.ConnectException || cause instanceof java.net.NoRouteToHostException ){
				MessageHandler.showErrorMessage( null, cause.getMessage()
						+ "!\n\nPlease check IP and Port-Number!\nMake sure that Mongo-Server works correct!" );
				return false;
			}
			MessageHandler.showErrorMessage(null, e.getMessage() );
			return false;
		}
		// lost connection between start and closeConnection
		catch( Exception e ){
			MessageHandler.showErrorMessage(null, "Connection Lost!" );
			return false;
		}
		return true;
	}
	/**
	 * Main method which initialize the {@link LoginGUI} and the {@link MainGUI} if the Login is correct.
	 * @param args
	 * @throws Exception
	 * @throws MongoException
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws UnknownHostException, MongoException, Exception {

		int whichButtonIsPressedInLoginGUI;
		boolean loginCorrect;

		//wiederhole Login bis richtig!
		do{
			whichButtonIsPressedInLoginGUI = login();

			//brich ab wenn User das wünscht
			if(whichButtonIsPressedInLoginGUI==-1||whichButtonIsPressedInLoginGUI==1) {
				break;
			}
			loginCorrect = !loginCorrect();

			//prüfe ob zugang genehmigt mit loginCorrect()
			if(loginCorrect){
				//				MessageHandler.showErrorMessage(null, "Login nicht Korrekt");
			}else{
				database.loadData();
			}
		}while(loginCorrect);

		System.out.println("===Starte Main GUI===");
	}
	public MessageHandler messageHandler;



}
