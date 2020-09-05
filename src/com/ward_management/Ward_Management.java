package com.ward_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.emergency.Emergency;
import com.patient_registration.Transfer;
import com.pharmacy.Pharmacy;
import com.registration.Registration;
import com.staff_management.NewDoctor;

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

public class Ward_Management extends JFrame {

	private JPanel contentPane;
	private JTextField ward_text;
	private JTextField pname_text;
	private JTextField pid_text;
	private JTextField staff_text;
	private JTextField indate_text;
	private JTextField outdate_text;
	private JTextField med_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ward_Management frame = new Ward_Management();
					frame.setTitle("Ward Management");
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
	public Ward_Management() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ward_Management.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 763, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ward/Bed Management");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 23));
		lblNewLabel.setBounds(10, 11, 727, 40);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(20, 55, 705, 386);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ward No. ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(42, 23, 71, 22);
		panel.add(lblNewLabel_1);
		
		ward_text = new JTextField();
		ward_text.setBounds(123, 24, 126, 22);
		panel.add(ward_text);
		ward_text.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Patient Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(27, 56, 86, 22);
		panel.add(lblNewLabel_2);
		
		pname_text = new JTextField();
		pname_text.setBounds(123, 57, 241, 20);
		panel.add(pname_text);
		pname_text.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Patient ID");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(42, 89, 71, 22);
		panel.add(lblNewLabel_3);
		
		pid_text = new JTextField();
		pid_text.setBounds(123, 88, 126, 20);
		panel.add(pid_text);
		pid_text.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Support Staff");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(19, 155, 94, 14);
		panel.add(lblNewLabel_4);
		
		staff_text = new JTextField();
		staff_text.setBounds(123, 147, 241, 54);
		panel.add(staff_text);
		staff_text.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("In Date:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(463, 11, 77, 20);
		panel.add(lblNewLabel_5);
		
		JLabel lblOutDate = new JLabel("Out Date:");
		lblOutDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOutDate.setBounds(463, 40, 77, 20);
		panel.add(lblOutDate);
		
		indate_text = new JTextField();
		indate_text.setBounds(541, 12, 100, 20);
		panel.add(indate_text);
		indate_text.setColumns(10);
		
		outdate_text = new JTextField();
		outdate_text.setBounds(541, 42, 100, 20);
		panel.add(outdate_text);
		outdate_text.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Medical Issue");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(27, 236, 109, 14);
		panel.add(lblNewLabel_6);
		
		med_text = new JTextField();
		med_text.setBounds(123, 234, 241, 54);
		panel.add(med_text);
		med_text.setColumns(10);
		
		JButton savebtn = new JButton("SAVE");
		savebtn.setBounds(102, 331, 89, 33);
		panel.add(savebtn);
		savebtn.setFont(new Font("Tahoma", Font.BOLD, 16));

		savebtn.addActionListener((e) -> {

			try {
				String wardno,patientname,patientid,staff,medical_issue,outdate,indate;
				wardno = ward_text.getText().toString();
				patientname = pname_text.getText().toString();
				patientid = pid_text.getText().toString();
			    staff= staff_text.getText().toString();
				indate = indate_text.getText().toString();
				medical_issue=med_text.getText().toString();
				outdate =outdate_text.getText().toString();
	
		
				

				if (wardno.equals("") || patientid.equals(""))
					JOptionPane.showMessageDialog(this, "Please fill in the mandatory fields", "Error Alert",
							JOptionPane.ERROR_MESSAGE);

				else {
					String line;

					FileWriter writer = new FileWriter("C:\\Users\\Nayanika\\Desktop\\Ward_ManagementDetails.txt",
							true);
					
						line = wardno+"|"+patientname + "|" + patientid + "|" + staff + "|" 
								+"|"+ medical_issue + "|"+staff+ "|Indate:"+indate+"|Outdate:"+outdate+ "\n";
						writer.write(line);
						writer.write("\n");
				
					writer.close();
					System.out.println("file write successful");
					JOptionPane.showMessageDialog(this, "Ward/Bed Detail Saved Successfully");
				}
			} // try ends

			catch (IOException ioe) {
				System.out.println("File Write Unsuccessful!");
			} // catch ends

		});// action ends
		
		
		JButton cancelbtn = new JButton("CANCEL");
		cancelbtn.setBounds(273, 331, 105, 33);
		panel.add(cancelbtn);
		cancelbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		cancelbtn.addActionListener((e) -> {
			JOptionPane.showMessageDialog(this, "Process cancelled on request");

		});
		
		JButton exitbtn = new JButton("EXIT");
		exitbtn.setBounds(463, 331, 89, 33);
		panel.add(exitbtn);
		exitbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		exitbtn.addActionListener((e)->{
			this.setVisible(false);
		});
		
		JButton prevbtn = new JButton("<<PREV");
		prevbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		prevbtn.setBounds(20, 483, 126, 33);
		contentPane.add(prevbtn);
		prevbtn.addActionListener((e)->{
			this.setVisible(false);
			new Emergency().setVisible(true);
		});
		
		
		JButton nextbtn = new JButton("NEXT>>");
		nextbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		nextbtn.setBounds(622, 483, 103, 33);
		contentPane.add(nextbtn);
		nextbtn.addActionListener((e)->{
			this.setVisible(false);
			new Pharmacy().setVisible(true);
		});
		
		JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
		background.setBounds(-202, -866, 1555, 2232);
		background.setFont(new Font("Tahoma", Font.ITALIC, 14));
		getContentPane().add(background);
		

	}

}
