package admingui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PanelRentInc extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelRentInc() {
		setBackground(new Color(105, 105, 105));
		setSize(593,503);
		setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Month:");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(149, 66, 73, 27);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("Select Date");
		lblNewLabel_1.setToolTipText("This tool calculates the 5 most rented films/series based on the prior moth from the date you have inserted.");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_1.setBounds(181, 11, 88, 27);
		add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox_1.setMaximumRowCount(12);
		comboBox_1.setBounds(229, 69, 79, 20);
		add(comboBox_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Year:");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2_2.setBounds(318, 66, 73, 27);
		add(lblNewLabel_2_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"}));
		comboBox_2.setBounds(384, 70, 60, 20);
		add(comboBox_2);


	}

}
