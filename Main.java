// Importamos las clases necesarias de la librería Swing, que nos permiten crear interfaces gráficas de usuario
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import vistas.loginPanel;
public class Main {

    public static void main(String[] args) {
        
        // Crear una ventana usando JFrame
        // Aquí estamos creando un objeto de tipo JFrame, que representa la ventana en la interfaz gráfica.
        JFrame miVentana = new JFrame(); 
        
        // Establecemos el título de la ventana con el método setTitle()
        // En este caso, el título de la ventana será "Hospital SCL".
        miVentana.setTitle("Hospital SCL"); 
        
        // Definimos el tamaño de la ventana con el método setSize(), en donde el primer número es el ancho
        // y el segundo número es la altura de la ventana en píxeles.
        miVentana.setSize(1000, 800);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout()); 
        
        // Panel Banner
        JPanel panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500,1100));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.RED);
        miVentana.add(panelBanner);
        miVentana.add(panelBanner,BorderLayout.WEST);

        // Panel login
        loginPanel loginPanel = new loginPanel();
        miVentana.add(loginPanel.getPanel(),BorderLayout.CENTER);

        miVentana.setVisible(true);
    }
}