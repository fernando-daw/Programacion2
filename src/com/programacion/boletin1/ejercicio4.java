package com.programacion.boletin1;
import java.util.Scanner;


public class ejercicio4 {
    public static void  main(String[]args){
    Scanner rellenar = new Scanner(System.in);
    System.out.println("El valor de la altura es");
    int altura= rellenar.nextInt();
    System.out.println("El valor de la base es");
    int base= rellenar.nextInt();
    int area = base*altura;
    System.out.println("El valor del area es " + area);


    }
}
