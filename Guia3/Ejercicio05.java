/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
5.	Escriba un programa en el cual se ingrese un valor límite positivo,
 y a continuación solicite números al usuario hasta que la suma de los
 números introducidos supere el límite inicial.
 */

package Guia3;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio05 {
            
    public static void main (String[] args){
        
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese un límite numérico entero positivo");
        int limite = leer.nextInt();
        int suma= 0; 
        do{ 
            System.out.println("Ingrese los número a sumar");
            int num = leer.nextInt();
            suma= suma + num;     

         } while ( suma <= limite);
        System.out.println("");
        System.out.println("La suma de los números es:" + suma);
        
    }
     
}
