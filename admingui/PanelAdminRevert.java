package admingui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAdminRevert extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelAdminRevert() {
		setBackground(new Color(105, 105, 105));
		setSize(593,503);
		setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Choose The Current Role of the User you want to Change:");
		lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_7.setBounds(10, 23, 395, 23);
		add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Employee", "Admin"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(400, 25, 89, 22);
		add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 71, 551, 363);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Change Role");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO Change ADMIN-EMPLOYEE VICE VERSA
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBounds(249, 455, 125, 23);
		add(btnNewButton);


	}

}
