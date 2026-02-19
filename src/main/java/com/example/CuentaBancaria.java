package com.example;
public class CuentaBancaria {
    
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {    
            this.saldo = saldoInicial;
        }

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            return true;
        }
        return false;
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            return true;
        }
        System.out.println("Fondos insuficientes o cantidad inválida.");
        return false;
    }
    
}