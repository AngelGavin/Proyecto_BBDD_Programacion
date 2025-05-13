package org.conexion;

import org.modelo.Alumno;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {

    public static List<Alumno> obtenerTodos() {
        List<Alumno> lista = new ArrayList<>();
        String sql = "select * from alumno";

        try (Connection conn = ConexionBD.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setId(rs.getInt("id"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setEmail(rs.getString("email"));
                lista.add(alumno);
            }

        } catch (SQLException e) {
            System.out.println("No se puede acceder a los alumnos: " + e.getMessage());
        }

        return lista;
    }
}



