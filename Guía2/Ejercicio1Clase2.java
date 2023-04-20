/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package Guía2;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio1Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner(System.in);
        boolean bandera = false; 
        char letra1;
        char letra2; 
        //int numero = 48;
        double decimal = 3.55;
        System.out.println("Ingrese el primer número:");
        int num1 = leer.nextInt();
        System.out.println("num1 = " + num1);
        System.out.println("Ingrese el segundo número:");
        int numero = leer.nextInt();
        System.out.println("numero = " + numero);
        System.out.println("La suma de ambos número es:");
        System.out.println(num1 + numero);                
}
 



        // TODO code application logic here
    }
    

