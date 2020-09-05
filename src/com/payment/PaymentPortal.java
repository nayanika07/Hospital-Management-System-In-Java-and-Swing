package com.payment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.helpdesk.HelpRequest;
import com.helpdesk.Helpdesk;
import com.pharmacy.NewDrug;
import com.pharmacy.Pharmacy;
import com.registration.Registration;
import com.staff_management.DoctorList;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class PaymentPortal extends JFrame {

	private JPanel contentPane;
	private JTextField pid;
	private JTextField amt;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentPortal frame = new PaymentPortal();
					frame.setTitle("Payment Page");
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
	public PaymentPortal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PaymentPortal.class.getResource("/Images/border logo.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 820, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Payment Portal");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblNewLabel.setBounds(0, 0, 804, 37);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 240));
		panel.setBounds(0, 39, 814, 579);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Patient ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(22, 11, 88, 25);
		panel.add(lblNewLabel_1);
		
		pid = new JTextField();
		pid.setBounds(97, 12, 145, 25);
		panel.add(pid);
		pid.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Payment Method:");
		lblNewLabel_3.setForeground(new Color(0, 128, 128));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(22, 392, 147, 25);
		panel.add(lblNewLabel_3);
		
		JRadioButton a1 = new JRadioButton("Credit Card");
		a1.setBackground(new Color(230, 230, 250));
		a1.setFont(new Font("Consolas", Font.BOLD, 16));
		a1.setBounds(22, 424, 217, 25);
		panel.add(a1);
		
		JRadioButton a2 = new JRadioButton("Debit Card");
		a2.setBackground(new Color(230, 230, 250));
		a2.setFont(new Font("Consolas", Font.BOLD, 16));
		a2.setBounds(22, 452, 217, 25);
		panel.add(a2);
		
		JRadioButton a3 = new JRadioButton("Cash");
		a3.setBackground(new Color(230, 230, 250));
		a3.setFont(new Font("Consolas", Font.BOLD, 16));
		a3.setBounds(22, 480, 217, 25);
		panel.add(a3);
		
		JRadioButton a4 = new JRadioButton("Online Wallet");
		a4.setBackground(new Color(230, 230, 250));
		a4.setFont(new Font("Consolas", Font.BOLD, 16));
		a4.setBounds(22, 508, 217, 25);
		panel.add(a4);
		
		JLabel lblNewLabel_4 = new JLabel("Total Amount (INR) :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(503, 11, 159, 25);
		panel.add(lblNewLabel_4);
		
		amt = new JTextField();
		amt.setColumns(10);
		amt.setBounds(642, 12, 147, 25);
		panel.add(amt);
		
		JLabel lblAmountPayableinr = new JLabel("Amount Payable (INR) :");
		lblAmountPayableinr.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAmountPayableinr.setBounds(22, 319, 192, 25);
		panel.add(lblAmountPayableinr);
		String[] types= {"In-Patient","Out-Patient","Emergency"};
		JComboBox comboBox = new JComboBox(types);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(359, 11, 134, 25);
		panel.add(comboBox);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(255, 228, 225));
		label.setOpaque(true);
		label.setForeground(new Color(0, 0, 139));
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(22, 343, 159, 37);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(0, 164, 804, 144);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rb1 = new JRadioButton("YES");
		rb1.setFont(new Font("Tahoma", Font.BOLD, 12));
		rb1.setBounds(205, 11, 99, 20);
		panel_1.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("NO");
		rb2.setFont(new Font("Tahoma", Font.BOLD, 12));
		rb2.setBounds(326, 11, 99, 20);
		panel_1.add(rb2);
		
		JButton confirmbtn = new JButton("CONFIRM");
		confirmbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		confirmbtn.setBounds(602, 531, 172, 37);
		panel.add(confirmbtn);
		confirmbtn.addActionListener((e) -> {
           String policyno=null;
			try {
				String patient_id,patient_type,amount,sum,code,name;
				patient_id = pid.getText().toString();
				patient_type = (String)comboBox.getSelectedItem();
				amount = amt.getText().toString();
				double intamount = Double.parseDouble(amount);
				
				if(rb1.isSelected()==true) 
			{
				policyno = t1.getText().toString();
			    code = t2.getText().toString();
				name = t3.getText().toString();
				sum = t4.getText().toString();
			   
			    
			    double intsum = Double.parseDouble(sum);
			    
			    if(intsum<=intamount)
				{
			    double discount=(85*intsum)/100;
				double finalbill=intamount-discount;
				String finalamt = Double.toString(finalbill);
				label.setText("Rs. "+finalamt);
				}
			    
			    else 
			    {
			        double discount=(95*intamount)/100;
					double finalbill=intamount-discount;
					String finalamt = Double.toString(finalbill);
					label.setText("Rs. "+finalamt);
			    }
			    
			}
				else
					label.setText("Rs. "+amount);
				
				
				
				
		        
				

				if (patient_id.equals("") || amount.equals(""))
					JOptionPane.showMessageDialog(this, "Please fill in the mandatory fields", "Error Alert",
							JOptionPane.ERROR_MESSAGE);

				else {
					String line;

					FileWriter writer = new FileWriter("C:\\Users\\Nayanika\\Desktop\\PaymentDetails.txt",
							true);
					
						line = patient_id+"|"+ patient_type + "|" + "Rs."+ amount+ "|" + "Policy:"+policyno + "\n";
						writer.write(line);
						writer.write("\n");
				
					writer.close();
					System.out.println("file write successful");
					JOptionPane.showMessageDialog(this, "Payment Details Saved Successfully");
				}
			} // try ends

			catch (IOException ioe) {
				System.out.println("File Write Unsuccessful!");
			} // catch ends

		});
		
	
		
		JLabel lblNewLabel_2 = new JLabel("Insurance Health Card:");
		lblNewLabel_2.setForeground(new Color(0, 128, 128));
		lblNewLabel_2.setBounds(10, 11, 220, 25);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_5 = new JLabel("Policy No. :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 47, 129, 25);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblCustomerCode = new JLabel("Customer Code:");
		lblCustomerCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCustomerCode.setBounds(10, 83, 129, 25);
		panel_1.add(lblCustomerCode);
		
		JLabel lblCustomerName = new JLabel("Customer Name:");
		lblCustomerName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCustomerName.setBounds(367, 80, 129, 25);
		panel_1.add(lblCustomerName);
		
		JLabel lblSumInsuredinr = new JLabel("Sum Insured (INR):");
		lblSumInsuredinr.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSumInsuredinr.setBounds(10, 114, 129, 25);
		panel_1.add(lblSumInsuredinr);
		
		t1 = new JTextField();
		t1.setBounds(128, 50, 296, 20);
		panel_1.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(128, 83, 220, 20);
		panel_1.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(482, 80, 220, 20);
		panel_1.add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(138, 114, 144, 20);
		panel_1.add(t4);
		
		JButton pbtn = new JButton("Check Policies");
		pbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		pbtn.setBounds(645, 11, 123, 20);
		panel_1.add(pbtn);
		pbtn.addActionListener((e)->{
			JOptionPane.showMessageDialog(this, "Get 85% of Insurance Paid Back. For Insured Sum greater than bill, get 95% back.");
	
		});
	
		
		JLabel lblPatientType = new JLabel("Patient Type:");
		lblPatientType.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPatientType.setBounds(261, 11, 88, 25);
		panel.add(lblPatientType);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(PaymentPortal.class.getResource("/Images/paymentlogo.png")));
		lblNewLabel_6.setBounds(317, 307, 486, 79);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(PaymentPortal.class.getResource("/Images/StarLogo (1).png")));
		lblNewLabel_7.setBounds(0, 47, 207, 117);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setIcon(new ImageIcon(PaymentPortal.class.getResource("/Images/reliance-health.png")));
		lblNewLabel_8.setBounds(211, 48, 314, 116);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_9.setIcon(new ImageIcon(PaymentPortal.class.getResource("/Images/hdfclife.jpg")));
		lblNewLabel_9.setBounds(513, 47, 298, 117);
		panel.add(lblNewLabel_9);
		
	
		
		JButton prevbtn = new JButton("<<PREV");
		prevbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		prevbtn.setBounds(10, 629, 136, 37);
		contentPane.add(prevbtn);
		
		JButton nextbtn = new JButton("NEXT>>");
		nextbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		nextbtn.setBounds(658, 627, 136, 37);
		contentPane.add(nextbtn);
		nextbtn.addActionListener((e)->{
		if(a1.isSelected()==true || a2.isSelected()==true)
		{
			
				this.setVisible(false);
				new CardPayment().setVisible(true);
			
				
		
		}
		else if(a3.isSelected()==true)
		{
			
				this.setVisible(false);
				new CashPayment().setVisible(true);
		
		}
		else
		{
			
				this.setVisible(false);
				new WalletPayment().setVisible(true);
		
		}
	});
			
		
		
		prevbtn.addActionListener((e)->{
			this.setVisible(false);
			new Helpdesk().setVisible(true);
		});
		JLabel background = new JLabel(new ImageIcon(Registration.class.getResource("/Images/hospital_back.jpg")));
		background.setBounds(-202, -866, 1555, 2232);
		background.setFont(new Font("Tahoma", Font.ITALIC, 14));
		getContentPane().add(background);
		
	
	}
}
