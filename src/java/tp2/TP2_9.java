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
public class TP2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        
        System.out.print("Introduce el peso del paquete: ");
        double pesoPaquete = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Introduce la zona de envio (Nacional/Internacional): ");
        String zonaEnvio = scanner.nextLine();
        
        double costoEnvio = calcularCostoEnvio(pesoPaquete, zonaEnvio);
        double totalCompra = calcularCompraTotal(precioProducto, costoEnvio);
        
        System.out.println("El costo del envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
        }
    static double calcularCostoEnvio(double peso, String zona){
        double costo;
        if (zona.equalsIgnoreCase("Nacional")){
            costo = 5;
        }
        else if(zona.equalsIgnoreCase("Internacional")){
            costo = 10;
        }
        else{
            costo = 0;
        }
        
        return costo * peso;   
    }
    static double calcularCompraTotal(double precioProducto, double costoEnvio){
        double costoTotal = costoEnvio + precioProducto; 
        return costoTotal;
    }
        

}
