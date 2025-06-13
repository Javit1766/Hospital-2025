package paneles;

import java.awt.*;
import javax.swing.*;
import ventanas.VentanaPacientes;
import ventanas.VentanaHistorial;

public class MenuLateralPanel extends JPanel {

    public MenuLateralPanel() {
        this.setPreferredSize(new Dimension(200, 1000));
        this.setLayout(new GridBagLayout()); // Centrar contenido
        this.setOpaque(false); // Para que se pinte el fondo personalizado

        // Crear botones personalizados
        JButton btnPacientes = crearBoton("Pacientes");
        JButton btnHistorial = crearBoton("Historial");

        // Panel para agrupar botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(2, 1, 10, 20));
        panelBotones.setOpaque(false);
        panelBotones.add(btnPacientes);
        panelBotones.add(btnHistorial);

        this.add(panelBotones);

        // Eventos
        btnPacientes.addActionListener(e -> new VentanaPacientes());
        btnHistorial.addActionListener(e -> new VentanaHistorial());
    }

    // Método para crear botones estilizados
    private JButton crearBoton(String texto) {
        JButton boton = new JButton(texto);
        boton.setFocusPainted(false);
        boton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        boton.setBackground(new Color(60, 120, 200));
        boton.setForeground(Color.GREEN);
        boton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        return boton;
    }

    // Fondo con degradado
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint gp = new GradientPaint(0, 0, new Color(100, 150, 255),
                                             0, getHeight(), Color.WHITE);
        g2.setPaint(gp);
        g2.fillRect(0, 0, getWidth(), getHeight());
    }

    public JPanel getPanel() {
        return this;
    }
}
