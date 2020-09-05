package com.registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.emergency.Emergency;
import com.helpdesk.BloodBank;
import com.helpdesk.HelpRequest;
import com.helpdesk.Helpdesk;
import com.helpdesk.PatientCare;
import com.patient_registration.ConsultingAppointment;
import com.patient_registration.NewPatient;
import com.patient_registration.OutPatient;
import com.patient_registration.Transfer;
import com.payment.PaymentPortal;
import com.pharmacy.NewDrug;
import com.pharmacy.Pharmacy;
import com.staff_management.DoctorList;
import com.staff_management.NewDoctor;
import com.staff_management.NewNurse;
import com.staff_management.NewStaff;
import com.ward_management.Ward_Management;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextArea;


public class Registration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField namefield;
	private JTextField phonefield;
	private JPasswordField passfield;
	private JTextField nametextlogin;
	private JPasswordField passtextlogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setTitle("Registration");
					frame.setVisible(true);
				
				
				} catch (Exception e) {
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
	public Registration() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Registration.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1325, 747);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sterling Hospital");
		lblNewLabel.setBackground(new Color(25, 25, 112));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(211, 211, 211));
	
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 86));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(111, 0, 1116, 114);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 175, 175));
		tabbedPane.setBounds(10, 445, 857, 229);
		contentPane.add(tabbedPane);
		
				JPanel aboutus_panel = new JPanel();
				aboutus_panel.setBackground(new Color(255, 255, 240));
				tabbedPane.addTab("About Us", null, aboutus_panel, null);
				aboutus_panel.setLayout(null);
				
				JLabel lblNewLabel_3 = new JLabel("Sterling Hospital provies world class medical services with the best facilities from expert and dedicated doctors and staff.");
				lblNewLabel_3.setFont(new Font("Microsoft New Tai Lue", Font.BOLD | Font.ITALIC, 14));
				lblNewLabel_3.setBounds(26, 36, 840, 31);
				aboutus_panel.add(lblNewLabel_3);
				
				JLabel lblWithOver = new JLabel("\"With over 500 doctors in over 6 cities across India\"");
				lblWithOver.setFont(new Font("Microsoft New Tai Lue", Font.BOLD | Font.ITALIC, 16));
				lblWithOver.setBounds(26, 69, 840, 31);
				aboutus_panel.add(lblWithOver);
				
				JLabel lblNewLabel_13 = new JLabel("Founder: Shri S. Murthy");
				lblNewLabel_13.setBackground(new Color(135, 206, 250));
				lblNewLabel_13.setForeground(new Color(0, 0, 128));
				lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
				lblNewLabel_13.setBounds(26, 124, 264, 25);
				aboutus_panel.add(lblNewLabel_13);
				
				JLabel lblToKnowMore = new JLabel("To know more>> Visit www.sterlinghospitals.co.in");
				lblToKnowMore.setFont(new Font("Franklin Gothic Book", Font.BOLD, 20));
				lblToKnowMore.setBounds(10, 168, 840, 31);
				aboutus_panel.add(lblToKnowMore);
	
	
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 240));
		tabbedPane.addTab("Contact", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Address: Sterling Hospital, 42 Park Circle Road, opposite Axis Bank, Kolkata 700156");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(32, 28, 595, 53);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Contact: +91 9768765532");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(32, 81, 270, 31);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Dial 7001 for emergency services");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(29, 123, 347, 39);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("E-mail: contact@sterlinghospitals.co.in");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(29, 167, 384, 32);
		panel.add(lblNewLabel_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(173, 216, 230));
		tabbedPane.addTab("Register", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("NAME");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(125, 30, 103, 21);
		panel_1.add(lblNewLabel_8);
		
		namefield = new JTextField();
		namefield.setBounds(215, 30, 187, 21);
		panel_1.add(namefield);
		namefield.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("PHONE NUMBER");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(441, 30, 125, 21);
		panel_1.add(lblNewLabel_9);
		
		phonefield = new JTextField();
		phonefield.setBounds(576, 30, 187, 21);
		panel_1.add(phonefield);
		phonefield.setColumns(10);
		
		JRadioButton malebtn = new JRadioButton("MALE");
		malebtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		malebtn.setBounds(292, 80, 132, 21);
		panel_1.add(malebtn);
		
		JRadioButton femalebtn = new JRadioButton("FEMALE");
		femalebtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		femalebtn.setBounds(441, 80, 162, 21);
		panel_1.add(femalebtn);
		
		JLabel lblNewLabel_10 = new JLabel("PASSWORD");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(97, 116, 132, 21);
		panel_1.add(lblNewLabel_10);
		
		passfield = new JPasswordField();
		passfield.setBounds(215, 118, 187, 21);
		panel_1.add(passfield);
		
		JButton registerbtn = new JButton("REGISTER");
		registerbtn.setToolTipText("Already egistered? Go to Login");
		registerbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		registerbtn.setBounds(193, 153, 145, 32);
		panel_1.add(registerbtn);
		

		registerbtn.addActionListener((e) -> {

			try {
				String name,phone,password;
				name = namefield.getText().toString();
			    phone = phonefield.getText().toString();
				password = passfield.getText().toString();
				boolean atleastOneAlpha = phone.matches(".*[a-zA-Z]+.*");// to check if mobile_no contains alphabets
				Pattern p = Pattern.compile("[^A-Za-z0-9]"); // to check if name/surname/number contains special
																// characters
				Matcher m4 = p.matcher(password);
				boolean b4 = m4.find();

				if (name.equals("") || phone.equals("") || 
						password.equals("")) {
					JOptionPane.showMessageDialog(this, "Please fill in the required fields", "Error Alert",
							JOptionPane.ERROR_MESSAGE);
				} else if (atleastOneAlpha == true) {
					JOptionPane.showMessageDialog(this, "Invalid Mobile Number", "Error Alert",
							JOptionPane.ERROR_MESSAGE);
				} else if (b4 != true) {
					JOptionPane.showMessageDialog(this, "Password must contain atleast one special character",
							"Error Alert", JOptionPane.ERROR_MESSAGE);
				}

				else {
					String line;

					FileWriter writer = new FileWriter("C:\\Users\\Nayanika\\Desktop\\RegisteredOperators.txt",
							true);
					if (malebtn.isSelected()) {
						line = name + "|" + "Male" + "|" + phone + "|" + password
								+ "\n";
						writer.write(line);
						writer.write("\n");
					} else {
						line = name + "|" + "Female" + "|" + phone + "|" + password
								+ "\n";
						writer.write(line);
						writer.write("\n");
					}

					writer.close();
					System.out.println("file write successful");
					JOptionPane.showMessageDialog(this, "Registration Successful");
				}
			} // try ends

			catch (IOException ioe) {
				System.out.println("File Write Unsuccessful!");
			} // catch ends

		});// action ends
		
		JButton cancelbtn = new JButton("CANCEL");
		cancelbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		cancelbtn.setBounds(363, 155, 145, 32);
		panel_1.add(cancelbtn);
		
		cancelbtn.addActionListener((e) -> {
			JOptionPane.showMessageDialog(this, "You Cancelled Your Registration Process");

		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(173, 216, 230));
		tabbedPane.addTab("Login", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("NAME");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(327, 38, 55, 30);
		panel_3.add(lblNewLabel_11);
		
		nametextlogin = new JTextField();
		nametextlogin.setBounds(406, 40, 206, 30);
		panel_3.add(nametextlogin);
		nametextlogin.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("PASSWORD");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(283, 97, 113, 30);
		panel_3.add(lblNewLabel_12);
		
		passtextlogin = new JPasswordField();
		passtextlogin.setBounds(406, 99, 206, 30);
		panel_3.add(passtextlogin);
		
		JButton loginbtn2 = new JButton("LOGIN");
		loginbtn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		loginbtn2.setBounds(342, 157, 126, 42);
		panel_3.add(loginbtn2);
		loginbtn2.addActionListener((e) -> {
		try {
			String pathname = "C:\\\\Users\\\\Nayanika\\\\Desktop\\\\RegisteredOperators.txt";
			File file = new File(pathname);
			String username1 = nametextlogin.getText().toString();
			String password1 = passtextlogin.getText().toString();
			boolean exists = false;
			FileReader fileReader = new FileReader(file);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line = bufferedReader.readLine();

			while (line != null) {
				// System.out.println(line);

				if ((line.contains(username1)) && (line.contains(password1)) && (!username1.trim().equals(""))
						&& (!password1.trim().equals(""))) {
					exists = true;
					break;
				}

				line = bufferedReader.readLine();
			} // while loop ends
			if (exists == true) {
				new homepage().setVisible(true);
				// shows the next page after login
				this.setVisible(false);
				System.out.println("file read successful");
				
			} else {
				JOptionPane.showMessageDialog(this, "Invalid Username/password", "Error Alert",
						JOptionPane.ERROR_MESSAGE);
			}

			bufferedReader.close();
			fileReader.close();

		} catch (FileNotFoundException exp) {
			exp.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		}
	});


		
		
		JButton cancelbtn2 = new JButton("CANCEL");
		cancelbtn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		cancelbtn2.setBounds(508, 157, 133, 42);
		panel_3.add(cancelbtn2);
		cancelbtn2.addActionListener((e) -> {
			new Registration().setVisible(true);
			this.setVisible(false);
		});
		
	
		contentPane.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 125, 1289, 277);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Registration.class.getResource("/Images/Smart-Apps-Mean-Smart-Patients-3-1220x349.jpg")));
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setBounds(825, 0, 464, 277);
		panel_4.add(label);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(414, 0, 419, 277);
		panel_4.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(Registration.class.getResource("/Images/logo.png")));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Registration.class.getResource("/Images/Smart-Apps-Mean-Smart-Patients-3-1220x349.jpg")));
		lblNewLabel_2.setBounds(0, 0, 773, 277);
		panel_4.add(lblNewLabel_2);
		

	
		
		JLabel lblNewLabel_15 = new JLabel("Hospital Management System Powered By ThirdLife IT Solutions");
		lblNewLabel_15.setForeground(new Color(30, 144, 255));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Microsoft Tai Le", Font.BOLD, 18));
		lblNewLabel_15.setBounds(301, 416, 566, 35);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_16.setIcon(new ImageIcon(Registration.class.getResource("/Images/grey.jpg")));
		lblNewLabel_16.setBounds(1128, 404, 171, 191);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_14 = new JLabel("we ensure your health first\"");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBackground(new Color(224, 255, 255));
		lblNewLabel_14.setOpaque(true);
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_14.setBounds(1128, 616, 171, 20);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_17 = new JLabel("Dr. Grey (Director, Sterling Kolkata)");
		lblNewLabel_17.setBackground(new Color(224, 255, 255));
		lblNewLabel_17.setOpaque(true);
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_17.setBounds(1128, 631, 171, 43);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblwithATeam = new JLabel("\"With a team of over 500 doctors");
		lblwithATeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblwithATeam.setBackground(new Color(224, 255, 255));
		lblwithATeam.setOpaque(true);
		lblwithATeam.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblwithATeam.setBounds(1128, 594, 171, 26);
		contentPane.add(lblwithATeam);
		
		JLabel lblNewLabel_18 = new JLabel("MULTI-SPECIALTY");
		lblNewLabel_18.setForeground(new Color(224, 255, 255));
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_18.setBackground(new Color(0, 128, 128));
		lblNewLabel_18.setOpaque(true);
		lblNewLabel_18.setBounds(877, 413, 241, 35);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("CARDIOLOGY");
		lblNewLabel_19.setForeground(new Color(224, 255, 255));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_19.setBackground(new Color(0, 128, 128));
		lblNewLabel_19.setOpaque(true);
		lblNewLabel_19.setBounds(877, 459, 241, 35);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("RADIOLOGY");
		lblNewLabel_20.setForeground(new Color(224, 255, 255));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_20.setBackground(new Color(0, 128, 128));
		lblNewLabel_20.setOpaque(true);
		lblNewLabel_20.setBounds(877, 505, 241, 35);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("NEONATAL CARE");
		lblNewLabel_21.setForeground(new Color(224, 255, 255));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_21.setBackground(new Color(0, 128, 128));
		lblNewLabel_21.setOpaque(true);
		lblNewLabel_21.setBounds(877, 551, 241, 35);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("EMERGENCY");
		lblNewLabel_22.setForeground(new Color(224, 255, 255));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_22.setBackground(new Color(0, 128, 128));
		lblNewLabel_22.setOpaque(true);
		lblNewLabel_22.setBounds(877, 596, 241, 35);
		contentPane.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("PHARMACY");
		lblNewLabel_23.setForeground(new Color(224, 255, 255));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_23.setBackground(new Color(0, 128, 128));
		lblNewLabel_23.setOpaque(true);
		lblNewLabel_23.setBounds(877, 642, 241, 35);
		contentPane.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.setIcon(new ImageIcon(Registration.class.getResource("/Images/newdocsymbol.jpg")));
		lblNewLabel_24.setBounds(10, -25, 101, 139);
		contentPane.add(lblNewLabel_24);
	
		JLabel lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25.setIcon(new ImageIcon(Registration.class.getResource("/Images/icon.png")));
		lblNewLabel_25.setBounds(1223, -11, 76, 101);
		contentPane.add(lblNewLabel_25);
		JLabel lblNewLabel_26 = new JLabel("7001");
		lblNewLabel_26.setForeground(new Color(255, 255, 255));
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setBackground(new Color(255, 51, 51));
		lblNewLabel_26.setOpaque(true);
		lblNewLabel_26.setBounds(1218, 77, 81, 35);
		contentPane.add(lblNewLabel_26);
		JLabel lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_27.setIcon(new ImageIcon(Registration.class.getResource("/Images/caduceus-medical-symbol-icon-on-blue-background-vector-21549610.jpg")));
		lblNewLabel_27.setBounds(10, 90, 101, 24);
		contentPane.add(lblNewLabel_27);
		JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
		background.setBackground(new Color(0, 128, 128));
		background.setBounds(-202, -866, 1555, 2232);
		background.setFont(new Font("Serif", Font.ITALIC, 14));
		getContentPane().add(background);

	}
}
