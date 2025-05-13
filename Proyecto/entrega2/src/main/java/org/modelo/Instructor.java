package org.modelo;

import org.conexion.InstructorDAO;

public class Instructor {

    private int id;
    private String nombre;
    private String email;

    public Instructor(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public void escribirComentario(int idClase, String comentario) {
        InstructorDAO.actualizarComentario(idClase, comentario);
    }

    public void borrarComentario(int idClase) {
        InstructorDAO.borrarComentario(idClase);
    }

    @Override
    public String toString() {
        return "Instructor{id=" + id +
                ", nombre=" + nombre +
                ", email=" + email +
                "}";
    }
}
