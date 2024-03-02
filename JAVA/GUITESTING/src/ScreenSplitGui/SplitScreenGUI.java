package ScreenSplitGui;

import java.awt.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SplitScreenGUI extends JFrame {
    public SplitScreenGUI() {
        super("Split Screen"); // set window title
        
        Object[][] data = {
                {"John", "jjjjjj", 30},
                {"Jane", "Doe", 25},
                {"Bob", "Smith", 42},
                {"Alice", "Jones", 37},
                {"Tom", "Brown", 19}
            };
         String[] columnNames = {"First Name", "Last Name", "Age"};
            
            
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        
        // create components
        JTextArea leftTextArea = new JTextArea();
        JPanel rightTextArea = new JPanel();
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftTextArea, rightTextArea);
        splitPane.setResizeWeight(0.5);
        
        // add split pane to frame
        setContentPane(splitPane);
        rightTextArea.add(table);
        
        // set window properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true); 
        
        
    }
    
    public static void main(String[] args) {
        new SplitScreenGUI();
    }
}
