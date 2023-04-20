/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de 
equipo y define su tipo de dato de tal manera que te permita alojar sus nombres
más adelante.
 */
package Guía5;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio1Guía {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerN = new Scanner(System.in);
        Scanner leerNom = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de integrantes");
        int cant = leerN.nextInt();
        String[] equipo = new String[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1));
            equipo[i] = leerNom.nextLine();
        }
        System.out.println("");

        for (int i = 0; i < cant; i++) {
            System.out.print(" " + equipo[i] + " ");

        }
        System.out.println("");

        for (String elemento : equipo) {
            System.out.print(" " + elemento + " ");
        }

    }
}
