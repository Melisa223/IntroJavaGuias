/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

3.	Realizar un programa que solo permita introducir solo frases 
o palabras de 8 de largo. Si el usuario ingresa una frase o palabra de 8 
de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio03 {
    

      public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese un frase o palabra de 8 carácteres");
          String frase = leer.nextLine();
          if (frase.length() == 8) {
              System.out.println("CORRECTO");
          } else {
              System.out.println("INCORRECTO");
          }
      }
}
      
