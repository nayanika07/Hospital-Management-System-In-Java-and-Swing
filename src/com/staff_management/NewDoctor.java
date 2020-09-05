package com.staff_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.patient_registration.Transfer;
import com.registration.Registration;
import com.ward_management.Ward_Management;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class NewDoctor extends JFrame {

	private JPanel contentPane;
	private JTextField docname_text;
	private JTextField fathername_text;
	private JTextField dob_text;
	private JTextField dateofjoin_text;
	private JTextField specialization_text;
	private JTextField address_text;
	private JTextField contact_text;
	private JTextField email_text;
	private JTextField salary_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewDoctor frame = new NewDoctor();
					frame.setVisible(true);
					frame.setTitle("Add New Doctor");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewDoctor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewDoctor.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 876, 704);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Doctor Information");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 26));
		lblNewLabel.setBounds(66, 11, 794, 56);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(66, 78, 713, 499);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(94, 22, 58, 25);
		panel.add(lblNewLabel_1);
		
		docname_text = new JTextField();
		docname_text.setBounds(177, 23, 459, 25);
		panel.add(docname_text);
		docname_text.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Father's Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(53, 58, 104, 25);
		panel.add(lblNewLabel_2);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth:");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateOfBirth.setBounds(63, 94, 104, 25);
		panel.add(lblDateOfBirth);
		
		JLabel lblDateOfJoining = new JLabel("Date Of Joining:");
		lblDateOfJoining.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateOfJoining.setBounds(53, 130, 104, 25);
		panel.add(lblDateOfJoining);
		
		JLabel lblSpecialization = new JLabel("Specialization:");
		lblSpecialization.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSpecialization.setBounds(63, 166, 94, 25);
		panel.add(lblSpecialization);
		
		JLabel lblPermanentAddress = new JLabel("Permanent Address:");
		lblPermanentAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPermanentAddress.setBounds(30, 206, 137, 25);
		panel.add(lblPermanentAddress);
		
		fathername_text = new JTextField();
		fathername_text.setBounds(177, 61, 459, 22);
		panel.add(fathername_text);
		fathername_text.setColumns(10);
		
		dob_text = new JTextField();
		dob_text.setBounds(177, 97, 137, 20);
		panel.add(dob_text);
		dob_text.setColumns(10);
		
		dateofjoin_text = new JTextField();
		dateofjoin_text.setBounds(177, 133, 137, 20);
		panel.add(dateofjoin_text);
		dateofjoin_text.setColumns(10);
		
		specialization_text = new JTextField();
		specialization_text.setBounds(177, 169, 459, 20);
		panel.add(specialization_text);
		specialization_text.setColumns(10);
		
		address_text = new JTextField();
		address_text.setBounds(177, 209, 459, 48);
		panel.add(address_text);
		address_text.setColumns(10);
		
		JLabel lblContactNumber = new JLabel("Contact Number:");
		lblContactNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContactNumber.setBounds(53, 286, 114, 25);
		panel.add(lblContactNumber);
		
		contact_text = new JTextField();
		contact_text.setBounds(177, 289, 197, 22);
		panel.add(contact_text);
		contact_text.setColumns(10);
		
		JLabel lblEmailId = new JLabel("Email ID:");
		lblEmailId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmailId.setBounds(63, 322, 104, 25);
		panel.add(lblEmailId);
		
		email_text = new JTextField();
		email_text.setBounds(177, 325, 459, 20);
		panel.add(email_text);
		email_text.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Salary* (INR):");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(38, 358, 114, 20);
		panel.add(lblNewLabel_3);
		
		salary_text = new JTextField();
		salary_text.setBounds(177, 359, 197, 20);
		panel.add(salary_text);
		salary_text.setColumns(10);
		
		JButton savebtn = new JButton("SAVE");
		savebtn.setBounds(36, 445, 116, 29);
		panel.add(savebtn);
		savebtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		savebtn.addActionListener((e) -> {

			try {
				String doctor_name,fathersname,address,contact,specialization,email,dateofbirth,dateofjoining,salary;
				doctor_name = docname_text.getText().toString();
				fathersname = fathername_text.getText().toString();
				specialization = specialization_text.getText().toString();
				dateofbirth = dob_text.getText().toString();
			    dateofjoining = dateofjoin_text.getText().toString();
				address = address_text.getText().toString();
				email = email_text.getText().toString();
				contact = contact_text.getText().toString();
	            salary = salary_text.getText().toString();
		
				

				if (doctor_name.equals("") || contact.equals("") || specialization.equals(""))
					JOptionPane.showMessageDialog(this, "Please fill in the mandatory fields", "Error Alert",
							JOptionPane.ERROR_MESSAGE);

				else {
					String line;

					FileWriter writer = new FileWriter("C:\\Users\\Nayanika\\Desktop\\DoctorList.txt",
							true);
					
						line = doctor_name+"|"+ fathersname + "|" + specialization + "|" + dateofbirth + "|" 
								+"|"+ dateofjoining + "|"+contact+ "|" + address +"|"+salary+"|"+email+"\n";
						writer.write(line);
						writer.write("\n");
				
					writer.close();
					System.out.println("file write successful");
					JOptionPane.showMessageDialog(this, "New Doctor Biodata Registered Successfully");
				}
			} // try ends

			catch (IOException ioe) {
				System.out.println("File Write Unsuccessful!");
			} // catch ends

		});// action ends
		
		JButton cancelbtn = new JButton("CANCEL");
		cancelbtn.setBounds(299, 445, 116, 29);
		panel.add(cancelbtn);
		cancelbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		cancelbtn.addActionListener((e) -> {
			JOptionPane.showMessageDialog(this, "Process cancelled on request");

		});
		
		JButton exitbtn = new JButton("EXIT");
		exitbtn.setBounds(547, 445, 116, 29);
		panel.add(exitbtn);
		exitbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		exitbtn.addActionListener((e)->{
			this.setVisible(false);
		});
		
		JButton prevbtn = new JButton("<<PREV");
		prevbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		prevbtn.setBounds(43, 598, 135, 42);
		contentPane.add(prevbtn);
		prevbtn.addActionListener((e)->{
			this.setVisible(false);
			new Ward_Management().setVisible(true);
		});
		
		
		JButton nextbtn = new JButton("NEXT>>");
		nextbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		nextbtn.setBounds(674, 598, 135, 42);
		contentPane.add(nextbtn);
		nextbtn.addActionListener((e)->{
			this.setVisible(false);
			new NewNurse().setVisible(true);
		});
		
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(NewDoctor.class.getResource("/Images/plussign.png")));
		lblNewLabel_4.setBounds(0, 11, 66, 56);
		contentPane.add(lblNewLabel_4);
		
		JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
		background.setBounds(-202, -866, 1555, 2232);
		background.setFont(new Font("Tahoma", Font.ITALIC, 14));
		getContentPane().add(background);
		
	

		
	
	
	}
}
