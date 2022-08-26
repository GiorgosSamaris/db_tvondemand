package mockFrame;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;

import content.Film;
import content.Series;
import queryToDB.Query;
import javax.swing.JTextArea;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class mockCatalogue2 extends JPanel {

	/**
	 * Create the panel.
	 * @param qri 
	 */
	public mockCatalogue2(Query qri) {
		setBackground(new Color(112, 128, 144));
		setBounds(0, 0, 522,378);
		setLayout(null);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 522, 212);
		tabbedPane.setBackground(new Color(112, 128, 144));
		add(tabbedPane);

		String[] filmArr;
		final List<Film> films;
		try {
			films = qri.getAvailableFilms();
			filmArr = films.stream().map(Film::getTitle).collect(Collectors.toList()).toArray(String[]::new);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		JList filmList = new JList(filmArr);
		filmList.setBackground(new Color(119, 136, 153));
		filmList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane filmPanel = new JScrollPane(filmList);
		filmPanel.setBounds(66, 47, 274, 151);
		tabbedPane.addTab("Films", null, filmPanel, null);
		tabbedPane.setBackgroundAt(0, new Color(0, 128, 128));
		
		JTextArea textArea = new JTextArea("");
		textArea.setEditable(false);
		textArea.setBackground(new Color(112, 128, 144));
		textArea.setBounds(10, 223, 304, 144);
		textArea.setLineWrap(true);
		add(textArea);
		
		
		//Mouse adapter for film list selection
		filmList.addMouseListener(new PanelButtonMouseAdapter(filmList){
			@Override
			public void mouseClicked(MouseEvent e) {
			  textArea.setText(films.get(filmList.getSelectedIndex()).getDescription());
			}
		});
		
		
		
		String[] seriesArr;
		final List<Series> series;
		try {
			series = qri.getAvailableSeries();
			seriesArr = series.stream().map(Series::getTitle).collect(Collectors.toList()).toArray(String[]::new);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		JList seriesList = new JList(seriesArr);
		seriesList.setBackground(new Color(112, 128, 144));
		filmList.setBackground(new Color(112, 128, 144));
		filmList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane seriesPanel = new JScrollPane(seriesList);
		tabbedPane.addTab("Series", null, seriesPanel, null);
		tabbedPane.setBackgroundAt(1, new Color(0, 128, 128));
		
		JPanel toRentPanel = new JPanel();
		toRentPanel.setBounds(324, 223, 188, 110);
		toRentPanel.setBackground(new Color(112, 128, 144));
		add(toRentPanel);
		toRentPanel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 11, 125, 22);
		toRentPanel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 53, 125, 22);
		toRentPanel.add(comboBox_1);
		
		JLabel episodeLngth = new JLabel("Length: +getlength()");
		episodeLngth.setBounds(10, 85, 168, 14);
		toRentPanel.add(episodeLngth);
		
		//Mouse adapter for series list selection
		seriesList.addMouseListener(new PanelButtonMouseAdapter(seriesList){
			@Override
			public void mouseClicked(MouseEvent e) {
			  textArea.setText(series.get(seriesList.getSelectedIndex()).getDescription());
			}
		});
		
		JButton rent = new JButton("Rent");
		rent.setBounds(423, 344, 89, 23);
		add(rent);
		
		
		try {
			if(!qri.getUserActivity(Query.usr.getUser_id())) {
				tabbedPane.remove(seriesPanel);
				tabbedPane.remove(filmPanel);
				textArea.setText(" You need to have an active account in order to rent a film or an episode.");
			}
			else if(qri.getCustomerSub(Query.usr.getUser_id()).equals("S"))tabbedPane.remove(filmPanel);
			else if(qri.getCustomerSub(Query.usr.getUser_id()).equals("M"))tabbedPane.remove(seriesPanel); 
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	
	
	
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		JList  panel;
		public PanelButtonMouseAdapter(JList  panel) {
			this.panel=panel;
		}
	}
}
