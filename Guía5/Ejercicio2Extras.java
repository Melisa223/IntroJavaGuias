/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
2.	Escriba un programa que averigüe si dos vectores de N enteros son 
iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia
entre los elementos).
 */
package Guía5;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio2Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leerNum = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leerNum.nextInt();

        int[] vector1 = new int[N];
        int[] vector2 = new int[N];
        
        System.out.println(" ");
        System.out.println("Llenando el primer vector");
       
        for (int i = 0; i < N; i++) {   
            System.out.println("Ingrese un número");
            vector1[i] = leerNum.nextInt();
        }
         System.out.println(" ");
         System.out.println("Llenando el segundo vector");
           
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese un número");
            vector2[i] = leerNum.nextInt();
        }
        boolean iguales = true;
        for (int i = 0; i < N; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false; 
            }
        }
        if (iguales) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }
}
