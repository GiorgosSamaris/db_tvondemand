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
import queryToDB.Query;
import javax.swing.JTextArea;

public class mockCatalogue2 extends JPanel {

	/**
	 * Create the panel.
	 * @param qri 
	 */
	public mockCatalogue2(Query qri) {
		setBounds(0, 0, 522,378);
		setLayout(null);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 522, 212);
		add(tabbedPane);
		String[] arr;
		final List<Film> films;
		try {
			films = qri.getAvailableFilms();
			arr = films.stream().map(Film::getTitle).collect(Collectors.toList()).toArray(String[]::new);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		JList list = new JList(arr);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollableList = new JScrollPane(list);
		scrollableList.setBounds(66, 47, 274, 151);
		tabbedPane.addTab("New tab", null, scrollableList, null);
		
		JTextArea textArea = new JTextArea("Choose a film to show description and rent");
		textArea.setLineWrap(true);
		textArea.setBounds(10, 223, 304, 144);
		add(textArea);

		list.addMouseListener(new PanelButtonMouseAdapter(list){
			@Override
			public void mouseClicked(MouseEvent e) {
			  textArea.setText(films.get(list.getSelectedIndex()).getDescription());
			}
		});
		
		JList list_1 = new JList();
		tabbedPane.addTab("New tab", null, list_1, null);
		
		
	}
	private class PanelButtonMouseAdapter extends MouseAdapter{
		JList  panel;
		public PanelButtonMouseAdapter(JList  panel) {
			this.panel=panel;
		}
	}
}
