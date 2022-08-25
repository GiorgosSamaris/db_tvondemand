package employeeGui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelEmpEditCat extends JPanel {
	private JTable FilmTable;
	private JTable SeriesTable;

	/**
	 * Create the panel.
	 */
	public PanelEmpEditCat() {
		setBackground(new Color(112, 128, 144));
		setForeground(new Color(0, 0, 0));
		setBounds(0,0,601,561);
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 42, 581, 461);
		add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Film", null, scrollPane, null);
		
		FilmTable = new JTable();
		scrollPane.setViewportView(FilmTable);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane.addTab("Seiries", null, scrollPane_1, null);
		
		SeriesTable = new JTable();
		scrollPane_1.setViewportView(SeriesTable);
		
		JLabel lblNewLabel = new JLabel("Edit Catalogue");
		lblNewLabel.setToolTipText("Choose film/series catalogue and change atrributes.");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(161, 11, 235, 31);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Save Catalogue Changes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// SAVE CATALOGUE CHANGES
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBounds(227, 515, 224, 23);
		add(btnNewButton);


	}
}
