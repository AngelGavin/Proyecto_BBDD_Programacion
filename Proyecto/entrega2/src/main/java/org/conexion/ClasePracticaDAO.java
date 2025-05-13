package org.conexion;

import org.modelo.ClasePractica;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClasePracticaDAO {

    public static List<ClasePractica> obtenerTodos() {
        List<ClasePractica> lista = new ArrayList<>();
        String sql = "select * from clase_practica";

        try (Connection conn = ConexionBD.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                ClasePractica clase = new ClasePractica(
                        rs.getInt("id"),
                        rs.getInt("id_alumno"),
                        rs.getInt("id_instructor"),
                        rs.getDate("fecha").toLocalDate(),
                        rs.getTime("hora_inicio").toLocalTime(),
                        rs.getTime("hora_fin") != null ? rs.getTime("hora_fin").toLocalTime() : null,
                        rs.getString("comentarios")
                );
                lista.add(clase);
            }

        } catch (SQLException e) {
            System.out.println("No se puede acceder a las clases prácticas: " + e.getMessage());
        }

        return lista;
    }
}
