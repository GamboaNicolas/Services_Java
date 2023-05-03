/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principales;

import Clases.CuentaBancaria;
import Servicios.CuentaBancariaServicio;


/**
 * listo Método para crear cuenta pidiéndole los datos al usuario.
   listo Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
   listo Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
   listo Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
   listo Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
   listo Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */


public class Ejercicio1{
    
    public static void main(String[] args){
        
        CuentaBancariaServicio bank = new CuentaBancariaServicio();
        
        CuentaBancaria gamboa = bank.CrearCuenta();
        
//        System.out.println("Bienvenido a la app del sistema bancario.");

        /**
         * Acá se puede armar tipo una app para administrar una o varias cuentas bancarias.
         */
        
    }
    
}
