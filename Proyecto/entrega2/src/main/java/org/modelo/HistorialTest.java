package org.modelo;

public class HistorialTest {

    private int id;
    private int idTest;
    private int idPregunta;
    private int idRespuestaMarcada;
    private boolean acierto;

    public HistorialTest(int id, int idTest, int idPregunta, int idRespuestaMarcada, boolean acierto) {
        this.id = id;
        this.idTest = idTest;
        this.idPregunta = idPregunta;
        this.idRespuestaMarcada = idRespuestaMarcada;
        this.acierto = acierto;
    }

    @Override
    public String toString() {
        return "HistorialTest{id=" + id +
                ", idTest=" + idTest +
                ", idPregunta=" + idPregunta +
                ", idRespuestaMarcada=" + idRespuestaMarcada +
                ", acierto=" + acierto +
                "}";
    }
}