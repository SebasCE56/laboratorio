package com.tuapp.mavenproject1.probando;


public class Empleado {
    private int codigo;
    private String nombre;
    private String apellido;

    public Empleado(int codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Empleado{codigo=" + codigo + ", nombre='" + nombre + "', apellido='" + apellido + "'}";
    }
}
