package org.coderhouse.clases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = getPersonas();

        // Ordenar por nombre
        System.out.println("Ordenado por nombre:");
        personas.sort(Comparator.comparing(Persona::getNombre));
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

        // Ordenar por apellido
        System.out.println("\nOrdenado por apellido:");
        personas.sort(Comparator.comparing(Persona::getApellido));
        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + " " + persona.getNombre());
        }

        // Ordenar inversamente por apellido
        System.out.println("\nOrdenado inversamente por apellido:");
        personas.sort(Comparator.comparing(Persona::getApellido).reversed());
        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + " " + persona.getNombre());
        }
    }

    private static List<Persona> getPersonas() {
        Persona persona1 = new Persona("Augusto", "Luján García");
        Persona persona2 = new Persona("María", "Sánchez");
        Persona persona3 = new Persona("Anderson", "Ocaña");
        Persona persona4 = new Persona("Mauro", "Fernández");
        Persona persona5 = new Persona("Alejandro", "Di Stefano");

        List<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);
        return personas;
    }
}
