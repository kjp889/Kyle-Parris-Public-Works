package internalFrameExample;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InternalFrameExample {
	private JFrame frame;
	private JLabel label;
	private JInternalFrame iFrame;
	private JButton button;
	private JPanel panel;
	
	public InternalFrameExample() {
		frame = new JFrame("frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iFrame = new JInternalFrame("Internal Frame", true, true, true, true);
		iFrame.setTitle("Internal Frame");
		
		button = new JButton("Click Me");
		
		label = new JLabel("This is a JInternal Frame");
		
		panel = new JPanel();
		
		panel.add(label);
		panel.add(button);
		
		iFrame.setVisible(true);
		iFrame.add(panel);
		
		frame.add(iFrame);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InternalFrameExample();
	}

}
