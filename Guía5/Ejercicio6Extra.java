/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
6.	Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 
caracteres y, a medida que el usuario las va ingresando, construya una 
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras 
se ubicarán todas en orden horizontal en una fila que será seleccionada de 
manera aleatoria. Una vez concluida la ubicación de las palabras, rellene 
los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente 
imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java substring(), Length() y Math.random().

 */
package Guía5;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio6Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[] vector = new String[5];
        for (int i = 0; i < 5; i++) {        
        String palabra= "   "; 
        while (palabra.length()>=3 && palabra.length()<=5 && i<=5) { 
        System.out.println("Ingrese una palabra entre 3 y 5 carácteres");
        palabra = leer.nextLine();
        palabra = leer.nextLine(); 
        vector[i]= palabra;
        } 
        
        }
         /*for (int i = 0; i < tamaño; i++) {
           System.out.print(" [" + vector [i] + "]");
        }
         System.out.println(" ");*/
     }
     
        
    }


