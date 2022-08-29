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
		setLayout(null);
		setBounds(0, 0, 595, 503);
		JLabel monthLbl = new JLabel("Month:");
		monthLbl.setHorizontalAlignment(SwingConstants.CENTER);
		monthLbl.setFont(new Font("Serif", Font.BOLD, 13));
		monthLbl.setBounds(149, 66, 73, 27);
		add(monthLbl);
		
		JLabel dateLbl = new JLabel("Select Date");
		dateLbl.setToolTipText("This tool calculates the 5 most rented films/series based on the prior moth from the date you have inserted.");
		dateLbl.setHorizontalAlignment(SwingConstants.CENTER);
		dateLbl.setFont(new Font("Serif", Font.BOLD, 15));
		dateLbl.setBounds(181, 11, 88, 27);
		add(dateLbl);
		
		JComboBox monthCmbBx = new JComboBox();
		monthCmbBx.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		monthCmbBx.setMaximumRowCount(12);
		monthCmbBx.setBounds(229, 69, 79, 20);
		add(monthCmbBx);
		
		JLabel yearLbl = new JLabel("Year:");
		yearLbl.setHorizontalAlignment(SwingConstants.CENTER);
		yearLbl.setFont(new Font("Serif", Font.BOLD, 13));
		yearLbl.setBounds(318, 66, 73, 27);
		add(yearLbl);
		
		JComboBox yearCmbBx = new JComboBox();
		yearCmbBx.setModel(new DefaultComboBoxModel(new String[] {"2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"}));
		yearCmbBx.setBounds(384, 70, 60, 20);
		add(yearCmbBx);


	}

}
