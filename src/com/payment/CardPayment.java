package com.payment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

public class CardPayment extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=171,-11
	 */
	private JTextField textField = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardPayment frame = new CardPayment();
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
	public CardPayment() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CardPayment.class.getResource("/Images/border logo.png")));
		textField.setColumns(10);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 645, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(47, 115, 540, 290);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Enter Card Number");
		lblNewLabel_1.setFont(new Font("Consolas", Font.BOLD, 13));
		lblNewLabel_1.setBounds(78, 104, 133, 25);
		panel.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setToolTipText("Enter 16 digit Card Number");
		textField.setBounds(211, 104, 343, 23);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Enter Card Name");
		lblNewLabel_2.setFont(new Font("Consolas", Font.BOLD, 13));
		lblNewLabel_2.setBounds(93, 138, 133, 25);
		panel.add(lblNewLabel_2);

		JTextField textField_1 = new JTextField();
		textField_1.setBounds(211, 138, 343, 23);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Enter CVV");
		lblNewLabel_3.setFont(new Font("Consolas", Font.BOLD, 13));
		lblNewLabel_3.setBounds(130, 208, 96, 23);
		panel.add(lblNewLabel_3);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setToolTipText("CVV must be 3 digits");
		passwordField.setBounds(256, 207, 157, 23);
		panel.add(passwordField);

		JLabel lblNewLabel_4 = new JLabel("Valid Through");
		lblNewLabel_4.setFont(new Font("Consolas", Font.BOLD, 13));
		lblNewLabel_4.setBounds(115, 174, 96, 23);
		panel.add(lblNewLabel_4);

		JTextField textField_3 = new JTextField();
		textField_3.setToolTipText("MM/YY");
		textField_3.setBounds(256, 171, 157, 25);
		panel.add(textField_3);
		textField_3.setColumns(10);

		JButton btnNewButton = new JButton("Make Payment");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));

		btnNewButton.addActionListener((e) -> {
			if ((textField.getText().trim().equals("")) || (textField_1.getText().trim().equals(""))
					|| (passwordField.getText().trim().equals("")) || (textField_3.getText().trim().equals(""))) {
				JOptionPane.showMessageDialog(this, "Please fill in the required fields", "Error Alert",
						JOptionPane.ERROR_MESSAGE);
			}

			else if (passwordField.getText().length() != 3) {
				JOptionPane.showMessageDialog(this, "CVV must be 3 digits!", "Error Alert", JOptionPane.ERROR_MESSAGE);
			} else
				JOptionPane.showMessageDialog(this, "Payment Successful! Thank You");
		});

		btnNewButton.setBounds(112, 253, 141, 33);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener((e) -> {
			this.setVisible(false);
			new PaymentPortal().setVisible(true);
		});
		btnNewButton_1.setBounds(275, 253, 126, 33);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Payment Gateway");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBackground(new Color(176, 196, 222));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(10, 26, 599, 35);

	}

}
