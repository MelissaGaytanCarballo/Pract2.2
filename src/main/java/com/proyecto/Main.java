package com.proyecto;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Persona alumno = new Persona("Melissa", 23);
        System.out.println("Su nombre es: " + alumno.GetNombre());
        System.out.println("Su edad es: " + alumno.GetEdad());
    }
}
