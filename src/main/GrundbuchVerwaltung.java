package main;

import rieger.ui.MessageHandler;
import ui.LoginGUI;
import ui.MainGUI;

/**
 * Startclass, which starts the Grundbuchverwaltung.
 * At first GUI the {@link LoginGUI} is loading.
 * @author sebastian
 *
 */
public class GrundbuchVerwaltung {


	/**
	 * Starts the {@link LoginGUI}.
	 * @return <code>true</code> after a successful login otherwise <code>false</code>.
	 */
	public static int login(){
		System.out.println("===Login GUI START==");
		LoginGUI gui = new LoginGUI();
		return gui.startGui();
	}

	/**
	 * Check all Inputs if you can Login.
	 * @return <code>true</code> if access graduate or <code>false</code> if access denied.
	 */
	public static boolean loginCorrect(){
		//TODO: Test Login
		System.out.println("Login muss noch getestet werden");
		return false;
	}

	/**
	 * Main method which initialize the {@link LoginGUI} and the {@link MainGUI} if the Login is correct.
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("===Start Grundbuchverwaltung");

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
				MessageHandler.showErrorMessage(null, "Login nicht Korrekt");
			}else{
				System.out.println("===Starte Main GUI===");
			}
		}while(loginCorrect);

	}

}
