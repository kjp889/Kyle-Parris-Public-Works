package menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MenuBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Menu 1");
        JButton login = new JButton("button");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Login.login(usernameTextField.getText(), passwordField.getText());
			}
		});
        menu1.add(login);
        //menu1.add(menuItem2);

        JMenu menu2 = new JMenu("Menu 2");
        JMenuItem menuItem3 = new JMenuItem("Menu Item 3");
        JMenuItem menuItem4 = new JMenuItem("Menu Item 4");
        menu2.add(menuItem3);
        menu2.add(menuItem4);
        menuItem3.add(login);

        JMenu menu3 = new JMenu("Menu 3");
        JMenuItem menuItem5 = new JMenuItem("Menu Item 5");
        JMenuItem menuItem6 = new JMenuItem("Menu Item 6");
        menu3.add(menuItem5);
        menu3.add(menuItem6);

        JMenu menu4 = new JMenu("Menu 4");
        JMenuItem menuItem7 = new JMenuItem("Menu Item 7");
        JMenuItem menuItem8 = new JMenuItem("Menu Item 8");
        menu4.add(menuItem7);
        menu4.add(menuItem8);

        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);

        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
