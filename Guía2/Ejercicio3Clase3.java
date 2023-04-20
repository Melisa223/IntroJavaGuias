/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía2;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio3Clase3 {
    
    public static void main(String[] args) {
Scanner read = new Scanner(System.in);
int num1;
int num2;
System.out.println("Ingrese dos numeros para la suma.");
num1 = read.nextInt();
num2 = read.nextInt();

int suma = num1 + num2;
System.out.println("El resultado es " + suma);
}
}
