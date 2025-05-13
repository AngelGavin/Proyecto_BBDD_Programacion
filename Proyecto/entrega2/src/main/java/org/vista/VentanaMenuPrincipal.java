package org.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaMenuPrincipal extends JFrame {

    public VentanaMenuPrincipal() {
        setTitle("Menú principal");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        JButton botonAlumno = new JButton("Soy alumno");
        JButton botonInstructor = new JButton("Soy instructor");

        botonAlumno.addActionListener(e -> {
            new VentanaAlumno().setVisible(true);
            dispose();
        });

        add(new JLabel("¿Qué tipo de usuario eres?", SwingConstants.CENTER));
        add(botonAlumno);
        add(botonInstructor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaMenuPrincipal().setVisible(true));
    }
}
