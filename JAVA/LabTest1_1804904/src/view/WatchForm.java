 //Kyle Parris
//1804904

package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import controller.Actions;
import model.Watch;

public class WatchForm extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JLabel soaLabel;
	private JLabel materialLabel;
	private JLabel brandLabel;
	private JLabel priceLabel;
	private JTextField soaTextField;
	private JTextField brandTextField;
	private JTextField priceTextField;
	//private JTextField materialTextField;
	private JButton button;
	private JPanel soaPanel;
	private JPanel brandPanel;
	private JPanel buttonPanel;
	private JPanel pricePanel;
	private JPanel materialPanel;
	private String materials[] = {"Gold", "Silver", "Plastic", "Bismuth", "Wood", "Diamond"};
	private JComboBox comboBox; 
	private Watch watch;
	private Actions action;
	
	public WatchForm() {
		watch = new Watch();
				
		comboBox = new JComboBox(materials);
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(100, 50, 150, 20);
		
		soaLabel = new JLabel();
		materialLabel = new JLabel();
		priceLabel = new JLabel();
		brandLabel = new JLabel();
		soaTextField = new JTextField(8);
		brandTextField = new JTextField(15);
		priceTextField = new JTextField();
		//materialTextField = new JTextField(20);
		soaPanel = new JPanel(new GridLayout(1, 2));
		brandPanel = new JPanel(new GridLayout(1, 2));
		materialPanel = new JPanel(new GridLayout(1, 2));
		pricePanel = new JPanel(new GridLayout(1, 2));
		buttonPanel = new JPanel();
		button = new JButton("Save");
		button.addActionListener(this);
		
		layoutComponents();
	}



	private void layoutComponents() {
		// TODO Auto-generated method stub
		setLayout(new GridLayout(5,1));
		
		soaPanel.setSize(100,30);
		soaLabel.setText("SOA No.:");
		soaPanel.add(soaLabel);
		soaPanel.add(soaTextField);
		add(soaPanel);
		
		brandPanel.setSize(100, 30);
		brandLabel.setText("Brand[Rolex, Swiss}");
		brandPanel.add(brandLabel);
		brandPanel.add(brandTextField);
		add(brandPanel);
		
		materialPanel.setSize(100,30);
		materialLabel.setText("Material:");
		materialPanel.add(materialLabel);
		materialPanel.add(comboBox);
		//materialPanel.add(materialTextField);
		add(materialPanel);
		
		pricePanel.setSize(100,30);
		priceLabel.setText("Price:");
		pricePanel.add(priceLabel);
		pricePanel.add(priceTextField);
		//priceTextField.setSize(500, 30);
		add(pricePanel);
		
		buttonPanel.setSize(500,30);
		buttonPanel.add(button);
		add(buttonPanel);
		
		setSize(600,700);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		watch.setBrand(brandTextField.getText());
		watch.setMaterial((String) comboBox.getSelectedItem());
		watch.setSoa(soaTextField.getText());
		watch.setPrice(Double.parseDouble(priceTextField.getText()));
		
		action.createARecord(watch);
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WatchForm();
	}


}
