/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
7.	Realizar un programa que simule el funcionamiento de un dispositivo RS232,
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial 
“&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que 
no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas 
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals().

 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio07 {
    public static void main (String[] args){
        Scanner leer =new Scanner (System.in);
        System.out.println("La palabra debe poseer 5 carácteres, comenzar con x y terminar con o");
        String palabra = "";
        int correcta= 0, incorrecta = 0;     
        /* Int cantletras = palabra.length();*/
        while(!palabra.equals("&&&&&")){
        System.out.println("Ingrese una palabra");
        palabra = leer.nextLine();
        
        if (palabra.length() == 5 && "X".equals(palabra.substring(0,1)) && "O".equals(palabra.substring(4,5)) ){
            correcta++;        
        } else if (!palabra.equals("&&&&&")){
            incorrecta++;
        }
        
    }
        System.out.println("Informe:\n"
                + "Cantidad de palabras correctas:" + correcta);
        System.out.println("Cantidad de palabras incorrectas:" + incorrecta);
   }
}