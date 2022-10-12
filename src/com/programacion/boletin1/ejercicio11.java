package com.programacion.boletin1;

import java.util.Scanner;

public class ejercicio11 {
    public static void  main(String[]args){
        Scanner suma=new Scanner(System.in);
        System.out.println("Escribe un dato");
        int dato= suma.nextInt();
        int dato2= ++dato;
        System.out.println("Introduce un nuevo dato ");
        int dato3=suma.nextInt();
        int dato4= dato3*dato2;
        System.out.println("la solucion es " + dato4);

    }
}
