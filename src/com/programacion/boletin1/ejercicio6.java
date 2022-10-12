package com.programacion.boletin1;

import java.util.Scanner;

public class ejercicio6 {
    public static void  main(String[]args){
        Scanner rellenar= new Scanner(System.in);
        System.out.println("Tu nombre es ");
        String nombre = rellenar.nextLine();
        System.out.println(" eres de ");
        String localidad = rellenar.nextLine();
        System.out.println(" tus gustos son ");
        String gusto = rellenar.nextLine();
        System.out.println("Tu nombre es " + nombre + " eres de " + localidad + " y te gusta " + gusto);

    }
}
