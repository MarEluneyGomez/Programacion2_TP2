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
public class TP2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        
        System.out.print("Introduce el precio base del producto: ");
        double precioBase = scanner.nextDouble();
        
        System.out.print("Introduce el impuesto aplicado (en porcentaje): ");
        double impuesto = scanner.nextDouble();
        impuesto = impuesto / 100;
        
        System.out.print("Introduce el descuento aplicado(en porcentaje): ");
        double descuento = scanner.nextDouble();
        descuento = descuento / 100;
        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("Precio final: " + precioFinal);

        }
     static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
}
