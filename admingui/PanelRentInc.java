package admingui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class PanelRentInc extends JPanel {
	private JTable table_Series;
	private JTable table_Films;

	/**
	 * Create the panel.
	 */
	public PanelRentInc() {
		setBackground(new Color(105, 105, 105));
		setSize(593,503);
		setLayout(null);
		
		JLabel lbMonth = new JLabel("Month:");
		lbMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lbMonth.setFont(new Font("Serif", Font.BOLD, 13));
		lbMonth.setBounds(132, 49, 73, 27);
		add(lbMonth);
		
		JLabel SelectDate = new JLabel("Select Date");
		SelectDate.setToolTipText("This tool calculates the 5 most rented films/series based on the prior moth from the date you have inserted.");
		SelectDate.setHorizontalAlignment(SwingConstants.CENTER);
		SelectDate.setFont(new Font("Serif", Font.BOLD, 15));
		SelectDate.setBounds(181, 11, 88, 27);
		add(SelectDate);
		
		JComboBox comboBox_month = new JComboBox();
		comboBox_month.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox_month.setMaximumRowCount(12);
		comboBox_month.setBounds(225, 53, 79, 20);
		add(comboBox_month);
		
		JLabel LbYEAR = new JLabel("Year:");
		LbYEAR.setHorizontalAlignment(SwingConstants.CENTER);
		LbYEAR.setFont(new Font("Serif", Font.BOLD, 13));
		LbYEAR.setBounds(314, 49, 73, 27);
		add(LbYEAR);
		
		JComboBox comboBox_year = new JComboBox();
		comboBox_year.setModel(new DefaultComboBoxModel(new String[] {"2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"}));
		comboBox_year.setBounds(383, 53, 60, 20);
		add(comboBox_year);
		
		JScrollPane scrollPane_Films = new JScrollPane();
		scrollPane_Films.setBounds(23, 120, 548, 164);
		add(scrollPane_Films);
		
		table_Films = new JTable();
		scrollPane_Films.setViewportView(table_Films);
		
		JScrollPane scrollPane_Series = new JScrollPane();
		scrollPane_Series.setBounds(23, 316, 548, 164);
		add(scrollPane_Series);
		
		table_Series = new JTable();
		scrollPane_Series.setViewportView(table_Series);
		
		JLabel LbSeries = new JLabel("Series");
		LbSeries.setHorizontalAlignment(SwingConstants.CENTER);
		LbSeries.setFont(new Font("Serif", Font.BOLD, 15));
		LbSeries.setBounds(157, 291, 230, 14);
		add(LbSeries);
		
		JLabel LbFilms = new JLabel("Films");
		LbFilms.setHorizontalAlignment(SwingConstants.CENTER);
		LbFilms.setFont(new Font("Serif", Font.BOLD, 15));
		LbFilms.setBounds(142, 95, 230, 14);
		add(LbFilms);


	}
}
