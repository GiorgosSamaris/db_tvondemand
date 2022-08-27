package customerGui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import content.RentsTableModel;
import queryToDB.Query;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PanelShowMyRents extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelShowMyRents(Query q) {
		setBackground(new Color(105, 105, 105));
		setBounds(0, 0, 522,378);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Your Rented Content");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 522, 37);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 59, 522, 232);
		add(scrollPane);
		RentsTableModel rents=null;
		try {
			rents = new RentsTableModel(q.getUserRents());
		} catch (Exception e) {
			e.printStackTrace();
		}
		table = new JTable();
		table.setModel(rents);
		table.removeColumn(table.getColumnModel().getColumn(4));
		scrollPane.setViewportView(table);
		
		JLabel lblEurosSpentOn = new JLabel("Euros spent on rents:");
		lblEurosSpentOn.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEurosSpentOn.setFont(new Font("Serif", Font.BOLD, 20));
		lblEurosSpentOn.setBounds(0, 313, 295, 37);
		add(lblEurosSpentOn);
		
		JLabel Sum = new JLabel(rents.getRentSum().toString()+" €");
		Sum.setFont(new Font("Dialog", Font.BOLD, 15));
		Sum.setBounds(305, 313, 102, 37);
		add(Sum);

	}
}
