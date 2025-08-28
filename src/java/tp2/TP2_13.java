/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;


public class TP2_13 {


    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);
        
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }

    // Función recursiva para mostrar precios
    static void mostrarPreciosRecursivo(double[] array, int indice) {
        if (indice >= array.length) return;
        System.out.println("Precio: $" + array[indice]);
        mostrarPreciosRecursivo(array, indice + 1);
    }
}

    


