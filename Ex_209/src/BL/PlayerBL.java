package BL;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class PlayerBL extends AbstractTableModel {

    private final String[] colNames = {"Names", "Class", "Attack", "Defense", "HP"};
    private final ArrayList<Player> players = new ArrayList<>();

    @Override
    public int getRowCount() {
        return players.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }

}
