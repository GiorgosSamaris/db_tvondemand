package admingui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

public class PanelAdminDelete extends JPanel {
	private JTable tableDelete;

	/**
	 * Create the panel.
	 */
	public PanelAdminDelete() {
		setBackground(new Color(105, 105, 105));
		setSize(593,503);
		setLayout(null);
		
		JButton btnDelete = new JButton("Delete User");
		btnDelete.setForeground(new Color(255, 127, 80));
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 15));
		btnDelete.setBounds(225, 458, 131, 23);
		add(btnDelete);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 62, 559, 377);
		add(panel);
		
		tableDelete = new JTable();
		panel.add(tableDelete);
		
		JLabel lblNewLabel_7 = new JLabel("Choose Role:");
		lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel_7.setBounds(16, 25, 125, 23);
		add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Customer", "Employee"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(151, 27, 89, 22);
		add(comboBox);


	}
}
