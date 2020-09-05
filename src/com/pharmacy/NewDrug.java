package com.pharmacy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.helpdesk.BloodBank;
import com.helpdesk.Helpdesk;
import com.registration.Registration;
import com.staff_management.DoctorList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class NewDrug extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewDrug frame = new NewDrug();
					frame.setTitle("Add New Drug");
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
	public NewDrug() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewDrug.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 542, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add New Drug");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblNewLabel.setBounds(38, 11, 448, 31);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 240));
		panel.setBounds(38, 53, 448, 247);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name Of Medicine");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 11, 116, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblDose = new JLabel("Dose");
		lblDose.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDose.setBounds(10, 45, 116, 23);
		panel.add(lblDose);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRoute.setBounds(10, 74, 116, 23);
		panel.add(lblRoute);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblQuantity.setBounds(10, 108, 116, 23);
		panel.add(lblQuantity);
		
		JLabel lblExpirationDate = new JLabel("Expiration Date");
		lblExpirationDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblExpirationDate.setBounds(10, 142, 116, 23);
		panel.add(lblExpirationDate);
		
		t1 = new JTextField();
		t1.setBounds(136, 13, 257, 20);
		panel.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(136, 47, 257, 20);
		panel.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(136, 77, 257, 20);
		panel.add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(136, 110, 257, 20);
		panel.add(t4);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(136, 144, 257, 20);
		panel.add(t5);
		
		JButton savebtn = new JButton("SAVE");
		savebtn.setBackground(SystemColor.control);
		savebtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		savebtn.setBounds(99, 196, 89, 29);
		panel.add(savebtn);
		
		savebtn.addActionListener((e) -> {

			try {
				String name,dose,route,quantity,expiry;
				name = t1.getText().toString();
			    dose = t2.getText().toString();
			    route=t3.getText().toString();
			    quantity=t4.getText().toString();
			    expiry=t5.getText().toString();
			    
	            
		
				

				if (name.equals(""))
					JOptionPane.showMessageDialog(this, "Please fill in the drug name", "Error Alert",
							JOptionPane.ERROR_MESSAGE);

				else {
					String line;

					FileWriter writer = new FileWriter("C:\\Users\\Nayanika\\Desktop\\PharmacyList.txt",
							true);
					
						line = name+"|"+dose + "|" +route+ "|"+quantity+"|"+expiry+"\n";
						writer.write(line);
						writer.write("\n");
				
					writer.close();
					System.out.println("file write successful");
					JOptionPane.showMessageDialog(this, "Drug Added Successfully");
				}
			} // try ends

			catch (IOException ioe) {
				System.out.println("File Write Unsuccessful!");
			} // catch ends

		});// action ends
		
		
		JButton clearbtn = new JButton("CLEAR");
		clearbtn.setBackground(SystemColor.control);
		clearbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		clearbtn.setBounds(249, 196, 89, 29);
		panel.add(clearbtn);
		clearbtn.addActionListener((e) ->{
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t4.setText(null);
			t5.setText(null);
		});
		
		JButton prevbtn = new JButton("<<PREV");
		prevbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		prevbtn.setBounds(10, 311, 89, 34);
		contentPane.add(prevbtn);
		
		
		JButton exitbtn = new JButton("EXIT");
		exitbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		exitbtn.setBounds(207, 311, 89, 34);
		contentPane.add(exitbtn);
		
		JButton nextbtn = new JButton("NEXT>>");
		nextbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		nextbtn.setBounds(410, 311, 89, 34);
		contentPane.add(nextbtn);
		
		exitbtn.addActionListener((e)->{
			this.setVisible(false);
			
		});
		prevbtn.addActionListener((e)->{
			this.setVisible(false);
			new Pharmacy().setVisible(true);
		});
		nextbtn.addActionListener((e)->{
			this.setVisible(false);
			new BloodBank().setVisible(true);
			
		});
		
	      JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
			background.setBounds(-202, -866, 1555, 2232);
			background.setFont(new Font("Tahoma", Font.ITALIC, 14));
			getContentPane().add(background);
	}

}
