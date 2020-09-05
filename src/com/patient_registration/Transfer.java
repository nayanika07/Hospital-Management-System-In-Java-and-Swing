package com.patient_registration;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.emergency.Emergency;
import com.registration.Registration;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Transfer extends JFrame {

	private JPanel contentPane;
	private JTextField to_text;
	private JTextField reg_text;
	private JTextField to_phone_text;
	private JTextField sentvia_text;
	private JTextField to_email_text;
	private JTextField from_text;
	private JTextField fullname_text;
	private JTextField from_phone_text;
	private JTextField from_email_text;
	private JTextField date_text;
	private JTextField ward_text;
	private JTextField transport_text;
	private JTextField patientid_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transfer frame = new Transfer();
					frame.setVisible(true);
					frame.setTitle("Patient Discharge Or Transfer Module");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Transfer() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Transfer.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 947, 713);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Discharge/Transfer Module");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 24));
		lblNewLabel.setBounds(41, 11, 849, 41);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(41, 53, 849, 556);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("To:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(54, 23, 57, 21);
		panel.add(lblNewLabel_1);
		
		to_text = new JTextField();
		to_text.setBounds(121, 24, 236, 20);
		panel.add(to_text);
		to_text.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Region:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(45, 65, 70, 21);
		panel.add(lblNewLabel_2);
		
		reg_text = new JTextField();
		reg_text.setBounds(121, 65, 236, 46);
		panel.add(reg_text);
		reg_text.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Phone:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(57, 142, 46, 14);
		panel.add(lblNewLabel_3);
		
		to_phone_text = new JTextField();
		to_phone_text.setBounds(121, 140, 236, 21);
		panel.add(to_phone_text);
		to_phone_text.setColumns(10);
		
		JLabel lblSentVia = new JLabel("Sent Via:");
		lblSentVia.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSentVia.setHorizontalAlignment(SwingConstants.CENTER);
		lblSentVia.setBounds(38, 187, 72, 19);
		panel.add(lblSentVia);
		
		sentvia_text = new JTextField();
		sentvia_text.setBounds(121, 187, 237, 21);
		panel.add(sentvia_text);
		sentvia_text.setColumns(10);
		
		JLabel lblEMail = new JLabel("E mail:");
		lblEMail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEMail.setBounds(57, 239, 46, 14);
		panel.add(lblEMail);
		
		to_email_text = new JTextField();
		to_email_text.setBounds(121, 237, 236, 21);
		panel.add(to_email_text);
		to_email_text.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("From:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(457, 25, 70, 17);
		panel.add(lblNewLabel_4);
		
		from_text = new JTextField();
		from_text.setBounds(517, 24, 253, 21);
		panel.add(from_text);
		from_text.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Full Name:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(428, 97, 85, 14);
		panel.add(lblNewLabel_5);
		
		fullname_text = new JTextField();
		fullname_text.setBounds(517, 91, 253, 20);
		panel.add(fullname_text);
		fullname_text.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPhone.setBounds(447, 142, 46, 14);
		panel.add(lblPhone);
		
		from_phone_text = new JTextField();
		from_phone_text.setBounds(517, 140, 253, 20);
		panel.add(from_phone_text);
		from_phone_text.setColumns(10);
		
		JLabel lblEMail_1 = new JLabel("E mail:");
		lblEMail_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEMail_1.setBounds(447, 189, 46, 14);
		panel.add(lblEMail_1);
		
		from_email_text = new JTextField();
		from_email_text.setBounds(520, 187, 250, 20);
		panel.add(from_email_text);
		from_email_text.setColumns(10);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDate.setBounds(447, 239, 46, 14);
		panel.add(lblDate);
		
		date_text = new JTextField();
		date_text.setBounds(524, 237, 129, 20);
		panel.add(date_text);
		date_text.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Ward:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(457, 65, 46, 14);
		panel.add(lblNewLabel_6);
		
		ward_text = new JTextField();
		ward_text.setText("");
		ward_text.setBounds(517, 59, 253, 21);
		panel.add(ward_text);
		ward_text.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Transport Service:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(37, 313, 129, 20);
		panel.add(lblNewLabel_7);
		
		transport_text = new JTextField();
		transport_text.setBounds(176, 314, 176, 21);
		panel.add(transport_text);
		transport_text.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Patient ID:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(428, 317, 98, 21);
		panel.add(lblNewLabel_8);
		
		patientid_text = new JTextField();
		patientid_text.setBounds(517, 314, 253, 21);
		panel.add(patientid_text);
		patientid_text.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(238, 232, 170));
		panel_1.setBounds(45, 365, 738, 166);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Checklist:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_9.setBounds(31, 11, 78, 14);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("YES");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(542, 11, 41, 14);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNo = new JLabel("NO");
		lblNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNo.setBounds(612, 11, 41, 14);
		panel_1.add(lblNo);
		
		JLabel lblNewLabel_11 = new JLabel("1. Patient has claimed reimbursement:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11.setBounds(24, 42, 339, 14);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("2. Clinically assessed as requiring escort:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12.setBounds(24, 67, 264, 19);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("3. Patient Identification details provided:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_13.setBounds(24, 100, 264, 19);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("4. Requirements for travel provided by hospital:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_14.setBounds(24, 130, 323, 14);
		panel_1.add(lblNewLabel_14);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(542, 39, 20, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("New check box");
		checkBox.setBounds(612, 39, 20, 23);
		panel_1.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("New check box");
		checkBox_1.setBounds(542, 66, 20, 23);
		panel_1.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("New check box");
		checkBox_2.setBounds(612, 66, 20, 23);
		panel_1.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("New check box");
		checkBox_3.setBounds(542, 99, 20, 23);
		panel_1.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("New check box");
		checkBox_4.setBounds(612, 99, 20, 23);
		panel_1.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("New check box");
		checkBox_5.setBounds(542, 127, 20, 23);
		panel_1.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("New check box");
		checkBox_6.setBounds(612, 127, 20, 23);
		panel_1.add(checkBox_6);
		
		JButton confirmbtn = new JButton("CONFIRM");
		confirmbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		confirmbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		confirmbtn.setBounds(328, 620, 133, 35);
		contentPane.add(confirmbtn);
		
		confirmbtn.addActionListener((e) -> {

			try {
				String to,from,patientid,phone_to,phone_from,transport,region,email_to,email_from,ward,sentvia,date,fullname;
				to = to_text.getText().toString();
			    from = from_text.getText().toString();
				region = reg_text.getText().toString();
				sentvia = sentvia_text.getText().toString();
				phone_to=to_phone_text.getText().toString();
				email_to=to_email_text.getText().toString();
				transport=transport_text.getText().toString();
			    email_from=from_email_text.getText().toString();
			    phone_from=to_phone_text.getText().toString();
			    ward=ward_text.getText().toString();
			    date=date_text.getText().toString();
			    patientid=patientid_text.getText().toString();
			    fullname=fullname_text.getText().toString();
				
				boolean atleastOneAlpha1 = phone_to.matches(".*[a-zA-Z]+.*");// to check if mobile_no contains alphabets
				boolean atleastOneAlpha2=phone_from.matches(".*[a-zA-Z]+.*");
		
				

				if (fullname.equals("") || phone_to.equals("") || 
						region.equals("") || patientid.equals("") || transport.equals("")) {
					JOptionPane.showMessageDialog(this, "Please fill in the mandatory fields", "Error Alert",
							JOptionPane.ERROR_MESSAGE);
				} else if (atleastOneAlpha1 == true || atleastOneAlpha2==true) {
					JOptionPane.showMessageDialog(this, "Invalid Mobile Number", "Error Alert",
							JOptionPane.ERROR_MESSAGE);
				}

				else {
					String line;

					FileWriter writer = new FileWriter("C:\\Users\\Nayanika\\Desktop\\TransferDetails.txt",
							true);
					
						line = patientid+"|"+fullname + "|" + phone_to + "|" + "SentVia:"+sentvia + "|" + ward +"|"+date+"|"+region
								+ "|"+transport+"\n";
						writer.write(line);
						writer.write("\n");
				
					writer.close();
					System.out.println("file write successful");
					JOptionPane.showMessageDialog(this, "Transfer/Discharge Details Saved & Confirmed");
				}
			} // try ends

			catch (IOException ioe) {
				System.out.println("File Write Unsuccessful!");
			} // catch ends

		});// action ends
		
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBounds(486, 621, 113, 32);
		contentPane.add(btnExit);
		btnExit.addActionListener((e)->{
			this.setVisible(false);
		});
		
		JButton prevbtn = new JButton("<<PREV");
		prevbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		prevbtn.setBounds(10, 617, 121, 38);
		contentPane.add(prevbtn);
		prevbtn.addActionListener((e)->{
			this.setVisible(false);
			new ConsultingAppointment().setVisible(true);
		});
		
		
		
		JButton nextbtn = new JButton("NEXT>>");
		nextbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		nextbtn.setBounds(800, 620, 121, 38);
		contentPane.add(nextbtn);
		nextbtn.addActionListener((e)->{
			this.setVisible(false);
			new Emergency().setVisible(true);
		});
		
		
		
		JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
		background.setBounds(-202, -866, 1555, 2232);
		background.setFont(new Font("Tahoma", Font.ITALIC, 14));
		getContentPane().add(background);
		

		

	}
}
