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
public class TP2_3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if (edad < 12){
            System.out.println("Usted es un Niño");}
        else if (12 <= edad & edad <= 17){
            System.out.println("Usted es un Adolescente");
        }
        else if (18 <= edad & edad <= 59){
            System.out.println("Usted es un Adulto");
        }
        else {
            System.out.println("Usted es un Adulto mayor");
        }
    }
    
}
