/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
1.	Realizar un algoritmo que llene un vector con los 100 primeros números 
enteros y los muestre por pantalla en orden descendente.
 */
package Guía5;

/**
 *
 * @author Meli
 */
public class Ejercicio01Prácticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[100];
        for (int i = 0; i < 100 ; i++) {
            vector [i] = i + 1; 
        } 
        System.out.println(" ");
        
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector [i]) ;
        }
        System.out.println(" ");
    }  
}
