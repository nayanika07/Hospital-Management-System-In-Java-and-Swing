package com.helpdesk;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.emergency.Emergency;
import com.patient_registration.ConsultingAppointment;
import com.payment.PaymentPortal;
import com.pharmacy.NewDrug;
import com.pharmacy.Pharmacy;
import com.staff_management.DoctorList;

import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class Helpdesk extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Helpdesk frame = new Helpdesk();
					frame.setTitle("Helpdesk");
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
	public Helpdesk() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Helpdesk.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 756, 734);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(230,238,230));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sterling Hospital: Support And Healthcare");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 28));
		lblNewLabel.setBounds(0, 21, 757, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("The Sterling World Of Care: Advanced | Assured | Accessible");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setBounds(83, 71, 588, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Our team of over a 1000 doctors join in giving you the best of modern healthcare to ensure you staying healthy always.");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setBounds(21, 106, 694, 30);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 128, 128), null, null, null));
		panel.setBackground(new Color(250, 240, 230));
		panel.setBounds(0, 184, 740, 183);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("HOSPITAL LOCATIONS");
		lblNewLabel_4.setForeground(new Color(0, 128, 128));
		lblNewLabel_4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 11, 200, 27);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ahmedabad");
		lblNewLabel_5.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 62, 115, 20);
		panel.add(lblNewLabel_5);
		
		JLabel lblDelhi = new JLabel("Delhi");
		lblDelhi.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		lblDelhi.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelhi.setBounds(10, 97, 115, 20);
		panel.add(lblDelhi);
		
		JLabel lblMumbai = new JLabel("Mumbai");
		lblMumbai.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		lblMumbai.setHorizontalAlignment(SwingConstants.CENTER);
		lblMumbai.setBounds(10, 136, 115, 20);
		panel.add(lblMumbai);
		
		JLabel lblBangalore = new JLabel("Bangalore");
		lblBangalore.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		lblBangalore.setHorizontalAlignment(SwingConstants.CENTER);
		lblBangalore.setBounds(179, 65, 115, 20);
		panel.add(lblBangalore);
		
		JLabel lblHyderabad = new JLabel("Hyderabad");
		lblHyderabad.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		lblHyderabad.setHorizontalAlignment(SwingConstants.CENTER);
		lblHyderabad.setBounds(179, 100, 115, 20);
		panel.add(lblHyderabad);
		
		JLabel lblTrivandrum = new JLabel("Trivandrum");
		lblTrivandrum.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		lblTrivandrum.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrivandrum.setBounds(179, 139, 115, 20);
		panel.add(lblTrivandrum);
		
		JLabel lblChennai = new JLabel("Chennai");
		lblChennai.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		lblChennai.setHorizontalAlignment(SwingConstants.CENTER);
		lblChennai.setBounds(362, 65, 115, 20);
		panel.add(lblChennai);
		
		JLabel lblKolkata = new JLabel("Kolkata");
		lblKolkata.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		lblKolkata.setHorizontalAlignment(SwingConstants.CENTER);
		lblKolkata.setBounds(362, 100, 115, 20);
		panel.add(lblKolkata);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Helpdesk.class.getResource("/Images/hospital.jpg")));
		lblNewLabel_10.setBounds(501, 11, 229, 161);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_3 = new JLabel("Sterling LifeLine: 1860 500 7000");
		lblNewLabel_3.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		lblNewLabel_3.setBounds(21, 136, 253, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblEmergency = new JLabel("Emergency: 7001");
		lblEmergency.setForeground(new Color(255, 0, 0));
		lblEmergency.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmergency.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		lblEmergency.setBounds(546, 147, 184, 24);
		contentPane.add(lblEmergency);
		
		JButton b1 = new JButton("Book Now");
		b1.setFont(new Font("Tahoma", Font.BOLD, 13));
		b1.setBounds(221, 379, 116, 30);
		contentPane.add(b1);
		b1.addActionListener((e)->
		{
			new ConsultingAppointment().setVisible(true);
		});
		
		JLabel lblNewLabel_6 = new JLabel("Book An Appointment Now!");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_6.setBounds(22, 378, 252, 30);
		contentPane.add(lblNewLabel_6);
		
		JButton b2 = new JButton("FIND A DOCTOR");
		b2.setFont(new Font("Tahoma", Font.BOLD, 13));
		b2.setBounds(565, 378, 165, 30);
		contentPane.add(b2);
		b2.addActionListener((e)->{
			new DoctorList().setVisible(true);
		});
		
		
		JButton b3 = new JButton("HELP REQUEST");
		b3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		b3.setBounds(565, 431, 165, 38);
		contentPane.add(b3);
		b3.addActionListener((e)->{
			new HelpRequest().setVisible(true);
		});
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 205));
		panel_1.setBounds(0, 498, 740, 140);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		JLabel l1 = new JLabel("");
		l1.setBounds(382, 17, 278, 20);
		panel_1.add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setBounds(382, 51, 278, 20);
		panel_1.add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setBounds(382, 90, 278, 20);
		panel_1.add(l3);
		
		JLabel lblNewLabel_7 = new JLabel("VISITOR TIMINGS");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(24, 17, 164, 29);
		panel_1.add(lblNewLabel_7);
		
		String[] data = {"Morning","Afternoon","Evening","Night"};
		JComboBox comboBox = new JComboBox(data);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setSelectedItem(0);
		comboBox.setBounds(24, 51, 164, 29);
		panel_1.add(comboBox);
		
		JButton btnNewButton = new JButton("Get Visitor Timings");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(24, 90, 164, 29);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("For Online Appointment Go to www.asksterling.com");
		lblNewLabel_8.setForeground(new Color(0, 0, 128));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_8.setBounds(83, 420, 472, 24);
		contentPane.add(lblNewLabel_8);
		
		JButton prevbtn = new JButton("<<PREV");
		prevbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		prevbtn.setBounds(21, 649, 126, 35);
		contentPane.add(prevbtn);
		
		
		JButton nextbtn = new JButton("NEXT>>");
		nextbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		nextbtn.setBounds(604, 649, 126, 35);
		contentPane.add(nextbtn);
		
		JButton b4 = new JButton("EMERGENCY");
		b4.setBackground(new Color(255, 218, 185));
		b4.setFont(new Font("Tahoma", Font.BOLD, 15));
		b4.setBounds(21, 455, 153, 30);
		contentPane.add(b4);
		b4.addActionListener((e)->
		{
			new Emergency().setVisible(true);
		});
		btnNewButton.addActionListener((e)->{
	    String ans=(String)comboBox.getSelectedItem();

		if (ans=="Morning")
		{
			l1.setText("8:00 am to 9:15 am on Weekdays");
			l2.setText("10:00 am to 11:15 am on Weekdays");
			l3.setText("9:00 am to 11:00 am on Sunday/Saturday");
		}
		else if(ans=="Afternoon")
		{
			l1.setText("12:00 pm to 1:15 pm on Weekdays");
			l2.setText("1:00 pm to 2:15 pm on Weekdays");
			l3.setText("1:00 pm to 4:00 pm on Sunday/Saturday");
		}
		else if(ans=="Evening")
		{
			l1.setText("5:00 pm to 6:15 pm on Weekdays");
			l2.setText("6:00 pm to 7:15 pm on Weekdays");
			l3.setText("5:00 pm to 7:30 pm on Sunday/Saturday");
			
		}
		else
		{	
			l1.setText("8:00 pm to 9:15 pm on Weekdays");
		    l2.setText("9:00 pm to10:15 pm on Weekdays");
		    l3.setText("8:00 pm to 10:30 pm on Sunday/Saturday");
			
		
	}

		});
	
		prevbtn.addActionListener((e)->{
			this.setVisible(false);
			new NewDrug().setVisible(true);
		});
		nextbtn.addActionListener((e)->{
			this.setVisible(false);
			new PaymentPortal().setVisible(true);
			
		});
	
	}
}
