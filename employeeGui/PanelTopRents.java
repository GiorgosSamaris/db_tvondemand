package employeeGui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import content.RentsTableModel;
import content.TopContentTableModel;
import queryToDB.Query;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class PanelTopRents extends JPanel {
	private JTable table;
	private TopContentTableModel topContent;

	/**
	 * Create the panel.
	 */
	public PanelTopRents(Query q) {
		setBackground(new Color(112, 128, 144));
		setForeground(new Color(255, 255, 255));
		setSize(601,561);
		setLayout(null);
		
		JLabel titleLbl = new JLabel("Most Rented Films & Series");
		titleLbl.setFont(new Font("Serif", Font.PLAIN, 20));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		titleLbl.setBounds(166, 11, 234, 46);
		add(titleLbl);
		
		JLabel dateLbl = new JLabel("Select Date");
		dateLbl.setHorizontalAlignment(SwingConstants.CENTER);
		dateLbl.setFont(new Font("Serif", Font.BOLD, 15));
		dateLbl.setToolTipText("This tool calculates the 5 most rented films/series based on the prior moth from the date you have inserted.");
		dateLbl.setBounds(222, 96, 88, 27);
		add(dateLbl);
		
		JLabel contentLbl = new JLabel("Day:");
		contentLbl.setFont(new Font("Serif", Font.BOLD, 13));
		contentLbl.setHorizontalAlignment(SwingConstants.CENTER);
		contentLbl.setBounds(58, 151, 73, 27);
		add(contentLbl);
		
		JComboBox dayComboBox = new JComboBox();
		dayComboBox.setBounds(130, 155, 42, 20);
		add(dayComboBox);
		dayComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		dayComboBox.setMaximumRowCount(30);
		
		JComboBox monthComboBox = new JComboBox();
		monthComboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		monthComboBox.setMaximumRowCount(12);
		monthComboBox.setBounds(270, 154, 100, 20);
		add(monthComboBox);
		
		JComboBox yearComboBox = new JComboBox();
		yearComboBox.setModel(new DefaultComboBoxModel(new String[] {"2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"}));
		yearComboBox.setBounds(425, 155, 60, 20);
		add(yearComboBox);
		
		JLabel monthLbl = new JLabel("Month:");
		monthLbl.setHorizontalAlignment(SwingConstants.CENTER);
		monthLbl.setFont(new Font("Serif", Font.BOLD, 13));
		monthLbl.setBounds(190, 151, 73, 27);
		add(monthLbl);
		
		JLabel yealLbl = new JLabel("Year:");
		yealLbl.setHorizontalAlignment(SwingConstants.CENTER);
		yealLbl.setFont(new Font("Serif", Font.BOLD, 13));
		yealLbl.setBounds(359, 151, 73, 27);
		add(yealLbl);
		
		JComboBox contentComboBox = new JComboBox();
		contentComboBox.setModel(new DefaultComboBoxModel(new String[] {"Series", "Films"}));
		contentComboBox.setBounds(250, 212, 90, 22);
		add(contentComboBox);
		
		JLabel contentlbl = new JLabel("Choose Type of Content:");
		contentlbl.setFont(new Font("Serif", Font.BOLD, 15));
		contentlbl.setBounds(58, 214, 200, 14);
		add(contentlbl);
		
//		JScrollPane contentPanel = new JScrollPane();
//		contentPanel.setLayout(null);
//		contentPanel.setBounds(10, 280, 581, 270);
//	    JTable testTable = new JTable(10,2);
//		testTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//	    contentPanel.add(testTable);
//		add(contentPanel);

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 280, 581, 270);
		add(scrollPane);
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JButton getButton = new JButton("Get");
		getButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date earlyDate;
				if(monthComboBox.getSelectedIndex() == 0) earlyDate = Date.valueOf((String)yearComboBox.getItemAt(yearComboBox.getSelectedIndex()+1)+"-"+Integer.toString(monthComboBox.getSelectedIndex()+12)+"-"+(String)dayComboBox.getSelectedItem());
				else earlyDate = Date.valueOf((String)yearComboBox.getSelectedItem()+"-"+Integer.toString(monthComboBox.getSelectedIndex())+"-"+(String)dayComboBox.getSelectedItem());
				Date lateDate = Date.valueOf((String)yearComboBox.getSelectedItem()+"-"+Integer.toString(monthComboBox.getSelectedIndex()+1)+"-"+(String)dayComboBox.getSelectedItem());
				System.out.println(earlyDate.toString()+" to "+lateDate.toString());
				System.out.println(contentComboBox.getSelectedIndex());
				try {
					topContent = new TopContentTableModel(q.getTopContent(contentComboBox.getSelectedIndex(), earlyDate, lateDate));
					table.setModel(topContent);

				} catch (Exception e1) {
					throw new RuntimeException(e1);
				}
			}
		});
		getButton.setBounds(396, 212, 89, 23);
		add(getButton);


	}
}