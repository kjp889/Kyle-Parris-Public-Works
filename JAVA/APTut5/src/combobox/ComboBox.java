package combobox;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox {
	private JFrame frame;
	private JComboBox comboBox;

	public ComboBox() {
		frame = new JFrame("ComboBox Example");
		String countries[] = {"India", "Jamaica", "U.S.A", "England", "France"};
		comboBox = new JComboBox(countries);
		comboBox.setSelectedIndex(1);
		
		comboBox.setBounds(100, 50, 150, 20);
		
		frame.add(comboBox);
		frame.setLayout(null);
		frame.setSize(400, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
