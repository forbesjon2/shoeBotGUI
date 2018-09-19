package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import java.awt.ScrollPane;
import javax.swing.JTextField;

public class UserInterface extends JFrame{
	//private static JPanel contentPane;

	protected static JPanel contentPane = new JPanel();

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface frame = new UserInterface();
					frame.setBounds(60, 0, 1200, 770);
					frame.setLocationRelativeTo(null); 			//center it
					frame.setUndecorated(true);  				//no exit button or top interface
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserInterface() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(60, 0, 1200, 770);
		contentPane.setBackground(new java.awt.Color(233,232,232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		createSidebar(contentPane);
		

		
		//contentPane = Panels.runPanel(contentPane);
		// contentPane = Panels.cardPanel(contentPane);

		
	}

	public static void setRunPanel() {
		setNullPanel();
		contentPane = Panels.runPanel(contentPane);
		contentPane.validate();
		contentPane.repaint();
	}
	
	
	public static void setCardPanel() {
		setNullPanel();
		contentPane = Panels.cardPanel(contentPane);
		contentPane.validate();
		contentPane.repaint();
	}
	
	
	public static void setTwo() {
		setNullPanel();
		JLabel lblThisOne = new JLabel("this two aahh!");
		lblThisOne.setBounds(110, 178, 48, 14);
		//mainPanel.add(lblThisOne);
		contentPane.validate();
		contentPane.repaint();
	}
	
	
	/**
	 * Used to reset the panel to avoid overfitting when
	 * changing panels. Resets main panel to have no contents
	 */
	protected static void setNullPanel() {
		//contentPane.removeAll();
		for(Component comp :contentPane.getComponents()) {
			try {
				if(comp.getName().compareToIgnoreCase("sideBar")==0) {
					continue;
				}else {
					contentPane.remove(comp);
				}	
			}catch(Exception e) {
				contentPane.remove(comp);
			}
		}		
		contentPane.validate();
		contentPane.repaint();
	}
	
	
	
	
	
	
	
	/**
	 * Creates the blue sidebar
	 * @param contentPane
	 */
	private static void createSidebar(JPanel contentPane) {
		JPanel sideBar = Main.sideBar;
		//JPanel sideBar = new JPanel();
		sideBar.setBackground(new java.awt.Color(61,195,218));
		sideBar.setBounds(0, 0, 30, 770);
		//sideBar.setBounds(0, 0, 330, 745);
		sideBar.setName("sideBar");
		contentPane.add(sideBar);
		sideBar.setLayout(null);
		
		JLabel cardButtonSelect = Main.cardButtonSelect;
		// JLabel cardButtonSelect = new JLabel();
		cardButtonSelect.setName("cardButtonSelect");
		cardButtonSelect.addMouseListener(new MouseAction());
		cardButtonSelect.setOpaque(true);
		cardButtonSelect.setBackground(new java.awt.Color(0,0,0));
		cardButtonSelect.setForeground(new java.awt.Color(0,0,0));
		cardButtonSelect.setVerticalAlignment(SwingConstants.BOTTOM);
		cardButtonSelect.setBounds(0, 180, 3, 32);
		sideBar.add(cardButtonSelect);
		
		JButton cardButton = Main.cardButton;
		// JButton cardButton = new JButton();
		cardButton.setName("cardButton");
//		cardButton.setBounds(-45, 180, 200, 32);
		cardButton.setBounds(-10, 180, 50, 32);
		cardButton.setFocusPainted(false);
		cardButton.setBorderPainted(false);
		cardButton.setContentAreaFilled(false);
		cardButton.addMouseListener(new MouseAction());
		cardButton.setBackground(new java.awt.Color(61,195,218));
		cardButton.setText("C");
		cardButton.setFont(new Font("Roboto", Font.BOLD, 20));
//		cardButton.setText("Add");
//		cardButton.setFont(new Font("Roboto", Font.BOLD, 40));
		sideBar.add(cardButton);
		
		JButton cardButton2 = Main.cardButton2;
		//JButton cardButton2 = new JButton();
		cardButton2.setName("cardButton");
		cardButton2.setBounds(50, 181, 190, 32);
		cardButton2.setFocusPainted(false);
		cardButton2.setBorderPainted(false);
		cardButton2.setContentAreaFilled(false);
		cardButton2.addMouseListener(new MouseAction());
		cardButton2.setBackground(new java.awt.Color(61,195,218));
		cardButton2.setText("Cards");
		cardButton2.setFont(new Font("Roboto Lt", Font.PLAIN, 37));
		cardButton2.setVisible(false);
		sideBar.add(cardButton2);
		
		
		
		JLabel proxyButtonSelect = Main.proxyButtonSelect;
		// JLabel proxyButtonSelect = new JLabel();
		proxyButtonSelect.setName("proxyButtonSelect");
		proxyButtonSelect.addMouseListener(new MouseAction());
		proxyButtonSelect.setOpaque(true);
		proxyButtonSelect.setBackground(new java.awt.Color(61,195,218));
		proxyButtonSelect.setVerticalAlignment(SwingConstants.BOTTOM);
		proxyButtonSelect.setBounds(0, 230, 3, 32);
		sideBar.add(proxyButtonSelect);
		
		// JButton proxyButton = new JButton();
		JButton proxyButton = Main.proxyButton;
		proxyButton.setName("proxyButton");
		
		proxyButton.setBounds(-10, 230, 50, 32);
		//proxyButton.setBounds(-30, 228, 200, 32);
		proxyButton.setFocusPainted(false);
		proxyButton.setBorderPainted(false);
		proxyButton.setContentAreaFilled(false);
		proxyButton.addMouseListener(new MouseAction());
		proxyButton.setBackground(new java.awt.Color(61,195,218));
		//proxyButton.setText("Configure");
		proxyButton.setText("P");
		// small P
		proxyButton.setFont(new Font("Roboto Lt", Font.PLAIN, 20));
		//proxyButton.setFont(new Font("Roboto", Font.BOLD, 28));
		sideBar.add(proxyButton);
		
		// JButton proxyButton2 = new JButton();
		JButton proxyButton2 = Main.proxyButton2;
		proxyButton2.setName("proxyButton");
		proxyButton2.setBounds(80, 231, 190, 32);
		proxyButton2.setFocusPainted(false);
		proxyButton2.setBorderPainted(false);
		proxyButton2.setContentAreaFilled(false);
		proxyButton2.addMouseListener(new MouseAction());
		proxyButton2.setBackground(new java.awt.Color(61,195,218));
		proxyButton2.setText("Proxies");
		proxyButton2.setFont(new Font("Roboto Lt", Font.PLAIN, 21));
		proxyButton2.setVisible(false);
		sideBar.add(proxyButton2);
		
		
		
		JLabel accountButtonSelect = Main.accountButtonSelect;
		// JLabel accountButtonSelect = new JLabel();
		accountButtonSelect.setName("accountButtonSelect");
		accountButtonSelect.addMouseListener(new MouseAction());
		accountButtonSelect.setOpaque(true);
		accountButtonSelect.setBackground(new java.awt.Color(61,195,218));
		accountButtonSelect.setVerticalAlignment(SwingConstants.BOTTOM);
		accountButtonSelect.setBounds(0, 280, 3, 32);
		sideBar.add(accountButtonSelect);
		
		JButton accountButton2 = Main.accountButton2;
		accountButton2.setName("accountButton");
		accountButton2.addMouseListener(new MouseAction());
		accountButton2.setBounds(50, 273, 190, 48);
		accountButton2.setFocusPainted(false);
		accountButton2.setBorderPainted(false);
		accountButton2.setContentAreaFilled(false);
		accountButton2.setBackground(new java.awt.Color(61,195,218));
		accountButton2.setText("Accounts");
		accountButton2.setFont(new Font("Roboto Lt", Font.PLAIN, 21));
		accountButton2.setVisible(false);
		sideBar.add(accountButton2);
		
		
		// JLabel runButtonSelect = new JLabel();
		JLabel runButtonSelect = Main.runButtonSelect;
		runButtonSelect.setName("runButtonSelect");
		runButtonSelect.addMouseListener(new MouseAction());
		
		JButton accountButton = Main.accountButton;
		// JButton accountButton = new JButton();
		accountButton.setBounds(-10, 273, 50, 48);
		accountButton.setName("accountButton");
		accountButton.addMouseListener(new MouseAction());
		accountButton.setFocusPainted(false);
		accountButton.setBorderPainted(false);
		accountButton.setContentAreaFilled(false);
		accountButton.setBackground(new java.awt.Color(61,195,218));
		//accountButton.setFont(new Font("Roboto", Font.BOLD, 28));
		//accountButton.setText("Create");
		accountButton.setText("A");
		accountButton.setFont(new Font("Roboto Lt", Font.PLAIN, 20));
		sideBar.add(accountButton);
		runButtonSelect.setOpaque(true);
		runButtonSelect.setBackground(new java.awt.Color(61,195,218));
		runButtonSelect.setVerticalAlignment(SwingConstants.BOTTOM);
		runButtonSelect.setBounds(0, 330, 3, 32);
		sideBar.add(runButtonSelect);
		
		JButton runButton = Main.runButton;
		// JButton runButton = new JButton();
		runButton.setName("runButton");
		runButton.addMouseListener(new MouseAction());
		runButton.setBounds(-10, 322, 50, 48);
		runButton.setFocusPainted(false);
		runButton.setBorderPainted(false);
		runButton.setContentAreaFilled(false);
		runButton.setBackground(new java.awt.Color(61,195,218));
		//runButton.setText("Run");
		runButton.setText("R");
		// runButton.setFont(new Font("Roboto", Font.BOLD, 28));
		runButton.setFont(new Font("Roboto Lt", Font.PLAIN, 20));
		sideBar.add(runButton);
		
		JButton runButton2 = Main.runButton2;
		runButton2.setName("runButton");
		runButton2.addMouseListener(new MouseAction());
		runButton2.setBounds(36, 322, 200, 48);
		runButton2.setFocusPainted(false);
		runButton2.setBorderPainted(false);
		runButton2.setContentAreaFilled(false);
		runButton2.setBackground(new java.awt.Color(61,195,218));
		runButton2.setText("Configurations");
		runButton2.setFont(new Font("Roboto Lt", Font.PLAIN, 21));
		sideBar.add(runButton2);
		
		
		
		JLabel settingsButtonSelect = Main.settingsButtonSelect;
		//JLabel settingsButtonSelect = new JLabel();
		settingsButtonSelect.setName("settingsButtonSelect");
		settingsButtonSelect.addMouseListener(new MouseAction());
		settingsButtonSelect.setOpaque(true);
		settingsButtonSelect.setBackground(new java.awt.Color(61,195,218));
		settingsButtonSelect.setVerticalAlignment(SwingConstants.BOTTOM);
		settingsButtonSelect.setBounds(0, 380, 3, 32);
		sideBar.add(settingsButtonSelect);
		
		JButton settingsButton = Main.settingsButton;
		//JButton settingsButton = new JButton();
		settingsButton.setName("settingsButton");
		settingsButton.addMouseListener(new MouseAction());
		settingsButton.setBounds(-10, 373, 50, 48);
		settingsButton.setFocusPainted(false);
		settingsButton.setBorderPainted(false);
		settingsButton.setContentAreaFilled(false);
		settingsButton.setBackground(new java.awt.Color(61,195,218));
		// settingsButton.setText("Account");
		settingsButton.setText("S");
		// settingsButton.setFont(new Font("Roboto", Font.BOLD, 28));
		settingsButton.setFont(new Font("Roboto Lt", Font.PLAIN, 20));
		sideBar.add(settingsButton);
		
		JButton settingsButton2 = Main.settingsButton2;
		settingsButton2.setName("settingsButton");
		settingsButton2.addMouseListener(new MouseAction());
		settingsButton2.setBounds(95, 375, 130, 48);
		settingsButton2.setFocusPainted(false);
		settingsButton2.setBorderPainted(false);
		settingsButton2.setContentAreaFilled(false);
		settingsButton2.setBackground(new java.awt.Color(61,195,218));
		settingsButton2.setText("Settings");
		settingsButton2.setFont(new Font("Roboto Lt", Font.PLAIN, 21));
		sideBar.add(settingsButton2);
		
		JLabel exitButton = Main.exitButton;
		exitButton.setText("E");
		exitButton.setName("exitButton");
		exitButton.addMouseListener(new MouseAction());
		exitButton.setBackground(new java.awt.Color(61,195,218));
		exitButton.setHorizontalAlignment(SwingConstants.CENTER);
		exitButton.setFont(new Font("Roboto", Font.PLAIN, 20));
		exitButton.setBounds(-10, 10, 50, 40);
		sideBar.add(exitButton);

		JLabel exitButton2 = Main.exitButton2;
		exitButton2.setText("Program");
		exitButton2.setName("exitButton");
		exitButton2.addMouseListener(new MouseAction());
		exitButton2.setBackground(new java.awt.Color(61,195,218));
		exitButton2.setHorizontalAlignment(SwingConstants.CENTER);
		exitButton2.setFont(new Font("Roboto Lt", Font.PLAIN, 21));
		exitButton2.setBounds(138, 36, 100, 40);
		exitButton2.setVisible(false);
		sideBar.add(exitButton2);
		
		JLabel expandLabel = Main.expandLabel;
		expandLabel.setBounds(0, 80, 330, 18);
		expandLabel.setName("expandLabel");
		MatteBorder topLine = BorderFactory.createMatteBorder(4, 0, 4, 0, Color.BLACK);
		MatteBorder bottomLine = BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(176, 210, 54));
		CompoundBorder border = BorderFactory.createCompoundBorder(topLine, bottomLine);
		expandLabel.setBorder(topLine);
		expandLabel.addMouseListener(new MouseAction());
		sideBar.add(expandLabel);
	}
}
