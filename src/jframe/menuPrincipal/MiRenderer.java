package jframe.menuPrincipal;

/**
 *
 * @author cgsen
 */
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MiRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (evaluarPar(row)) {
            this.setBackground(Color.getHSBColor(229,229,229));
            this.setForeground(Color.black);
            this.setHorizontalAlignment(CENTER);
        } else {
            this.setBackground(Color.getHSBColor(204, 204, 204));
            this.setForeground(Color.black);
            this.setHorizontalAlignment(CENTER);
        }
        return this;
    }

    public boolean evaluarPar(int numero) {
        return (numero % 2 == 0);
    }
}
