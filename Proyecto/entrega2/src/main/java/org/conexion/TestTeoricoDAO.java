package org.conexion;

import org.modelo.TestTeorico;
import org.modelo.TestTeorico.TipoTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestTeoricoDAO {

    public static List<TestTeorico> obtenerTodos() {
        List<TestTeorico> lista = new ArrayList<>();

        try (Connection conn = ConexionBD.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from test_teorico")) {

            while (rs.next()) {
                TestTeorico test = new TestTeorico(
                        rs.getInt("id"),
                        rs.getInt("id_alumno"),
                        TipoTest.valueOf(rs.getString("tipo_test")),
                        rs.getInt("cantidad_preguntas"),
                        rs.getDouble("porcentaje_aciertos")
                );
                lista.add(test);
            }

        } catch (Exception e) {
            System.out.println("Error al obtener los tests teóricos: " + e.getMessage());
        }

        return lista;
    }
}
