/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
6.	Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números 
del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son 
idénticas. Crear un programa que permita introducir un cuadrado por teclado 
y determine si este cuadrado es mágico o no. El programa deberá comprobar que 
los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package Guía5;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio06Prácticos {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);

        System.out.println("Ingrese los valores de la matriz con numeros <10");

        int matriz[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    matriz[i][j] = ingrese.nextInt();
                } while ((matriz[i][j] > 10) || (matriz[i][j] < 0));

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
            }
            System.out.println(" ");
        }

        magica(matriz);
    }

    public static void magica(int[][] matriz) {

        boolean magic = true;

        int diagp = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    diagp += matriz[i][j];
                }
            }
        }
        System.out.println(diagp);

        int i = 0;

        do {
            int suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += matriz[i][j];
                if (suma == diagp) {
                    magic = false;
                }
            }
            System.out.println(magic);
            i++;
        } while (magic == true || i < 3);

        int j = 0;
        i = 0;
        do {
            int suma = 0;
            for (i = 0; i < 3; i++) {
                suma += matriz[i][j];
                if (suma != diagp) {
                    magic = false;
                }
                System.out.println(magic);
            }
            j++;
        } while (magic == true || j < 3);

        int suma = 0;
        for (int k = 0; k < 3; k++) {

            int l = 3 - (k + 1);
            suma += matriz[k][l];
            if (suma != diagp) {
                magic = false;
            }
            System.out.println(magic);

        }

        if (magic == true) {
            System.out.println("es magica");

        } else {
            System.out.println("no es magica");
        }
    }
}
