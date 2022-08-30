package employeeGui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import content.RentsTableModel;
import queryToDB.Query;
import user.Customer;
import user.CustomerTableModel;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTree;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class PanelEmpCusInf extends JPanel {
	private JTextField CusFirstName;
	private JTextField CusLastName;
	private JTextField CusID;
	private JTextField CusRegDate;
	private JTextField address;
	private JTextField city;
	private JTextField country;
	private JTextField district;
	private JTextField postal;
	private JTextField phone;
	private JTable table;
	/**
	 * Create the panel.
	 */
	public PanelEmpCusInf(Query q) {
		setBackground(new Color(112, 128, 144));
		setBounds(0,0,601,561);
		setLayout(null);
		
		JLabel addressLabel = new JLabel("Address:");
		addressLabel.setFont(new Font("Serif", Font.BOLD, 15));
		addressLabel.setHorizontalAlignment(SwingConstants.CENTER);
		addressLabel.setBounds(300, 370, 129, 20);
		add(addressLabel);
		
		address = new JTextField();
		address.setFont(new Font("Serif", Font.PLAIN, 15));
		address.setColumns(10);
		address.setBounds(400, 370, 137, 20);
		add(address);
		
		JLabel cityLabel = new JLabel("City:");
		cityLabel.setFont(new Font("Serif", Font.BOLD, 15));
		cityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cityLabel.setBounds(300, 390, 129, 20);
		add(cityLabel);
		
		city = new JTextField();
		city.setFont(new Font("Serif", Font.PLAIN, 15));
		city.setColumns(10);
		city.setBounds(400, 390, 137, 20);
		add(city);
		
		JLabel countryLabel = new JLabel("Country:");
		countryLabel.setFont(new Font("Serif", Font.BOLD, 15));
		countryLabel.setHorizontalAlignment(SwingConstants.CENTER);
		countryLabel.setBounds(300, 410, 129, 20);
		add(countryLabel);
		
		country = new JTextField();
		country.setFont(new Font("Serif", Font.PLAIN, 15));
		country.setColumns(10);
		country.setBounds(400, 410, 137, 20);
		add(country);
		
		JLabel districtLabel = new JLabel("District:");
		districtLabel.setFont(new Font("Serif", Font.BOLD, 15));
		districtLabel.setHorizontalAlignment(SwingConstants.CENTER);
		districtLabel.setBounds(300, 430, 129, 20);
		add(districtLabel);
		
		district = new JTextField();
		district.setFont(new Font("Serif", Font.PLAIN, 15));
		district.setColumns(10);
		district.setBounds(400, 430, 137, 20);
		add(district);
		
		JLabel postalLabel = new JLabel("Postal:");
		postalLabel.setFont(new Font("Serif", Font.BOLD, 15));
		postalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		postalLabel.setBounds(300, 450, 129, 20);
		add(postalLabel);
		
		postal = new JTextField();
		postal.setFont(new Font("Serif", Font.PLAIN, 15));
		postal.setColumns(10);
		postal.setBounds(400, 450, 137, 20);
		add(postal);
		
		JLabel phoneLabel = new JLabel("Phone:");
		phoneLabel.setFont(new Font("Serif", Font.BOLD, 15));
		phoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
		phoneLabel.setBounds(300, 470, 129, 20);
		add(phoneLabel);
		
		phone = new JTextField();
		phone.setFont(new Font("Serif", Font.PLAIN, 15));
		phone.setColumns(10);
		phone.setBounds(400, 470, 137, 20);
		add(phone);
		
		JLabel idLabel = new JLabel("Customer ID");
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setFont(new Font("Serif", Font.BOLD, 15));
		idLabel.setBounds(10, 460, 129, 20);
		add(idLabel);
		
		JLabel lastNameLabel = new JLabel("Last Name:");
		lastNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lastNameLabel.setFont(new Font("Serif", Font.BOLD, 15));
		lastNameLabel.setBounds(10, 430, 129, 20);
		add(lastNameLabel);
		
		JLabel firstNameLabel = new JLabel("First Name:");
		firstNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		firstNameLabel.setFont(new Font("Serif", Font.BOLD, 15));
		firstNameLabel.setBounds(10, 400, 129, 20);
		add(firstNameLabel);
		
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setFont(new Font("Serif", Font.BOLD, 15));
		emailLabel.setBounds(10, 370, 129, 20);
		add(emailLabel);
		
		JLabel subTypeLbl = new JLabel("Subscription type:");
		subTypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		subTypeLbl.setFont(new Font("Serif", Font.BOLD, 15));
		subTypeLbl.setBounds(10, 490, 150, 20);
		add(subTypeLbl);
		
		JComboBox comboBox = new JComboBox();
		String[] types = {"Films","Series", "Both"};
		comboBox.setModel(new DefaultComboBoxModel(types));
		comboBox.setBounds(165, 490, 82, 22);
		add(comboBox);
		
		JLabel activeLabel = new JLabel("Active:");
		activeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		activeLabel.setFont(new Font("Serif", Font.BOLD, 15));
		activeLabel.setBounds(10, 520, 129, 20);
		add(activeLabel);
		
		JCheckBox CusActive = new JCheckBox("");
		CusActive.setBounds(119, 520, 21, 20);
		add(CusActive);
		
		CusFirstName = new JTextField();
		CusFirstName.setFont(new Font("Serif", Font.PLAIN, 15));
		CusFirstName.setColumns(10);
		CusFirstName.setBounds(134, 402, 137, 20);
		add(CusFirstName);
		
		CusLastName = new JTextField();
		CusLastName.setFont(new Font("Serif", Font.PLAIN, 15));
		CusLastName.setColumns(10);
		CusLastName.setBounds(134, 429, 137, 20);
		add(CusLastName);
		
		CusID = new JTextField();
		CusID.setFont(new Font("Serif", Font.PLAIN, 15));
		CusID.setColumns(10);
		CusID.setBounds(134, 459, 137, 20);
		add(CusID);
		

		
		JLabel CusEmail = new JLabel("Cant change");
		CusEmail.setFont(new Font("Serif", Font.BOLD, 15));
		CusEmail.setBounds(134, 375, 132, 15);
		add(CusEmail);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 581, 328);
		add(scrollPane);
		
		List<Customer> customers=updateCustomerList(q);
		CustomerTableModel customersTable=updateCustomerTable(q);
		table = new JTable();
		table.setModel(customersTable);
		table.removeColumn(table.getColumnModel().getColumn(4));
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		table.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e){
				 try {
					 comboBox.setModel(new DefaultComboBoxModel(setComboBox(customers.get(table.getSelectedRow()).getSubType())));
					 CusLastName.setText(customers.get(table.getSelectedRow()).getLastname());
					 CusID.setText(Integer.toString(customers.get(table.getSelectedRow()).getId()));
					 address.setText(customers.get(table.getSelectedRow()).getAddress());
					 city.setText(customers.get(table.getSelectedRow()).getCity());
					 country.setText(customers.get(table.getSelectedRow()).getCountry());
					 district.setText(customers.get(table.getSelectedRow()).getDistrict());
					 postal.setText(customers.get(table.getSelectedRow()).getPostal());
					 phone.setText(customers.get(table.getSelectedRow()).getPhone());
					 CusActive.setSelected(customers.get(table.getSelectedRow()).isActive());
					 CusFirstName.setText(customers.get(table.getSelectedRow()).getName());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 }
		});
		
		JButton saveInfo = new JButton("Save Customer Info");
		saveInfo.setForeground(new Color(255, 99, 71));
		saveInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String subType;
					final String changed_selection = comboBox.getSelectedItem().toString();
					if(changed_selection.equals("Films")) subType = "M";
					else if(changed_selection.equals("Series")) subType = "S";
					else subType = "B";
					if(q.idValid(customers.get(table.getSelectedRow()).getId()) || customers.get(table.getSelectedRow()).getId()==Integer.parseInt(CusID.getText())) {
						q.updateCustomerInfo(customers.get(table.getSelectedRow()).getId(), Integer.parseInt(CusID.getText()), CusFirstName.getText(), CusLastName.getText(), subType, CusActive.isSelected());
						List<Customer> customers=updateCustomerList(q);
						CustomerTableModel customersTable=updateCustomerTable(q);
						table.setModel(customersTable);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					throw new RuntimeException(e1);
				}
			}
		});
		
		saveInfo.setBounds(250, 495, 150, 38);
		add(saveInfo);
		
		JButton saveAddress = new JButton("Save New Address");
		saveAddress.setForeground(new Color(255, 99, 71));
		saveAddress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					q.newAddress(customers.get(table.getSelectedRow()).getId(), address.getText(), city.getText(), country.getText(), district.getText(), postal.getText(), phone.getText());
					List<Customer> customers=updateCustomerList(q);
					CustomerTableModel customersTable=updateCustomerTable(q);
					table.setModel(customersTable);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					throw new RuntimeException(e1);
				}
			}
		});
		
		saveAddress.setBounds(420, 495, 150, 38);
		add(saveAddress);
	}
	
	private List<Customer> updateCustomerList(Query q) {
		List<Customer> customers = null;
		try {
			customers = q.getAllCustomers();
		} catch (Exception e2) {
			throw new RuntimeException(e2);
		}
		return customers;
	}

	private CustomerTableModel updateCustomerTable(Query q) {
		CustomerTableModel customersTable=null;
		List<Customer> customers;
		try {
			customers = q.getAllCustomers();
			customersTable = new CustomerTableModel(customers);
		} catch (Exception e2) {
			throw new RuntimeException(e2);
		}
		return customersTable;
	}
	
	private String[] setComboBox(String subType) {
		String films [] =  {"Films","Series", "Both"};
		String series [] =  {"Series", "Films","Both"};
		String both [] =  {"Both","Films","Series" };
		if(subType.equals("S")) return series;
		else if(subType.equals("M")) return films;
		else return both;
	}
	
}
