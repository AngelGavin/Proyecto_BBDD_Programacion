package org.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class ClasePractica {

    private int id;
    private int idAlumno;
    private int idInstructor;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String comentarios;

    public ClasePractica(int id, int idAlumno, int idInstructor, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, String comentarios) {
        this.id = id;
        this.idAlumno = idAlumno;
        this.idInstructor = idInstructor;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "ClasePractica{" +
                "id=" + id +
                ", idAlumno=" + idAlumno +
                ", idInstructor=" + idInstructor +
                ", fecha=" + fecha +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", comentarios='" + comentarios +
                '}';
    }
}
