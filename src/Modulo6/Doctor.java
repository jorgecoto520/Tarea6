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
public class Doctor extends Personas{

    public Doctor(String nombre, String apellido, int edad, String profesion, String Direccion, String pais) {
        super(nombre, apellido, edad, profesion, Direccion, pais);
    }


    public void Doctor(){
        
        setNombre("Juan Rodriguez");
        setApellido("Martinez");
        setEdad(23);
        setDireccion("Colonia Arturo Quezada");
        setProfesion("Doctor en medicina general");
        setPais("Honduras");
        
    
    
    
    }
    
    
}
