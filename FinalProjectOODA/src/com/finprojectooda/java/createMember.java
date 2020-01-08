package com.finprojectooda.java;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class createMember {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void newCreateMember(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createMember window = new createMember();
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
	public createMember() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
