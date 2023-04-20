/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
6.	Realizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
si el usuario selecciona la opción 5, en vez de salir del programa directamente,
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir 
del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.

 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio06 {
     public static void main (String[] args){
        
        Scanner leer =new Scanner (System.in);
         System.out.println("Ingrese dos números enteros positivos");
         int numero1 = leer.nextInt();
         int numero2 = leer.nextInt();
         boolean menu = true;
        
         
        do {
            System.out.println("Eleja la opción que desea realizar\n"
                 + "MENU\n"
                 + "1-Sumar\n"
                 + "2-Restar\n"
                 + "3-Multipiclar\n"
                 + "4-Dividir\n"
                 + "5-Salir\n");
         int opc = leer.nextInt(); 
        
         switch (opc){
             case 1: 
                 System.out.println("La suma es:" + (numero1 + numero2));
             break;
             case 2: 
                 System.out.println("La resta es:" + (numero1 - numero2));
             break;
             case 3: 
                 System.out.println("La multiplicación es:" + (numero1 * numero2));
             break;
             case 4: 
                 System.out.println("La división es:" + (numero1 / numero2));
             break;
             case 5: 
                 System.out.println("Ha decidido salir");
                 System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                 String confirma = leer.next();
                 
                if (confirma.equals("s")) {
                    menu=false;
                    break;
                } else { 
                    menu=true;
               }          
         }
        } while (menu == true); 
                
     } 
   }
        
     


