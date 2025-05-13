package org.modelo;

public class Pregunta {

    private int id;
    private String enunciado;

    public Pregunta(int id, String enunciado) {
        this.id = id;
        this.enunciado = enunciado;
    }

    @Override
    public String toString() {
        return "Pregunta{id=" + id +
                ", enunciado='" + enunciado +
                "'}";
    }
}