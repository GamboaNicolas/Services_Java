/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principales;

import Clases.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author Nicolas
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        PersonaServicio personaServ = new PersonaServicio();
        
        Persona persona1 = personaServ.crearPersona();
        
        System.out.println(personaServ.calcularIMC(persona1));
        System.out.println(personaServ.esMayorDeEdad(persona1));
        
        
        
        
        
        
        
        
    }
    
}
