package com.programacion.boletin1;

import java.util.Scanner;

public class ejercicio9 {
    public static void  main(String[]args){
        Scanner pedir = new Scanner(System.in);
        System.out.println("La primera cadena de texto es ");
        String texto= pedir.nextLine();
        System.out.println("La segunda cadena de texto es ");
        String text2= pedir.nextLine();
        if (texto==text2) {
            System.out.println("Ambas cadenas son iguales ");
        }
        else {
            System.out.println("Ambos cadenas NO son iguales");
        }
    }
}
