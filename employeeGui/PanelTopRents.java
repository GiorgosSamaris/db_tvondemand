package employeeGui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelTopRents extends JPanel {
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public PanelTopRents() {
		setBackground(new Color(112, 128, 144));
		setForeground(new Color(255, 255, 255));
		setSize(601,561);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Most Rented Films & Series");
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(166, 11, 234, 46);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select Date");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_1.setToolTipText("This tool calculates the 5 most rented films/series based on the prior moth from the date you have inserted.");
		lblNewLabel_1.setBounds(222, 96, 88, 27);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Day:");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(58, 151, 73, 27);
		add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(130, 155, 38, 20);
		add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setMaximumRowCount(30);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox_1.setMaximumRowCount(12);
		comboBox_1.setBounds(270, 154, 79, 20);
		add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"}));
		comboBox_2.setBounds(425, 155, 60, 20);
		add(comboBox_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Month:");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(190, 151, 73, 27);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Year:");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2_2.setBounds(359, 151, 73, 27);
		add(lblNewLabel_2_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 280, 581, 270);
		add(panel);
		
		table_1 = new JTable();
		panel.add(table_1);
		
		JButton btnNewButton = new JButton("Get");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO get
			}
		});
		btnNewButton.setBounds(396, 212, 89, 23);
		add(btnNewButton);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Series", "Films"}));
		comboBox_3.setBounds(166, 212, 60, 22);
		add(comboBox_3);
		
		JLabel lblNewLabel_3 = new JLabel("Choose Genre:");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_3.setBounds(58, 214, 98, 14);
		add(lblNewLabel_3);


	}
}