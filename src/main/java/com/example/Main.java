package com.example;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
        cuenta.depositar(200);
        System.out.println(cuenta.getSaldo()); 
        cuenta.retirar(1000); 

        Estudiante e1 = new Estudiante("Pedro", 21, 2.5);
        e1.mostrarInfo();

        Estudiante e2 = new Estudiante("Ana", 22, 3.8);
        e2.mostrarInfo();

                Libro l1 = new Libro(); 
        l1.mostrarDetalles(); 
        
        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
        l2.mostrarDetalles();

        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarDetalles();
    }
}