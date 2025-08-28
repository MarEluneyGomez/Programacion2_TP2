/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

public class TP2_12 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for(double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        // Modificar un precio específico (ejemplo: índice 2)
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        for(double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
