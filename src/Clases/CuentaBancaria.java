/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Nicolas
 */
public class CuentaBancaria {
    
//    Atributos
    
    private int Numerocuenta;
    private long dniCliente;
    private double saldoActual;

//    Constructores
    
    public CuentaBancaria() {
    }

    public CuentaBancaria(int Numerocuenta, long dniCliente, double saldoActual) {
        this.Numerocuenta = Numerocuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

//    Getters y Setters
    
    public int getNumerocuenta() {
        return Numerocuenta;
    }

    public void setNumerocuenta(int Numerocuenta) {
        this.Numerocuenta = Numerocuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    
    @Override
    public String toString() {
        return "CuentaBancaria{" + "Numerocuenta=" + Numerocuenta + ", dniCliente=" + dniCliente + '}';
    }
    
    
    
}
