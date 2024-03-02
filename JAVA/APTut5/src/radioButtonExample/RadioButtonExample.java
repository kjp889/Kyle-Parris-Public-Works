package radioButtonExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class RadioButtonExample extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JRadioButton rbtnMale;
	private JRadioButton rbtnFemale;
	private JButton button;
	
	
	
	public RadioButtonExample() {
		rbtnMale = new JRadioButton("Male");
		rbtnMale.setBounds(100, 50, 100, 30);
		rbtnFemale = new JRadioButton("Female");
		rbtnFemale.setBounds(100, 100, 100, 30);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbtnMale);
		bg.add(rbtnFemale);
		
		button = new JButton("click");
		button.setBounds(100, 150, 80, 30);
		button.addActionListener(this);
		
		this.add(rbtnMale);
		this.add(rbtnFemale);
		this.add(button);
		
		this.setSize(300, 300);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(rbtnMale.isSelected()) {
			JOptionPane.showMessageDialog(this, "Male Selected");
		}
		if(rbtnFemale.isSelected()) {
			JOptionPane.showMessageDialog(this, "Female Selected");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonExample();
	}

}
