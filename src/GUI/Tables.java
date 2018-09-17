package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class Tables {
	public static JTable tableThreeColumns(JScrollPane scrollPane, DefaultTableModel tableModel) {
		JTable table = new JTable() {
			//cells cannot be editable
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
			@Override
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {				
				Component preComponent = super.prepareRenderer(renderer, row, column);
				JComponent component = (JComponent) preComponent;
				//create middle green bars and bottom lines for cells
				if(column != 2) {
					AbstractBorder underline = new AbstractBorder() {
						@Override
						public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
							super.paintBorder(c, g, x, y, width, height);
							Graphics2D g2d = null;
							if(g instanceof Graphics2D) {
								g2d = (Graphics2D) g;
								g2d.setColor(Color.BLACK);
					            g2d.draw(new Line2D.Double(width - 20, (double)height, 20 , (double)height));
					            g2d.setColor(new java.awt.Color(233,232,232));
							}
						}
					};
					
					Border rightline = BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(176, 210, 54));
					CompoundBorder compBorder = BorderFactory.createCompoundBorder(underline, rightline);
					component.setBorder(compBorder);
				}else {
					AbstractBorder underline = new AbstractBorder() {
						@Override
						public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
							super.paintBorder(c, g, x, y, width, height);
							Graphics2D g2d = null;
							if(g instanceof Graphics2D) {
								g2d = (Graphics2D) g;
								g2d.setColor(Color.BLACK);
					            g2d.draw(new Line2D.Double(width - 20, (double)height, 20 , (double)height));
					            g2d.setColor(new java.awt.Color(233,232,232));
							}
						}
					};
					component.setBorder(underline);
				}
				//make it look like nothing happens when the user selects a row
				if (isRowSelected(row))  component.setBackground(new java.awt.Color(233,232,232));
				return component;
			}
		};
		table.setFont(new Font("Roboto Lt", Font.PLAIN, 15));
		table.setRowHeight(36);
		
		table.getTableHeader().setReorderingAllowed(false);
		table.getColumnModel().setColumnSelectionAllowed(false);
		table.setShowHorizontalLines(false);
		table.setShowVerticalLines(false);
		table.removeEditor();
		
		//if table model has less entries than it has height, fill the rest with empty entries
		int numRowsNeeded = 1 + scrollPane.getHeight() /  table.getRowHeight();
		while(tableModel.getRowCount() < numRowsNeeded) {
			tableModel.addRow(new Object[] {"","","" });
		}
		
		table.setModel(tableModel);
		
		//disable resizing
		//center text, set cell background color
		DefaultTableCellRenderer rndr = new DefaultTableCellRenderer();
		rndr.setHorizontalAlignment(JLabel.CENTER);
		rndr.setBackground(new java.awt.Color(233,232,232));
		int count = 0;
		while(count <= 2) {
			table.getColumnModel().getColumn(count).setCellRenderer(rndr);
			table.getColumnModel().getColumn(count).setHeaderRenderer(rndr);
			table.getColumnModel().getColumn(count).setResizable(false);

			count++;
		}
		table.setColumnSelectionAllowed(false);
		table.setRowSelectionAllowed(false);
		table.setCellSelectionEnabled(false);
		table.setBorder(null);
		
		table.setBackground(new java.awt.Color(233,232,232));
		return table;
	}
	
	public static JTable tableTwoColumns(JScrollPane scrollPane, DefaultTableModel tableModel) {
		JTable table = new JTable();
		
		return table;
		
	}
}
