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

public class PanelAdminDelete extends JPanel {
	private JTable tableEmployee;
	private JTable tableCustomer;

	/**
	 * Create the panel.
	 */
	public PanelAdminDelete() {
		setBackground(new Color(105, 105, 105));
		setSize(593,503);
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 562, 407);
		add(tabbedPane);
		
		JScrollPane scrollCustomer = new JScrollPane();
		tabbedPane.addTab("Customer", null, scrollCustomer, null);
		
		tableCustomer = new JTable();
		tableCustomer.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollCustomer.setViewportView(tableCustomer);
		
		JScrollPane scrollEmployee = new JScrollPane();
		tabbedPane.addTab("Employee", null, scrollEmployee, null);
		
		tableEmployee = new JTable();
		tableEmployee.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollEmployee.setViewportView(tableEmployee);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(new Color(255, 127, 80));
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 15));
		btnDelete.setBounds(228, 449, 89, 23);
		add(btnDelete);


	}
}
