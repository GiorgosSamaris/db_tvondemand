package mockFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.CallableStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;

import content.Episode;
import content.Film;
import content.Series;
import content.Seasons;
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
	private int episode_id;
	private int film_id;
	private int tab_sel;
	public mockCatalogue2(Query qri) {
		setBackground(new Color(112, 128, 144));
		setBounds(0, 0, 522,378);
		setLayout(null);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 522, 212);
		tabbedPane.setBackground(new Color(112, 128, 144));
		add(tabbedPane);

		JPanel toRentPanel = new JPanel();
		toRentPanel.setBounds(324, 223, 188, 110);
		toRentPanel.setBackground(new Color(112, 128, 144));
		add(toRentPanel);
		toRentPanel.setVisible(false);
		toRentPanel.setLayout(null);
		JComboBox<Seasons> comboBox = new JComboBox<>();
		comboBox.setBounds(10, 11, 125, 22);
		toRentPanel.add(comboBox);
		
		JComboBox<Episode> comboBox_1 = new JComboBox<>();
		comboBox_1.setBounds(10, 53, 125, 22);
		toRentPanel.add(comboBox_1);
		
		JLabel episodeLngth = new JLabel("Length: ");
		episodeLngth.setBounds(10, 85, 168, 14);
		toRentPanel.add(episodeLngth);
		
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
				Film flm = films.get(filmList.getSelectedIndex());
			  textArea.setText(flm.getDescription());
			  film_id= flm.getId();
			  tab_sel = 1;
			  toRentPanel.setVisible(false);
			  
				  
				  
			  
			  
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
		seriesList.setBackground(new Color(112, 128, 144));
		seriesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane seriesPanel = new JScrollPane(seriesList);
		tabbedPane.addTab("Series", null, seriesPanel, null);
		tabbedPane.setBackgroundAt(1, new Color(0, 128, 128));
		
		
		
		
		//Mouse adapter for series list selection
		seriesList.addMouseListener(new PanelButtonMouseAdapter(seriesList){
			@Override
			public void mouseClicked(MouseEvent e) {
			int index=0;
			int seasonIndex = 0;
			tab_sel = 2;
			toRentPanel.setVisible(true);
			  index = seriesList.getSelectedIndex();
			  textArea.setText(series.get(index).getDescription());
			  int series_id;
			  int season_id;
			  int ep_id;
			  int length;
			  series_id=series.get(index).getId();
			  
			  	final String[] seasonsArr;
				final List<Seasons> seasons;
				try {
					seasons = qri.getSeriesSeasons(series_id);
					seasonsArr = seasons.stream().map(Seasons::getSeason_name).collect(Collectors.toList()).toArray(String[]::new);
					comboBox.setModel(new DefaultComboBoxModel(seasonsArr));
					seasonIndex = comboBox.getSelectedIndex();
					Seasons selectedSeason = seasons.get(seasonIndex);
					List<Episode> episodes;
					String[] episodesArr;
					System.out.print(selectedSeason.getSeason_id());
					episodes = qri.getSeasonsEpisodes(selectedSeason.getSeason_id());
					episodesArr = episodes.stream().map(Episode::getEpisode_name).collect(Collectors.toList()).toArray(String[]::new);
					comboBox_1.setModel(new DefaultComboBoxModel(episodesArr));
					episode_id = episodes.get(comboBox_1.getSelectedIndex()).getEpisode_id();
					length = episodes.get(comboBox_1.getSelectedIndex()).getLenght();
					episodeLngth.setText("Length: "+String.valueOf(length));
					
				} catch (Exception x) {
					
				}
			}
		});
		
		JButton rent = new JButton("Rent");
		rent.setBounds(423, 344, 89, 23);
		add(rent);
		rent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(tab_sel == 1)
					{
						qri.rentAFilm(film_id);
						
					}
					else if(tab_sel == 2)
					{
						qri.dadadirladada(episode_id);
						
					}
					
					
				}
				catch(Exception ex)
				{
					
				}
				
			}
		});
		
		
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
