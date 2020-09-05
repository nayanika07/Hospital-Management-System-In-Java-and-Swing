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
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.border.MatteBorder;

public class OutPatient extends JFrame {

	private JPanel contentPane;
	private JTextField pname;
	private JTextField dname;
	private JTextField specialization_text;
	private JTextField date;
	private JTextField date_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OutPatient frame = new OutPatient();
					frame.setTitle("Out-Patient Information Page");
					frame.setVisible(true);
					frame.setTitle("OutPatient Management");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OutPatient() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(OutPatient.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 811, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Outpatient Management");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(93, 36, 602, 56);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(93, 99, 602, 351);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewApplicant = new JLabel("New Applicant");
		lblNewApplicant.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewApplicant.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewApplicant.setBounds(91, 22, 401, 23);
		panel.add(lblNewApplicant);
		
		JLabel lblNewLabel_1 = new JLabel("Patient Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(42, 95, 160, 23);
		panel.add(lblNewLabel_1);
		
		
		pname = new JTextField();
		pname.setBounds(212, 95, 280, 23);
		panel.add(pname);
		pname.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Doctor Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(57, 129, 139, 23);
		panel.add(lblNewLabel_2);
		
		dname = new JTextField();
		dname.setBounds(212, 129, 280, 23);
		panel.add(dname);
		dname.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Specialization");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(56, 163, 139, 23);
		panel.add(lblNewLabel_3);
		
		specialization_text = new JTextField();
		specialization_text.setBounds(212, 163, 280, 23);
		panel.add(specialization_text);
		specialization_text.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Date");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(166, 212, 66, 23);
		panel.add(lblNewLabel_4);
		
	
		date_text = new JTextField();
		date_text.setBounds(242, 214, 121, 23);
		panel.add(date_text);
		date_text.setColumns(10);
		
		JButton confirmbtn = new JButton("CONFIRM");
		confirmbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		confirmbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		confirmbtn.setBounds(111, 278, 121, 31);
		panel.add(confirmbtn);
		confirmbtn.addActionListener((e) -> {

			try {
				String name,doctor,speciali,date;
				name = pname.getText().toString();
			   doctor = dname.getText().toString();
				speciali = specialization_text.getText().toString();
				date =date_text.getText().toString();
	
		
				

				if (pname.equals("") || dname.equals(""))
					JOptionPane.showMessageDialog(this, "Please fill in the mandatory fields", "Error Alert",
							JOptionPane.ERROR_MESSAGE);

				else {
					String line;

					FileWriter writer = new FileWriter("C:\\Users\\Nayanika\\Desktop\\NewPatientList.txt.txt",
							true);
					
						line = name+"|"+doctor + "|" + speciali + "|" + date + "|" 
								+"|"+ "OutPatient"+"\n";
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
		cancelbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		cancelbtn.setBounds(252, 278, 108, 31);
		panel.add(cancelbtn);
		cancelbtn.addActionListener((e) -> {
			JOptionPane.showMessageDialog(this, "Process cancelled on request");

		});
		
		JButton exitbtn = new JButton("EXIT");
		exitbtn.addActionListener((e)->{
			this.setVisible(false);
		});
		exitbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
	    exitbtn.setBounds(384, 278, 108, 31);
		panel.add(exitbtn);
		
	
		
		
		JButton prevbtn = new JButton("<<PREV");
		prevbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		prevbtn.setBounds(43, 485, 115, 42);
		contentPane.add(prevbtn);
		prevbtn.addActionListener((e)->{
			this.setVisible(false);
			new NewPatient().setVisible(true);
		});
		
		
		JButton nextbtn = new JButton("NEXT>>");
		nextbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		nextbtn.setBounds(627, 485, 115, 42);
		contentPane.add(nextbtn);
		nextbtn.addActionListener((e)->{
			this.setVisible(false);
			new ConsultingAppointment().setVisible(true);
		});
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(OutPatient.class.getResource("/Images/plussign.png")));
		lblNewLabel_5.setBounds(10, 29, 73, 63);
		contentPane.add(lblNewLabel_5);
		
		JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
		background.setBounds(-202, -866, 1555, 2232);
		background.setFont(new Font("Tahoma", Font.ITALIC, 14));
		getContentPane().add(background);
		
	

	
	}
}
