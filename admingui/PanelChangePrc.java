package admingui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import content.Film;
import content.Series;
import queryToDB.Query;

public class PanelChangePrc extends JPanel {
	private JTextField priceTxtFld;
	private String contentSelected;
	/**
	 * Create the panel.
	 */
	public PanelChangePrc(Query q) {
		setBackground(new Color(105, 105, 105));
		setSize(593,503);
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 28, 561, 394);
		add(tabbedPane);
		
//		JScrollPane scrollFilms = new JScrollPane();
//		tabbedPane.addTab("Films", null, scrollFilms, null);
//		
//		JList list_Films = new JList();
//		scrollFilms.setViewportView(list_Films);
		
		String[] filmArr;
		final List<Film> films;
		try {
			films = q.getAvailableFilms();
			filmArr = films.stream().map(Film::getTitle).collect(Collectors.toList()).toArray(String[]::new);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		JList filmList = new JList(filmArr);
		filmList.setBackground(new Color(119, 136, 153));
		filmList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane filmPanel = new JScrollPane(filmList);
		tabbedPane.addTab("Films", null, filmPanel, null);
		tabbedPane.setBackgroundAt(0, new Color(0, 128, 128));
		
		String[] seriesArr;
		final List<Series> series;
		try {
			series = q.getAvailableSeries();
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
		
		JButton changePriceButton = new JButton("Change Pricing");
		changePriceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contentSelected.equals("series"))
					try {
						q.updateContentPrice(contentSelected, series.get(seriesList.getSelectedIndex()).getId(),Float.parseFloat(priceTxtFld.getText()));
					} catch (NumberFormatException e1) {
						e1.printStackTrace();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				else
					try {
						q.updateContentPrice(contentSelected, films.get(filmList.getSelectedIndex()).getId(), Float.parseFloat(priceTxtFld.getText()));
					} catch (NumberFormatException e1) {
						e1.printStackTrace();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
			}
		});
		changePriceButton.setForeground(new Color(244, 164, 96));
		changePriceButton.setFont(new Font("Dialog", Font.BOLD, 15));
		changePriceButton.setBounds(309, 442, 147, 38);
		add(changePriceButton);
		
		priceTxtFld = new JTextField();
		priceTxtFld.setFont(new Font("Serif", Font.BOLD, 15));
		priceTxtFld.setBounds(123, 453, 96, 20);
		add(priceTxtFld);
		priceTxtFld.setColumns(10);
		
		JLabel lbPrice = new JLabel("Price:");
		lbPrice.setFont(new Font("Serif", Font.BOLD, 15));
		lbPrice.setBounds(69, 443, 52, 37);
		add(lbPrice);
		
		//Mouse adapter for series list selection
		seriesList.addMouseListener(new PanelButtonMouseAdapter(seriesList){
			@Override
			public void mouseClicked(MouseEvent e) {
			  priceTxtFld.setText(Float.toString(series.get(seriesList.getSelectedIndex()).getPrice()));
			  contentSelected = "series";
			}
		});
		
		
		//Mouse adapter for film list selection
		filmList.addMouseListener(new PanelButtonMouseAdapter(filmList){
			@Override
			public void mouseClicked(MouseEvent e) {
				  priceTxtFld.setText(Float.toString(films.get(filmList.getSelectedIndex()).getPrice()));
				  contentSelected = "film";
			}
		});
	}
	private class PanelButtonMouseAdapter extends MouseAdapter{
		JList  panel;
		public PanelButtonMouseAdapter(JList  panel) {
			this.panel=panel;
		}
	}
}
