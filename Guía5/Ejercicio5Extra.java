/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
5.	Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package Guía5;

import static Guía5.Ejercicio3Extra.mostrarVector;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio5Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese filas: ");
        int m = input.nextInt();
        System.out.print("Ingrese columnas: ");
        int n = input.nextInt();
        int suma = 0;
        System.out.println("");
        int[][] matriz = llenarMatriz(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" [" + matriz[i][j] + "]");
                suma += matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("La suma de todos los números es: " + suma);
    }

    public static int[][] llenarMatriz(int m, int n) {

        int[][] matriz = new int[m][n];
        Random rand = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(11);
            }
        }
        return matriz;
    }
}
