
package paneles;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TablaHistorial {

    private JPanel panelTabla;
    private JTable tabla;
    private DefaultTableModel modelo;

    public TablaHistorial() {
        panelTabla = new JPanel(new BorderLayout());

        String[] columnas = {"Nombre del Paciente", "Fecha de Consulta", "Diagnóstico"};

        Object[][] datos = {
            {"María López", "2023-11-15", "Dolor de espalda"},
            {"Luis Martínez", "2024-02-20", "Chequeo dental"},
            {"Sofía Ramírez", "2024-06-01", "Fractura leve"}
        };

        modelo = new DefaultTableModel(datos, columnas);
        tabla = new JTable(modelo);

        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setPreferredSize(new Dimension(380, 200));

        panelTabla.add(scrollPane, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panelTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }
}