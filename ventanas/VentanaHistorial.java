package ventanas;

import javax.swing.*;
import paneles.TablaHistorial;

public class VentanaHistorial extends JFrame {

    public VentanaHistorial() {
        this.setTitle("Historial");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.add(new TablaHistorial().getPanel());
        this.setVisible(true);
    }
}
