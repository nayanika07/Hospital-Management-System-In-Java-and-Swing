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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WalletPayment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WalletPayment frame = new WalletPayment();
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
	public WalletPayment() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 564, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(39, 23, 538, 187);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Mobile Number Registered With Paytm/PhonePe");
		lblNewLabel.setBounds(75, 47, 427, 23);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JTextField textField = new JTextField();
		textField.setBounds(184, 81, 200, 23);
		panel.add(textField);
		textField.setColumns(10);
		
		
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener((e)->{
			this.dispose();
		});
		btnNewButton_1.setBounds(383, 126, 119, 32);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Make Payment");
		btnNewButton.setBounds(214, 126, 145, 32);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnNewButton_2 = new JButton("<<Back");
		btnNewButton_2.addActionListener((e)->{
			new PaymentPortal().setVisible(true);
			this.dispose();
		});
		btnNewButton_2.setBounds(75, 126, 119, 32);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(btnNewButton_2);
		btnNewButton.addActionListener((e)->
		{
			if(textField.getText().trim().equals(""))
				JOptionPane.showMessageDialog(this,"Please fill in your Mobile Number","Error Alert", JOptionPane.ERROR_MESSAGE);
			else JOptionPane.showMessageDialog(this, "Payment Successful! Thank You");
		});
	}

}
