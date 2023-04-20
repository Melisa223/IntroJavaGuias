/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
4.	Los profesores del curso de programación de Egg necesitan llevar un 
registro de las notas adquiridas por sus 10 alumnos para luego obtener una 
cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno 
obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
con promedio mayor o igual al 7 de sus notas del curso.

 */
package Guía5;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double[][] matriz = new double[10][5];
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double nota4 = 0;
        int aprob = 0;
        int desap = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1));
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    System.out.println("Primer trabajo práctico evaluativo 10%");
                    matriz[i][j] = leer.nextDouble();
                    nota1 = matriz[i][j] * 0.10;
                }
                if (j == 1) {
                    System.out.println("Segundo trabajo práctico evaluativo 15%");
                    matriz[i][j] = leer.nextDouble();
                    nota2 = matriz[i][j] * 0.15;
                }
                if (j == 2) {
                    System.out.println("Primer Integrador 25%");
                    matriz[i][j] = leer.nextDouble();
                    nota3 = matriz[i][j] * 0.25;
                }
                if (j == 3) {
                    System.out.println("Segundo integrador 50%");
                    matriz[i][j] = leer.nextDouble();
                    nota4 = matriz[i][j] * 0.50;
                }                
            }
            matriz[i][4] = (nota1 + nota2 + nota3 + nota4);
                if (matriz[i][4] >= 7) {
                    aprob++;
                } else {
                    desap++;
                }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" [" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("La cantidad de alumnos aprobados es: " + aprob);
        System.out.println("La cantidad de alumnos desaprobados es: " + desap);
    }
}
