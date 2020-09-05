package com.payment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

public class CashPayment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashPayment frame = new CashPayment();
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
	public CashPayment() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CashPayment.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Payment Successful! Thank You");
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setBackground(new Color(176, 196, 222));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(22, 96, 389, 36);
		contentPane.add(lblNewLabel);
	}

}
