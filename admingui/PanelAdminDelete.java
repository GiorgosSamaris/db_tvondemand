package admingui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import queryToDB.Query;
import user.Customer;
import user.CustomerTableModel;
import user.Employee;
import user.EmployeeTableModel;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

public class PanelAdminDelete extends JPanel {
	private JTable table;
	
	/**
	 * Create the panel.
	 */
	public PanelAdminDelete(Query q) {
		setBackground(new Color(105, 105, 105));
		setSize(593,503);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 62, 559, 377);
		add(scrollPane);
		
		JLabel roleLbl = new JLabel("Choose Role:");
		roleLbl.setFont(new Font("Serif", Font.BOLD, 20));
		roleLbl.setBounds(16, 25, 125, 23);
		add(roleLbl);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Customer", "Employee"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(151, 27, 89, 22);
		add(comboBox);
		
		List<Employee> employees;
		List<Customer> customers;
		try {
			employees = q.getAllEmployees();
			customers = q.getAllCustomers();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		EmployeeTableModel employeesTable = new EmployeeTableModel(employees);
		CustomerTableModel customersTable= new CustomerTableModel(customers);
		table = new JTable();
		table.setModel(customersTable);
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JLabel infoLbl = new JLabel("Changes will appear on next log in");
		infoLbl.setFont(new Font("Serif", Font.BOLD, 12));
		infoLbl.setBounds(340, 458, 200, 23);
		add(infoLbl);
		infoLbl.setVisible(false);
		
		JButton btnDelete = new JButton("Delete User");
		btnDelete.setForeground(new Color(255, 127, 80));
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 15));
		btnDelete.setBounds(200, 458, 131, 23);
		add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(comboBox.getSelectedIndex()==0)q.deleteUser("c", customers.get(table.getSelectedRow()).getId());
					else q.deleteUser("e", employees.get(table.getSelectedRow()).getId());
					infoLbl.setVisible(true);
				} catch (Exception e1) {
					throw new RuntimeException(e1);
				}
			}
		});
		
		JButton getBtn = new JButton("Fetch");
		getBtn.setForeground(new Color(255, 127, 80));
		getBtn.setFont(new Font("Dialog", Font.BOLD, 15));
		getBtn.setBounds(250, 27, 89, 22);
		add(getBtn);
		getBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(comboBox.getSelectedIndex()==0)table.setModel(customersTable);
					else table.setModel(employeesTable);
				} catch (Exception e1) {
					throw new RuntimeException(e1);
				}
			}
		});


	}
}
