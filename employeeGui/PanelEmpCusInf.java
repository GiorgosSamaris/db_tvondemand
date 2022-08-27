package employeeGui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTree;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class PanelEmpCusInf extends JPanel {
	private JTextField CusFirstName;
	private JTextField CusLastName;
	private JTextField CusID;
	private JTextField CusRegDate;

	/**
	 * Create the panel.
	 */
	public PanelEmpCusInf() {
		setBackground(new Color(112, 128, 144));
		setBounds(0,0,601,561);
		setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Address:");
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(340, 370, 129, 20);
		add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Save Customer Info");
		btnNewButton.setForeground(new Color(255, 99, 71));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TO DO: SAVE CUSTOMER INFO
			}
		});
		btnNewButton.setBounds(420, 480, 132, 54);
		add(btnNewButton);
		
		JLabel lblNewLabel_4_1 = new JLabel("Registration Date:");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(10, 490, 129, 20);
		add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Customer ID");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(10, 460, 129, 20);
		add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Last Name:");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_4_3.setBounds(10, 430, 129, 20);
		add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("First Name:");
		lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_4.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_4_4.setBounds(10, 400, 129, 20);
		add(lblNewLabel_4_4);
		
		JLabel LbEmail = new JLabel("Email:");
		LbEmail.setHorizontalAlignment(SwingConstants.CENTER);
		LbEmail.setFont(new Font("Serif", Font.BOLD, 15));
		LbEmail.setBounds(10, 370, 129, 20);
		add(LbEmail);
		
		JLabel lblNewLabel_4_4_2 = new JLabel("Active:");
		lblNewLabel_4_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_4_2.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_4_4_2.setBounds(10, 520, 129, 20);
		add(lblNewLabel_4_4_2);
		
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
		
		CusRegDate = new JTextField();
		CusRegDate.setFont(new Font("Serif", Font.PLAIN, 15));
		CusRegDate.setColumns(10);
		CusRegDate.setBounds(149, 492, 122, 20);
		add(CusRegDate);
		
		JLabel CusEmail = new JLabel("Cant change");
		CusEmail.setFont(new Font("Serif", Font.BOLD, 15));
		CusEmail.setBounds(134, 375, 132, 15);
		add(CusEmail);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 581, 328);
		add(tabbedPane);
		
		JScrollPane ScrollableList = new JScrollPane();
		tabbedPane.addTab("Customer", null, ScrollableList, null);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ScrollableList.setViewportView(list);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(439, 375, 122, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(376, 401, 122, 15);
		add(lblNewLabel_1);


	}
}
