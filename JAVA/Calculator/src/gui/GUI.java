package gui;

//import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JPanel screen;
	private JPanel pad;
	private JTextField outputScreen;
	private JTextField inputScreen;
	private JButton b0;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton dotButton;
	private JButton plusButton;
	private JButton minusButton;
	private JButton timesButton;
	private JButton divideButton;
	private JButton modButton;
	private JButton equalButton;
	
	public GUI() {
		screen = new JPanel();
		pad = new JPanel();
		outputScreen = new JTextField();
		inputScreen = new JTextField();
		
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		dotButton = new JButton(".");
		plusButton = new JButton("+");
		minusButton = new JButton("-");
		timesButton = new JButton("x");
		divideButton = new JButton("\367");
		modButton = new JButton("MOD");
		equalButton = new JButton("=");
		
		setSize(350,650);
		setVisible(true);
		setResizable(true);
		setTitle("---------------CALCULATOR--------------");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));
		
		Panel();
		
	}
	
	private void Panel() {
		Button();
		Screen();
		
		screen.add(outputScreen);
		screen.add(inputScreen);
		screen.setLayout(new GridLayout(2, 1));
		//screen.setBounds(0, 0, WIDTH, 100);
		
		pad.add(b0);
		pad.add(b1);
		pad.add(b2);
		pad.add(b3);
		pad.add(b4);
		pad.add(b5);
		pad.add(b6);
		pad.add(b7);
		pad.add(b8);
		pad.add(b9);
		pad.add(dotButton);
		pad.add(plusButton);
		pad.add(minusButton);
		pad.add(timesButton);
		pad.add(divideButton);
		pad.add(modButton);
		pad.add(equalButton);
		pad.setLayout(null);
		//pad.setBounds(0, 101, WIDTH, 100);
		
		add(screen);
		add(pad);
	}
	
	private void Button() {
		b0.setBounds(0, 165, 105, 50);
		dotButton.setBounds(110, 165, 50, 50);
		
		b1.setBounds(0, 110, 50, 50);
		b2.setBounds(55, 110, 50, 50);
		b3.setBounds(110, 110, 50, 50);
		plusButton.setBounds(165, 110, 50, 105);
		equalButton.setBounds(220, 110, 50, 105);
		
		b4.setBounds(0, 55, 50, 50);
		b5.setBounds(55, 55, 50, 50);
		b6.setBounds(110, 55, 50, 50);
		minusButton.setBounds(165, 55, 50, 50);
		divideButton.setBounds(220, 55, 50, 50);
		
		b7.setBounds(0, 0, 50, 50);
		b8.setBounds(55, 0, 50, 50);
		b9.setBounds(110, 0, 50, 50);
		timesButton.setBounds(165, 0, 50, 50);
		modButton.setBounds(220, 0, 65, 50);
	}
	
	private void Screen() {
		inputScreen.setBounds(0, 51, 320, 50);
		outputScreen.setBounds(0, 0, 320, 50);
		
		//outputScreen.disable();
		
		inputScreen.setHorizontalAlignment(JTextField.RIGHT);
		outputScreen.setHorizontalAlignment(JTextField.RIGHT);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI();
	}



	
}