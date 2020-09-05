package com.registration;
import java.util.Date;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

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
import com.sun.glass.ui.Timer;
import com.ward_management.Ward_Management;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
		
				try {
					homepage frame = new homepage();
				      
					
				
					frame.setTitle("Home");
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
	public homepage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(homepage.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1295, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		



		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 11, 1294, 88);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		JMenu add_new_patient = new JMenu("Patient Module");
		mb.add(add_new_patient );
		JMenuItem outpatient = new JMenuItem("Out-Patient Application");
		add_new_patient.add(outpatient);
		outpatient.addActionListener((e) -> {
            new OutPatient().setVisible(true);
       
		});
		JMenuItem inpatient = new JMenuItem("In-Patient Application");
		add_new_patient.add(inpatient);
		inpatient.addActionListener((e) -> {
			
            new NewPatient().setVisible(true);
      
       });
		JMenu consulting = new JMenu("Consulting Appointment");
		mb.add(consulting);
		JMenuItem consult =new JMenuItem("Consultation Form");
		consulting.add(consult);
		
		consult.addActionListener((e)->{
		
			new ConsultingAppointment().setVisible(true);
		});
		JMenu transfer=new JMenu("Transfer");
		mb.add(transfer);
		JMenuItem tran = new JMenuItem("Transfer Checkout");
		transfer.add(tran);
		tran.addActionListener((e)->{
			new Transfer().setVisible(true);
		});
		
		
		JMenu staff = new JMenu("Staff");
		mb.add(staff);
		JMenuItem newdoc = new JMenuItem("Add Doctor");
		staff.add(newdoc);
		newdoc.addActionListener((e)->{
			new NewDoctor().setVisible(true);
		});
		JMenuItem newnurse = new JMenuItem("Add Nurse");
		staff.add(newnurse);
		newnurse.addActionListener((e)->{
			new NewNurse().setVisible(true);
		});
		JMenuItem newstaff = new JMenuItem("Add Support Staff");
		staff.add(newstaff);
		newstaff.addActionListener((e)->{
			new NewStaff().setVisible(true);
		});
		
		JMenuItem doclist = new JMenuItem("Doctor List");
		staff.add(doclist);
		doclist.addActionListener((e)->{
			new DoctorList().setVisible(true);
		});
		
		
		JMenu ward =new JMenu("Ward Management");
		mb.add(ward);
		JMenuItem wardmenu = new JMenuItem("Ward Details");
		ward.add(wardmenu);
		wardmenu.addActionListener((e)->{
			new Ward_Management().setVisible(true);
		});
		
		JMenu emergency=new JMenu("Emergency Services");
		mb.add(emergency);
		JMenuItem em = new JMenuItem("Add New");
		emergency.add(em);
		em.addActionListener((e)->{
			new Emergency().setVisible(true);
		});
		
		
		JMenu patient_care =new JMenu("Patient Care");
		mb.add(patient_care);
		JMenuItem pc = new JMenuItem("Patient Care Updates");
		patient_care.add(pc);
		pc.addActionListener((e)->{
			new PatientCare().setVisible(true);
		});
		
		JMenu pharmacy = new JMenu("Pharmacy");
		mb.add(pharmacy);
		JMenuItem pharma1 = new JMenuItem("Drug Store");
		pharmacy.add(pharma1);
		pharma1.addActionListener((e)->{
			new Pharmacy().setVisible(true);
		});
		JMenuItem pharma2 = new JMenuItem("Add New Medicine");
		pharmacy.add(pharma2);
		pharma2.addActionListener((e)->{
			new NewDrug().setVisible(true);
		});
		
		
		
		JMenu bloodbank = new JMenu("Blood Bank");
		mb.add(bloodbank);
		JMenuItem b = new JMenuItem("Sterling Blood Bank");
		bloodbank.add(b);
		b.addActionListener((e)->{
			new BloodBank().setVisible(true);
		});
		
		JMenu helpdesk = new JMenu("Helpdesk");
		mb.add(helpdesk);
		JMenuItem help = new JMenuItem("Support & Healthcare");
		helpdesk.add(help);
		help.addActionListener((e)->{
			new Helpdesk().setVisible(true);
		});
		JMenuItem help2 = new JMenuItem("Help Request Form");
		helpdesk.add(help2);
		help2.addActionListener((e)->{
			new HelpRequest().setVisible(true);
		});
		
		JMenu payment = new JMenu("Payment");
		mb.add(payment);
		JMenuItem portal = new JMenuItem("Make Payment");
		payment.add(portal);
		portal.addActionListener((e)->{
			new PaymentPortal().setVisible(true);
		});
		
	
		
		JLabel lblNewLabel = new JLabel("You Are Now Logged In");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(1057, 27, 204, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("||  HOME  ||");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 42));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(92, 11, 381, 66);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(homepage.class.getResource("/Images/plussign.png")));
		lblNewLabel_7.setBounds(10, 11, 72, 66);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_2 = new JLabel("Add A New Patient>>");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_2.setBounds(741, 133, 262, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_3.setIcon(new ImageIcon(homepage.class.getResource("/Images/newdoccccc.png")));
		lblNewLabel_3.setBounds(720, 175, 534, 361);
		contentPane.add(lblNewLabel_3);
		
		JButton addbtn = new JButton("ADD");
		addbtn.setFont(new Font("Tahoma", Font.BOLD, 23));
		addbtn.setBounds(1049, 122, 151, 44);
		contentPane.add(addbtn);
		
		JLabel lblNewLabel_4 = new JLabel("Patient Management ");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(new Color(60, 179, 113));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_4.setBounds(33, 189, 609, 50);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblScheduleConsultingAppointments = new JLabel("Schedule Consulting Appointments");
		lblScheduleConsultingAppointments.setForeground(new Color(255, 255, 255));
		lblScheduleConsultingAppointments.setOpaque(true);
		lblScheduleConsultingAppointments.setBackground(new Color(60, 179, 113));
		lblScheduleConsultingAppointments.setHorizontalAlignment(SwingConstants.CENTER);
		lblScheduleConsultingAppointments.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 22));
		lblScheduleConsultingAppointments.setBounds(33, 250, 609, 50);
		contentPane.add(lblScheduleConsultingAppointments);
		
		JLabel lblTransferdischargeForms = new JLabel("Transfer/Discharge Forms");
		lblTransferdischargeForms.setForeground(new Color(255, 255, 255));
		lblTransferdischargeForms.setBackground(new Color(60, 179, 113));
		lblTransferdischargeForms.setOpaque(true);
		lblTransferdischargeForms.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransferdischargeForms.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 22));
		lblTransferdischargeForms.setBounds(33, 311, 609, 44);
		contentPane.add(lblTransferdischargeForms);
		
		JLabel lblManageStaffRecord = new JLabel("Manage Staff Record");
		lblManageStaffRecord.setForeground(new Color(255, 255, 255));
		lblManageStaffRecord.setBackground(new Color(60, 179, 113));
		lblManageStaffRecord.setOpaque(true);
		lblManageStaffRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblManageStaffRecord.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 22));
		lblManageStaffRecord.setBounds(33, 421, 609, 44);
		contentPane.add(lblManageStaffRecord);
		
		JLabel lblRegisterEmergencies = new JLabel("Register Emergencies");
		lblRegisterEmergencies.setForeground(new Color(255, 255, 255));
		lblRegisterEmergencies.setBackground(new Color(60, 179, 113));
		lblRegisterEmergencies.setOpaque(true);
		lblRegisterEmergencies.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegisterEmergencies.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 22));
		lblRegisterEmergencies.setBounds(33, 366, 609, 44);
		contentPane.add(lblRegisterEmergencies);
		
		JLabel lblAccessToPharmacy = new JLabel("Access to Pharmacy");
		lblAccessToPharmacy.setForeground(new Color(255, 255, 255));
		lblAccessToPharmacy.setBackground(new Color(60, 179, 113));
		lblAccessToPharmacy.setOpaque(true);
		lblAccessToPharmacy.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccessToPharmacy.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 22));
		lblAccessToPharmacy.setBounds(33, 476, 609, 44);
		contentPane.add(lblAccessToPharmacy);
		
		JLabel lblAccessToBlood = new JLabel("Access to Blood Bank Details");
		lblAccessToBlood.setForeground(new Color(255, 255, 255));
		lblAccessToBlood.setBackground(new Color(60, 179, 113));
		lblAccessToBlood.setOpaque(true);
		lblAccessToBlood.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccessToBlood.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 22));
		lblAccessToBlood.setBounds(33, 531, 609, 50);
		contentPane.add(lblAccessToBlood);
		
		JLabel lblNewLabel_5 = new JLabel("Payment Portal Management");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBackground(new Color(60, 179, 113));
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_5.setBounds(33, 592, 609, 44);
		contentPane.add(lblNewLabel_5);
		JLabel lblNewLabel_6 = new JLabel("Services:");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Open Sans Semibold", Font.BOLD | Font.ITALIC, 42));
		lblNewLabel_6.setBounds(28, 115, 378, 50);
		contentPane.add(lblNewLabel_6);
		
		JButton nextbtn = new JButton("NEXT>>");
		nextbtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		nextbtn.setBounds(1031, 604, 131, 44);
		contentPane.add(nextbtn);
		nextbtn.addActionListener((e)->{
			this.setVisible(false);
			new NewPatient().setVisible(true);
		});
		
	  addbtn.addActionListener((e)->{
			new NewPatient().setVisible(true);
		});
		
	  
		JLabel lblNewLabel_8 = new JLabel("Ensuring the best health services by experts");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_8.setBounds(730, 536, 534, 37);
		contentPane.add(lblNewLabel_8);
		
		JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
		background.setBounds(-202, -866, 1555, 2232);
		background.setFont(new Font("Tahoma", Font.ITALIC, 14));
		getContentPane().add(background);
		

		

		
	
		
		
	}
}
