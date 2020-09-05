package com.helpdesk;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.payment.PaymentPortal;
import com.registration.Registration;
import com.staff_management.NewStaff;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.MatteBorder;

public class HelpRequest extends JFrame {

	private JPanel contentPane;
	private JTextField a3;
	private JTextField a2;
	private JTextField a1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelpRequest frame = new HelpRequest();
					frame.setTitle("Request Page");
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
	public HelpRequest() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(HelpRequest.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 605, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Help Request ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 23));
		lblNewLabel.setBounds(10, 22, 569, 42);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(250, 240, 230));
		panel.setBounds(20, 75, 548, 303);
		contentPane.add(panel);
		panel.setLayout(null);
		String types[]= {"Medical Query","Information On Doctors","Hospital-related issue","Job Query","IT Request","Other"};
		JComboBox comboBox = new JComboBox(types);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(128, 14, 300, 20);
		panel.add(comboBox);
		
		String urgen[]= {"Low","Medium","High","Critical"};
		JComboBox comboBox_1 = new JComboBox(urgen);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setBounds(126, 200, 161, 22);
		panel.add(comboBox_1);
		
		a3 = new JTextField();
		a3.setBounds(128, 164, 159, 25);
		panel.add(a3);
		a3.setColumns(10);
		
		a2 = new JTextField();
		a2.setBounds(128, 128, 244, 25);
		panel.add(a2);
		a2.setColumns(10);
		
		a1 = new JTextField();
		a1.setBounds(128, 79, 369, 38);
		panel.add(a1);
		a1.setColumns(10);
		
		JButton savebtn = new JButton("SUBMIT");
		savebtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		savebtn.setBounds(444, 248, 94, 32);
		panel.add(savebtn);
		savebtn.addActionListener((e) -> {

			try {
				String querytype,query,name,contact,urgency;
				querytype = (String)comboBox.getSelectedItem();
				urgency = (String)comboBox_1.getSelectedItem();
				query = a1.getText().toString();
			    name= a2.getText().toString();
				contact = a3.getText().toString();
	
		
				

				if (name.equals("") || query.equals(""))
					JOptionPane.showMessageDialog(this, "Please fill in the mandatory fields", "Error Alert",
							JOptionPane.ERROR_MESSAGE);

				else {
					String line;

					FileWriter writer = new FileWriter("C:\\Users\\Nayanika\\Desktop\\HelpRequest.txt",
							true);
					
						line = querytype+"|"+query + "|" + name + "|" + contact+ "|" +urgency
								+ "\n";
						writer.write(line);
						writer.write("\n");
				
					writer.close();
					System.out.println("file write successful");
					JOptionPane.showMessageDialog(this, "Request Submitted Successfully");
				}
			} // try ends

			catch (IOException ioe) {
				System.out.println("File Write Unsuccessful!");
			} // catch ends

		});// action ends
		
		
		JLabel lblNewLabel_1 = new JLabel("Request Type");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(26, 11, 110, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblQuery = new JLabel("Query");
		lblQuery.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblQuery.setBounds(36, 85, 67, 25);
		panel.add(lblQuery);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setBounds(36, 127, 51, 25);
		panel.add(lblName);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContact.setBounds(34, 163, 84, 25);
		panel.add(lblContact);
		
		JLabel lblUrgency = new JLabel("Urgency");
		lblUrgency.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUrgency.setBounds(32, 199, 84, 25);
		panel.add(lblUrgency);
		

		
		JButton prevbtn = new JButton("<<PREV");
		prevbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		prevbtn.setBounds(10, 389, 107, 32);
		contentPane.add(prevbtn);
		prevbtn.addActionListener((e)->{
			this.setVisible(false);
			new Helpdesk().setVisible(true);
		});
		
		JButton nextbtn = new JButton("NEXT>>");
		nextbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		nextbtn.setBounds(472, 389, 107, 32);
		contentPane.add(nextbtn);
		nextbtn.addActionListener((e)->{
			this.setVisible(false);
			new PaymentPortal().setVisible(true);
		});
		
	      JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
			background.setBounds(-202, -866, 1555, 2232);
			background.setFont(new Font("Tahoma", Font.ITALIC, 14));
			getContentPane().add(background);
	}

}
