package GUI;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//green    new java.awt.Color(176, 210, 54)
//cream	   new java.awt.Color(233,232,232)
//blue	   new java.awt.Color(61,195,218)
//black	   new java.awt.Color(51, 51, 51)


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
	
	
	/**
	 * These come from the run configuration panel
	 */
	public static JTable runConfigTable = new JTable();
	public static JLabel createRunConfigLabel = new JLabel();
	public static JTable tableRunPanel = new JTable();
	public static DefaultTableModel tableModelRunPanel = new DefaultTableModel();
	public static JTextField rURLText = new JTextField();
	public static JTextField numEntriesText = new JTextField();
	public static JTextField sizeSecondaryText = new JTextField();
	public static JTextField sizePrimaryText = new JTextField();
	public static JTextField numThreadsText = new JTextField();
	public static JTextField cardNumberText = new JTextField();
	public static JTextField monthText = new JTextField();
	public static JTextField yearText = new JTextField();
	public static JTextField cvvText = new JTextField();
	public static JLabel runLabel = new JLabel();
	public static JLabel lblConfigurations = new JLabel();
	public static JLabel lblTitle = new JLabel();
	public static JLabel lblDescription = new JLabel();
	public static JLabel labelNumAccountsAvailable = new JLabel();
	public static JLabel labelNumMaxEntries = new JLabel();
	public static JLabel labelNumAvailableProxies = new JLabel();
	
	
	/**
	 * These come from the card panel
	 */
	public static JTextField numCardsText = new JTextField();
	public static JTextField spendLimitText = new JTextField();
	public static JTextField accessTokenCreateCardText = new JTextField();
	public static JTextField accessTokenLoadCardText = new JTextField();
	public static JScrollPane scrollPaneCreateNewCards = new JScrollPane();
	public static JScrollPane scrollPaneLoadExistingCards = new JScrollPane();
	
	
	/**
	 * These come from the proxy panel
	 */
	public static JLabel lblscrapesTheExisting = new JLabel();
	public static JLabel lblTheLongerOf = new JLabel();
	public static JLabel optimizeExistingProxiesContent = new JLabel();
	public static JLabel lblOptimizeExistingProxy = new JLabel();
	public static JLabel lblCheckForNew = new JLabel();
	public static JLabel labelRunCompleteScanTitleButton = new JLabel();
	public static JLabel lblHundredthsProxy = new JLabel();
	public static JLabel lblTenthsProxy = new JLabel();
	public static JLabel lblOnesProxy = new JLabel();
	public static JPanel darkProxyPanel = new JPanel();
	
}






