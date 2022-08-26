package mockFrame;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import customerGui.RentsTableModel;
import queryToDB.Query;

import javax.swing.JScrollPane;

public class mockRental extends JPanel {
	private JTable table;

	public mockRental(Query q) {
		setBackground(new Color(112, 128, 144));
		setBounds(0, 0, 522,378);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 463, 259);
		add(scrollPane);
		RentsTableModel rents=null;
		try {
			rents = new RentsTableModel(q.getUserRents());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		table = new JTable();
		table.setModel(rents);
		scrollPane.setViewportView(table);
		
	}
}
