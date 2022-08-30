package admingui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import queryToDB.Query;
import user.Admin;
import user.AdminTableModel;
import user.Customer;
import user.CustomerTableModel;
import user.Employee;
import user.EmployeeTableModel;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class PanelAdminSwapRoles extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelAdminSwapRoles(Query q) {
		setBackground(new Color(105, 105, 105));
		setSize(593,503);
		setLayout(null);
		
		JLabel titleLbl = new JLabel("Choose The Current Role of the User you want to Change:");
		titleLbl.setFont(new Font("Serif", Font.BOLD, 15));
		titleLbl.setBounds(10, 23, 395, 23);
		add(titleLbl);
		
		JComboBox roleComboBox = new JComboBox();
		roleComboBox.setModel(new DefaultComboBoxModel(new String[] {"Employee", "Admin"}));
		roleComboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		roleComboBox.setBounds(400, 25, 89, 22);
		add(roleComboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 71, 551, 363);
		add(scrollPane);
		
		List<Employee> employees;
		List<Admin> admins;
		try {
			employees = q.getAllEmployees();
			admins = q.getAllAdmins();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		EmployeeTableModel employeesTable = new EmployeeTableModel(employees);
		AdminTableModel adminsTable= new AdminTableModel(admins);
		table = new JTable();
		table.setModel(employeesTable);
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JButton changeRoleBttn = new JButton("Swap Role");
		changeRoleBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(roleComboBox.getSelectedIndex()==0)
					try {
						q.swapAdminEmployee("e", employees.get(table.getSelectedRow()).getId());
					} catch (Exception e1) {
						throw new RuntimeException(e1);
					}
				else
					try {
						q.swapAdminEmployee("a", admins.get(table.getSelectedRow()).getId());
					} catch (Exception e1) {
						throw new RuntimeException(e1);
					}
			}
		});
		changeRoleBttn.setFont(new Font("Dialog", Font.BOLD, 15));
		changeRoleBttn.setBounds(249, 455, 125, 23);
		add(changeRoleBttn);

		JButton getBtn = new JButton("Fetch");
		getBtn.setForeground(new Color(255, 127, 80));
		getBtn.setFont(new Font("Dialog", Font.BOLD, 15));
		getBtn.setBounds(500, 25, 89, 22);
		add(getBtn);
		getBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(roleComboBox.getSelectedIndex()==0) {
						table.setModel(employeesTable);}
					else { 
						table.setModel(adminsTable);}
				} catch (Exception e1) {
					throw new RuntimeException(e1);
				}
			}
		});
	}
}
