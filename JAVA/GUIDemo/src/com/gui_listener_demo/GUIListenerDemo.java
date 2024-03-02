package com.gui_listener_demo;

import java.awt.event.*;
import javax.swing.*;

public class GUIListenerDemo {
	private JFrame frame;
	private JButton button;
	
	public GUIListenerDemo() {
		frame = new JFrame("GUI Demo - One");
		button = new JButton("Click me");
		
		frame.setSize(400, 400);
		frame.setLayout(null);
		
		button.setBounds(130, 100, 100, 40);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"You clicked the"
						+ "button", "Action Demo", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		frame.add(button);
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	


}
