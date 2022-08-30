package admingui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import content.FilmIncomeTableModel;
import content.SeriesIncomeTableModel;
import queryToDB.Query;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class PanelRentInc extends JPanel {
	private JTable table_Series;
	private JTable table_Films;

	/**
	 * Create the panel.
	 * @param q 
	 */
	public PanelRentInc(Query q) {
		setBackground(new Color(105, 105, 105));
		setSize(593,503);
		setLayout(null);
		setBounds(0, 0, 595, 503);
		
		JLabel SelectDate = new JLabel("Income per Month");
		SelectDate.setHorizontalAlignment(SwingConstants.CENTER);
		SelectDate.setFont(new Font("Serif", Font.BOLD, 15));
		SelectDate.setBounds(181, 11, 200, 27);
		add(SelectDate);
		
		JScrollPane scrollPane_Films = new JScrollPane();
		scrollPane_Films.setBounds(23, 120, 548, 164);
		add(scrollPane_Films);
		
		try {
			table_Films = new JTable(new FilmIncomeTableModel(q.getFilmsPayment()));
		} catch (Exception e) {
			throw new RuntimeException();
		}
		scrollPane_Films.setViewportView(table_Films);
		
		JScrollPane scrollPane_Series = new JScrollPane();
		scrollPane_Series.setBounds(23, 316, 548, 164);
		add(scrollPane_Series);
		
		try {
			table_Series = new JTable(new SeriesIncomeTableModel(q.getSeriesPayment()));
		} catch (Exception e) {
			throw new RuntimeException();
		}
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
