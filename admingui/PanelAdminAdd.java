package admingui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class PanelAdminAdd extends JPanel {
	private JTextField textFieldFN;
	private JTextField textFieldLN;
	private JTextField textField_email;
	private JTextField textField_address;
	private JTextField textField_city;
	private JTextField textField_country;
	private JTextField textField_district;
	private JTextField textField_phone;
	private JTextField textField_Postal;

	/**
	 * Create the panel.
	 */
	public PanelAdminAdd() {
		setBackground(new Color(105, 105, 105));
		setBounds(0, 0, 595, 503);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 48, 573, 272);
		add(panel);
		panel.setLayout(null);
		
		JLabel firstname = new JLabel("First Name:");
		firstname.setFont(new Font("Serif", Font.BOLD, 15));
		panel.add(firstname, "2, 2, right, default");
		
		textFieldFN = new JTextField();
		textFieldFN.setColumns(10);
		panel.add(textFieldFN, "4, 2, fill, default");
		
		JLabel lastname = new JLabel("Last Name:");
		lastname.setFont(new Font("Serif", Font.BOLD, 15));
		panel.add(lastname, "2, 4, right, default");
		
		textFieldLN = new JTextField();
		textFieldLN.setColumns(10);
		panel.add(textFieldLN, "4, 4, fill, default");
		
		JLabel email = new JLabel("Email:");
		email.setFont(new Font("Serif", Font.BOLD, 15));
		panel.add(email, "2, 6, right, default");
		
		textField_email = new JTextField();
		textField_email.setColumns(10);
		panel.add(textField_email, "4, 6, fill, default");
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Serif", Font.BOLD, 15));
		panel.add(lblAddress, "2, 8, right, default");
		
		textField_address = new JTextField();
		textField_address.setColumns(10);
		panel.add(textField_address, "4, 8, fill, default");
		
		JLabel firstname_2_1 = new JLabel("City:");
		firstname_2_1.setFont(new Font("Serif", Font.BOLD, 15));
		panel.add(firstname_2_1, "2, 10, right, default");
		
		textField_city = new JTextField();
		textField_city.setColumns(10);
		panel.add(textField_city, "4, 10, fill, default");
		
		JLabel firstname_2_2 = new JLabel("Country:");
		firstname_2_2.setFont(new Font("Serif", Font.BOLD, 15));
		panel.add(firstname_2_2, "2, 12, right, default");
		
		textField_country = new JTextField();
		textField_country.setColumns(10);
		panel.add(textField_country, "4, 12, fill, default");
		
		JLabel firstname_2_3 = new JLabel("District:");
		firstname_2_3.setFont(new Font("Serif", Font.BOLD, 15));
		panel.add(firstname_2_3, "2, 14, right, default");
		
		textField_district = new JTextField();
		textField_district.setColumns(10);
		panel.add(textField_district, "4, 14, fill, default");
		
		JLabel firstname_2_4 = new JLabel("Phone:");
		firstname_2_4.setFont(new Font("Serif", Font.BOLD, 15));
		panel.add(firstname_2_4, "2, 16, right, default");
		
		textField_phone = new JTextField();
		textField_phone.setColumns(10);
		panel.add(textField_phone, "4, 16, fill, default");
		
		JLabel firstname_2_4_1 = new JLabel("Postal Code:");
		firstname_2_4_1.setFont(new Font("Serif", Font.BOLD, 15));
		panel.add(firstname_2_4_1, "2, 18, right, default");
		
		textField_Postal = new JTextField();
		textField_Postal.setColumns(10);
		panel.add(textField_Postal, "4, 18, fill, default");
		
		JButton btnNewButton = new JButton("Add User");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO NA EMFANIZEI SUCCEFUL MINIMA
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBounds(221, 362, 134, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Choose Role:");
		lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel_7.setBounds(10, 11, 125, 23);
		add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Customer", "Employee"}));
		comboBox.setBounds(134, 15, 92, 22);
		add(comboBox);
		
		JTextArea txtrtheNewlyRegistered = new JTextArea();
		txtrtheNewlyRegistered.setBackground(new Color(0, 128, 128));
		txtrtheNewlyRegistered.setFont(new Font("Serif", Font.BOLD, 15));
		txtrtheNewlyRegistered.setLineWrap(true);
		txtrtheNewlyRegistered.setText("*The newly registered Customer has a type \"Both\" default setting as Subcription     type.Also be aware that the new user will be seen from the next login.");
		txtrtheNewlyRegistered.setBounds(10, 424, 557, 53);
		add(txtrtheNewlyRegistered);

	}
}
