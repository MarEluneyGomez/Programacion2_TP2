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
public class TP2_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese su primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese su segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese su tercer numero: ");
        int num3 = scanner.nextInt();
        
        if (num1 > num2 & num1 > num3 ){
            if (num2 > num3){
                System.out.println("El orden de los numeros es: " + num1 + ">" + num2 + ">" + num3);
            }
            else{
                System.out.println("El orden de los numeros es: " + num1 + ">" + num3 + ">" + num2);
            }
        }
        else if (num2 > num3 & num2 > num1) {
            if (num3 > num1){
                System.out.println("El orden de los numeros es: " + num2 + ">" + num3 + ">" + num1);
            }
            else{
                System.out.println("El orden de los numeros es: " + num2 + ">" + num1 + ">" + num3);
            }
        }
        
        else{
            if (num1 > num2){
                System.out.println("El orden de los numeros es: " + num3 + ">" + num1 + ">" + num2);
            }
            else{
                System.out.println("El orden de los numeros es: " + num3 + ">" + num2 + ">" + num1);
            }
        }
}
    
    
}
