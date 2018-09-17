package GUI;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//green    new java.awt.Color(176, 210, 54)
//black    new java.awt.Color(233,232,232)
//cream	   new java.awt.Color(176, 210, 54)


public class Main {
	/**
	 * Global variables
	 */
//	public static String apiAddress = "http://localhost:3000/sb";
//	public static CloseableHttpClient httpAPIClient = HttpClients.createDefault();
//	
	/**
	 * These come from the login form class
	 */
	public static boolean usernameSelect = false;	//used to keep track of whether it was clicked or not
	public static boolean passwordSelect = false;	//used to keep track of whether it was clicked or not
	public static JTextField username = new JTextField();
	public static JPasswordField password = new JPasswordField();
	public static JTextField login = new JTextField();
	public static JTextField left0 = new JTextField();
	public static JPanel contentPane = new JPanel();
	
	
	/**
	 * These come from the user interface class
	 */
	public static int previousButtonInt = 0;
	public static JLabel expandLabel = new JLabel();
	public static JPanel sideBar = new JPanel();
	public static JLabel exitButton = new JLabel();
	public static JLabel exitButton2 = new JLabel();
	public static JLabel cardButtonSelect = new JLabel();
	public static JButton cardButton = new JButton();
	public static JButton cardButton2 = new JButton();
	public static JLabel proxyButtonSelect = new JLabel();
	public static JButton proxyButton = new JButton();
	public static JButton proxyButton2 = new JButton();
	public static JLabel accountButtonSelect = new JLabel();
	public static JButton accountButton = new JButton();
	public static JButton accountButton2 = new JButton();
	public static JLabel runButtonSelect = new JLabel();
	public static JButton runButton = new JButton();
	public static JButton runButton2 = new JButton();
	public static JLabel settingsButtonSelect = new JLabel();
	public static JButton settingsButton = new JButton();
	public static JButton settingsButton2 = new JButton();
	public static boolean[] buttonSelect = {true, false, false, false, false};
	
}
