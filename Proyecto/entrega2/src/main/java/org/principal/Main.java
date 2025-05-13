package org.principal;

import org.conexion.AlumnoDAO;
import org.conexion.ClasePracticaDAO;
import org.conexion.HistorialTestDAO;
import org.conexion.InstructorDAO;
import org.conexion.NotificacionDAO;
import org.conexion.PreguntaDAO;
import org.conexion.RespuestaDAO;
import org.conexion.TestTeoricoDAO;
import org.modelo.Instructor;


public class Main {
    public static void main(String[] args) {
        /*
        System.out.println(ClasePracticaDAO.obtenerTodos());
        System.out.println(HistorialTestDAO.obtenerTodos());
        System.out.println(InstructorDAO.obtenerTodos());
        System.out.println(NotificacionDAO.obtenerTodos());
        System.out.println(PreguntaDAO.obtenerTodos());
        System.out.println(RespuestaDAO.obtenerTodos());
        System.out.println(TestTeoricoDAO.obtenerTodos());
         */

        Instructor instructor = new Instructor(1, "roberto", "email");

        System.out.println(ClasePracticaDAO.obtenerTodos());

        instructor.escribirComentario(1, "tiene que mejorar");
        System.out.println(ClasePracticaDAO.obtenerTodos());

        instructor.borrarComentario(1);
        System.out.println(ClasePracticaDAO.obtenerTodos());
    }
}
