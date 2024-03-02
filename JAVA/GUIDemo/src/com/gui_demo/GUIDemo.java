package com.gui_demo;

import javax.swing.*;

public class GUIDemo {
	private JFrame frame;
	private JButton button;
	
	public GUIDemo() {
		frame = new JFrame("GUI Demo - One");
		button = new JButton("Click me");
		
		frame.setSize(400, 400);
		frame.setLayout(null);
		
		button.setBounds(130, 100, 100, 40);
		
		frame.add(button);
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
