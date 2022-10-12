package com.programacion.boletin1;

import java.util.Scanner;

public class ejercicio8 {
    public static void  main(String[]args){
        Scanner pedir = new Scanner(System.in);
        System.out.println("El primer valor es ");
        int valor1= pedir.nextInt();
        System.out.println("El segundo valor es ");
        int valor2= pedir.nextInt();
        if (valor1==valor2) {
            System.out.println("Ambos numeros tienen el mismo valor ");
        }
        else {
            System.out.println("Ambos numeros NO tienen  el mismo valor ");
        }

    }
}
