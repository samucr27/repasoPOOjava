package org.example;

public class Main {
    public static void main(String[] args) {

        //crear persona desde el constructor vacio
        Persona p1 = new Persona();

        p1.setNombre("Juan");
        p1.setEdad(26);
        p1.setGenero("Masculino");

        //crear persona usando construcor con todos los parametros

        Persona p2 = new Persona("Juliana",23,"Femenino");

        //mostrar persona

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        }
}
