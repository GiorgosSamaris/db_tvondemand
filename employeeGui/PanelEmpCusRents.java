package employeeGui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import content.RentsTableModel;
import queryToDB.Query;

import javax.swing.JButton;
import java.awt.Font;

public class PanelEmpCusRents extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelEmpCusRents(Query q) {
		setBackground(new Color(112, 128, 144));
		setBounds(0,0,601,561);
		setLayout(null);
		
		JLabel CustomerRents = new JLabel("See Customer Rents");
		CustomerRents.setFont(new Font("Dialog", Font.BOLD, 20));
		CustomerRents.setBounds(162, 22, 216, 27);
		add(CustomerRents);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 85, 581, 408);
		add(scrollPane);
		RentsTableModel rents=null;
		try {
			rents = new RentsTableModel(q.getAllRents());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		table = new JTable();
		table.setModel(rents);
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}

}
