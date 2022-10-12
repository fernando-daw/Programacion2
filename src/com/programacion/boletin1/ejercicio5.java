package com.programacion.boletin1;

import java.util.Scanner;

public class ejercicio5 {
    public static void  main(String[]args){

        Scanner rellenar = new Scanner(System.in);
        System.out.println("El valor del radio es ");
        int radio= rellenar.nextInt();
        final double PI = 3.14;
        System.out.println("El valor de la longitud es");
        int longitud= rellenar.nextInt();
        double area = PI*(radio*radio);
        double longitudrestult = 2*PI*radio;
        System.out.println("El valor del area es " + area + "y el valor de la longitud es " + longitudrestult );

    }
}
