package com.programacion.boletin1;

import java.util.Scanner;

public class ejercicio10 {
    public static void  main(String[]args){
        Scanner datos=new Scanner(System.in);
        System.out.println("introduce un dato numerico");
        int dato= datos.nextInt();
        System.out.println("introduce  el segundo dato numerico");
        int dato2= datos.nextInt();
        System.out.println("introduce el tercer dato numerico");
        int dato3= datos.nextInt();
        if (dato==dato2){
            System.out.println("el primer dato y el segundo son iguales");
        }
        else {
            System.out.println("ambos numeros no son iguales");

        }
        if (dato==dato3){
            System.out.println("el primer y tercer dato son iguales");
        }
        else {
            System.out.println("el primer y tercer dato NO son iguales");

        }
        if (dato2==dato3){
            System.out.println("El segundo y tercer dato son iguales");
        }
        else {
            System.out.println("El segundo y tercer dato NO son iguales");

        }

    }
}
