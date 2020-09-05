package com.pharmacy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.registration.Registration;
import com.staff_management.DoctorList;
import com.staff_management.NewStaff;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Pharmacy extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	JTable jt;
    String[] column_headers = {"NAME","DOSE","ROUTE","QUANTITY","EXPIRATION"};
    String[][] data = {{"Amoxicillin", "5 mg", "Oral", "5 mg x60", "06/2022"},
    		           {"Folic Acid","3.4 mg", "Oral", "3.4 mg x45","08/2024"},
                       {"Aspirin", "4.5 mg", "Oral","4.5 mg x50", "05/2025"},
                       {"Biperiden", "5.2 mg","Oral","5.2 mg x75", "06/2026"},
                       {"Aciclovir", "3.6 mg","Oral", "3.6 mg x70","07/2019"},
                       {"Morphine(MIR)", "3.2 mg","Oral", "3.2 mg x70","07/2020"},
                       {"Nystatin", "3.0 mg","Oral", "3.0 mg x80","09/2019"},
                       {"Omeprazole", "6.6 mg","Oral", "6.6 mg x80","09/2024"},
                       {"Salbutamol", "3.5 mg","Oral", "3.5 mg x90","07/2019"},
                       {"Paracetamol", "3.5 mg","Oral", "3.5 mg x120","08/2021"},
                       {"Quinine", "5.2 mg","Oral", "5.2 mg x80","04/2023"},
                       {"Dextrose", "7.2 mg","Injectable", "7.2 mg x60","07/2020"},
                       {"Sulfadiazine", "7.2 mg","Oral", "7.2 mg x60","07/2020"},
                       {"Insulin", "9.2 mg","Injectable", "9.2 mg x100","07/2022"},
                       {"Naloxone", "7.0 mg","Injectable", "7.0 mg x65","08/2021"},
                       {"Heparin", "8.2 mg","Injectable", "8.2 mg x65","07/2021"},
                       {"Adrenaline", "7.4 mg","Injectable", "7.4 mg x50","09/2020"},
                       {"Benzylpenicillin", "5.3 mg","Injectable", "5.3 mg x60","07/2022"},
                       {"Labetalol", "7.2 mg","Injectable", "7.2 mg x60","07/2020"},
                       {"Gentamicine", "7.2 mg","Injectable", "7.2 mg x60","07/2020"},
                 
    };
    private JPanel panel;
    private JLabel lblNewLabel;
    private JTextField input;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JButton prevbtn;
    private JButton nextbtn;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel label;
    private JLabel label_1;
    private JLabel label_2;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pharmacy frame = new Pharmacy();
					frame.setTitle("Pharmacy Information Module");
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
	public Pharmacy() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pharmacy.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 730, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		 jt = new JTable(data,column_headers);
		 jt.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        jt.setBackground(new Color(255, 250, 205));
	        jt.getTableHeader().setFont(new Font("Tahoma",Font.BOLD,14));
	        jt.getTableHeader().setBackground(new Color(173,216,230));
	        contentPane.setLayout(null);
	        jt.setBounds(50,50,200,230);
	        JScrollPane js = new JScrollPane(jt);
	        js.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 127, 80)));
	        js.setBounds(45, 190, 629, 264);
	        getContentPane().add(js);
	        
	        panel = new JPanel();
	        panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
	        panel.setBackground(new Color(176, 224, 230));
	        panel.setBounds(45, 106, 629, 84);
	        contentPane.add(panel);
	        panel.setLayout(null);
	        
	        lblNewLabel = new JLabel("Enter Medicine Name:");
	        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblNewLabel.setBounds(10, 11, 175, 21);
	        panel.add(lblNewLabel);
	        
	        input = new JTextField();
	        input.setBounds(195, 11, 260, 20);
	        panel.add(input);
	        input.setColumns(10);
	        
	        
	        JLabel lblNewLabel_1 = new JLabel("Search Result:");
	        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblNewLabel_1.setBounds(10, 35, 106, 21);
	        panel.add(lblNewLabel_1);
	        
	        JLabel label1 = new JLabel("");
	        label1.setBackground(new Color(255, 250,205));
	        label1.setOpaque(true);
	        label1.setBounds(126, 38, 97, 18);
	        panel.add(label1);
	        
	        label2 = new JLabel("");
	        label2.setHorizontalAlignment(SwingConstants.CENTER);
	        label2.setOpaque(true);
	        label2.setBackground(new Color(255, 250, 205));
	        label2.setBounds(221, 38, 97, 18);
	        panel.add(label2);
	        
	        label3 = new JLabel("");
	        label3.setHorizontalAlignment(SwingConstants.CENTER);
	        label3.setOpaque(true);
	        label3.setBackground(new Color(255, 250, 205));
	        label3.setBounds(316, 38, 97, 18);
	        panel.add(label3);
	        
	        label4 = new JLabel("");
	        label4.setHorizontalAlignment(SwingConstants.CENTER);
	        label4.setOpaque(true);
	        label4.setBackground(new Color(255, 250, 205));
	        label4.setBounds(406, 38, 97, 18);
	        panel.add(label4);
	        
	        label5 = new JLabel("");
	        label5.setHorizontalAlignment(SwingConstants.CENTER);
	        label5.setOpaque(true);
	        label5.setBackground(new Color(255, 250, 205));
	        label5.setBounds(498, 38, 97, 18);
	        panel.add(label5);
	        
	        JButton searchbtn = new JButton("SEARCH");
	        searchbtn.setBackground(SystemColor.control);
	        searchbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
	        searchbtn.setBounds(465, 9, 130, 22);
	        panel.add(searchbtn);
	        
	        prevbtn = new JButton("<<PREV");
	        prevbtn.setBackground(SystemColor.control);
	        prevbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
	        prevbtn.setBounds(10, 465, 125, 37);
	        contentPane.add(prevbtn);
	        
	        nextbtn = new JButton("NEXT>>");
	        nextbtn.setBackground(SystemColor.control);
	        nextbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
	        nextbtn.setBounds(579, 465, 125, 37);
	        contentPane.add(nextbtn);
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
	    				     label5.setText((String)rowdata[4]);
	    	                 counter++;
	    				}
	    				
	    				
	    		}//loop ends
	    		if(counter==0)
	    			JOptionPane.showMessageDialog(this, "Result Not Found!");
	    	
	           });
	        
			prevbtn.addActionListener((e)->{
				this.setVisible(false);
				new DoctorList().setVisible(true);
			});
			nextbtn.addActionListener((e)->{
				this.setVisible(false);
				new NewDrug().setVisible(true);
				
			});
			
			
			lblNewLabel_2 = new JLabel("Pharmacy Information Module");
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setBackground(new Color(0, 128, 128));
			lblNewLabel_2.setOpaque(true);
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 22));
			lblNewLabel_2.setBounds(10, 11, 694, 37);
			contentPane.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon(Pharmacy.class.getResource("/Images/medicines.jpg")));
			lblNewLabel_3.setBounds(10, 50, 167, 55);
			contentPane.add(lblNewLabel_3);

				label = new JLabel("");
				label.setHorizontalAlignment(SwingConstants.TRAILING);
				label.setIcon(new ImageIcon(Pharmacy.class.getResource("/Images/medicines.jpg")));
				label.setBounds(176, 50, 178, 55);
				contentPane.add(label);
				
				label_1 = new JLabel("");
				label_1.setHorizontalAlignment(SwingConstants.TRAILING);
				label_1.setIcon(new ImageIcon(Pharmacy.class.getResource("/Images/medicines.jpg")));
				label_1.setBounds(344, 50, 186, 55);
				contentPane.add(label_1);
				
				label_2 = new JLabel("");
				label_2.setIcon(new ImageIcon(Pharmacy.class.getResource("/Images/medicines.jpg")));
				label_2.setBounds(528, 50, 176, 55);
				contentPane.add(label_2);
				
				
			      
		

	}
}
