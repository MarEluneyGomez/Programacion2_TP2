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
public class TP2_6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int total_num = 0;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        for (total_num = 0; total_num < 10; total_num++){
            System.out.println("Ingrese un número: ");
            numero = scanner.nextInt();
            
            if (numero > 0){
            positivos += 1;
            }
            else if (numero < 0){
            negativos += 1;
            }
            else {
            ceros += 1;
            }
        }
        System.out.println("El total de números positivos es: " + positivos);
            System.out.println("El total de números negativos es: " + negativos);
            System.out.println("El total de ceros es: " + ceros);
    }
}
