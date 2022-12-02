/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hamming;


import java.util.Arrays;
import java.util.Scanner;

public class Hamming {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);//he echo una cajita
        System.out.println("introduce la longitud del mensaje:");

        int longitud = input.nextInt();//guardo la longitud
        System.out.println("longitud = " + longitud);

        int[] mensaje = new int[longitud];//array de la longitud

        //mensaje aleatorio que guarda de 0 y 1.
        for (int i = 0; i < longitud; i++) {
            int numero = (int) Math.round(Math.random());
            mensaje[i] = numero;
        }
        //aqui imprime por pantalla el array
        for (int a = 0; a < longitud; a++) {
            System.out.print(mensaje[a]);
        }
       
         //calculando los bit de pariedad
        int bitparidad = 0;
        
        while (Math.pow(2, bitparidad) <= longitud + bitparidad + 1) {
            bitparidad++;

        }
        System.out.println("bitparidad = " + bitparidad);
        

        /*int[] codigohamming = new int[longitud + bitparidad + 1];
        System.out.println("codigohamming = " + Arrays.toString(codigohamming));*/
        
    }
    }
    

