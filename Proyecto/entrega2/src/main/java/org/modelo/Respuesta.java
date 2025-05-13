package org.modelo;

public class Respuesta {

    private int id;
    private int idPregunta;
    private String texto;
    private boolean esCorrecta;

    public Respuesta(int id, int idPregunta, String texto, boolean esCorrecta) {
        this.id = id;
        this.idPregunta = idPregunta;
        this.texto = texto;
        this.esCorrecta = esCorrecta;
    }

    @Override
    public String toString() {
        return "Respuesta{id=" + id +
                ", idPregunta=" + idPregunta +
                ", texto='" + texto +
                "', esCorrecta=" + esCorrecta +
                "}";
    }
}