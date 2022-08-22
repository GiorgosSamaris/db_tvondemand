package mockFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import QueryInterface.QueryInterface;

import java.awt.Color;

public class MockMenu extends JFrame {
	private QueryInterface qri = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void show(QueryInterface query) {
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
	public MockMenu(QueryInterface query) {
		this.qri = query; 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
