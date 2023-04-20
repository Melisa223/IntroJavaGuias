/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
3.	Recorrer un vector de N enteros contabilizando cuántos números son 
de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guía5;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio03Prácticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamVector = sc.nextInt();
        int[] vector = new int[tamVector];
        for (int i = 0; i < tamVector; i++) {
            vector[i] = (int) ( 1 + (Math.random() * 100000));
        }
        for (int elemento : vector) {
            System.out.println(" [ " + elemento + " ] ");
        }
        int cont = 0;
        for (int i = 0; i < tamVector ; i++) {
            cont = 1;
            int aux= vector[i];
            while (aux > 10) { 
                cont++;
                aux/=10;
            }
            System.out.println("El número " + vector[i] 
                        + " tiene " + cont + " dígitos" );
        }
    }

}
