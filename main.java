import java.awt.Color;

import javax.swing.JFrame; // Para crear ventanas
import javax.swing.JLabel;

public class main {

    public static void main(String[] args) {
        
        // Crear una ventana con JFrame
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital SCL");
        miVentana.setSize(1000,800);

        // Crear texto con JLabel
        JLabel texto = new JLabel();
        texto.setText("Hola Mundo");
        miVentana.add(texto);

        miVentana.setVisible(true);
    }
    
}