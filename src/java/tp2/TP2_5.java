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
public class TP2_5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número  :");
        int numero = scanner.nextInt();
         int suma = 0;
        
        
        while(numero != 0){
            if (numero%2 != 0){
            suma += numero;
                    }
            System.out.println("Ingrese un número  :");
            numero = scanner.nextInt();
        }
        System.out.println("La suma de los numeros impares (Hata cero) es: "+ suma);
    }
    
}
