package gui3;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PanelShowMyRents extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelShowMyRents() {
		setBackground(new Color(105, 105, 105));
		setSize(522,378);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Your Rented Content");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 522, 37);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 59, 522, 232);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblEurosSpentOn = new JLabel("Euros spent on rents:");
		lblEurosSpentOn.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEurosSpentOn.setFont(new Font("Serif", Font.BOLD, 20));
		lblEurosSpentOn.setBounds(0, 313, 295, 37);
		add(lblEurosSpentOn);
		
		JLabel Sum = new JLabel("Sum");
		Sum.setFont(new Font("Dialog", Font.BOLD, 15));
		Sum.setBounds(305, 313, 102, 37);
		add(Sum);

	}
}
