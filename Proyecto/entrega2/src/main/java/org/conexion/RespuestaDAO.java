package org.conexion;

import org.modelo.Respuesta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RespuestaDAO {

    public static List<Respuesta> obtenerTodos() {
        List<Respuesta> lista = new ArrayList<>();

        try (Connection conn = ConexionBD.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from respuesta")) {

            while (rs.next()) {
                Respuesta respuesta = new Respuesta(
                        rs.getInt("id"),
                        rs.getInt("id_pregunta"),
                        rs.getString("texto"),
                        rs.getBoolean("es_correcta")
                );
                lista.add(respuesta);
            }

        } catch (Exception e) {
            System.out.println("Error al obtener las respuestas: " + e.getMessage());
        }

        return lista;
    }
}
