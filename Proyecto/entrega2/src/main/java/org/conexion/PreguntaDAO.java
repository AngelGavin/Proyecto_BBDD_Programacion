package org.conexion;

import org.modelo.Pregunta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PreguntaDAO {

    public static List<Pregunta> obtenerTodos() {
        List<Pregunta> lista = new ArrayList<>();

        try (Connection conn = ConexionBD.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from pregunta")) {

            while (rs.next()) {
                Pregunta pregunta = new Pregunta(
                        rs.getInt("id"),
                        rs.getString("enunciado")
                );
                lista.add(pregunta);
            }

        } catch (Exception e) {
            System.out.println("Error al obtener las preguntas: " + e.getMessage());
        }

        return lista;
    }
}
