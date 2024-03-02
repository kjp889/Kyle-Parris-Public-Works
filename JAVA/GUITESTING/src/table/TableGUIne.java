package table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TableGUIne extends JFrame {
    public TableGUIne() {
        super("Table GUI");

        // create data for table as an ArrayList of Object arrays
        ArrayList<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"John", "Doe", 30});
        data.add(new Object[]{"Jane", "Doe", 25});
        data.add(new Object[]{"Bob", "Smith", 42});
        data.add(new Object[]{"Alice", "Jones", 37});
        data.add(new Object[]{"Tom", "Brown", 19});

        // create column names for the table
        String[] columnNames = {"First Name", "Last Name", "Age", "Action"};

        // create table model with all columns
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // only the last column (action) is editable
                return column == 3;
            }
        };

        // add rows to table model
        for (Object[] row : data) {
            model.addRow(new Object[]{row[0], row[1], row[2], "Delete"});
        }

        // create table with custom renderer and editor for the action column
        JTable table = new JTable(model) {
            @Override
            public TableCellRenderer getCellRenderer(int row, int column) {
                if (column == 3) {
                    return new ButtonRenderer();
                }
                return super.getCellRenderer(row, column);
            }

            @Override
            public TableCellEditor getCellEditor(int row, int column) {
                if (column == 3) {
                    return new ButtonEditor();
                }
                return super.getCellEditor(row, column);
            }
        };

        // add table to scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        // add scroll pane to frame
        setContentPane(scrollPane);

        // set window properties
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // custom button renderer for the action column
    static class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    // custom button editor for the action column
    static class ButtonEditor extends DefaultCellEditor {
        protected JButton button;

        private String label;

        public ButtonEditor() {
            super(new JTextField());
            setClickCountToStart(1);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                }
            });
        }

        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            return button;
        }  
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TableGUIne();
	}
 }
        
        

       

