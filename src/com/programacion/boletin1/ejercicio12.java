package com.programacion.boletin1;

import java.util.Scanner;

public class ejercicio12 {
    public static void  main(String[]args){
        Scanner permiso=new Scanner(System.in);
        System.out.println("introduce tu edad");
        int resultado= permiso.nextInt();
        int edad=18;
        int carnet=0;
        carnet=resultado>edad ? resultado: edad;
        System.out.println( "tienes mas de 18 años? " + resultado);

    }
}
