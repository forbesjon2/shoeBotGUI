package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Panels extends UserInterface{
	
	
	
	
	/**
	 * Creates the proxy panel TODO add logic
	 * @param contentPane	The content pane from userInterface
	 * @return contentPane	Returns the same contentPane with elements
	 */
	public static JPanel proxyPanel(JPanel contentPane) {
		//___________Dark proxy panel__________
		JPanel darkProxyPanel = Main.darkProxyPanel;
		darkProxyPanel.setBackground(new java.awt.Color(51, 51, 51));
		darkProxyPanel.setBounds(613, 0, 585, 745);
		contentPane.add(darkProxyPanel);
		darkProxyPanel.setLayout(null);
		
		
		
		//_____________Text to change/add listeners__________________
		
		JLabel lblOnesProxy = Main.lblOnesProxy;
		lblOnesProxy.setText("2");
		lblOnesProxy.setForeground(Color.WHITE);
		lblOnesProxy.setFont(new Font("Roboto Lt", Font.PLAIN, 200));
		lblOnesProxy.setBounds(30, 22, 140, 167);
		darkProxyPanel.add(lblOnesProxy);
		
		JLabel lblTenthsProxy = Main.lblTenthsProxy;
		lblTenthsProxy.setText("1");
		lblTenthsProxy.setFont(new Font("Roboto Lt", Font.PLAIN, 200));
		lblTenthsProxy.setBounds(515, 20, 140, 167);
		contentPane.add(lblTenthsProxy);
		
		JLabel lblHundredthsProxy = Main.lblHundredthsProxy;
		lblHundredthsProxy.setText("");
		lblHundredthsProxy.setFont(new Font("Roboto Lt", Font.PLAIN, 200));
		lblHundredthsProxy.setBounds(415, 20, 140, 167);
		contentPane.add(lblHundredthsProxy);
		
		
		JLabel labelRunCompleteScanTitleButton = Main.labelRunCompleteScanTitleButton;
		labelRunCompleteScanTitleButton.setText("Run complete scan");
		labelRunCompleteScanTitleButton.setFont(new Font("Roboto Lt", Font.PLAIN, 17));
		labelRunCompleteScanTitleButton.setBounds(390, 375, 177, 32);
		contentPane.add(labelRunCompleteScanTitleButton);
		
		JLabel lblCheckForNew = Main.lblCheckForNew;
		lblCheckForNew.setText("Check for new proxies");
		lblCheckForNew.setFont(new Font("Roboto", Font.BOLD, 17));
		lblCheckForNew.setBounds(390, 500, 202, 32);
		contentPane.add(lblCheckForNew);
		
		JLabel lblOptimizeExistingProxy = Main.lblOptimizeExistingProxy;
		lblOptimizeExistingProxy.setText("Optimize proxy list");
		lblOptimizeExistingProxy.setFont(new Font("Roboto Lt", Font.PLAIN, 17));
		lblOptimizeExistingProxy.setBounds(390, 625, 177, 32);
		contentPane.add(lblOptimizeExistingProxy);
		
		JLabel optimizeExistingProxiesContent = Main.optimizeExistingProxiesContent;
		optimizeExistingProxiesContent.setText("<html>Scrapes the existing proxy sites for its exist-<br>ing proxies and uploads those to the data-<br>base if they dont already exist. Use this pro<br>cess sparingly as it is only needed about<br>once every week or so");
		optimizeExistingProxiesContent.setForeground(Color.WHITE);
		optimizeExistingProxiesContent.setFont(new Font("Rubik Light", Font.ITALIC, 13));
		optimizeExistingProxiesContent.setBounds(10, 597, 340, 85);
		darkProxyPanel.add(optimizeExistingProxiesContent);
		
		JLabel lblTheLongerOf = Main.lblTheLongerOf;
		lblTheLongerOf.setText("<html> The longer of the other two processes, this both<br>checks for new and optimizes existing proxies .");
		lblTheLongerOf.setForeground(Color.WHITE);
		lblTheLongerOf.setFont(new Font("Rubik Light", Font.ITALIC, 13));
		lblTheLongerOf.setBounds(10, 361, 340, 61);
		darkProxyPanel.add(lblTheLongerOf);
		
		JLabel lblscrapesTheExisting = Main.lblscrapesTheExisting;
		lblscrapesTheExisting.setText("<html>Scrapes the existing proxy sites for its exist-<br>ing proxies and uploads those to the data-<br>base if they dont already exist. Use this pro<br>cess sparingly as it is only needed about<br>once every week or so");
		lblscrapesTheExisting.setForeground(Color.WHITE);
		lblscrapesTheExisting.setFont(new Font("Rubik", Font.BOLD | Font.ITALIC, 13));
		lblscrapesTheExisting.setBounds(10, 473, 453, 85);
		darkProxyPanel.add(lblscrapesTheExisting);
		
		
		
		//____________Random text & labels to ignore__________________
		JLabel randomTextProxyDark = new JLabel("<html> Its more ideal to have<br>before your run the scri<br>number tells you, on a<br>connect to each of the<br>ning a full proxy scan s<br>proxy sites and upload<br>That scan is followed b<br>that tests the connect<br>that exist on the datab<br>quickest ones to be sto");
		randomTextProxyDark.setFont(new Font("Rubik Light", Font.ITALIC, 13));
		randomTextProxyDark.setHorizontalAlignment(SwingConstants.RIGHT);
		randomTextProxyDark.setBounds(340, 5, 245, 180);
		darkProxyPanel.add(randomTextProxyDark);
		randomTextProxyDark.setForeground(Color.WHITE);
		
		JLabel lblProxiesDC = new JLabel("Proxies");
		lblProxiesDC.setForeground(Color.WHITE);
		lblProxiesDC.setFont(new Font("Roboto Th", Font.PLAIN, 50));
		lblProxiesDC.setBounds(10, 200, 200, 45);
		darkProxyPanel.add(lblProxiesDC);
		
		JLabel randomTextProxyLight = new JLabel("<html> more than enough proxies<br>pt. The average latency<br>verage, how fast it takes to<br>se available proxies. Run-<br>crapes the available free<br>s them to the database.<br>y an optimization algorithm<br>ion speed to the proxies<br>ase and sorts out the<br>red locally in this session.");
		randomTextProxyLight.setFont(new Font("Rubik Light", Font.ITALIC, 13));
		randomTextProxyLight.setBounds(30, 5, 220, 180);
		contentPane.add(randomTextProxyLight);
		
		JLabel lblAvailableproxyDC = new JLabel("Available");
		lblAvailableproxyDC.setFont(new Font("Roboto", Font.BOLD, 50));
		lblAvailableproxyDC.setBounds(400, 200, 265, 45);
		contentPane.add(lblAvailableproxyDC);
		
		return contentPane;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Creates the card panel TODO add logic
	 * 
	 * @param contentPane
	 * @return contentPane
	 */
	public static JPanel cardPanel(JPanel contentPane) {		
		//___________Text fields (parameters)_________
		JTextField numCardsText = Main.numCardsText;
		numCardsText.setBackground(new java.awt.Color(233,232,232));
		numCardsText.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		numCardsText.setFont(new Font("Rubik Light", Font.ITALIC, 10));
		numCardsText.setBounds(90, 145, 80, 20);
		contentPane.add(numCardsText);
		numCardsText.setColumns(10);
		
		JTextField spendLimitText = Main.spendLimitText;
		spendLimitText.setFont(new Font("Rubik Light", Font.ITALIC, 10));
		spendLimitText.setColumns(10);
		spendLimitText.setBackground(new java.awt.Color(233,232,232));
		spendLimitText.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		spendLimitText.setBounds(90, 215, 58, 20);
		contentPane.add(spendLimitText);
		
		JTextField accessTokenCreateCardText = Main.accessTokenCreateCardText;
		accessTokenCreateCardText.setFont(new Font("Rubik Light", Font.ITALIC, 10));
		accessTokenCreateCardText.setColumns(10);
		accessTokenCreateCardText.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		accessTokenCreateCardText.setBackground(new java.awt.Color(233,232,232));
		accessTokenCreateCardText.setBounds(90, 285, 120, 20);
		contentPane.add(accessTokenCreateCardText);
		
		JTextField accessTokenLoadCardText = Main.accessTokenLoadCardText;
		accessTokenLoadCardText.setFont(new Font("Rubik Light", Font.ITALIC, 10));
		accessTokenLoadCardText.setColumns(10);
		accessTokenLoadCardText.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		accessTokenLoadCardText.setBackground(new Color(233, 232, 232));
		accessTokenLoadCardText.setBounds(760, 284, 120, 20);
		contentPane.add(accessTokenLoadCardText);
		
		
		
		
		//___________Labels functioning as buttons__________
		JLabel labelLoadOnlyUnusedCards = new JLabel("Load only unused cards");
		labelLoadOnlyUnusedCards.setFont(new Font("Rubik", Font.BOLD, 17));
		labelLoadOnlyUnusedCards.setBounds(760, 190, 256, 20);
		contentPane.add(labelLoadOnlyUnusedCards);
		
		JLabel lblLoadOnlyUused = new JLabel("Load only used cards");
		lblLoadOnlyUused.setFont(new Font("Rubik", Font.ITALIC, 17));
		lblLoadOnlyUused.setBounds(760, 125, 256, 20);
		contentPane.add(lblLoadOnlyUused);
		
		JLabel labelCreateNewCardButton = new JLabel("Create");
		labelCreateNewCardButton.setFont(new Font("Rubik", Font.ITALIC, 17));
		labelCreateNewCardButton.setBackground(new java.awt.Color(61,195,218));
		labelCreateNewCardButton.setOpaque(true);
		labelCreateNewCardButton.setHorizontalAlignment(SwingConstants.CENTER);
		labelCreateNewCardButton.setBounds(90, 320, 353, 30);
		contentPane.add(labelCreateNewCardButton);
		
		JLabel labelLoadCardButton = new JLabel("Load");
		labelLoadCardButton.setOpaque(true);
		labelLoadCardButton.setHorizontalAlignment(SwingConstants.CENTER);
		labelLoadCardButton.setFont(new Font("Rubik", Font.ITALIC, 17));
		labelLoadCardButton.setBackground(new java.awt.Color(61,195,218));
		labelLoadCardButton.setBounds(760, 320, 350, 30);
		contentPane.add(labelLoadCardButton);
		
		
		
		
		
		//______________Scroll panes_______________
		JScrollPane scrollPaneCreateNewCards = Main.scrollPaneCreateNewCards;
		scrollPaneCreateNewCards.setBounds(90, 450, 353, 280);
		contentPane.add(scrollPaneCreateNewCards);
		DefaultTableModel scrollPaneCNC = new DefaultTableModel();
		scrollPaneCNC.addColumn("");
		scrollPaneCNC.addColumn("");
		scrollPaneCNC.addColumn("");
		scrollPaneCNC.addRow(new Object[] {"row 1", "row 2", "row 3"});
		scrollPaneCNC.addRow(new Object[] {"row 1", "row 2", "row 3"});
		scrollPaneCNC.addRow(new Object[] {"row 1", "row 2", "row 3"});
		Tables.tableThreeColumns(scrollPaneCreateNewCards, scrollPaneCNC);
		
		//instantiate the scroll pane
		JScrollPane scrollPaneLoadExistingCards = Main.scrollPaneLoadExistingCards;
		scrollPaneLoadExistingCards.setBounds(760, 450, 350, 280);
		contentPane.add(scrollPaneLoadExistingCards);
		//create the table model
		DefaultTableModel scrollPaneLEX = new DefaultTableModel();
		scrollPaneLEX.addColumn("");
		scrollPaneLEX.addColumn("");
		scrollPaneLEX.addColumn("");
		scrollPaneLEX.addRow(new Object[] {"row 1", "row 2", "row 3"});
		scrollPaneLEX.addRow(new Object[] {"row 1", "row 2", "row 3"});
		scrollPaneLEX.addRow(new Object[] {"row 1", "row 2", "row 3"});
		Tables.tableThreeColumns(scrollPaneLoadExistingCards, scrollPaneLEX);

		
		
		
		
		
		//_____________Labels and random text (Ignore)_____________
		JLabel labelAccessTokenLoadCard = new JLabel("Access Token");
		labelAccessTokenLoadCard.setFont(new Font("Rubik", Font.ITALIC, 17));
		labelAccessTokenLoadCard.setBounds(760, 260, 130, 20);
		contentPane.add(labelAccessTokenLoadCard);
		
		JLabel lblCreate = new JLabel("Create");
		lblCreate.setFont(new Font("Roboto", Font.BOLD, 64));
		lblCreate.setBounds(80, 35, 200, 65);
		contentPane.add(lblCreate);
		
		JLabel lblNew = new JLabel("New");
		lblNew.setFont(new Font("Roboto Th", Font.PLAIN, 52));
		lblNew.setBounds(280, 42, 120, 60);
		contentPane.add(lblNew);
		
		JLabel lblNumberOfCards = new JLabel("Number of cards");
		lblNumberOfCards.setFont(new Font("Rubik", Font.ITALIC, 17));
		lblNumberOfCards.setBounds(90, 120, 160, 20);
		contentPane.add(lblNumberOfCards);
		
		JLabel lblSpendLimit = new JLabel("Spend limit");
		lblSpendLimit.setFont(new Font("Rubik", Font.ITALIC, 17));
		lblSpendLimit.setBounds(90, 190, 120, 20);
		contentPane.add(lblSpendLimit);
		
		JLabel lblAccessToken = new JLabel("Access Token");
		lblAccessToken.setFont(new Font("Rubik", Font.ITALIC, 17));
		lblAccessToken.setBounds(90, 260, 130, 20);
		contentPane.add(lblAccessToken);
		
		JLabel labelLoadCard = new JLabel("Load");
		labelLoadCard.setFont(new Font("Roboto", Font.BOLD, 64));
		labelLoadCard.setBounds(760, 35, 200, 65);
		contentPane.add(labelLoadCard);
		
		JLabel lblExistingCard = new JLabel("Existing");
		lblExistingCard.setFont(new Font("Roboto Th", Font.PLAIN, 52));
		lblExistingCard.setBounds(913, 40, 200, 60);
		contentPane.add(lblExistingCard);
		
		JLabel labelCardID = new JLabel("card ID");
		labelCardID.setFont(new Font("Rubik", Font.ITALIC, 18));
		labelCardID.setBounds(120, 428, 100, 20);
		contentPane.add(labelCardID);
		
		JLabel randomTextCreateNew = new JLabel("<html> Cards will show up in the table below when you create\r\nnew credit cards. Be sure to enter the amount you want \r\nto create and that the total amount does not exceed\r\nthe amount you have in your connected bank account");
		randomTextCreateNew.setFont(new Font("Rubik Light", Font.ITALIC, 10));
		randomTextCreateNew.setBounds(90, 361, 353, 51);
		contentPane.add(randomTextCreateNew);
		
		JLabel labelSpendLimit = new JLabel("spend limit");
		labelSpendLimit.setFont(new Font("Rubik", Font.ITALIC, 17));
		labelSpendLimit.setBounds(220, 428, 130, 20);
		contentPane.add(labelSpendLimit);
		
		JLabel labelStatus = new JLabel("status");
		labelStatus.setFont(new Font("Rubik", Font.ITALIC, 18));
		labelStatus.setBounds(355, 428, 100, 20);
		contentPane.add(labelStatus);
		
		JLabel randomTextCreateNew2 = new JLabel("<html> Cards will show up in the table below when you create\r\nnew credit cards. Be sure to enter the amount you want \r\nto create and that the total amount does not exceed\r\nthe amount you have in your connected bank account");
		randomTextCreateNew2.setFont(new Font("Rubik Light", Font.ITALIC, 10));
		randomTextCreateNew2.setBounds(760, 361, 353, 51);
		contentPane.add(randomTextCreateNew2);
		
		JLabel labelCardID2 = new JLabel("card ID");
		labelCardID2.setFont(new Font("Rubik", Font.ITALIC, 18));
		labelCardID2.setBounds(790, 428, 100, 20);
		contentPane.add(labelCardID2);
		
		JLabel labelSpendLimit2 = new JLabel("spend limit");
		labelSpendLimit2.setFont(new Font("Rubik", Font.ITALIC, 17));
		labelSpendLimit2.setBounds(890, 428, 130, 20);
		contentPane.add(labelSpendLimit2);
		
		JLabel labelStatus2 = new JLabel("status");
		labelStatus2.setFont(new Font("Rubik", Font.ITALIC, 18));
		labelStatus2.setBounds(1025, 428, 100, 20);
		contentPane.add(labelStatus2);
		
		
		return contentPane;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Creates the run panel, TODO add logic
	 * 
	 * @param contentPane		The content pane to be changed
	 * @return contentPane		same content pane added into this method
	 * but with the respectable elements
	 */
	public static JPanel runPanel(JPanel contentPane) {
		//_______CLICK TO RUN_________
		JLabel runLabel = Main.runLabel;
		runLabel.setText("Run");
		runLabel.setFont(new Font("Roboto", Font.BOLD, 64));
		runLabel.setHorizontalAlignment(SwingConstants.LEFT);
		runLabel.setBounds(75, 25, 130, 65);
		contentPane.add(runLabel);
		
		JLabel lblConfigurations = Main.lblConfigurations;
		lblConfigurations.setText("Configurations");
		//lblConfigurations.setName("aah");
		lblConfigurations.setHorizontalAlignment(SwingConstants.LEFT);
		lblConfigurations.setFont(new Font("Roboto Th", Font.PLAIN, 52));
		lblConfigurations.setBounds(198, 27, 360, 65);
		contentPane.add(lblConfigurations);
		
		JLabel lblTitle =Main.lblTitle;
		lblTitle.setText("Title");
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setFont(new Font("Rubik", Font.ITALIC, 30));
		lblTitle.setBounds(70, 130, 80, 40);
		contentPane.add(lblTitle);
		
		JLabel lblDescription = Main.lblDescription;
		lblDescription.setText("Description");
		lblDescription.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescription.setFont(new Font("Rubik", Font.ITALIC, 30));
		lblDescription.setBounds(200, 130, 180, 40);
		contentPane.add(lblDescription);
		
		//create scrollPane to insert the table into
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new java.awt.Color(233,232,232));
		scrollPane.setBorder(null);
		
		
		scrollPane.setBounds(70, 175, 470, 450);
		DefaultTableModel tableModel = new DefaultTableModel();
		//change this information to add it to the table
		tableModel.addColumn("");
		tableModel.addColumn("");
		tableModel.addRow(new Object[] {"<html>Nike Drawing<br> noGUI", "<html>HTML driver based, non-gui run configuration for <br>entering into nike drawings"});
		tableModel.addRow(new Object[] {"<html>Nike Purchase<br> noGUI", "<html>HTML driver based, non-gui run configuration for <br>purchasing nike SNKRS"});
		
		JTable tableRunPanel = Main.tableRunPanel;
		tableRunPanel = Tables.tableTwoColumns(scrollPane, tableModel);
		tableRunPanel.setVisible(true);
		scrollPane.setBackground(new java.awt.Color(233,232,232));
		scrollPane.setForeground(new java.awt.Color(233,232,232));
		scrollPane.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(233,232,232)));
		scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(0,0));
		
		scrollPane.setViewportView(tableRunPanel);
		scrollPane.setVisible(true);
		contentPane.add(scrollPane);
		
		JLabel createRunConfigLabel = Main.createRunConfigLabel;
		createRunConfigLabel.setOpaque(true);
		createRunConfigLabel.setBackground(Color.BLACK);
		createRunConfigLabel.setHorizontalAlignment(SwingConstants.CENTER);
		createRunConfigLabel.setBounds(35, 690, 1065, 35);
		createRunConfigLabel.setForeground(Color.WHITE);
		createRunConfigLabel.setText("create");
		createRunConfigLabel.setFont(new Font("Roboto", Font.PLAIN, 17));
		createRunConfigLabel.setName("createRunConfigLabel");
		createRunConfigLabel.addMouseListener(new MouseAction());
		createRunConfigLabel.setVisible(true);
		contentPane.add(createRunConfigLabel);
		
		JLabel lblR = new JLabel("R");
		lblR.setHorizontalAlignment(SwingConstants.LEFT);
		lblR.setFont(new Font("Roboto", Font.BOLD, 64));
		lblR.setBounds(610, 25, 60, 65);
		contentPane.add(lblR);
		
		JLabel lblIii = new JLabel("III");
		lblIii.setHorizontalAlignment(SwingConstants.LEFT);
		lblIii.setFont(new Font("Roboto Th", Font.PLAIN, 52));
		lblIii.setBounds(665, 27, 70, 65);
		contentPane.add(lblIii);
		
		JLabel labelRelease = new JLabel("Release");
		labelRelease.setHorizontalAlignment(SwingConstants.LEFT);
		labelRelease.setFont(new Font("Roboto", Font.BOLD, 28));
		labelRelease.setBounds(652, 125, 100, 40);
		contentPane.add(labelRelease);
		
		JLabel lblUrl = new JLabel("URL");
		lblUrl.setHorizontalAlignment(SwingConstants.LEFT);
		lblUrl.setFont(new Font("Roboto Th", Font.PLAIN, 21));
		lblUrl.setBounds(755, 135, 70, 25);
		contentPane.add(lblUrl);
		
		JLabel labelNumber = new JLabel("Number");
		labelNumber.setHorizontalAlignment(SwingConstants.LEFT);
		labelNumber.setFont(new Font("Roboto", Font.BOLD, 28));
		labelNumber.setBounds(912, 125, 120, 40);
		contentPane.add(labelNumber);
		
		JLabel labelOfEntries = new JLabel("of entries");
		labelOfEntries.setHorizontalAlignment(SwingConstants.LEFT);
		labelOfEntries.setFont(new Font("Roboto Th", Font.PLAIN, 21));
		labelOfEntries.setBounds(1020, 135, 100, 25);
		contentPane.add(labelOfEntries);
		
		
		
		
		//________________Top four entry forms__________________
		JTextField rURLText = Main.rURLText;
		rURLText.setBackground(new java.awt.Color(233,232,232));
		rURLText.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(176, 210, 54)));
		rURLText.setFont(new Font("Rubik Light", Font.PLAIN, 18));
		rURLText.setBounds(652, 165, 174, 20);
		contentPane.add(rURLText);
		rURLText.setColumns(10);
		
		JTextField numEntriesText = Main.numEntriesText;
		numEntriesText.setHorizontalAlignment(SwingConstants.CENTER);
		numEntriesText.setBounds(912, 165, 45, 20);
		numEntriesText.setBackground(new java.awt.Color(233,232,232));
		numEntriesText.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(176, 210, 54)));
		numEntriesText.setFont(new Font("Rubik Light", Font.PLAIN, 18));
		contentPane.add(numEntriesText);
		numEntriesText.setColumns(10);
		
		JTextField sizeSecondaryText = Main.sizeSecondaryText;
		sizeSecondaryText.setHorizontalAlignment(SwingConstants.CENTER);
		sizeSecondaryText.setBackground(new java.awt.Color(233,232,232));
		sizeSecondaryText.setBounds(912, 250, 45, 20);
		sizeSecondaryText.setFont(new Font("Rubik Light", Font.PLAIN, 18));
		sizeSecondaryText.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(176, 210, 54)));
		contentPane.add(sizeSecondaryText);
		sizeSecondaryText.setColumns(10);
		
		JTextField sizePrimaryText = Main.sizePrimaryText;
		sizePrimaryText.setHorizontalAlignment(SwingConstants.CENTER);
		sizePrimaryText.setBackground(new java.awt.Color(233,232,232));
		sizePrimaryText.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(176, 210, 54)));
		sizePrimaryText.setBounds(652, 250, 45, 20);
		sizePrimaryText.setFont(new Font("Rubik Light", Font.PLAIN, 18));
		contentPane.add(sizePrimaryText);
		sizePrimaryText.setColumns(10);
		
		
		
		
		JLabel labelShoeI = new JLabel("Shoe");
		labelShoeI.setHorizontalAlignment(SwingConstants.LEFT);
		labelShoeI.setFont(new Font("Roboto", Font.BOLD, 28));
		labelShoeI.setBounds(652, 210, 100, 40);
		contentPane.add(labelShoeI);
		
		JLabel lblSizeMain = new JLabel("Size (main)");
		lblSizeMain.setHorizontalAlignment(SwingConstants.LEFT);
		lblSizeMain.setFont(new Font("Roboto Th", Font.PLAIN, 21));
		lblSizeMain.setBounds(720, 220, 130, 25);
		contentPane.add(lblSizeMain);
		
		JLabel labelShoeII = new JLabel("Shoe");
		labelShoeII.setHorizontalAlignment(SwingConstants.LEFT);
		labelShoeII.setFont(new Font("Roboto", Font.BOLD, 28));
		labelShoeII.setBounds(912, 210, 80, 40);
		contentPane.add(labelShoeII);
		
		JLabel labelSizeII = new JLabel("Size (secondary)");
		labelSizeII.setHorizontalAlignment(SwingConstants.LEFT);
		labelSizeII.setFont(new Font("Roboto Th", Font.PLAIN, 21));
		labelSizeII.setBounds(980, 220, 170, 25);
		contentPane.add(labelSizeII);		

		
		JLabel labelAvailableAccounts = new JLabel("Available accounts");
		labelAvailableAccounts.setFont(new Font("Rubik", Font.PLAIN, 15));
		labelAvailableAccounts.setBounds(771, 320, 144, 14);
		contentPane.add(labelAvailableAccounts);
		
		JLabel labelMaxEntries = new JLabel("Maximum entries");
		labelMaxEntries.setFont(new Font("Rubik", Font.PLAIN, 15));
		labelMaxEntries.setBounds(771, 390, 144, 14);
		contentPane.add(labelMaxEntries);
		
		
		
		//____________Number of available accounts, max entries, & available proxies________
		JLabel labelNumAccountsAvailable = Main.labelNumAccountsAvailable;
		labelNumAccountsAvailable.setText("12");
		labelNumAccountsAvailable.setFont(new Font("Rubik Light", Font.PLAIN, 36));
		labelNumAccountsAvailable.setBounds(728, 300, 45, 40);
		contentPane.add(labelNumAccountsAvailable);
		
		JLabel labelNumMaxEntries = Main.labelNumMaxEntries;
		labelNumMaxEntries.setText("15");
		labelNumMaxEntries.setFont(new Font("Rubik Light", Font.PLAIN, 36));
		labelNumMaxEntries.setBounds(728, 370, 45, 40);
		contentPane.add(labelNumMaxEntries);

		
		JLabel labelNumAvailableProxies = Main.labelNumAvailableProxies;
		labelNumAvailableProxies.setText("21");
		labelNumAvailableProxies.setFont(new Font("Rubik Light", Font.PLAIN, 36));
		labelNumAvailableProxies.setBounds(728, 440, 45, 41);
		contentPane.add(labelNumAvailableProxies);
		
		
		
		
		JLabel labelAvailableProxies = new JLabel("Available proxies");
		labelAvailableProxies.setFont(new Font("Rubik", Font.PLAIN, 15));
		labelAvailableProxies.setBounds(771, 460, 144, 14);
		contentPane.add(labelAvailableProxies);
		
		JLabel labelNumThreads = new JLabel("Number");
		labelNumThreads.setHorizontalAlignment(SwingConstants.LEFT);
		labelNumThreads.setFont(new Font("Roboto", Font.BOLD, 28));
		labelNumThreads.setBounds(652, 518, 120, 40);
		contentPane.add(labelNumThreads);
		
		JLabel labelOfThreads = new JLabel("of threads");
		labelOfThreads.setHorizontalAlignment(SwingConstants.LEFT);
		labelOfThreads.setFont(new Font("Roboto Th", Font.PLAIN, 21));
		labelOfThreads.setBounds(755, 528, 130, 25);
		contentPane.add(labelOfThreads);
		
		JLabel labelCardInfo = new JLabel("Card");
		labelCardInfo.setHorizontalAlignment(SwingConstants.LEFT);
		labelCardInfo.setFont(new Font("Roboto", Font.BOLD, 28));
		labelCardInfo.setBounds(912, 518, 80, 40);
		contentPane.add(labelCardInfo);
		
		JLabel lblInformation = new JLabel("information");
		lblInformation.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformation.setFont(new Font("Roboto Th", Font.PLAIN, 21));
		lblInformation.setBounds(975, 528, 170, 25);
		contentPane.add(lblInformation);
		
		
		//______________Number of threads text field next to card info______________
		JTextField numThreadsText = Main.numThreadsText;
		numThreadsText.setBackground(new java.awt.Color(233,232,232));
		numThreadsText.setFont(new Font("Rubik Light", Font.PLAIN, 18));
		numThreadsText.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(176, 210, 54)));
		numThreadsText.setBounds(652, 558, 45, 20);
		contentPane.add(numThreadsText);
		numThreadsText.setColumns(10);
		
		
		
		//____________Card information text fields_____________
		JTextField cardNumberText = Main.cardNumberText;
		cardNumberText.setBackground(new java.awt.Color(233,232,232));
		cardNumberText.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(176, 210, 54)));
		cardNumberText.setBounds(912, 558, 70, 20);
		cardNumberText.setFont(new Font("Rubik Light", Font.PLAIN, 18));
		contentPane.add(cardNumberText);
		cardNumberText.setColumns(10);
		
		JTextField monthText = Main.monthText;
		monthText.setHorizontalAlignment(SwingConstants.CENTER);
		monthText.setBackground(new java.awt.Color(233,232,232));
		monthText.setBounds(985, 558, 20, 20);
		monthText.setFont(new Font("Rubik Light", Font.PLAIN, 18));
		monthText.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(61,195,218)));
		contentPane.add(monthText);
		monthText.setColumns(10);
		
		JTextField yearText = Main.yearText;
		yearText.setHorizontalAlignment(SwingConstants.CENTER);
		yearText.setBackground(new java.awt.Color(233,232,232));
		yearText.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(176, 210, 54)));
		yearText.setBounds(1010, 558, 20, 20);
		yearText.setFont(new Font("Rubik Light", Font.PLAIN, 18));
		contentPane.add(yearText);
		yearText.setColumns(10);
		
		JTextField cvvText = Main.cvvText;
		cvvText.setHorizontalAlignment(SwingConstants.CENTER);
		cvvText.setBackground(new java.awt.Color(233,232,232));
		cvvText.setFont(new Font("Rubik Light", Font.PLAIN, 18));
		cvvText.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(176, 210, 54)));
		cvvText.setColumns(10);
		cvvText.setBounds(1035, 558, 32, 20);
		contentPane.add(cvvText);
		
		
		
		//______________Card information labels______________
		JLabel lblCardNumber = new JLabel("card number");
		lblCardNumber.setFont(new Font("Rubik Light", Font.ITALIC, 9));
		lblCardNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblCardNumber.setBounds(912, 580, 70, 14);
		contentPane.add(lblCardNumber);
		
		JLabel labelM = new JLabel("m");
		labelM.setHorizontalAlignment(SwingConstants.CENTER);
		labelM.setFont(new Font("Rubik Light", Font.ITALIC, 9));
		labelM.setBounds(985, 580, 20, 14);
		contentPane.add(labelM);
		
		JLabel labelY = new JLabel("y");
		labelY.setHorizontalAlignment(SwingConstants.CENTER);
		labelY.setFont(new Font("Rubik Light", Font.ITALIC, 9));
		labelY.setBounds(1010, 579, 20, 14);
		contentPane.add(labelY);
		

		JLabel labelCVV = new JLabel("cvv");
		labelCVV.setHorizontalAlignment(SwingConstants.CENTER);
		labelCVV.setFont(new Font("Rubik Light", Font.ITALIC, 9));
		labelCVV.setBounds(1035, 579, 32, 14);
		contentPane.add(labelCVV);
		
		return contentPane;
	}
}
