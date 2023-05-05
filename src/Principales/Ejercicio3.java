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
        
        PersonaServicio p1 = new PersonaServicio();
        
        Persona persona1 = p1.crearPersona();
        
        Persona persona2 = p1.crearPersona();
        
        Persona persona3 = p1.crearPersona();
        
        Persona persona4 = p1.crearPersona();
        
        
        PesoIdeal(persona1);PesoIdeal(persona2);PesoIdeal(persona3);PesoIdeal(persona4);
        
        
        
        
    }
    
    public static void PesoIdeal(Persona p){
        
        PersonaServicio p1 = new PersonaServicio();
        
        int valor = p1.calcularIMC(p);
        
        switch (valor) {
            case -1:
                System.out.println(p.getNombre() + " está por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println(p.getNombre() + " está en su peso ideal.");
                break;
            default:
                System.out.println(p.getNombre() + " tiene sobrepeso.");
                break;
        }
        
    }
    
}
