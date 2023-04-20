/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
1.	Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package Guía5;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leerNum = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leerNum.nextInt();
        
        int[] vector = new int [N];
        int suma = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese un número");  
            vector [i] = leerNum.nextInt();            
            suma += vector [i];
        }
        for (int i = 0; i < N; i++) {
            System.out.print( " [" + vector [i] + "] "); 
    } 
        System.out.println(" ");
        System.out.println("La suma de los números es: " + suma);
   }
}
