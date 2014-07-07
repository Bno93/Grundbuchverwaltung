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
	
	//create JLabel
	JLabel hostLabel = new JLabel("Host Name:");
	JLabel portLabel = new JLabel("Port Nummer:");
	JLabel DatabaseNameLabel = new JLabel("Datenbank:");
	JLabel userNameLabel = new JLabel("User Name:");
	JLabel passwordLabel = new JLabel("Passwort:");
	
	//create Textfelder
	JTextField hostField = new JTextField();
	JTextField portField = new JTextField();
	JTextField DatabaseNameField = new JTextField();
	JTextField userNameField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	
	/**
	 * Create the Login-GUI for the User.
	 */
	public LoginGUI() {


		//add FirstClickEraser
//		FirstClickEraser fce = new FirstClickEraser();
//		
//		fce.addHint(hostField, "Hostname");
//		fce.addHint(portField, "Port");
//		fce.addHint(DatabaseNameField, "Datenbank");
//		fce.addHint(userNameField, "Username");
//		fce.addHint(passwordField, "Passwort");
		
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
	 * Show the Login-Window
	 * @return 0 if Login is pressed. <p>1 if Abbrechen is pressed</p> <p>-1 if the user close the Window</p>
	 */
	public int startGui(){
		return JOptionPane.showOptionDialog(null, this.logPanel, "Grundbuchverwaltung Login", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Login", "Abbrechen"}, "Login");
	}
	
	/**
	 * Get the last DatabaseName from {@link JTextField}
	 * @return DatabaseName
	 */
	public String getDatabaseNameField() {
		return DatabaseNameField.getText();
	}
	
	/**
	 * Get the last HostName from {@link JTextField}
	 * @return HostName
	 */
	public String getHostField() {
		return hostField.getText();
	}
	
	/**
	 * Get the last Password from {@link JTextField}
	 * @return password
	 */
	public char[] getPasswordField() {
		return passwordField.getPassword();
	}
	
	/**
	 * Get the last Port from {@link JTextField}
	 * @return Port
	 */
	public int getPortField() {
		//TODO: Test ob Parse möglich!!!!!
		return Integer.parseInt(portField.getText());
	}
	
	/**
	 * Get the last UserName from {@link JTextField}
	 * @return UserName
	 */
	public String getUserNameField() {
		return userNameField.getText();
	}
}
