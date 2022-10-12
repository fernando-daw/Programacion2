package com.programacion.boletin1;

import java.util.Scanner;

public class ejercicio13 {
    public static void  main(String[]args){
        Scanner tabla=new Scanner(System.in);
        System.out.println("Introduce un numero para hacerle la tabla de multiplicar");
        int dato= tabla.nextInt();
        System.out.println("La tabla de multiplicar del numero " +dato+ " es la siguiente");
        for (int i=1; i<=10;i++ ){
            System.out.println(dato + "*" + i + "=" + dato*i );
        }
    }
}
