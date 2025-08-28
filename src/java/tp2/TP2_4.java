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
public class TP2_4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor ingrese su categoría: ");
        char categoria = scanner.nextLine().charAt(0);
        
        System.out.println("Por favor ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        double descuento = 0;
        double porcentaje_descuento = 0;
        
        switch (categoria){
            case 'A':
                descuento = 0.1;
                porcentaje_descuento = descuento * 100;
                System.out.println("Su descuento es del " + (int) porcentaje_descuento + "%");
                break;
            case 'B':
                descuento = 0.15;
                porcentaje_descuento = descuento * 100;
                System.out.println("Su descuento es del " + (int) porcentaje_descuento + "%");
                break;
                
            case 'C':
                descuento = 0.2;
                porcentaje_descuento = descuento * 100;
                System.out.println("Su descuento es del " + (int) porcentaje_descuento + "%");
        }
        System.out.println("El precio final es: " + (precio * descuento));
    }
    
}
