package com.proyecto;

public class Persona {
    String name;
    int edad;
    Persona(String nombre, int age){
        name = nombre;
        edad = age;

    }

    String GetNombre(){
        return name;
    }
    int GetEdad(){
        return edad;
    }
}
