package org.modelo;

public class Alumno {

    private int id;
    private String nombre;
    private String email;

    public Alumno(){}

    public Alumno(int id, String nombre, String email){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String apellido) { this.email = email; }

    @Override
    public String toString() {
        return "Alumno{id=" + id +
                ", nombre=" + nombre +
                ", email=" + email +
                "}";
    }

}
