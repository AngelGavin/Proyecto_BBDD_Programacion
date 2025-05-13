package org.conexion;

import org.modelo.HistorialTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HistorialTestDAO {

    public static List<HistorialTest> obtenerTodos() {
        List<HistorialTest> lista = new ArrayList<>();

        try (Connection conn = ConexionBD.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from historial_test")) {

            while (rs.next()) {
                HistorialTest ht = new HistorialTest(
                        rs.getInt("id"),
                        rs.getInt("id_test"),
                        rs.getInt("id_pregunta"),
                        rs.getInt("id_respuesta_marcada"),
                        rs.getBoolean("acierto")
                );
                lista.add(ht);
            }

        } catch (Exception e) {
            System.out.println("Error al acceder al historial de tests: " + e.getMessage());
        }

        return lista;
    }
}
