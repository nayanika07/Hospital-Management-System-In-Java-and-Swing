package com.staff_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.registration.Registration;
import com.ward_management.Ward_Management;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.border.MatteBorder;

public class NewNurse extends JFrame {

	private JPanel contentPane;
	private JTextField name_text;
	private JTextField dob_text;
	private JTextField doj_text;
	private JTextField contact_text;
	private JTextField address_text;
	private JTextField salary_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewNurse frame = new NewNurse();
					frame.setTitle("Add New Nurse");
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
	public NewNurse() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewNurse.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 854, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Nurse Information");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblNewLabel.setBounds(86, 11, 742, 58);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(238, 232, 170));
		panel.setBounds(86, 80, 655, 399);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(49, 11, 148, 19);
		panel.add(lblNewLabel_1);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth:");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateOfBirth.setBounds(49, 41, 148, 19);
		panel.add(lblDateOfBirth);
		
		JLabel lblDateOfJoining = new JLabel("Date Of Joining:");
		lblDateOfJoining.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateOfJoining.setBounds(49, 106, 148, 19);
		panel.add(lblDateOfJoining);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setHorizontalAlignment(SwingConstants.CENTER);
		lblSex.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSex.setBounds(49, 76, 79, 19);
		panel.add(lblSex);
		
		JRadioButton rb1 = new JRadioButton("Male");
		rb1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb1.setBounds(193, 76, 102, 23);
		panel.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Female");
		rb2.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb2.setBounds(325, 74, 102, 23);
		panel.add(rb2);
		
		name_text = new JTextField();
		name_text.setBounds(194, 11, 304, 19);
		panel.add(name_text);
		name_text.setColumns(10);
		
		dob_text = new JTextField();
		dob_text.setBounds(194, 41, 117, 19);
		panel.add(dob_text);
		dob_text.setColumns(10);
		
		doj_text = new JTextField();
		doj_text.setColumns(10);
		doj_text.setBounds(194, 106, 117, 19);
		panel.add(doj_text);
		
		JLabel lblNewLabel_2 = new JLabel("Contact Number:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(49, 149, 109, 19);
		panel.add(lblNewLabel_2);
		
		contact_text = new JTextField();
		contact_text.setBounds(193, 148, 186, 20);
		panel.add(contact_text);
		contact_text.setColumns(10);
		
		JLabel lblPermanentAddress = new JLabel("Permanent Address:");
		lblPermanentAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPermanentAddress.setBounds(38, 191, 148, 19);
		panel.add(lblPermanentAddress);
		
		address_text = new JTextField();
		address_text.setBounds(193, 191, 311, 56);
		panel.add(address_text);
		address_text.setColumns(10);
		
		JLabel lblSalaryinr = new JLabel("Salary*(INR):");
		lblSalaryinr.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSalaryinr.setBounds(49, 263, 109, 19);
		panel.add(lblSalaryinr);
		
		salary_text = new JTextField();
		salary_text.setBounds(193, 273, 126, 20);
		panel.add(salary_text);
		salary_text.setColumns(10);
		
		JButton savebtn = new JButton("SAVE");
		savebtn.setBounds(95, 340, 102, 37);
		panel.add(savebtn);
		savebtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		savebtn.addActionListener((e) -> {

			try {
				String name,dob,doj,contact,gender,address, salary;
				name = name_text.getText().toString();
				dob = dob_text.getText().toString();
				doj = doj_text.getText().toString();
				contact = contact_text.getText().toString();
				address = address_text.getText().toString();
				salary = salary_text.getText().toString();
				boolean atleastOneAlpha = contact.matches(".*[a-zA-Z]+.*");// to check if mobile_no contains alphabets
				Pattern p = Pattern.compile("[^A-Za-z0-9]"); // to check if name/surname/number contains special
																// characters

				if (name.equals("") || doj.equals("") || contact.equals("")) {
					JOptionPane.showMessageDialog(this, "Please fill in the required fields", "Error Alert",
							JOptionPane.ERROR_MESSAGE);
				} else if (atleastOneAlpha == true) {
					JOptionPane.showMessageDialog(this, "Invalid Mobile Number", "Error Alert",
							JOptionPane.ERROR_MESSAGE);
				} 

				else {
					String line;

					FileWriter writer = new FileWriter("C:\\Users\\Nayanika\\Desktop\\NurseList.txt",
							true);
					if (rb1.isSelected()) {
						line = name + "|" + dob+ "|" + "Male" + "|" + doj + "|" + contact + "|" + salary +"|"+address
								+ "\n";
						writer.write(line);
						writer.write("\n");
					} else {
						line = name + "|" + dob + "|" + "Female" + "|" + doj + "|" + contact + "|" + salary +"|"+address
								+ "\n";
						writer.write(line);
						writer.write("\n");
					}

					writer.close();
					System.out.println("file write successful");
					JOptionPane.showMessageDialog(this, "New Nurse Registration Successful");
				}
			} // try ends

			catch (IOException ioe) {
				System.out.println("File Write Unsuccessful!");
			} // catch ends

		});// action ends

		
		
		JButton cancelbtn = new JButton("CANCEL");
		cancelbtn.setBounds(282, 340, 102, 37);
		panel.add(cancelbtn);
		cancelbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		cancelbtn.addActionListener((e) -> {
			JOptionPane.showMessageDialog(this, "Process cancelled on request");

		});
		
		JButton exitbtn = new JButton("EXIT");
		exitbtn.setBounds(475, 341, 102, 34);
		panel.add(exitbtn);
		exitbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		exitbtn.addActionListener((e)->{
			this.setVisible(false);
		});
		
		JButton button = new JButton("<<PREV");
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setBounds(45, 501, 102, 37);
		contentPane.add(button);
		button.addActionListener((e)->{
			this.setVisible(false);
			new NewDoctor().setVisible(true);
		});
		
		JButton btnNext = new JButton("NEXT>>");
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext.setBounds(691, 501, 102, 37);
		contentPane.add(btnNext);
		btnNext.addActionListener((e)->{
			this.setVisible(false);
			new NewStaff().setVisible(true);
		});
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(NewNurse.class.getResource("/Images/plussign.png")));
		lblNewLabel_3.setBounds(10, 11, 75, 58);
		contentPane.add(lblNewLabel_3);
		
		JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
		background.setBounds(-202, -866, 1555, 2232);
		background.setFont(new Font("Tahoma", Font.ITALIC, 14));
		getContentPane().add(background);
		
		
		
	}
}
