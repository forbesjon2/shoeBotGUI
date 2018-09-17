package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.nukethemoon.tools.ani.Ani;
import com.nukethemoon.tools.ani.BaseAnimation;

import GUI.JFrameAnimation;
import GUI.Main;
import GUI.UserInterface;

public class MouseAction extends Main implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent event) {
		String eventText = "";
		eventText = event.getComponent().getName();
		
		switch(eventText) {
		case "terminate":
			System.exit(0);
			break;
		case "exitButton":
			System.exit(0);
			break;
		case "configuration":
			System.out.println("No config set");
			break;
		case "username":
			if(!usernameSelect) {
				Main.username.setText("");
				usernameSelect = true;
			}
			break;
		case "password":
			if(!passwordSelect) {
				Main.password.setText("");
				passwordSelect = true;
			}
			break;
		case "connect":
			String username = Main.username.getText();
			String password = Main.password.getText();
//			if(username.length() == 0 || password.length() == 0) {
//				
//			}else {
//				boolean resp = API.loginInit(username, password);
//			}
			break;
		case "cardButtonSelect":
			selectButton(0);
			UserInterface.setOne();
			break;
		case "cardButton":
			selectButton(0);
			UserInterface.setOne();
			break;
		case "proxyButtonSelect":
			selectButton(1);
			UserInterface.setTwo();
			break;
		case "proxyButton":
			selectButton(1);
			UserInterface.setTwo();
			break;
		case "accountButtonSelect":
			selectButton(2);
			break;
		case "accountButton":
			selectButton(2);
			break;
		case "runButtonSelect":
			selectButton(3);
			break;
		case "runButton":
			selectButton(3);
			break;
		case "settingsButtonSelect":
			selectButton(4);
			break;
		case "settingsButton":
			selectButton(4);
			break;
		case "expandLabel":
			Ani controller = new Ani(40);
			JPanel sideBar = Main.sideBar;
			if(sideBar.getWidth() == 30) {
				controller.add(new JFrameAnimation(sideBar, sideBar.getX(), sideBar.getX(), sideBar.getY(), sideBar.getY(), 
						sideBar.getWidth(), sideBar.getWidth() + 300, sideBar.getHeight(), sideBar.getHeight(), 100));
				increasePaneSize();
			}else if(sideBar.getWidth() == 330) {
				controller.add(new JFrameAnimation(sideBar, sideBar.getX(), sideBar.getX(), sideBar.getY(), sideBar.getY(), 
						sideBar.getWidth(), sideBar.getWidth() - 300, sideBar.getHeight(), sideBar.getHeight(), 100));
				decreasePaneSize();
			}
			break;
		}			
	}

	
	
	@Override
	public void mouseEntered(MouseEvent event) {
		//if the button is not the selected one then change its color when hovered over
		//else do nothing
		String eventText = event.getComponent().getName();
		meLogicTwo(eventText, false);
	}
	

	/**
	 * Mouse entered logic
	 * 
	 * @param eventText
	 * @param sizeOverride
	 */
	private static void meLogicTwo(String eventText, boolean sizeOverride) {
		switch(eventText) {
		case "cardButtonSelect":
			mouseEnterExitLogic(true, sizeOverride, 0, Main.cardButton, Main.cardButton2, Main.cardButtonSelect, new java.awt.Color(120,120,120), 
					new int[]{-44, 180, 200, 32}, new int[]{49, 181, 190, 32});
 			break;
		case "cardButton":
			mouseEnterExitLogic(true, sizeOverride, 0, Main.cardButton, Main.cardButton2, Main.cardButtonSelect, new java.awt.Color(120,120,120), 
					new int[]{-44, 180, 200, 32}, new int[]{49, 181, 190, 32});
			break;
		case "proxyButtonSelect":
			mouseEnterExitLogic(true, sizeOverride, 1, Main.proxyButton, Main.proxyButton2, Main.proxyButtonSelect, new java.awt.Color(120,120,120), 
					new int[]{-46, 222, 300, 48}, new int[]{163, 222, 190, 48});
			break;
		case "proxyButton":
			mouseEnterExitLogic(true, sizeOverride, 1, Main.proxyButton, Main.proxyButton2, Main.proxyButtonSelect, new java.awt.Color(120,120,120),
					new int[]{-46, 222, 300, 48}, new int[]{163, 222, 190, 48});
			break;
		case "accountButtonSelect":
			mouseEnterExitLogic(true, sizeOverride, 2, Main.accountButton, Main.accountButton2, Main.accountButtonSelect,new java.awt.Color(120,120,120),
					new int[]{-75, 272, 300, 48}, new int[]{119, 273, 190, 48});
			break;
		case "accountButton":
			mouseEnterExitLogic(true, sizeOverride, 2, Main.accountButton, Main.accountButton2, Main.accountButtonSelect, new java.awt.Color(120,120,120),
					new int[]{-75, 272, 300, 48}, new int[]{119, 273, 190, 48});
			break;
		case "runButtonSelect":
			mouseEnterExitLogic(true, sizeOverride, 3, Main.runButton, Main.runButton2, Main.runButtonSelect, new java.awt.Color(120,120,120),
					new int[]{-49, 322, 196, 48}, new int[] {57, 324, 300, 48});
			break;
		case "runButton":
			mouseEnterExitLogic(true, sizeOverride, 3, Main.runButton, Main.runButton2, Main.runButtonSelect, new java.awt.Color(120,120,120),
					new int[]{-49, 322, 196, 48}, new int[] {57, 324, 300, 48});
			break;
		case "settingsButtonSelect":
			mouseEnterExitLogic(true, sizeOverride, 4, Main.settingsButton, Main.settingsButton2, Main.settingsButtonSelect, new java.awt.Color(120,120,120),
					new int[]{-5, 373, 196, 48}, new int[] {95, 374, 300, 48});
			break;
		case "settingsButton":
			mouseEnterExitLogic(true, sizeOverride, 4, Main.settingsButton, Main.settingsButton2, Main.settingsButtonSelect, new java.awt.Color(120,120,120),
					new int[]{-5, 373, 196, 48}, new int[] {95, 374, 300, 48});
			break;
		}
	}
	
	
	
	
	/**
	 * Ran whenever the side panel is maximized
	 */
	private static void increasePaneSize() {
		exitButton.setText("Exit");
		exitButton.setFont(new Font("Roboto", Font.BOLD, 28));
		exitButton.setBounds(88, 34, 59, 40);
		exitButton2.setVisible(true);
		
		cardButton.setText("Add");
		cardButton.setBounds(-32, 180, 138, 32);
		cardButton.setFont(new Font("Roboto", Font.BOLD, 28));
		cardButton2.setVisible(true);
		cardButton2.setFont(new Font("Roboto Lt", Font.PLAIN, 21));
		cardButton2.setBounds(0, 182, 190, 32);
		
		proxyButton.setText("Configure");
		proxyButton.setBounds(-30, 228, 200, 32);
		proxyButton.setFont(new Font("Roboto", Font.BOLD, 28));
		proxyButton2.setVisible(true);
		proxyButton2.setFont(new Font("Roboto Lt", Font.PLAIN, 21));
		proxyButton2.setBounds(80, 231, 190, 32);
		
		accountButton.setText("Create");
		accountButton.setBounds(-99, 270, 300, 48);
		accountButton.setFont(new Font("Roboto", Font.BOLD, 28));
		accountButton2.setVisible(true);
		accountButton2.setFont(new Font("Roboto Lt", Font.PLAIN, 21));
		accountButton2.setBounds(50, 273, 190, 48);
		
		runButton.setText("Run");
		runButton.setBounds(-14, 320, 100, 48);
		runButton.setFont(new Font("Roboto", Font.BOLD, 28));
		runButton2.setVisible(true);
		runButton2.setFont(new Font("Roboto Lt", Font.PLAIN, 21));
		runButton2.setBounds(36, 322, 200, 48);
		
		settingsButton.setText("Account");
		settingsButton.setBounds(-17, 373, 160, 48);
		settingsButton.setFont(new Font("Roboto", Font.BOLD, 28));
		settingsButton2.setVisible(true);
		settingsButton2.setFont(new Font("Roboto Lt", Font.PLAIN, 21));
		settingsButton2.setBounds(95, 375, 130, 48);
		
		JButton[] listOfButtons = {Main.cardButton, Main.proxyButton, Main.accountButton, Main.runButton, Main.settingsButton};
		//set buttonSelect to the correct value
		for(int j = 0; j < Main.buttonSelect.length; j++) {
			String namme = listOfButtons[j].getName();	
			namme = listOfButtons[j].getName();
			if(Main.buttonSelect[j]) {
				meLogicTwo(namme, true);
			}
		}
	}
	
	
	

	/**
	 * Ran whenever the panel is minimized
	 */
	private static void decreasePaneSize() {
		exitButton.setText("E");
		exitButton.setFont(new Font("Roboto", Font.PLAIN, 20));
		exitButton.setBounds(-10, 10, 50, 40);
		exitButton2.setVisible(false);
		
		cardButton.setText("C");
		cardButton.setBounds(-10, 180, 50, 32);
		cardButton.setFont(new Font("Roboto Lt", Font.PLAIN, 20));
		cardButton2.setVisible(false);
		
		proxyButton.setText("P");
		proxyButton.setBounds(-10, 230, 50, 32);
		proxyButton.setFont(new Font("Roboto Lt", Font.PLAIN, 20));
		proxyButton2.setVisible(false);
		
		accountButton.setText("A");
		accountButton.setBounds(-10, 273, 50, 48);
		accountButton.setFont(new Font("Roboto Lt", Font.PLAIN, 20));
		accountButton2.setVisible(false);
		
		runButton.setText("R");
		runButton.setBounds(-10, 322, 50, 48);
		runButton.setFont(new Font("Roboto Lt", Font.PLAIN, 20));
		runButton2.setVisible(false);
		
		settingsButton.setText("S");
		settingsButton.setBounds(-10, 373, 50, 48);
		settingsButton.setFont(new Font("Roboto Lt", Font.PLAIN, 20));
		settingsButton2.setVisible(false);
		
		JButton[] listOfButtons = {Main.cardButton, Main.proxyButton, Main.accountButton, Main.runButton, Main.settingsButton};
		//set buttonSelect to the correct value
		for(int j = 0; j < Main.buttonSelect.length; j++) {
			String namme = listOfButtons[j].getName();	
			namme = listOfButtons[j].getName();
			if(Main.buttonSelect[j]) {
				listOfButtons[j].setFont(new Font("Roboto", Font.BOLD, 20));
			}
		}
	}
	
	
	
	
	/**
	 * Ran whenever the cursor hovers over the object
	 * 
	 * @param entered
	 * @param widthOverride
	 * @param bsInt
	 * @param mainButton
	 * @param secondaryButton
	 * @param selectButton
	 * @param color
	 * @param mainBounds
	 * @param secondaryBounds
	 */
	private static void mouseEnterExitLogic(boolean entered, boolean widthOverride, int bsInt, JButton mainButton, JButton secondaryButton, JLabel selectButton, Color color, int[] mainBounds, int[] secondaryBounds) {
		//if the button is not selected
		if(!Main.buttonSelect[bsInt]) {
			selectButton.setBackground(color);
			if(Main.sideBar.getWidth() == 330) {
				if(entered) {
					mainButton.setBounds(mainBounds[0], mainBounds[1], mainBounds[2], mainBounds[3]);
					secondaryButton.setBounds(secondaryBounds[0], secondaryBounds[1], secondaryBounds[2], secondaryBounds[3]);
					mainButton.setFont(new Font("Roboto", Font.BOLD, 41));
					secondaryButton.setFont(new Font("Roboto Lt", Font.PLAIN, 37));
				}else {
					mainButton.setBounds(mainBounds[0], mainBounds[1], mainBounds[2], mainBounds[3]);
					secondaryButton.setBounds(secondaryBounds[0], secondaryBounds[1], secondaryBounds[2], secondaryBounds[3]);
					mainButton.setFont(new Font("Roboto", Font.BOLD, 28));
					secondaryButton.setFont(new Font("Roboto Lt", Font.PLAIN, 21));
				}
			//small sidebar
			}else{
				if(entered) {
					mainButton.setFont(new Font("Roboto", Font.BOLD, 20));
				}else {
					mainButton.setFont(new Font("Roboto Lt", Font.PLAIN, 20));
				}
			}
		//if the button is selected and the mouse left from hovering over it
		}else {
			if(Main.sideBar.getWidth() == 330) {
				mainButton.setFont(new Font("Roboto", Font.BOLD, 41));
				secondaryButton.setFont(new Font("Roboto Lt", Font.PLAIN, 37));
			}else if(widthOverride ) {
				mainButton.setBounds(mainBounds[0], mainBounds[1], mainBounds[2], mainBounds[3]);
				secondaryButton.setBounds(secondaryBounds[0], secondaryBounds[1], secondaryBounds[2], secondaryBounds[3]);
				mainButton.setFont(new Font("Roboto", Font.BOLD, 41));
				secondaryButton.setFont(new Font("Roboto Lt", Font.PLAIN, 37));
			}else{
				mainButton.setFont(new Font("Roboto", Font.BOLD, 20));
			}
		}
	}
	
	
	
	@Override
	public void mouseExited(MouseEvent event) {
		//if the button is not true, set its background to blue, else do nothing
		String eventText = event.getComponent().getName();
		meLogic(eventText);
	}
	
	/**
	 * Mouse exited logic
	 * 
	 * @param eventText
	 */
	private static void meLogic(String eventText) {
		switch(eventText) {
		case "cardButtonSelect":
			mouseEnterExitLogic(false, false, 0, Main.cardButton, Main.cardButton2, Main.cardButtonSelect, new java.awt.Color(61,195,218), 
					new int[]{-32, 180, 138, 32}, new int[]{0, 182, 190, 32});
 			break;
		case "cardButton":
			mouseEnterExitLogic(false, false, 0, Main.cardButton, Main.cardButton2, Main.cardButtonSelect, new java.awt.Color(61,195,218), 
					new int[]{-32, 180, 138, 32}, new int[]{0, 182, 190, 32});
			break;
		case "proxyButtonSelect":
			mouseEnterExitLogic(false, false, 1, Main.proxyButton, Main.proxyButton2, Main.proxyButtonSelect, new java.awt.Color(61,195,218), 
					new int[]{-30, 228, 200, 32}, new int[]{80, 231, 190, 32});
			break;
		case "proxyButton":
			mouseEnterExitLogic(false, false, 1, Main.proxyButton, Main.proxyButton2, Main.proxyButtonSelect, new java.awt.Color(61,195,218), 
					new int[]{-30, 228, 200, 32}, new int[]{80, 231, 190, 32});
			break;
		case "accountButtonSelect":
			mouseEnterExitLogic(false, false, 2, Main.accountButton, Main.accountButton2, Main.accountButtonSelect, new java.awt.Color(61,195,218),
					new int[]{-99, 270, 300, 48}, new int[]{50, 273, 190, 48});
			break;
		case "accountButton":
			mouseEnterExitLogic(false, false, 2, Main.accountButton, Main.accountButton2, Main.accountButtonSelect, new java.awt.Color(61,195,218),
					new int[]{-99, 270, 300, 48}, new int[]{50, 273, 190, 48});
			break;
		case "runButtonSelect":
			mouseEnterExitLogic(false, false, 3, Main.runButton, Main.runButton2, Main.runButtonSelect, new java.awt.Color(61,195,218),
					new int[]{-14, 320, 100, 48}, new int[]{36, 322, 200, 48});
			break;
		case "runButton":
			mouseEnterExitLogic(false, false, 3, Main.runButton, Main.runButton2, Main.runButtonSelect, new java.awt.Color(61,195,218),
					new int[]{-14, 320, 100, 48}, new int[] {36, 322, 200, 48});
			break;
		case "settingsButtonSelect":
			mouseEnterExitLogic(false, false, 4, Main.settingsButton, Main.settingsButton2, Main.settingsButtonSelect, new java.awt.Color(61,195,218),
					new int[]{-17, 373, 160, 48}, new int[] {95, 375, 130, 48});
			break;
		case "settingsButton":
			mouseEnterExitLogic(false, false, 4, Main.settingsButton, Main.settingsButton2, Main.settingsButtonSelect, new java.awt.Color(61,195,218),
					new int[]{-17, 373, 160, 48}, new int[] {95, 375, 130, 48});
			break;
		}
	}
	
	@Override
	public void mousePressed(MouseEvent event) {
		String eventText = event.getComponent().getName();
		switch(eventText) {
		case "connect":
			Main.login.setBackground(Color.BLACK);
			Main.login.setForeground(Color.WHITE);
			break;
		}
		
	}

	
	@Override
	public void mouseReleased(MouseEvent event) {
		String eventText = event.getComponent().getName();
		switch(eventText) {
		case "connect":
			Main.login.setBackground(Color.WHITE);
			Main.login.setForeground(Color.BLACK);
			break;
		}
	}

	
	
	
	/**
	 * Changes the truth value of the button select array as well
	 * as the color of the button
	 * 
	 * 0 = card button 
	 * 1 = proxy button
	 * 2 = account button
	 * 3 = run button
	 * 4 = settings button
	 * @param i
	 */
	private static void selectButton(int i) {
		Main.cardButtonSelect.setBackground(new java.awt.Color(61,195,218));
		Main.proxyButtonSelect.setBackground(new java.awt.Color(61,195,218));
		Main.accountButtonSelect.setBackground(new java.awt.Color(61,195,218));
		Main.runButtonSelect.setBackground(new java.awt.Color(61,195,218));
		Main.settingsButtonSelect.setBackground(new java.awt.Color(61,195,218));
		
		JButton[] listOfButtons = {Main.cardButton, Main.proxyButton, Main.accountButton, Main.runButton, Main.settingsButton};
		//set buttonSelect to the correct value
		for(int j = 0; j < Main.buttonSelect.length; j++) {
			if(i != j) {
				Main.buttonSelect[j] = false;
				String namme = listOfButtons[Main.previousButtonInt].getName();	
				namme = listOfButtons[j].getName();
				meLogic(namme);
			}else {
				Main.buttonSelect[j] = true;
			}
			//change the color to black
			switch(i){
			case 0:
				Main.cardButtonSelect.setBackground(new java.awt.Color(0, 0, 0));
				break;
			case 1:
				Main.proxyButtonSelect.setBackground(new java.awt.Color(0, 0, 0));
				break;
			case 2:
				Main.accountButtonSelect.setBackground(new java.awt.Color(0, 0, 0));
				break;
			case 3:
				Main.runButtonSelect.setBackground(new java.awt.Color(0, 0, 0));
				break;
			case 4:
				Main.settingsButtonSelect.setBackground(new java.awt.Color(0, 0, 0));
				break;
			}
		}
	}
}
