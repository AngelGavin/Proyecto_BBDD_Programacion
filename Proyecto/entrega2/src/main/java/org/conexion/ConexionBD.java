package org.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class ConexionBD {

    private static String url;
    private static String user;
    private static String password;

    public static void cargarConfiguracion() {
        try (InputStream input = ConexionBD.class.getClassLoader().getResourceAsStream("config.properties")) {

            Properties prop = new Properties();
            prop.load(input);

            url = prop.getProperty("db.url");
            user = prop.getProperty("db.user");
            password = prop.getProperty("db.password");

        } catch (IOException e) {
            System.out.println("Error al cargar el archivo de configuración: " + e.getMessage());
        }
    }

    public static Connection getConexion() throws SQLException {
        cargarConfiguracion();
        return DriverManager.getConnection(url, user, password);
    }
}



