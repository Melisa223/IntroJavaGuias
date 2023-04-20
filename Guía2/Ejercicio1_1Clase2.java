package Guía2;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */

/**
 *
 * @author Meli
 */
public class Ejercicio1_1Clase2 {
    
    public static void main(String[] args) {
       
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese el primer número");
         int numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
         int numero2 = leer.nextInt();
        System.out.println("La suma de los números es:");
        System.out.println(numero1 + numero2);
        
    }
    
}
