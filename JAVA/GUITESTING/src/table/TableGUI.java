package table;

/*import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TableGUI extends JFrame {
    public TableGUI() {
        super("Table GUI"); // set window title
        
        // create data for table
        Object[][] data = {
                {"John", "Doe", 30},
                {"Jane", "Doe", 25},
                {"Bob", "Smith", 42},
                {"Alice", "Jones", 37},
                {"Tom", "Brown", 19}
        };
        String[] columnNames = {"First Name", "Last Name", "Age"};
       
        // create table model
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        
        // create table and add to scroll pane
        JTable table = new JTable(model);
        table.getColumnModel().getColumn(0).setPreferredWidth(500); // set preferred width of first column
        JScrollPane scrollPane = new JScrollPane(table);
        
        // add scroll pane to frame
        setContentPane(scrollPane);
        
        // set window properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new TableGUI();
    }
}

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class TableGUI extends JFrame {
    public TableGUI() {
        super("Table GUI"); // set window title
        
        // create data for table as an ArrayList of Object arrays
        ArrayList<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"John", "Doe", 30});
        data.add(new Object[]{"Jane", "Doe", 25});
        data.add(new Object[]{"Bob", "Smith", 42});
        data.add(new Object[]{"Alice", "Jones", 37});
        data.add(new Object[]{"Tom", "Brown", 19});
        
        String[] columnNames = {"First Name", "Last Name", "Age"};
        
        // create table model
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
        // add rows to table model
        for (Object[] row : data) {
            model.addRow(row);
        }
        
        // create table and add to scroll pane
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        table.getColumnModel().getColumn(0).setPreferredWidth(500); // set preferred width of first column
        
        
        // add scroll pane to frame
        setContentPane(scrollPane);
        
        // set window properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new TableGUI();
    }
}*/

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class TableGUI extends JFrame {
    public TableGUI() {
        super("Table GUI"); // set window title
        
        // create data for table as an ArrayList of Object arrays
        ArrayList<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"John", "Doe", 30});
        data.add(new Object[]{"Jane", "Doe", 25});
        data.add(new Object[]{"Bob", "Smith", 42});
        data.add(new Object[]{"Alice", "Jones", 37});
        data.add(new Object[]{"Tom", "Brown", 19});
        
        String[] columnNames = {"First Name", "Last Name", "Age"};
        
        // create table model with only the first name and last name columns
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"First Name", "Last Name"});
        
        // add rows to table model
        for (Object[] row : data) {
            model.addRow(new Object[]{row[0], row[2]});
        }
        
        // create table and add to scroll pane
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        table.getColumnModel().getColumn(0).setPreferredWidth(500); // set preferred width of first column
        
        
        // add scroll pane to frame
        setContentPane(scrollPane);
        
        // set window properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new TableGUI();
    }
}


