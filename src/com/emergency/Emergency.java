package com.emergency;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.patient_registration.Transfer;
import com.registration.Registration;
import com.ward_management.Ward_Management;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class Emergency extends JFrame {

	private JPanel contentPane;
	private JTextField date_text;
	private JTextField name_text;
	private JTextField med_text;
	private JTextField guardian_text;
	private JTextField address_text;
	private JTextField contact_text;
	private JTextField phy_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emergency frame = new Emergency();
					frame.setTitle("Emergency Service");
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
	public Emergency() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Emergency.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 870, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Emergency Portal");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblNewLabel.setBounds(88, 11, 756, 45);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(20, 67, 809, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Date:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(574, 56, 52, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblFirstName = new JLabel("Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFirstName.setBounds(38, 22, 72, 23);
		panel.add(lblFirstName);
		
		JLabel lblGuardian = new JLabel("Guardian:");
		lblGuardian.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGuardian.setBounds(38, 56, 72, 23);
		panel.add(lblGuardian);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddress.setBounds(38, 114, 72, 23);
		panel.add(lblAddress);
		
		JLabel lblContact = new JLabel("Contact:");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContact.setBounds(38, 162, 62, 23);
		panel.add(lblContact);
		
		JLabel lblMedicalIssue = new JLabel("Medical Issue:");
		lblMedicalIssue.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMedicalIssue.setBounds(29, 224, 92, 23);
		panel.add(lblMedicalIssue);
		
		JLabel lblPhysician = new JLabel("Physician:");
		lblPhysician.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPhysician.setBounds(38, 268, 72, 23);
		panel.add(lblPhysician);
		
		date_text = new JTextField();
		date_text.setBounds(624, 58, 125, 20);
		panel.add(date_text);
		date_text.setColumns(10);
		
		name_text = new JTextField();
		name_text.setBounds(138, 23, 312, 23);
		panel.add(name_text);
		name_text.setColumns(10);
		
		med_text = new JTextField();
		med_text.setColumns(10);
		med_text.setBounds(138, 214, 319, 45);
		panel.add(med_text);
		
		guardian_text = new JTextField();
		guardian_text.setColumns(10);
		guardian_text.setBounds(138, 57, 312, 23);
		panel.add(guardian_text);
		
		address_text = new JTextField();
		address_text.setColumns(10);
		address_text.setBounds(138, 104, 312, 45);
		panel.add(address_text);
		
		contact_text = new JTextField();
		contact_text.setColumns(10);
		contact_text.setBounds(138, 163, 204, 23);
		panel.add(contact_text);
		
		phy_text = new JTextField();
		phy_text.setBounds(138, 270, 319, 23);
		panel.add(phy_text);
		phy_text.setColumns(10);
		
		JButton savebtn = new JButton("SAVE");
		savebtn.setBounds(199, 344, 95, 32);
		panel.add(savebtn);
		savebtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		savebtn.addActionListener((e) -> {

			try {
				String name,guardian,address,contact,medical_issue,physician,date;
				name = name_text.getText().toString();
				guardian = guardian_text.getText().toString();
				contact = contact_text.getText().toString();
			    physician= phy_text.getText().toString();
				address = address_text.getText().toString();
				medical_issue=med_text.getText().toString();
				date =date_text.getText().toString();
	
		
				

				if (name.equals("") || contact.equals(""))
					JOptionPane.showMessageDialog(this, "Please fill in the mandatory fields", "Error Alert",
							JOptionPane.ERROR_MESSAGE);

				else {
					String line;

					FileWriter writer = new FileWriter("C:\\Users\\Nayanika\\Desktop\\EmergencyPatients.txt",
							true);
					
						line = name+"|"+guardian + "|" + contact + "|" + address + "|" 
								+"|"+ medical_issue + "|"+physician+ "\n";
						writer.write(line);
						writer.write("\n");
				
					writer.close();
					System.out.println("file write successful");
					JOptionPane.showMessageDialog(this, "Emergency Service Registered Successfully");
				}
			} // try ends

			catch (IOException ioe) {
				System.out.println("File Write Unsuccessful!");
			} // catch ends

		});// action ends
		
		
		JButton cancelbtn = new JButton("CANCEL");
		cancelbtn.setBounds(373, 344, 113, 32);
		panel.add(cancelbtn);
		cancelbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		cancelbtn.addActionListener((e) -> {
			JOptionPane.showMessageDialog(this, "Process cancelled on request");

		});
		
		JButton exitbtn = new JButton("EXIT");
		exitbtn.setBounds(574, 344, 95, 32);
		panel.add(exitbtn);
		exitbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Emergency.class.getResource("/Images/donate_blood_1.gif")));
		lblNewLabel_3.setBounds(503, 104, 296, 195);
		panel.add(lblNewLabel_3);
		exitbtn.addActionListener((e)->{
			this.setVisible(false);
		});
		
		JButton prevbtn = new JButton("<<PREV");
		prevbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		prevbtn.setBounds(20, 493, 117, 44);
		contentPane.add(prevbtn);
		prevbtn.addActionListener((e)->{
			this.setVisible(false);
			new Transfer().setVisible(true);
		});
		
		JButton nextbtn = new JButton("NEXT>>");
		nextbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		nextbtn.setBounds(712, 493, 117, 44);
		contentPane.add(nextbtn);
		nextbtn.addActionListener((e)->{
			this.setVisible(false);
			new Ward_Management().setVisible(true);
		});
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Emergency.class.getResource("/Images/plussign.png")));
		lblNewLabel_2.setBounds(10, 11, 75, 53);
		contentPane.add(lblNewLabel_2);
		
		JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
		background.setBounds(-202, -866, 1555, 2232);
		background.setFont(new Font("Tahoma", Font.ITALIC, 14));
		getContentPane().add(background);
		
	
		
	
		
	
	}
}
