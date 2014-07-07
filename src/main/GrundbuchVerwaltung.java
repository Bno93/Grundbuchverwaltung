package main;

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
	public static boolean login(){
		System.out.println("===Login GUI START==");
		LoginGUI gui = new LoginGUI();
		gui.startGui();
		return false;
	}

	/**
	 * Main method which initialize the {@link LoginGUI} and the {@link MainGUI}.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("===Start Grundbuchverwaltung");
		do{
			System.out.println("===Login not successful===");
		}while(login()==false);

	}

}
