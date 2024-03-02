package checkBoxExample;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxExample {
	
	public CheckBoxExample() {
		JFrame frame = new JFrame("CheckBox Example");
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400, 100);
		
		JCheckBox cppCheckbox = new JCheckBox("C++");
		cppCheckbox.setBounds(150, 100, 50, 50);
		JCheckBox javaCheckbox = new JCheckBox("Java");
		javaCheckbox.setBounds(150, 150, 50, 50);
		
		frame.add(cppCheckbox);
		frame.add(javaCheckbox);
		frame.add(label);
		
		cppCheckbox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				label.setText("C++ Checkbox: " 
			    + (e.getStateChange()==1?"checked":"unchecked"));
			}
		});
		
		javaCheckbox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				label.setText("Java Checkbox: " 
				+ (e.getStateChange()==1?"checked":"unchecked"));
			}
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main (String args[]) {
		new CheckBoxExample();
	}

}
