/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo6;

/**
 *
 * @author HACK
 */
public class Personas {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String profesion;
    private  String Direccion;
    private String pais;

    public Personas(String nombre, String apellido, int edad, String profesion, String Direccion, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.profesion = profesion;
        this.Direccion = Direccion;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
    
}
