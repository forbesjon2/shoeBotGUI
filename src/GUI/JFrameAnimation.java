package GUI;


import com.nukethemoon.tools.ani.Ani;
import com.nukethemoon.tools.ani.BaseAnimation;

import javax.swing.*;

/**
 * This is an example that animates a JFrame from Java Swing.
 * Simply run the main method.
 */
	public class JFrameAnimation extends BaseAnimation {
		private JFrame frame;
		private JPanel panel;
		private boolean usingFrame;
		private int startX;
		private int endX;
		private int startY;
		private int endY;
		private int startWidth;
		private int endWidth;
		private int startHeight;
		private int endHeight;
		
		/**
		 * Animates a JFrame using frame.setbounds(x,y,width,height)
		 * Created by instantiating an Ani object and adding new JFrameAnimation to it
		 * 
		 * @param pFrame		JFrame you want to be animated
		 * @param pStartX		X position at the start of the animation
		 * @param pEndX			X position at the end of the animation
		 * @param pStartY		Y position at the start of the animation
		 * @param pEndY			Y position at the end of the animation
		 * @param pStartWidth	width at the start of the animation
		 * @param pEndWidth		width at the end of the animation
		 * @param pStartHeight	height at the start of the animation
		 * @param pEndHeight	height at the end of the animations
		 * @param duration		Time it takes for the animation to complete
		 */
		public JFrameAnimation(JFrame pFrame, int pStartX, int pEndX, int pStartY, int pEndY, int pStartWidth, int pEndWidth, int pStartHeight, int pEndHeight, int duration) {
			super(duration); // duration in millisecons
			usingFrame = true;
			frame = pFrame;
			startX = pStartX;
			endX = pEndX;
			startY = pStartY;
			endY = pEndY;
			startWidth = pStartWidth;
			endWidth = pEndWidth;
			startHeight = pStartHeight;
			endHeight = pEndHeight;
		}
		
		/**
		 * Animates a JPanel using panel.setbounds(x,y,width,height)
		 * Created by instantiating an Ani object and adding new JFrameAnimation to it
		 * 
		 * @param pFrame		JFrame you want to be animated
		 * @param pStartX		X position at the start of the animation
		 * @param pEndX			X position at the end of the animation
		 * @param pStartY		Y position at the start of the animation
		 * @param pEndY			Y position at the end of the animation
		 * @param pStartWidth	width at the start of the animation
		 * @param pEndWidth		width at the end of the animation
		 * @param pStartHeight	height at the start of the animation
		 * @param pEndHeight	height at the end of the animations
		 * @param duration		Time it takes for the animation to complete
		 */
		public JFrameAnimation(JPanel pPanel, int pStartX, int pEndX, int pStartY, int pEndY, int pStartWidth, int pEndWidth, int pStartHeight, int pEndHeight, int duration) {
			super(duration); // duration in millisecons
			usingFrame = false;
			panel = pPanel;
			startX = pStartX;
			endX = pEndX;
			startY = pStartY;
			endY = pEndY;
			startWidth = pStartWidth;
			endWidth = pEndWidth;
			startHeight = pStartHeight;
			endHeight = pEndHeight;
		}

		@Override
		protected void onProgress(float pProgress) {
			float progressX = (float) (endX - startX) * pProgress;
			float progressY = (float) (endY - startY) * pProgress;
			float progressWidth = (float) (endWidth - startWidth) * pProgress;
			float progressHeight = (float) (endHeight - startHeight) * pProgress;
			
			int x = startX + (int) progressX;
			int y = startY + (int) progressY;
			int width = startWidth + (int) progressWidth;
			int height = startHeight + (int) progressHeight;
			
			if(usingFrame) {
				frame.setBounds(x, y, width, height);
			}else {
				panel.setBounds(x, y, width, height);
			}
		}
	}

