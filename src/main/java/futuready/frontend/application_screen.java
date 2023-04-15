package futuready.frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import futuready.base.*;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class application_screen {
baseSetup setup = new baseSetup();
	private JFrame frmFutureadyAutomatedTesting;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					application_screen window = new application_screen();
					window.frmFutureadyAutomatedTesting.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public application_screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFutureadyAutomatedTesting = new JFrame();
		frmFutureadyAutomatedTesting.setTitle(setup.project_name + " AUTOMATED TESTING PROGRAM");
		frmFutureadyAutomatedTesting.getContentPane().setBackground(new Color(255, 128, 64));
		frmFutureadyAutomatedTesting.setBackground(new Color(255, 128, 64));
		frmFutureadyAutomatedTesting.setBounds(100, 100, 996, 669);
		frmFutureadyAutomatedTesting.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFutureadyAutomatedTesting.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(setup.project_name + " Testing Program");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(305, 11, 391, 45);
		frmFutureadyAutomatedTesting.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select Server Test");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(36, 79, 115, 27);
		frmFutureadyAutomatedTesting.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Select Test Scenario");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(36, 159, 140, 27);
		frmFutureadyAutomatedTesting.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Select Browser Test");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(36, 250, 133, 27);
		frmFutureadyAutomatedTesting.getContentPane().add(lblNewLabel_1_1_1);
		
		JComboBox comboBoxServer = new JComboBox();
		comboBoxServer.setBackground(new Color(254, 230, 171));
		comboBoxServer.setBounds(36, 110, 350, 38);
		frmFutureadyAutomatedTesting.getContentPane().add(comboBoxServer);
		comboBoxServer.addItem("Develop");
		comboBoxServer.addItem("Staging");
		comboBoxServer.addItem("Product");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(254, 230, 171));
		comboBox_1.setBounds(36, 188, 350, 38);
		frmFutureadyAutomatedTesting.getContentPane().add(comboBox_1);
		comboBox_1.addItem("TC_FU_001_Login_To_Friends_System");
		comboBox_1.addItem("TC_FU_002_Sign_Up_New_Account_In_Friends_Page");
		comboBox_1.addItem("TC_FU_003_My_Profile");
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(new Color(254, 230, 171));
		comboBox_2.setBounds(36, 281, 350, 38);
		frmFutureadyAutomatedTesting.getContentPane().add(comboBox_2);
		comboBox_2.addItem("Chrome");
		comboBox_2.addItem("Edge");
		comboBox_2.addItem("Firefox");
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(172, 98, 23), 2, true));
		panel.setBackground(new Color(254, 230, 171));
		panel.setBounds(36, 354, 350, 265);
		frmFutureadyAutomatedTesting.getContentPane().add(panel);
		frmFutureadyAutomatedTesting.getContentPane().setLayout(null);
		panel.setLayout(null);
		JLabel lblNewLabel_2 = new JLabel("Tester Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 21, 92, 19);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblNewLabel_2_1 = new JLabel("Account Test");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setBounds(127, 66, 92, 19);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Username");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setBounds(10, 98, 74, 19);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Password");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1.setBounds(10, 149, 74, 19);
		panel.add(lblNewLabel_2_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(92, 19, 223, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 96, 223, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(92, 147, 223, 20);
		panel.add(textField_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Default User\r\n");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBackground(new Color(172, 98, 23));
		rdbtnNewRadioButton.setBounds(93, 175, 92, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnDefaultPassword = new JRadioButton("Default Password");
		rdbtnDefaultPassword.setForeground(new Color(255, 255, 255));
		rdbtnDefaultPassword.setSelected(true);
		rdbtnDefaultPassword.setBackground(new Color(172, 98, 23));
		rdbtnDefaultPassword.setBounds(207, 175, 109, 23);
		panel.add(rdbtnDefaultPassword);
		frmFutureadyAutomatedTesting.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(172, 98, 23), 1, true));
		panel_1.setBackground(new Color(254, 223, 160));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(495, 110, 447, 209);
		frmFutureadyAutomatedTesting.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Tester");
		lblNewLabel_3.setForeground(new Color(172, 98, 23));
		lblNewLabel_3.setBounds(10, 26, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Server");
		lblNewLabel_3_1.setForeground(new Color(172, 98, 23));
		lblNewLabel_3_1.setBounds(10, 61, 46, 14);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Scenario");
		lblNewLabel_3_1_1.setForeground(new Color(172, 98, 23));
		lblNewLabel_3_1_1.setBounds(10, 94, 46, 14);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Browser");
		lblNewLabel_3_1_1_1.setForeground(new Color(172, 98, 23));
		lblNewLabel_3_1_1_1.setBounds(10, 128, 46, 14);
		panel_1.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Account");
		lblNewLabel_3_1_1_1_1.setForeground(new Color(172, 98, 23));
		lblNewLabel_3_1_1_1_1.setBounds(10, 166, 46, 14);
		panel_1.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("selectedTester");
		lblNewLabel_4.setBounds(70, 26, 342, 14);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setText(setup.tester_name);
		
		JLabel lblNewLabel_4_1 = new JLabel("selectedServer");
		lblNewLabel_4_1.setBounds(70, 61, 342, 14);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("selectedScenario");
		lblNewLabel_4_1_1.setBounds(70, 94, 342, 14);
		panel_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("selectedBrowser");
		lblNewLabel_4_1_1_1.setBounds(70, 128, 342, 14);
		panel_1.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("selectedAccount");
		lblNewLabel_4_1_1_1_1.setBounds(70, 166, 342, 14);
		panel_1.add(lblNewLabel_4_1_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(172, 98, 23), 2, true));
		panel_2.setBackground(new Color(244, 210, 176));
		panel_2.setBounds(495, 525, 447, 94);
		frmFutureadyAutomatedTesting.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(172, 98, 23));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(309, 25, 111, 45);
		panel_2.add(btnNewButton);
		
		JButton btnStop = new JButton("STOP");
		btnStop.setForeground(Color.WHITE);
		btnStop.setBackground(new Color(172, 98, 23));
		btnStop.setBounds(171, 25, 111, 45);
		panel_2.add(btnStop);
		
		JButton btnNewButton_1_1 = new JButton("EXIT");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(new Color(172, 98, 23));
		btnNewButton_1_1.setBounds(32, 25, 111, 45);
		panel_2.add(btnNewButton_1_1);
	}
}
