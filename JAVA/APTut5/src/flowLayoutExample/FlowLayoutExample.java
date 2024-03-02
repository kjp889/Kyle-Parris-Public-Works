package flowLayoutExample;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FlowLayoutExample {
	private JFrame frame;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JTextField usernameTextField;
	private JPasswordField passwordField;
	private JButton button;
	private JPanel namePanel;
	private JPanel passwordPanel;
	private JPanel buttonPanel;
	
	public FlowLayoutExample() {
		frame = new JFrame("FlowLayout Example");
		usernameLabel = new JLabel("Username: ");
		passwordLabel = new JLabel();
		usernameTextField = new JTextField(20);
		passwordField = new JPasswordField(20);
		button = new JButton("Sign In");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(frame, "Sign in button"
						+ "click...", "Flowlayout Example", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button.setSize(new Dimension(400, 30));
		namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		passwordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		layoutComponents();
	}

	private void layoutComponents() {
		// TODO Auto-generated method stub
		frame.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		namePanel.setSize(new Dimension(450, 30));
		namePanel.add(usernameLabel);
		namePanel.add(usernameTextField);
		frame.add(namePanel);
		
		passwordPanel.setSize(new Dimension(450,30));
		passwordLabel.setText("Password: ");
		passwordPanel.add(passwordLabel);
		passwordPanel.add(passwordField);
		frame.add(passwordPanel);
		
		buttonPanel.setSize(new Dimension(450,30));
		buttonPanel.add(button);
		frame.add(buttonPanel);
		
		frame.setSize(new Dimension(420,150));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutExample();
	}

}
