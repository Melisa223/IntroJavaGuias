/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
5.	Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
sus filas por columnas (o viceversa).
 */
package Guía5;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio5Prácticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leerNum = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int[][] matrizAT = new int[3][3];
        int i, j;
        boolean esAntisimetrica = false;

        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                System.out.println("Ingrese el valor a cargar");
                matrizA[i][j] = leerNum.nextInt();
                matrizAT[i][j] = matrizA[i][j];
            }
        }
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("Matriz traspuesta");
        System.out.println("");
        for (j = 0; j < matrizAT.length; j++) {
            for (i = 0; i < matrizAT.length; i++) {
                System.out.print("[" + matrizAT[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println(" ");
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                if (matrizA[i][j] == -matrizAT[j][i]) {
                    esAntisimetrica = true;
                    break;
                }
            }
        }
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimetrica.");
        } else {
            System.out.println("La matriz no es antisimetrica.");
        }
    }
}
