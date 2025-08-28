/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author elune
 */
public class TP2_7 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Por favor ingrese una nota entre 10 y 0: ");
            numero = scanner.nextInt();
        }while (numero < 0 || numero > 10);
        System.out.println("La nota ingresada es :" + numero);
    }
}
