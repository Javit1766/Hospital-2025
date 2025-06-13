package ventanas;

import javax.swing.*;
import paneles.TablaPacientes;

public class VentanaPacientes extends JFrame {

    public VentanaPacientes() {
        this.setTitle("Pacientes");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.add(new TablaPacientes().getPanel());
        this.setVisible(true);
    }
}
