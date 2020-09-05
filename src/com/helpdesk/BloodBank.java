package com.helpdesk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import com.pharmacy.Pharmacy;
import com.registration.Registration;
import com.staff_management.NewStaff;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BloodBank extends JFrame {
	
    JTable jt;
    String[] column_headers = {"BLOOD TYPE","QUANTITY","EXP.DATE"};
    String[][] data = {{"A+", "65 L", "12/12/2019"},
    		{"A-", "50 L", "14/09/2020"},
    		{"B+", "95 L", "12/12/2019"},
    		{"B-", "60 L", "18/11/2020"},
    		{"AB+", "77 L", "02/05/2021"},
    		{"AB-", "45 L", "04/11/2019"},
    		{"O+", "80 L", "15/10/2019"},
    		{"O-", "10 L", "20/12/2021"},
                       
          
    
    
    };
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel label;
	private JButton prevbtn;
	private JButton nextbtn;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BloodBank frame = new BloodBank();
					frame.setTitle("Sterling Blood Bank");
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
	public BloodBank() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(BloodBank.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 686, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		 jt = new JTable(data,column_headers);
	        jt.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        jt.setBackground(new Color(255, 228, 225));
	        jt.getTableHeader().setFont(new Font("Tahoma",Font.BOLD,16));
	        jt.getTableHeader().setBackground(new Color(173,216,230));
	        contentPane.setLayout(null);
	        jt.setBounds(50,50,200,230);
	        JScrollPane js = new JScrollPane(jt);
	        js.setBounds(10, 83, 650, 153);
	        js.setViewportBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
	        getContentPane().add(js);
	        
	        lblNewLabel = new JLabel("Sterling Hospital: Blood Bank");
	        lblNewLabel.setForeground(new Color(255, 255, 255));
	        lblNewLabel.setBackground(new Color(0, 128, 128));
	        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel.setOpaque(true);
	        lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 27));
	        lblNewLabel.setBounds(83, 22, 577, 50);
	        contentPane.add(lblNewLabel);
	        
	        label = new JLabel("");
	        label.setHorizontalAlignment(SwingConstants.CENTER);
	        label.setForeground(new Color(220, 20, 60));
	        label.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 18));
	        label.setBackground(new Color(245, 222, 179));
	        label.setOpaque(true);
	        label.setBounds(10, 247, 650, 38);
	        contentPane.add(label);
	        
	        prevbtn = new JButton("<<PREV");
	        prevbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
	        prevbtn.setBounds(10, 424, 103, 37);
	        contentPane.add(prevbtn);
	        
	        nextbtn = new JButton("NEXT>>");
	        nextbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
	        nextbtn.setBounds(557, 424, 103, 37);
	        contentPane.add(nextbtn);
	        
	    	prevbtn.addActionListener((e)->{
				this.setVisible(false);
				new Pharmacy().setVisible(true);
			});
	    	
	     	nextbtn.addActionListener((e)->{
				this.setVisible(false);
				new Helpdesk().setVisible(true);
			});
	     	
	        String ans=null;
	         int c=0;
	    	   for(int row = 0; row<jt.getRowCount();row++)
	    			for(int col = 0; col<jt.getColumnCount();col++)
	    			{
	    				String next = (String)jt.getValueAt(row, 1);
	    				if(next=="10 L")
	    				{
	    				 ans=(String)jt.getValueAt(row, 0);
	    					c++;
	    					
	    				}
	       }
	    	   
	    		 if(c>0)  
	    			 label.setText("Low in Reserve, Blood Type:   "+ans);
	    		 
	    		 
	    			lblNewLabel_2 = new JLabel("");
	    			lblNewLabel_2.setIcon(new ImageIcon(BloodBank.class.getResource("/Images/plussign.png")));
		   			lblNewLabel_2.setBounds(10, 22, 69, 59);
		   			contentPane.add(lblNewLabel_2);
	    			
		   			JLabel lblNewLabel_1 = new JLabel("");
		   			lblNewLabel_1.setIcon(new ImageIcon(BloodBank.class.getResource("/Images/blood1.jpg")));
		   			lblNewLabel_1.setBounds(176, 296, 314, 176);
		   			contentPane.add(lblNewLabel_1);
	    		 
	    		   JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
	   			background.setBounds(-202, -866, 1555, 2232);
	   			background.setFont(new Font("Century Gothic", Font.BOLD, 25));
	   			getContentPane().add(background);
	   			
	   		
	   	
	}
}
