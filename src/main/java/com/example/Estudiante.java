package com.example;

public class Estudiante {
    
    private String nombre;
    private int edad; 
    private double promedio;


    public Estudiante(){
    }

    public Estudiante(String nombre, int edad, double promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }


    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Pedro", 21, 2.5);
        e1.mostrarInfo();

        Estudiante e2 = new Estudiante("Ana", 22, 3.8);
        e2.mostrarInfo();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if(edad > 0){
            this.edad = edad;
        }
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public boolean haAprobado() {
        return this.promedio >= 3.0;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        if (haAprobado()) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}

    

