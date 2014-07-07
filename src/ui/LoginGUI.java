package ui;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import rieger.ui.FirstClickEraser;
/**
 * Create a GUI for the Login.
 * @author da5254
 *
 */
public class LoginGUI {
	JPanel logPanel = new JPanel();
	/**
	 * Create the Login-GUI for the User.
	 */
	public LoginGUI() {

		//create JLabel
		JLabel hostLabel = new JLabel("Host Name:");
		JLabel portLabel = new JLabel("Port Nummer:");
		JLabel DatabaseNameLabel = new JLabel("Datenbank:");
		JLabel userNameLabel = new JLabel("User Name:");
		JLabel passwordLabel = new JLabel("Passwort:");

		//create Textfelder
		JTextField hostField = new JTextField();
		JTextField portField = new JTextField();
		JTextField DatabaseNameField = new JTextField("Datenbank");
		JTextField userNameField = new JTextField("UserName");
		JPasswordField passwordField = new JPasswordField("Passwort");

		//add FirstClickEraser
		FirstClickEraser.textFieldHint(hostField, "Hostname");
		FirstClickEraser.textFieldHint(portField, "Port");
		FirstClickEraser.textFieldHint(DatabaseNameField, "Datenbank");
		FirstClickEraser.textFieldHint(userNameField, "UserName");
		FirstClickEraser.textFieldHint(passwordField, "Passwort");

		//add Labels and Fields to JPanel
		this.logPanel.add(hostLabel);
		this.logPanel.add(hostField);
		this.logPanel.add(portLabel);
		this.logPanel.add(portField);
		this.logPanel.add(DatabaseNameLabel);
		this.logPanel.add(DatabaseNameField);
		this.logPanel.add(userNameLabel);
		this.logPanel.add(userNameField);
		this.logPanel.add(passwordLabel);
		this.logPanel.add(passwordField);

		this.logPanel.setLayout(new GridLayout(5, 2));

		this.logPanel.setBorder(BorderFactory.createEmptyBorder());

	}
	/**
	 *
	 * @return
	 */
	public int startGui(){
		return JOptionPane.showOptionDialog(null, this.logPanel, "Grundbuchverwaltung Login", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Login", "Abbrechen"}, "Login");
	}
}
