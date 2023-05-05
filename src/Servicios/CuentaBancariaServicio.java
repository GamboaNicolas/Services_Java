/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.CuentaBancaria;
import java.util.Scanner;


/**
 *
 * @author Nicolas
 */
public class CuentaBancariaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public CuentaBancariaServicio(){
        
    }
    
    
    public CuentaBancaria CrearCuenta(){
        
        CuentaBancaria cuenta = new CuentaBancaria();
        
        System.out.println("Por favor, ingresá el numero de cuenta:");
        cuenta.setNumerocuenta(leer.nextInt());
        
        System.out.println("Ahora Ingrese el DNI del cliente:");
        cuenta.setDniCliente(leer.nextLong());
        
        cuenta.setSaldoActual(0);
        
        System.out.println("La cuenta fue creada con un saldo inicial de $0");
        
        return cuenta;
        
    }
    
    
    
    public void ingresar(CuentaBancaria cuenta){
        
        System.out.println("Ingrese el monto que desea agregar a la cuenta:");
        
        cuenta.setSaldoActual(cuenta.getSaldoActual()+leer.nextDouble());
        
        System.out.println("Se ha agregado tal cantidad a su cuenta. Su saldo actual es de $" + cuenta.getSaldoActual());
        
    }
    
    public void retirar(CuentaBancaria cuenta){
        
        System.out.println("Ingrese el monto que desea retirar:");
        
        double retiro = leer.nextDouble();
        double tenencia = cuenta.getSaldoActual();
        
        
        if (retiro > tenencia) {
            
            cuenta.setSaldoActual(0);
            
            System.out.println("No tiene tal cantidad, se han retirado $"+tenencia+" dejando un saldo de $0");
            
        } else {
            
            cuenta.setSaldoActual(tenencia - retiro);
            
            System.out.println("Has retirado $" + retiro + " su saldo actual es de $" + cuenta.getSaldoActual());
        }
        
        
    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
        
        double tenencia = cuenta.getSaldoActual();
        
        System.out.println("Ha seleccionado la extracción rápida, no podrá retirar más de un 20% de su saldo ($" + 
                0.2*tenencia+")");
        
        System.out.println("Ingrese cuánto desea retirar:");
        double retiro = leer.nextDouble();
        
        while(retiro <= 0 || retiro > 0.2*tenencia){
            
            System.out.println("El monto ingresado no es válido. Ingrese cuánto desea retirar:");
            retiro = leer.nextDouble();
        }
        
        cuenta.setSaldoActual(tenencia-retiro);
        
        System.out.println("Ha retirado $"+retiro+". Su saldo actual es de $" + 
                cuenta.getSaldoActual());
        
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        
        System.out.println("El saldo de la cuenta ingresada es de $" + cuenta.getSaldoActual() );
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        
        System.out.println("info de la cuenta:");
        System.out.println(cuenta.toString());
        
    }
    
}
