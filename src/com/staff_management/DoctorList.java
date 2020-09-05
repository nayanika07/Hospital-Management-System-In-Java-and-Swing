package com.staff_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.pharmacy.Pharmacy;
import com.registration.Registration;
import com.ward_management.Ward_Management;

import javax.swing.JTable;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class DoctorList extends JFrame {

	private JPanel contentPane;
	
    JTable jt;
    String[] column_headers = {"NAME","SPECIALIZATION","CONTACT","EMAIL"};
    String[][] data = {{"Rajiv Ray", "Child Specialist", "9056797861", "r.ray@sterling.com"},
    		           {"Ashim Gupta","Urologist", "7098676542", "drashimgupta@sterling.com"},
                       {"Florence Parker", "Gynaecologist", "7890001233", "drparker@sterling.com"},
                       {"Mathew Grey", "Cardiologist","9008741331", "mathew123@gmail.co.in"},
                       {"William Wren", "Neurosurgeon","14009876543", "wren_doc@gmail.co.in"},
                       
                       {"Meenakshi Talwar", "Pediatrician","9005677111", "m_talwar@gmail.co.in"},
                       {"Aakash Gupta", "Radiologist","7808741438", "aakash_doc@gmail.co.in"},
                       {"Radhika Agarwal", "Opthalmologist","94341208711", "dradhika@yahoo.co.in"},
                       {"Armaan Malik", "Child Specialist","866509361", "doctormalik@gmail.com"},
                       {"Riddhima Sen", "Pathologist","70098654322", "riddhima_sen08@gmail.com"},
                       {"Zayen Khan", "Endocrinologist","8445509780", "khan7089@gmail.com"},
                       {"Sushil Sinha", "Cardiologist","8076991011", "sushil2005@rediffmail.com"},
                       
                       {"Piyush Bose", "Gynaecologist","9877045389", "bose_piyush81@gmail.com"},
                       {"Jayant Chatterjee", "CardioVascular surgeon","9012890771", "chatterjee77@sterling.com"},
                       {"Rohit Saraf", "Psychiatrist","76522309616", "rohitsaraf@gmail.com"},
                       {"Aman Verma", "Anesthesiologist","8799409123", "aman_verma12@gmail.co.in"},
                       {"Jennifer Winget", "Nephrologist","9007709026", "misswinget@gmail.com"},
                       {"Niharika Agarwal", "Dermatologist","8705552910", "niharika_4050@sterling.com"},
                       {"Prateek Dasgupta", "Gynaecologist","9654091889", "im_prateek01@gmail.com"},
                       {"Sahil Singhania", "Oncologist","7860045555", "sahil.2007@gmail.com"},
                       {"Vinay Garg", "Oncologist","7200186379", "garg.vinay@gmail.com"},
                       {"Siddharth Mehra", "Urologist","9877045000", "siddharth_doc1@gmail.com"},
                       {"Arundhati Paul", "Obstetrician","8845013366", "drarundhati@gmail.com"},
                       {"Malini Roy", "Pulmonologist","7703889891", "dr_maliniroy@gmail.com"},
                       {"Priyangshu Mondal", "Child Specialist","9017896689", "priyangshum@gmail.com"},
                       {"Priyanka Mukherjee", "Neurosurgeon","90955508111", "drmukherjee09@gmail.com"},
    
    
    };
    private JTextField input;
                       
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorList frame = new DoctorList();
					frame.setTitle("Doctor Record");
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
	public DoctorList() {
		getContentPane().setBackground(new Color(70, 130, 180));
		setIconImage(Toolkit.getDefaultToolkit().getImage(DoctorList.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        getContentPane().setLayout(null);
        jt = new JTable(data,column_headers);
        jt.setFont(new Font("Tahoma", Font.PLAIN, 12));
        jt.setBackground(new Color(255, 250, 205));
        jt.getTableHeader().setFont(new Font("Tahoma",Font.BOLD,14));
        jt.getTableHeader().setBackground(new Color(173,216,230));
        jt.setBounds(50,50,200,230);
        JScrollPane js = new JScrollPane(jt);
        js.setViewportBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        js.setBounds(10, 317, 694, 298);
        getContentPane().add(js);
        
        JLabel lblNewLabel_2 = new JLabel("Sterling Hospital: Doctor Record");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setBackground(new Color(0, 128, 128));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 30));
        lblNewLabel_2.setBounds(0, 11, 914, 54);
        getContentPane().add(lblNewLabel_2);
        lblNewLabel_2.setOpaque(true);
        this.setSize(940,710);
        this.setVisible(true);
       
       JButton prevbtn = new JButton("<<PREV");
		prevbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		prevbtn.setBounds(10, 626, 122, 34);
		getContentPane().add(prevbtn);
		prevbtn.addActionListener((e)->{
			this.setVisible(false);
			new NewStaff().setVisible(true);
		});
		JButton btnNext = new JButton("NEXT>>");
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext.setBounds(792, 626, 122, 34);
		getContentPane().add(btnNext);
		btnNext.addActionListener((e)->{
			this.setVisible(false);
			new Pharmacy().setVisible(true);
		});
		
 
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 250, 240));
		panel.setBounds(10, 244, 694, 75);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Doctor Name:");
		lblNewLabel.setBounds(13, 15, 127, 16);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(255, 250, 240));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		input = new JTextField();
		input.setBounds(143, 14, 241, 21);
		panel.add(input);
		input.setColumns(10);
		
		JButton searchbtn = new JButton("SEARCH");
		searchbtn.setBounds(395, 11, 100, 25);
		panel.add(searchbtn);
		searchbtn.setToolTipText("Search By Name");
		searchbtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		
		JLabel lblNewLabel_1 = new JLabel("Search Result:");
		lblNewLabel_1.setBounds(0, 46, 130, 21);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(255, 250, 240));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label1 = new JLabel("");
		label1.setOpaque(true);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBackground(new Color(255, 239, 213));
		label1.setBounds(122, 46, 90, 21);
		panel.add(label1);
		
		JLabel label2 = new JLabel("");
		label2.setOpaque(true);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBackground(new Color(255, 239, 213));
		label2.setBounds(207, 46, 121, 21);
		panel.add(label2);
		
		JLabel label3 = new JLabel("");
		label3.setOpaque(true);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBackground(new Color(255, 239, 213));
		label3.setBounds(325, 46, 100, 21);
		panel.add(label3);
		
		JLabel label4 = new JLabel("");
		label4.setOpaque(true);
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setBackground(new Color(255, 239, 213));
		label4.setBounds(423, 46, 249, 21);
		panel.add(label4);
		
		
		JButton addbtn = new JButton("ADD NEW DOCTOR");
		addbtn.setBounds(505, 6, 167, 34);
		panel.add(addbtn);
		addbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		addbtn.addActionListener((e)->{
		
			new NewDoctor().setVisible(true);
		});
		searchbtn.addActionListener((e) -> {
    	String target = input.getText();
		 int counter=0;
		for(int row = 0; row<jt.getRowCount();row++)
		for(int col = 0; col<jt.getColumnCount();col++)
		{
			String next = (String)jt.getValueAt(row, col);
			if(next.equalsIgnoreCase(target))
				{
				 Object[] rowdata = new Object[jt.getColumnCount()];
				 for(int i=0;i<jt.getColumnCount();i++) 
					 rowdata[i]=jt.getValueAt(row,i);
			         label1.setText((String)rowdata[0]);
			         label2.setText((String)rowdata[1]);
			         label3.setText((String)rowdata[2]);
				     label4.setText((String)rowdata[3]);
	                 counter++;
				}
				
				
		}//loop ends
		if(counter==0)
			JOptionPane.showMessageDialog(this, "Result Not Found!");
	
		});
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(DoctorList.class.getResource("/Images/docs.jpg")));
		lblNewLabel_3.setBounds(115, 86, 630, 147);
		getContentPane().add(lblNewLabel_3);
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(DoctorList.class.getResource("/Images/drtt.jpg")));
		lblNewLabel_4.setBounds(714, 86, 200, 233);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Dr. Wren (Neurosurgeon,MD London)");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBackground(new Color(245, 255, 250));
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(714, 320, 200, 23);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBackground(new Color(255, 255, 255));
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setIcon(new ImageIcon(DoctorList.class.getResource("/Images/Red_Cross_Icon_Reworked (1).jpg")));
		lblNewLabel_6.setBounds(10, 86, 105, 147);
		getContentPane().add(lblNewLabel_6);
		JLabel lblNewLabel_7 = new JLabel("CARDIOLOGY");
		lblNewLabel_7.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBackground(new Color(46, 139, 87));
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setBounds(714, 354, 200, 25);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblEndocrinology = new JLabel("ENDOCRINOLOGY");
		lblEndocrinology.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblEndocrinology.setForeground(new Color(255, 255, 255));
		lblEndocrinology.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndocrinology.setBackground(new Color(60, 179, 113));
		lblEndocrinology.setOpaque(true);
		lblEndocrinology.setBounds(714, 378, 200, 25);
		getContentPane().add(lblEndocrinology);
		
		JLabel lblGynaecology = new JLabel("GYNAECOLOGY");
		lblGynaecology.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblGynaecology.setForeground(new Color(255, 255, 255));
		lblGynaecology.setHorizontalAlignment(SwingConstants.CENTER);
		lblGynaecology.setBackground(new Color(46, 139, 87));
		lblGynaecology.setOpaque(true);
		lblGynaecology.setBounds(714, 401, 200, 25);
		getContentPane().add(lblGynaecology);
		
		JLabel lblNeurologist = new JLabel("NEUROLOGY");
		lblNeurologist.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNeurologist.setForeground(new Color(255, 255, 255));
		lblNeurologist.setHorizontalAlignment(SwingConstants.CENTER);
		lblNeurologist.setBackground(new Color(60, 179, 113));
		lblNeurologist.setOpaque(true);
		lblNeurologist.setBounds(714, 423, 200, 25);
		getContentPane().add(lblNeurologist);
		
		JLabel lblOncology = new JLabel("ONCOLOGY");
		lblOncology.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblOncology.setForeground(new Color(255, 255, 255));
		lblOncology.setHorizontalAlignment(SwingConstants.CENTER);
		lblOncology.setBackground(new Color(46, 139, 87));
		lblOncology.setOpaque(true);
		lblOncology.setBounds(714, 445, 200, 25);
		getContentPane().add(lblOncology);
		
		JLabel lblOphthalmology = new JLabel("OPTHALMOLOGY");
		lblOphthalmology.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblOphthalmology.setForeground(new Color(255, 255, 255));
		lblOphthalmology.setHorizontalAlignment(SwingConstants.CENTER);
		lblOphthalmology.setBackground(new Color(60, 179, 113));
		lblOphthalmology.setOpaque(true);
		lblOphthalmology.setBounds(714, 469, 200, 25);
		getContentPane().add(lblOphthalmology);
		
		JLabel lblPathology = new JLabel("PATHOLOGY");
		lblPathology.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPathology.setForeground(new Color(255, 255, 255));
		lblPathology.setHorizontalAlignment(SwingConstants.CENTER);
		lblPathology.setBackground(new Color(46, 139, 87));
		lblPathology.setOpaque(true);
		lblPathology.setBounds(714, 492, 200, 25);
		getContentPane().add(lblPathology);
		
		JLabel lblPsychiatrist = new JLabel("PSYCHIATRY");
		lblPsychiatrist.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPsychiatrist.setForeground(new Color(255, 255, 255));
		lblPsychiatrist.setHorizontalAlignment(SwingConstants.CENTER);
		lblPsychiatrist.setBackground(new Color(60, 179, 113));
		lblPsychiatrist.setOpaque(true);
		lblPsychiatrist.setBounds(714, 515, 200, 25);
		getContentPane().add(lblPsychiatrist);
		
		JLabel lblPediatrics = new JLabel("PEDIATRICS");
		lblPediatrics.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPediatrics.setForeground(new Color(255, 255, 255));
		lblPediatrics.setHorizontalAlignment(SwingConstants.CENTER);
		lblPediatrics.setBackground(new Color(46, 139, 87));
		lblPediatrics.setOpaque(true);
		lblPediatrics.setBounds(714, 540, 200, 25);
		getContentPane().add(lblPediatrics);
		
		JLabel lblUrology = new JLabel("UROLOGY");
		lblUrology.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblUrology.setForeground(new Color(255, 255, 255));
		lblUrology.setHorizontalAlignment(SwingConstants.CENTER);
		lblUrology.setBackground(new Color(60, 179, 113));
		lblUrology.setOpaque(true);
		lblUrology.setBounds(714, 562, 200, 25);
		getContentPane().add(lblUrology);
		
		JLabel lblSurgery = new JLabel("SURGERY");
		lblSurgery.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblSurgery.setForeground(new Color(255, 255, 255));
		lblSurgery.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurgery.setBackground(new Color(46, 139, 87));
		lblSurgery.setOpaque(true);
		lblSurgery.setBounds(714, 584, 200, 25);
		getContentPane().add(lblSurgery);
		
	

		JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
		background.setForeground(new Color(255, 255, 255));
		background.setBackground(new Color(60, 179, 113));
		background.setBounds(-202, -866, 1555, 2232);
		background.setFont(new Font("Century Gothic", Font.BOLD, 13));
		getContentPane().add(background);
			
		
			
	
			
		
	}
}
