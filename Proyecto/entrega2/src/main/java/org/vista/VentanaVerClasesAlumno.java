package org.vista;

import javax.swing.*;
import java.sql.*;

import org.conexion.ConexionBD;

public class VentanaVerClasesAlumno extends JFrame {

    public VentanaVerClasesAlumno() {
        setTitle("Clases Prácticas:");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JTextArea area = new JTextArea();

        try {
            Connection conn = ConexionBD.getConexion();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from clase_practica");

            while (rs.next()) {
                area.append("ID: " + rs.getInt("id") + "\n");
                area.append("Alumno: " + rs.getInt("id_alumno") + "\n");
                area.append("Instructor: " + rs.getInt("id_instructor") + "\n");
                area.append("Fecha: " + rs.getDate("fecha") + "\n");
                area.append("Inicio: " + rs.getTime("hora_inicio") + "\n");
                area.append("Fin: " + rs.getTime("hora_fin") + "\n");
                area.append("Comentarios: " + rs.getString("comentarios") + "\n");
                area.append("----------------------------\n");
            }

        } catch (SQLException e) {
            area.setText("Error al cargar clases: " + e.getMessage());
        }

        add(new JScrollPane(area));
        setVisible(true);
    }
}
