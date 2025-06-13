package paneles;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TablaPacientes {

    private JPanel panelTabla;
    private JTable tabla;
    private DefaultTableModel modelo;

    public TablaPacientes() {
        panelTabla = new JPanel(new BorderLayout());

        String[] columnas = {"Nombre del Paciente", "Motivo de Consulta", "Nombre del Doctor"};

        Object[][] datos = {
            {"Laura Fernández", "Fiebre alta", "Dr. Gutiérrez"},
            {"Ricardo López", "Chequeo visual", "Dra. Morales"},
            {"Gabriela Torres", "Dolor de pierna", "Dr. Sánchez"}
        };

        modelo = new DefaultTableModel(datos, columnas);
        tabla = new JTable(modelo);

        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setPreferredSize(new Dimension(380, 200)); // opcional

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