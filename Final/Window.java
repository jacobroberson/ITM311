import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class Window {

	private static JFrame Login;
	private static JFrame Reservation;
	private JLabel lblName;
	private JTextField textField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					Window.Login.setVisible(true);
					window.Reservation.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Login = new JFrame();
		Login.setTitle("Login");
		Login.setBounds(100, 100, 450, 300);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Reservation = new JFrame();
		Reservation.setTitle("Hotel Reservations");
		Reservation.setBounds(100, 100, 450, 300);
		Reservation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel2 = new JPanel();
		Reservation.getContentPane().add(panel2, BorderLayout.NORTH);
		panel2.setLayout(new GridLayout(6,2));
		
		lblName = new JLabel("Name");
		panel2.add(lblName);
		
		textField = new JTextField();
		panel2.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("New button");
		panel2.add(btnNewButton);
	}

}
