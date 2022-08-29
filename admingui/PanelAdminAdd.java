package admingui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class PanelAdminAdd extends JPanel {
	private JTextField textFieldEmail;
	private JTextField textField_FirstName;
	private JTextField textField_LastName;
	private JTextField textField_ID;
	private JTextField textField_Address;
	private JTextField textField_City;
	private JTextField textField_Country;
	private JTextField textField_Postal;
	private JTextField textField_Phone;
	private JTextField textField_District;

	/**
	 * Create the panel.
	 */
	public PanelAdminAdd() {
		setBackground(new Color(105, 105, 105));
		setSize(593,503);
		setLayout(null);
		
		JButton btnADDUSER = new JButton("Add User");
		btnADDUSER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO NA EMFANIZEI SUCCEFUL MINIMA
			}
		});
		btnADDUSER.setFont(new Font("Dialog", Font.BOLD, 15));
		btnADDUSER.setBounds(221, 362, 134, 23);
		add(btnADDUSER);
		
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
		
		JLabel lastNameLabel = new JLabel("Last Name:");
		lastNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lastNameLabel.setFont(new Font("Serif", Font.BOLD, 15));
		lastNameLabel.setBounds(10, 124, 114, 20);
		add(lastNameLabel);
		
		JLabel firstNameLabel = new JLabel("First Name:");
		firstNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		firstNameLabel.setFont(new Font("Serif", Font.BOLD, 15));
		firstNameLabel.setBounds(10, 94, 114, 20);
		add(firstNameLabel);
		
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setFont(new Font("Serif", Font.BOLD, 15));
		emailLabel.setBounds(10, 64, 114, 20);
		add(emailLabel);
		
		JLabel lblCustomerId = new JLabel("ID:");
		lblCustomerId.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerId.setFont(new Font("Serif", Font.BOLD, 15));
		lblCustomerId.setBounds(10, 154, 121, 20);
		add(lblCustomerId);
		
		JLabel phoneLabel = new JLabel("Phone:");
		phoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
		phoneLabel.setFont(new Font("Serif", Font.BOLD, 15));
		phoneLabel.setBounds(300, 185, 129, 20);
		add(phoneLabel);
		
		JLabel postalLabel = new JLabel("Postal:");
		postalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		postalLabel.setFont(new Font("Serif", Font.BOLD, 15));
		postalLabel.setBounds(300, 154, 129, 20);
		add(postalLabel);
		
		JLabel districtLabel = new JLabel("District:");
		districtLabel.setHorizontalAlignment(SwingConstants.CENTER);
		districtLabel.setFont(new Font("Serif", Font.BOLD, 15));
		districtLabel.setBounds(310, 216, 121, 20);
		add(districtLabel);
		
		JLabel countryLabel = new JLabel("Country:");
		countryLabel.setHorizontalAlignment(SwingConstants.CENTER);
		countryLabel.setFont(new Font("Serif", Font.BOLD, 15));
		countryLabel.setBounds(300, 124, 129, 20);
		add(countryLabel);
		
		JLabel cityLabel = new JLabel("City:");
		cityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cityLabel.setFont(new Font("Serif", Font.BOLD, 15));
		cityLabel.setBounds(300, 94, 129, 20);
		add(cityLabel);
		
		JLabel addressLabel = new JLabel("Address:");
		addressLabel.setHorizontalAlignment(SwingConstants.CENTER);
		addressLabel.setFont(new Font("Serif", Font.BOLD, 15));
		addressLabel.setBounds(300, 64, 129, 20);
		add(addressLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(105, 105, 105));
		panel.setBounds(10, 196, 196, 37);
		add(panel);
		
		JLabel subTypeLbl_1 = new JLabel("Subscription type:");
		subTypeLbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		subTypeLbl_1.setFont(new Font("Serif", Font.BOLD, 15));
		panel.add(subTypeLbl_1);
		
		JComboBox comboBox_SubType = new JComboBox();
		panel.add(comboBox_SubType);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(130, 66, 125, 20);
		add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textField_FirstName = new JTextField();
		textField_FirstName.setColumns(10);
		textField_FirstName.setBounds(130, 93, 125, 20);
		add(textField_FirstName);
		
		textField_LastName = new JTextField();
		textField_LastName.setColumns(10);
		textField_LastName.setBounds(134, 126, 121, 20);
		add(textField_LastName);
		
		textField_ID = new JTextField();
		textField_ID.setColumns(10);
		textField_ID.setBounds(134, 155, 121, 20);
		add(textField_ID);
		
		textField_Address = new JTextField();
		textField_Address.setColumns(10);
		textField_Address.setBounds(432, 66, 121, 20);
		add(textField_Address);
		
		textField_City = new JTextField();
		textField_City.setColumns(10);
		textField_City.setBounds(432, 96, 121, 20);
		add(textField_City);
		
		textField_Country = new JTextField();
		textField_Country.setColumns(10);
		textField_Country.setBounds(432, 126, 121, 20);
		add(textField_Country);
		
		textField_Postal = new JTextField();
		textField_Postal.setColumns(10);
		textField_Postal.setBounds(432, 156, 121, 20);
		add(textField_Postal);
		
		textField_Phone = new JTextField();
		textField_Phone.setColumns(10);
		textField_Phone.setBounds(432, 187, 121, 20);
		add(textField_Phone);
		
		textField_District = new JTextField();
		textField_District.setColumns(10);
		textField_District.setBounds(432, 218, 121, 20);
		add(textField_District);

	}
}
