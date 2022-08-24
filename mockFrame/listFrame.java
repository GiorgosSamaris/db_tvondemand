package mockFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;

import content.Film;
import queryToDB.Query;

import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;

public class listFrame extends JFrame {
	private Query qri = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void listFrameRun(Query query) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listFrame frame = new listFrame(query);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public listFrame(Query query) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		try {
			String[] films = query.getAvailableFilms().stream().map(Film::getTitle).collect(Collectors.toList()).toArray(String[]::new);
			JList<String> list = new JList<String>(films);
			JScrollPane scrollableList = new JScrollPane(list);
			scrollableList.setBounds(66, 47, 274, 151);
			contentPane.add(scrollableList);
		} catch (Exception e1) {
			throw new RuntimeException(e1);
		}
		JLabel lblNewLabel = new JLabel("Film list");
		lblNewLabel.setBounds(149, 22, 46, 14);
		contentPane.add(lblNewLabel);
	}
}
