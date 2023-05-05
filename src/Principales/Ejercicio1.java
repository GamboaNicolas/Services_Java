/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principales;

import Clases.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 * listo Método para crear cuenta pidiéndole los datos al usuario. listo Método
 * ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al
 * saldo actual. listo Método retirar(double): recibe una cantidad de dinero a
 * retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de
 * dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
 * listo Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
 * Validar que el usuario no saque más del 20%. listo Método consultarSaldo:
 * permitirá consultar el saldo disponible en la cuenta. listo Método
 * consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido a la aplicación del banco,"
                + "\npara iniciar debe crear una cuenta bancaria.");

        CuentaBancariaServicio bank = new CuentaBancariaServicio();

        CuentaBancaria cuenta = bank.CrearCuenta();

        int opcion = 0;

        System.out.println("");

        while (opcion != 5) {

            opciones();

            opcion = leer.nextInt();

            while (!(opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5)) {

                System.out.println("Por favor, ingrese una opcion válida.");

                opciones();

                opcion = leer.nextInt();

            }

            switch (opcion) {

                case 1:
                    bank.ingresar(cuenta);
                    break;
                case 2:

                    System.out.println("¿Qué tipo de extracción desea realizar?\n1_Normal\n2_Rápida(hasta el 20% del saldo)");

                    int n = leer.nextInt();

                    while (!(n == 1 || n == 2)) {

                        System.out.println("Ingrese una opcion válida");
                        System.out.println("¿Qué tipo de extracción desea realizar?\n1_Normal\n2_Rápida(hasta el 20% del saldo)");

                        n = leer.nextInt();

                    }

                    if (n == 1) {
                        bank.retirar(cuenta);
                    } else {
                        bank.extraccionRapida(cuenta);
                    }

                    break;
                case 3:
                    bank.consultarSaldo(cuenta);
                    break;
                case 4:
                    bank.consultarDatos(cuenta);
                    break;
                default:
                    break;
            }

        }

    }

    public static void opciones() {
        System.out.println("¿Qué desea hacer?");
        System.out.println("1_Ingresar dinero a mi cuenta");
        System.out.println("2_Retirar dinero de mi cuenta");
        System.out.println("3_Consultar saldo");
        System.out.println("4_consultar datos");
        System.out.println("5_Salir");
    }

}
