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
public class Deportista extends Personas {

    public Deportista(String nombre, String apellido, int edad, String profesion, String Direccion, String pais) {
        super(nombre, apellido, edad, profesion, Direccion, pais);
    }
    
    
    public void Deportista(){
    
        
        setNombre("leonel Andres");
        setApellido(" Messi ");
        setEdad(35);
        setDireccion("ESPA'A BARCELONA");
        setProfesion("Jugador del FB Barcelona");
        setPais("Spain");
    
    
    }
}
