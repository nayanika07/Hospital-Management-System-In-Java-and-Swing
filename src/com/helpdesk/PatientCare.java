package com.helpdesk;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.registration.Registration;

import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class PatientCare extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientCare frame = new PatientCare();
					frame.setTitle("Patient Care");
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
	public PatientCare() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PatientCare.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1263, 765);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Patient Care ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 28));
		lblNewLabel.setBounds(0, 0, 1257, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PatientCare.class.getResource("/Images/shutterstock_238674805-675x380.jpg")));
		lblNewLabel_1.setBounds(0, 45, 499, 242);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(PatientCare.class.getResource("/Images/healthchart.jpg")));
		lblNewLabel_2.setBounds(10, 281, 514, 434);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(PatientCare.class.getResource("/Images/Essential-Vaccination-Chart-6.jpg")));
		lblNewLabel_3.setBounds(532, 246, 705, 469);
		contentPane.add(lblNewLabel_3);
		JLabel lblNewLabel_5 = new JLabel("7th December");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_5.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_5.setBounds(785, 202, 138, 33);
		contentPane.add(lblNewLabel_5);
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(PatientCare.class.getResource("/Images/free-heart-check-up.jpg")));
		lblNewLabel_4.setBounds(757, 45, 480, 203);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(PatientCare.class.getResource("/Images/HTB1KhFIl22H8KJjy0Fcq6yDlFXaU.jpg_350x350.jpg")));
		lblNewLabel_6.setBounds(503, 42, 255, 205);
		contentPane.add(lblNewLabel_6);
		
		JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
		background.setBounds(-202, -866, 1555, 2232);
		background.setFont(new Font("Tahoma", Font.ITALIC, 14));
		getContentPane().add(background);
		

	}

}
