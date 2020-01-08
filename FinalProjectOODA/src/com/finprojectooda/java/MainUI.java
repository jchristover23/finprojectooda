package com.finprojectooda.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class MainUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCashierSystem = new JLabel("Cashier System");
		lblCashierSystem.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblCashierSystem.setBounds(10, 10, 270, 41);
		frame.getContentPane().add(lblCashierSystem);
		
		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMainMenu.setBounds(10, 71, 96, 25);
		frame.getContentPane().add(lblMainMenu);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Create Membership");
		rdbtnNewRadioButton.setBounds(10, 102, 126, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Add Item");
		rdbtnNewRadioButton_1.setBounds(10, 125, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnEditItem = new JRadioButton("Edit Item");
		rdbtnEditItem.setBounds(10, 148, 103, 21);
		frame.getContentPane().add(rdbtnEditItem);
		
		JRadioButton rdbtnSales = new JRadioButton("Sales");
		rdbtnSales.setBounds(10, 171, 103, 21);
		frame.getContentPane().add(rdbtnSales);
		
		JRadioButton rdbtnExit = new JRadioButton("Exit");
		rdbtnExit.setBounds(10, 194, 103, 21);
		frame.getContentPane().add(rdbtnExit);
		
		JButton btnChoose = new JButton("Choose");
		btnChoose.setBounds(10, 232, 85, 21);
		frame.getContentPane().add(btnChoose);
	}
}
