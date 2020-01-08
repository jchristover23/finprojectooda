package com.finprojectooda.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainUI {
	
	Customer customer = new Customer();
    Item item = new Item();
    Modifier modifier = new Modifier();
    Payment payment = new Payment();

	private JFrame mainUIWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
					window.mainUIWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainUIWindow = new JFrame();
		mainUIWindow.setBounds(100, 100, 450, 300);
		mainUIWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainUIWindow.getContentPane().setLayout(null);
		
		JLabel lblCashierSystem = new JLabel("Cashier System");
		lblCashierSystem.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblCashierSystem.setBounds(10, 10, 270, 41);
		mainUIWindow.getContentPane().add(lblCashierSystem);
		
		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMainMenu.setBounds(10, 71, 96, 25);
		mainUIWindow.getContentPane().add(lblMainMenu);
		
		JButton createMemberBtn = new JButton("Create Membership");
		createMemberBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 mainUIWindow.dispose();
				 createMember c2 = new createMember();
				 c2.newCreateMember(null);
			}
		});
		createMemberBtn.setBounds(10, 106, 85, 21);
		mainUIWindow.getContentPane().add(createMemberBtn);
		
		JButton btnNewButton_1 = new JButton("Add Item");
		btnNewButton_1.setBounds(10, 134, 85, 21);
		mainUIWindow.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Edit Item");
		btnNewButton_2.setBounds(10, 165, 85, 21);
		mainUIWindow.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Sales");
		btnNewButton_3.setBounds(10, 196, 85, 21);
		mainUIWindow.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("EXIT");
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setForeground(Color.RED);
		btnNewButton_4.setBounds(10, 227, 85, 21);
		mainUIWindow.getContentPane().add(btnNewButton_4);
	}
}
