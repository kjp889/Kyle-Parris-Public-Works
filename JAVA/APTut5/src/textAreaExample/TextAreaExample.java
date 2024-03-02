package textAreaExample;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaExample {
	private JTextArea textArea;
	
	public TextAreaExample() {
		JFrame frame = new JFrame("Text Area Example");
		
		textArea = new JTextArea("This is a Swing Component JTextArea"); 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLayout(new BorderLayout());
		
		textArea.setSize(100, 50);
		
		frame.add(textArea, BorderLayout.CENTER);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextAreaExample();
	}

}
