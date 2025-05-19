package vistas;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class loginPanel {

    private JPanel loginPanel;

    public loginPanel() {
      loginPanel = new JPanel();
      loginPanel.setSize(500, 700);
      loginPanel.setOpaque(true);
      loginPanel.setBackground(Color.WHITE);
      loginPanel.setLayout(new GridBagLayout());

      //Administrador de diseño
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.insets = new Insets(10,80,10,80);
      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.weightx = 1.0;
      
      //Titulo
      JLabel titulo = new JLabel("Login");
      gbc.gridx = 0;
      gbc.gridx = 0;
      gbc.gridwidth = 2;
      gbc.anchor = GridBagConstraints.CENTER;
      loginPanel.add(titulo, gbc);
      titulo.setBackground(Color.green);
      titulo.setOpaque(true);
      titulo.setHorizontalAlignment(SwingConstants.CENTER);

      //Entrada de Correo
      JTextField correo = new JTextField("Correo");
      correo.setSize(new Dimension(100,50));
      gbc.gridx = 1;
      gbc.gridy = 1;
      loginPanel.add(correo, gbc);

      //Entrada de contraseña
      JTextField entradContraseña = new JTextField("Contraseña");
      entradContraseña.setSize(new Dimension(100,50));
      gbc.gridx = 1;
      gbc.gridy = 2;
      loginPanel.add(entradContraseña,gbc);

      //Boton
      JButton boton = new JButton("Ingresar");
      boton.setSize(new Dimension(100,50));
      gbc.gridx = 1;
      gbc.gridy = 3;
      gbc.anchor = GridBagConstraints.EAST;
      gbc.fill = GridBagConstraints.NONE;
      loginPanel.add(boton, gbc);

    }

    public JPanel getPanel(){
        return loginPanel;
    }
}

