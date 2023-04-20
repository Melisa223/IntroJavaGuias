/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía4;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    /**
     * @param args the command line arguments
     */
        Scanner ingrese = new Scanner(System.in);

        float num1;
        float num2;

        System.out.println("Ingrese dos numeros");
        num1 = ingrese.nextInt();
        num2 = ingrese.nextInt();

        String salir = "";

        do {
            System.out.println("MENU:");
            System.out.println("");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int menu = ingrese.nextInt();

            switch (menu) {
                case 1:

                    System.out.println("La suma de ambos numeros es: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("La resta entre ambos numeros es: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de ambos numeros es: " + multi(num1, num2));
                    break;
                case 4:
                    System.out.println("El cociente entre numeros es: " + dividir(num1, num2));
                    break;
                case 5:
                    System.out.println("Desea salir del programa (S/N)");
                    salir = ingrese.next();
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
                    
            }

        } while (!salir.equals("S"));

    }

    public static float sumar(float num1, float num2) {
        float suma = num1 + num2;
        return suma;
    }

    public static float restar(float num1, float num2) {
        float resta = num1 - num2;
        return resta;
    }

    public static float multi(float num1, float num2) {
        float multip = num1 * num2;
        return multip;
    }

    public static float dividir(float num1, float num2) {
        float divid = num1 / num2;
        return divid;
    }


    }
    

