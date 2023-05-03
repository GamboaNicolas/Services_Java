/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Persona;
import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        Persona persona = new Persona();
        
//        nombre
        System.out.println("Ingrese el nombre de la persona:");
        persona.setNombre(leer.nextLine());
        
//        edad
        System.out.println("Ingrese su edad:");
        persona.setEdad(leer.nextByte());
        
//        sexo
        System.out.println("Ingrese el sexo:\n'M'(masculino)/'F'(femenino)/'O'(otro)");
        String s = leer.nextLine();
        
        while(!(s.equalsIgnoreCase("M")||s.equalsIgnoreCase("F")||s.equalsIgnoreCase("O"))){
            System.out.println("El sexo ingresado no es valido.");
            System.out.println("Ingrese el sexo:\n'M'(masculino)/'F'(femenino)/'O'(otro)");
            s = leer.nextLine();
        }
        
        persona.setSexo(s);
        
//        peso
        System.out.println("Ingrese el peso en KG:");
        persona.setPeso(leer.nextDouble());
        
//        altura
        System.out.println("ingrese la altura en Metros:");
        persona.setAltura(leer.nextDouble());
        
        return persona;
        
    }
    
    public boolean esMayorDeEdad(Persona persona){
        
        return (persona.getEdad() >= 18);
        
    }

    public int calcularIMC(Persona persona){
        
        double IMC = persona.getPeso()/(Math.pow(persona.getAltura(),2));
        if (IMC<20) {
           return -1;
        }else if (IMC <=25) {
            return 0;
        }else{
            return 1;
        }
        
    }
}
