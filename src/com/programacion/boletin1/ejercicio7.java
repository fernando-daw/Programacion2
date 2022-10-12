package com.programacion.boletin1;

import java.util.Scanner;

public class ejercicio7 {
    public static void  main(String[]args){
        Scanner pedir = new Scanner(System.in);
        System.out.println("El primer valor es ");
        double valor1 = pedir.nextDouble();
        System.out.println("El segundo valor es  ");
        double valor2 = pedir.nextDouble();
        double  modulo= valor1%valor2;
        System.out.println("El modulo es " + modulo);

    }
}
