package mockFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import queryToDB.Query;

import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;

public class MockMenu extends JFrame {
	private Query qri = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void show(Query query) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MockMenu frame = new MockMenu(query);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MockMenu(Query query) {
		this.qri = query; 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea MockWindow = new JTextArea();
		MockWindow.setFont(new Font("Serif", Font.PLAIN, 30));
		MockWindow.setForeground(new Color(255, 255, 255));
		MockWindow.setBackground(new Color(0, 128, 128));
		MockWindow.setText("Mock Window");
		contentPane.add(MockWindow, BorderLayout.CENTER);
	}

}
