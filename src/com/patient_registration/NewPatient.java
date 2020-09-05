package com.patient_registration;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import com.registration.Registration;
import com.staff_management.DoctorList;
import com.staff_management.NewDoctor;
import com.staff_management.NewNurse;
import com.staff_management.NewStaff;

import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.border.MatteBorder;

public class NewPatient extends JFrame {

	private JPanel contentPane;
	private JTextField patient_id;
	private JTextField namefirst;
	private JTextField namelast;
	private JTextField dob_text;
	private JTextField ph_text;
	private JTextField address1;
	private JTextField fullnameG;
	private JTextField PhoneG;
	private JTextField OccG;
	private JTextField EmpG;
	private JTextField address2;
	private JTextField billingG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			
				try {
					NewPatient frame = new NewPatient();
					frame.setTitle("Sterling Hospital Management System");
				
					
					frame.setVisible(true);
					
					
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewPatient() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewPatient.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1277, 707);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Patient");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblNewLabel.setBounds(92, 17, 520, 65);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(92, 93, 520, 498);
		contentPane.add(panel);
		panel.setLayout(null);
		

		
		JLabel lblNewLabel_1 = new JLabel("Identification");
		lblNewLabel_1.setBounds(32, 11, 245, 32);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel lblNewLabel_2 = new JLabel("Patient ID No.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(32, 65, 164, 24);
		panel.add(lblNewLabel_2);
		
		patient_id = new JTextField();
		patient_id.setBounds(150, 68, 298, 21);
		panel.add(patient_id);
		patient_id.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("First Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(32, 116, 116, 24);
		panel.add(lblNewLabel_3);
		
		namefirst = new JTextField();
		namefirst.setBounds(150, 119, 298, 21);
		panel.add(namefirst);
		namefirst.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Last Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(32, 162, 106, 24);
		panel.add(lblNewLabel_4);
		
		namelast = new JTextField();
		namelast.setBounds(150, 165, 300, 20);
		panel.add(namelast);
		namelast.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Sex");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(50, 210, 84, 24);
		panel.add(lblNewLabel_5);
		
		String genders[]= {"Male","Female","Other"};
		JComboBox comboBox = new JComboBox(genders);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(180, 211, 202, 24);
		panel.add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("Date Of Birth");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(25, 261, 133, 24);
		panel.add(lblNewLabel_6);
		
		dob_text = new JTextField();
		dob_text.setBounds(150, 264, 305, 21);
		panel.add(dob_text);
		dob_text.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Phone Number");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(25, 305, 106, 21);
		panel.add(lblNewLabel_7);
		
		ph_text = new JTextField();
		ph_text.setBounds(150, 306, 305, 20);
		panel.add(ph_text);
		ph_text.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Address");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(32, 353, 106, 21);
		panel.add(lblNewLabel_8);
		
		address1 = new JTextField();
		address1.setBounds(150, 337, 305, 86);
		panel.add(address1);
		address1.setColumns(10);
		
		JButton savebtn = new JButton("SAVE");
		savebtn.setBounds(390, 455, 120, 32);
		panel.add(savebtn);
		savebtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		/*String[] timenames = { "Morning", "Afternoon", "Evening" };
		JComboBox comboBox = new JComboBox(timenames);
		comboBox.setSelectedIndex(1);*/
		
		savebtn.addActionListener((e) -> {

			try {
				String firstname,lastname,patientid,phone,address,dob,sex;
				patientid = patient_id.getText().toString();
			    firstname = namefirst.getText().toString();
				lastname = namelast.getText().toString();
				phone = ph_text.getText().toString();
				dob=dob_text.getText().toString();
				address=address1.getText().toString();
				sex=(String) comboBox.getSelectedItem();
				
				boolean atleastOneAlpha = phone.matches(".*[a-zA-Z]+.*");// to check if mobile_no contains alphabets
		
				

				if (firstname.equals("") || phone.equals("") || 
						address.equals("") || patientid.equals("")) {
					JOptionPane.showMessageDialog(this, "Please fill in the required fields", "Error Alert",
							JOptionPane.ERROR_MESSAGE);
				} else if (atleastOneAlpha == true) {
					JOptionPane.showMessageDialog(this, "Invalid Mobile Number", "Error Alert",
							JOptionPane.ERROR_MESSAGE);
				}

				else {
					String line;

					FileWriter writer = new FileWriter("C:\\Users\\Nayanika\\Desktop\\NewPatientList.txt",
							true);
					
						line = patientid+"|"+firstname + "|" + lastname + "|" + phone + "|" + dob +"|"+sex+"|"+address
								+ "|"+"NewPatient"+"\n";
						writer.write(line);
						writer.write("\n");
				
					writer.close();
					System.out.println("file write successful");
					JOptionPane.showMessageDialog(this, "Patient Details Saved");
				}
			} // try ends

			catch (IOException ioe) {
				System.out.println("File Write Unsuccessful!");
			} // catch ends

		});// action ends
		
		JButton clearbtn = new JButton("CLEAR");
		clearbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		clearbtn.setBounds(343, 619, 120, 32);
		contentPane.add(clearbtn);
		clearbtn.addActionListener((e) -> {
			 patient_id.setText(null);
			 namefirst.setText(null);
		     namelast.setText(null);
			 dob_text.setText(null);
			 ph_text.setText(null);
			 address1.setText(null);
			 fullnameG.setText(null);
			 PhoneG.setText(null);
		     OccG.setText(null);
			 EmpG.setText(null);
			 address2.setText(null);
			 billingG.setText(null);

		});
		
		JButton exitbtn = new JButton("EXIT");
		
		exitbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		exitbtn.setBounds(515, 619, 120, 32);
		contentPane.add(exitbtn);
		exitbtn.addActionListener((e) -> {
			this.setVisible(false);
			new Registration().setVisible(true);
		});
		
		JLabel lblNewLabel_9 = new JLabel("Guardian Information");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBackground(new Color(0, 128, 128));
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblNewLabel_9.setBounds(720, 17, 481, 65);
		contentPane.add(lblNewLabel_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(720, 93, 481, 498);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Full Name");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_10.setBounds(29, 21, 96, 23);
		panel_1.add(lblNewLabel_10);
		
		fullnameG = new JTextField();
		fullnameG.setText("");
		fullnameG.setBounds(127, 22, 262, 23);
		panel_1.add(fullnameG);
		fullnameG.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Relationship");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_11.setBounds(21, 67, 104, 23);
		panel_1.add(lblNewLabel_11);
		
		String[] relations= {"Father","Mother","Son","Daughter","Relative","Friend","Neighbour","Other"};
		JComboBox comboBox_1 = new JComboBox(relations);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setBounds(127, 69, 262, 20);
		panel_1.add(comboBox_1);
		
		JLabel lblNewLabel_12 = new JLabel("Phone Number");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_12.setBounds(21, 111, 96, 23);
		panel_1.add(lblNewLabel_12);
		
		PhoneG = new JTextField();
		PhoneG.setBounds(127, 112, 262, 23);
		panel_1.add(PhoneG);
		PhoneG.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Occupation");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_13.setBounds(21, 163, 96, 23);
		panel_1.add(lblNewLabel_13);
		
		OccG = new JTextField();
		OccG.setBounds(127, 165, 262, 20);
		panel_1.add(OccG);
		OccG.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Employer");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_14.setBounds(29, 212, 96, 20);
		panel_1.add(lblNewLabel_14);
		
		EmpG = new JTextField();
		EmpG.setBounds(127, 213, 262, 23);
		panel_1.add(EmpG);
		EmpG.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Address");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_15.setBounds(29, 271, 104, 20);
		panel_1.add(lblNewLabel_15);
		
		address2 = new JTextField();
		address2.setBounds(127, 271, 269, 78);
		panel_1.add(address2);
		address2.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Billing Statement");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_16.setBounds(21, 418, 112, 23);
		panel_1.add(lblNewLabel_16);
		
		billingG = new JTextField();
		billingG.setBounds(155, 419, 269, 23);
		panel_1.add(billingG);
		billingG.setColumns(10);
		
		JButton addbtn = new JButton("ADD");
		addbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		addbtn.setBounds(352, 456, 104, 31);
		panel_1.add(addbtn);
		addbtn.addActionListener((e) -> {

			try {
				String fullname,phone,occupation,employer,address,relation,billingstatement;
				fullname = fullnameG.getText().toString();
			    phone = PhoneG.getText().toString();
				occupation = OccG.getText().toString();
				employer = EmpG.getText().toString();
				address=address2.getText().toString();
				billingstatement=billingG.getText().toString();
				relation=(String) comboBox.getSelectedItem();
				
				boolean atleastOneAlpha = phone.matches(".*[a-zA-Z]+.*");// to check if mobile_no contains alphabets
		
				

				if (fullname.equals("") || phone.equals("")) {
					JOptionPane.showMessageDialog(this, "Please fill in the mandatory fields", "Error Alert",
							JOptionPane.ERROR_MESSAGE);
				} else if (atleastOneAlpha == true) {
					JOptionPane.showMessageDialog(this, "Invalid Mobile Number", "Error Alert",
							JOptionPane.ERROR_MESSAGE);
				}

				else {
					String line;

					FileWriter writer = new FileWriter("C:\\Users\\Nayanika\\Desktop\\GuardianDetails.txt",
							true);
					
						line = fullname+"|"+phone + "|" + relation + "|" + address + "|" + occupation+"|"+"|"+billingstatement
								+"\n";
						writer.write(line);
						writer.write("\n");
				
					writer.close();
					System.out.println("file write successful");
					JOptionPane.showMessageDialog(this, "Guardian Details Saved");
				}
			} // try ends

			catch (IOException ioe) {
				System.out.println("File Write Unsuccessful!");
			} // catch ends

		});// action ends
		
		
		JCheckBox liveswithp = new JCheckBox("Lives With Patient");
		liveswithp.setFont(new Font("Tahoma", Font.BOLD, 13));
		liveswithp.setBounds(28, 374, 158, 23);
		panel_1.add(liveswithp);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(NewPatient.class.getResource("/Images/plussign.png")));
		lblNewLabel_17.setBounds(10, 11, 72, 71);
		contentPane.add(lblNewLabel_17);
		
		
		JButton nextbtn = new JButton("NEXT>>");
		nextbtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		nextbtn.setBounds(1017, 617, 120, 40);
		contentPane.add(nextbtn);
		nextbtn.addActionListener((e) -> {
			this.setVisible(false);
			new OutPatient().setVisible(true);
		});
		
		JButton prevbtn = new JButton("<<PREV");
		prevbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		prevbtn.setBounds(10, 619, 106, 38);
		contentPane.add(prevbtn);
		
		prevbtn.addActionListener((e) -> {
			this.setVisible(false);
			new Registration().setVisible(true);
		});
		JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
		background.setBounds(-202, -866, 1555, 2232);
		background.setFont(new Font("Tahoma", Font.ITALIC, 14));
		getContentPane().add(background);
	

		
		
	
	

	}
}
