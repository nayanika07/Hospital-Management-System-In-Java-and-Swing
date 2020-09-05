package com.patient_registration;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.registration.Registration;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ConsultingAppointment extends JFrame {

	private JPanel contentPane;
	private JTextField ref;
	private JTextField pname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultingAppointment frame = new ConsultingAppointment();
					frame.setVisible(true);
					frame.setTitle("Consulting Appointment Application Form");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConsultingAppointment() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ConsultingAppointment.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 701, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulting Appointment");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblNewLabel.setBounds(101, 11, 470, 44);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(60, 79, 561, 289);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Referral Details");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(50, 29, 101, 25);
		panel.add(lblNewLabel_1);
		
		ref = new JTextField();
		ref.setBounds(177, 29, 319, 25);
		panel.add(ref);
		ref.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Patient Name");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(50, 79, 101, 25);
		panel.add(lblNewLabel_2);
		
		pname = new JTextField();
		pname.setBounds(177, 80, 319, 25);
		panel.add(pname);
		pname.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Lab Tests");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(50, 137, 101, 25);
		panel.add(lblNewLabel_3);
		
		JRadioButton rb1 = new JRadioButton("Yes");
		rb1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb1.setBounds(177, 139, 92, 23);
		panel.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("No");
		rb2.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb2.setBounds(291, 138, 101, 23);
		panel.add(rb2);
		
		JLabel lblNewLabel_4 = new JLabel("Radiology Service");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(44, 204, 126, 25);
		panel.add(lblNewLabel_4);
		
		JRadioButton rb3 = new JRadioButton("Yes");
		rb3.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb3.setBounds(177, 206, 92, 23);
		panel.add(rb3);
		
		JRadioButton rb4 = new JRadioButton("No");
		rb4.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb4.setBounds(291, 206, 101, 23);
		panel.add(rb4);
		
		JButton confirmbtn = new JButton("CONFIRM");
		confirmbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		confirmbtn.setBounds(123, 399, 125, 32);
		contentPane.add(confirmbtn);
		confirmbtn.addActionListener((e) -> {

			try {
				String referral,patient;
				patient = pname.getText().toString();
			    referral = ref.getText().toString();
	            
		
				

				if (patient.equals("") || referral.equals(""))
					JOptionPane.showMessageDialog(this, "Please fill in the mandatory fields", "Error Alert",
							JOptionPane.ERROR_MESSAGE);

				else {
					String line;

					FileWriter writer = new FileWriter("C:\\Users\\Nayanika\\Desktop\\ConsultingAppointment.txt",
							true);
					
						line = referral+"|"+patient +"\n";
						writer.write(line);
						writer.write("\n");
				
					writer.close();
					System.out.println("file write successful");
					JOptionPane.showMessageDialog(this, "Out Patient Details Saved");
				}
			} // try ends

			catch (IOException ioe) {
				System.out.println("File Write Unsuccessful!");
			} // catch ends

		});// action ends
		
		
		JButton cancelbtn = new JButton("CANCEL");
		cancelbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		cancelbtn.setBounds(295, 399, 110, 32);
		contentPane.add(cancelbtn);
		cancelbtn.addActionListener((e) -> {
			JOptionPane.showMessageDialog(this, "Process cancelled on request");

		});
		
		JButton exitbtn = new JButton("EXIT");
		exitbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		exitbtn.setBounds(449, 399, 98, 32);
		contentPane.add(exitbtn);
		exitbtn.addActionListener((e)->{
			this.setVisible(false);
		});
		
		JButton prevbtn = new JButton("<<PREV");
		prevbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		prevbtn.setBounds(10, 463, 134, 36);
		contentPane.add(prevbtn);
		prevbtn.addActionListener((e)->{
			this.setVisible(false);
			new OutPatient().setVisible(true);
		});
		
		JButton nextbtn = new JButton("NEXT>>");
		nextbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		nextbtn.setBounds(541, 463, 134, 36);
		contentPane.add(nextbtn);
		nextbtn.addActionListener((e)->{
			this.setVisible(false);
			new Transfer().setVisible(true);
		});
	
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(ConsultingAppointment.class.getResource("/Images/doctor-appointment-300x188.jpg")));
		lblNewLabel_5.setBounds(10, 11, 98, 44);
		contentPane.add(lblNewLabel_5);
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ConsultingAppointment.class.getResource("/Images/doctor-appointment-300x188.jpg")));
		label.setBounds(572, 11, 113, 44);
		contentPane.add(label);
		JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
		background.setBounds(-202, -866, 1555, 2232);
		background.setFont(new Font("Tahoma", Font.ITALIC, 14));
		getContentPane().add(background);
		
	
		

		
	
		
	
	}
}
