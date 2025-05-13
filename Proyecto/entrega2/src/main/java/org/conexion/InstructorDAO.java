package org.conexion;

import org.modelo.Instructor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InstructorDAO {

    public static List<Instructor> obtenerTodos() {
        List<Instructor> lista = new ArrayList<>();

        try (Connection conn = ConexionBD.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from instructor")) {

            while (rs.next()) {
                Instructor instructor = new Instructor(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("email")
                );
                lista.add(instructor);
            }

        } catch (Exception e) {
            System.out.println("Error al obtener los instructores: " + e.getMessage());
        }

        return lista;
    }

    public static void actualizarComentario(int idClase, String comentario) {
        String sql = "update clase_practica set comentarios = ? where id = ?";
        try (Connection conn = ConexionBD.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, comentario);
            stmt.setInt(2, idClase);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al actualizar el comentario: " + e.getMessage());
        }
    }

    public static void borrarComentario(int idClase) {
        String sql = "update clase_practica set comentarios = null where id = ?";
        try (Connection conn = ConexionBD.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idClase);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al borrar el comentario: " + e.getMessage());
        }
    }
}
