package org.conexion;

import org.modelo.Notificacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NotificacionDAO {

    public static List<Notificacion> obtenerTodos() {
        List<Notificacion> lista = new ArrayList<>();

        try (Connection conn = ConexionBD.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from notificacion")) {

            while (rs.next()) {
                Notificacion notificacion = new Notificacion(
                        rs.getInt("id"),
                        rs.getInt("id_alumno"),
                        rs.getString("mensaje"),
                        rs.getTimestamp("fecha_envio")
                );
                lista.add(notificacion);
            }

        } catch (Exception e) {
            System.out.println("Error al obtener las notificaciones: " + e.getMessage());
        }

        return lista;
    }
}
