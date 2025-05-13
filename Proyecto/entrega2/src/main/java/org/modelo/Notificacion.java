package org.modelo;

import java.sql.Timestamp;

public class Notificacion {

    private int id;
    private int idAlumno;
    private String mensaje;
    private Timestamp fechaEnvio;

    public Notificacion(int id, int idAlumno, String mensaje, Timestamp fechaEnvio) {
        this.id = id;
        this.idAlumno = idAlumno;
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
    }

    @Override
    public String toString() {
        return "Notificacion{id=" + id +
                ", idAlumno=" + idAlumno +
                ", mensaje=" + mensaje +
                ", fechaEnvio=" + fechaEnvio +
                "}";
    }
}
