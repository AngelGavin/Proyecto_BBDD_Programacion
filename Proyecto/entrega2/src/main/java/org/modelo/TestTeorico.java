package org.modelo;

public class TestTeorico {

    private int id;
    private int idAlumno;
    private TipoTest tipoTest;
    private int cantidadPreguntas;
    private double porcentajeAciertos;

    public enum TipoTest {
        Practica,
        Practica_intensiva
    }

    public TestTeorico(int id, int idAlumno, TipoTest tipoTest, int cantidadPreguntas, double porcentajeAciertos) {
        this.id = id;
        this.idAlumno = idAlumno;
        this.tipoTest = tipoTest;
        this.cantidadPreguntas = cantidadPreguntas;
        this.porcentajeAciertos = porcentajeAciertos;
    }

    @Override
    public String toString() {
        return "TestTeorico{" +
                "id=" + id +
                ", idAlumno=" + idAlumno +
                ", tipoTest=" + tipoTest +
                ", cantidadPreguntas=" + cantidadPreguntas +
                ", porcentajeAciertos=" + porcentajeAciertos +
                '}';
    }
}
