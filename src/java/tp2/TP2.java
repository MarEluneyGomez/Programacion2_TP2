/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;
import java.util.Scanner;
/**
 *
 * @author elune
 */
public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el año: ");
        int anio = scanner.nextInt();

        
        if (anio % 400 == 0) {
                System.out.println("Es un año bisiesto");
            }
        else if (anio % 100 == 0){
            System.out.println("No es un año bisiesto");
            }
        else if (anio % 4 == 0){
            System.out.println("Es un año bisisesto");
        }
        else{
            System.out.println("No es año bisisesto");
        }
    }
    
    
}

