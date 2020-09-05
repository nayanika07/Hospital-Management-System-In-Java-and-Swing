package com.staff_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.registration.Registration;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.border.MatteBorder;

public class NewStaff extends JFrame {

	private JPanel contentPane;
	private JTextField name_text;
	private JTextField dob_text;
	private JTextField doj_text;
	private JTextField address_text;
	private JTextField salary_text;
	private JTextField contact_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewStaff frame = new NewStaff();
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
	public NewStaff() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewStaff.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 780, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Support Staff Information");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(88, 11, 666, 61);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(238, 232, 170));
		panel.setBounds(88, 83, 591, 430);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(51, 44, 126, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth:");
		lblDateOfBirth.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateOfBirth.setBounds(51, 75, 126, 20);
		panel.add(lblDateOfBirth);
		
		JLabel lblContact = new JLabel("Contact:");
		lblContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContact.setBounds(51, 137, 126, 20);
		panel.add(lblContact);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setHorizontalAlignment(SwingConstants.CENTER);
		lblSex.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSex.setBounds(51, 106, 126, 20);
		panel.add(lblSex);
		
		JLabel lblDateOfJoining = new JLabel("Date Of Joining:");
		lblDateOfJoining.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateOfJoining.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateOfJoining.setBounds(51, 168, 126, 20);
		panel.add(lblDateOfJoining);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddress.setBounds(51, 199, 126, 20);
		panel.add(lblAddress);
		
		JLabel lblSalaryinr = new JLabel("Salary*(INR):");
		lblSalaryinr.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalaryinr.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSalaryinr.setBounds(51, 272, 126, 20);
		panel.add(lblSalaryinr);
		
		name_text = new JTextField();
		name_text.setBounds(187, 45, 323, 20);
		panel.add(name_text);
		name_text.setColumns(10);
		
		dob_text = new JTextField();
		dob_text.setBounds(187, 76, 145, 20);
		panel.add(dob_text);
		dob_text.setColumns(10);
		
		JRadioButton rb1 = new JRadioButton("Male");
		rb1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb1.setBounds(183, 106, 84, 23);
		panel.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Female");
		rb2.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb2.setBounds(286, 106, 84, 23);
		panel.add(rb2);
		
		doj_text = new JTextField();
		doj_text.setBounds(187, 169, 145, 20);
		panel.add(doj_text);
		doj_text.setColumns(10);
		
		address_text = new JTextField();
		address_text.setBounds(187, 200, 323, 54);
		panel.add(address_text);
		address_text.setColumns(10);
		
		salary_text = new JTextField();
		salary_text.setBounds(187, 273, 145, 20);
		panel.add(salary_text);
		salary_text.setColumns(10);
		
		contact_text = new JTextField();
		contact_text.setColumns(10);
		contact_text.setBounds(187, 138, 145, 20);
		panel.add(contact_text);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Full Time");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setBounds(189, 313, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnPartTime = new JRadioButton("Part Time");
		rdbtnPartTime.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnPartTime.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnPartTime.setBounds(321, 313, 109, 23);
		panel.add(rdbtnPartTime);
		
		JButton savebtn = new JButton("SAVE");
		savebtn.setBounds(84, 391, 106, 28);
		panel.add(savebtn);
		savebtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		savebtn.addActionListener((e) -> {

			try {
				String name,dob,doj,contact,address, salary;
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
		cancelbtn.setBounds(245, 391, 106, 28);
		panel.add(cancelbtn);
		cancelbtn.addActionListener((e) -> {
			JOptionPane.showMessageDialog(this, "Process cancelled on request");

		});
	
		cancelbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton exitbtn = new JButton("EXIT");
		exitbtn.setBounds(408, 391, 106, 28);
		panel.add(exitbtn);
		exitbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		exitbtn.addActionListener((e)->{
			this.setVisible(false);
		});
		
	
		
		JButton prevbtn = new JButton("<<PREV");
		prevbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		prevbtn.setBounds(34, 568, 119, 41);
		contentPane.add(prevbtn);
		prevbtn.addActionListener((e)->{
			this.setVisible(false);
			new NewNurse().setVisible(true);
		});
		
		
		JButton nextbtn = new JButton("NEXT>>");
		nextbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		nextbtn.setBounds(615, 568, 119, 41);
		contentPane.add(nextbtn);
		nextbtn.addActionListener((e)->{
			this.setVisible(false);
			new DoctorList().setVisible(true);
		});
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(NewStaff.class.getResource("/Images/plussign.png")));
		lblNewLabel_2.setBounds(10, 11, 74, 61);
		contentPane.add(lblNewLabel_2);
		
		JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
		background.setBounds(-202, -866, 1555, 2232);
		background.setFont(new Font("Tahoma", Font.ITALIC, 14));
		getContentPane().add(background);
		
		
		
		
		
		
	}
}
