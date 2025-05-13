package org.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaAlumno extends JFrame {

    public VentanaAlumno() {
        setTitle("Panel del Alumno");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel titulo = new JLabel("Bienvenido, Alumno", SwingConstants.CENTER);
        JButton verClases = new JButton("Ver mis próximas clases prácticas");
        JButton cerrarSesion = new JButton("Cerrar sesión");

        verClases.addActionListener(e -> new VentanaVerClasesAlumno());
        cerrarSesion.addActionListener(e -> dispose());

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(Box.createVerticalStrut(30));
        panel.add(titulo);
        panel.add(Box.createVerticalStrut(20));
        panel.add(verClases);
        panel.add(Box.createVerticalStrut(10));
        panel.add(cerrarSesion);

        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        verClases.setAlignmentX(Component.CENTER_ALIGNMENT);
        cerrarSesion.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(panel);
    }
}
