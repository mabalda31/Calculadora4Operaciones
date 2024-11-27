/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora4operaciones;

/**
 *
 * @author alejo
 */
import java.util.Scanner;
public class Calculadora4Operaciones {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            double num1, num2, resultado;
            do {
                System.out.println("===== CALCULADORA =====");
                System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                
                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Ingrese el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = scanner.nextDouble();
                    
                    resultado = switch (opcion) {
                        case 1 -> num1 + num2;
                        case 2 -> num1 - num2;
                        case 3 -> num1 * num2;
                        case 4 -> (num2 != 0) ? num1 / num2 : Double.NaN; // Verifica división por cero
                        default -> 0;
                    };
                    
                    if (opcion == 4 && num2 == 0)
                        System.out.println("Error: No se puede dividir por cero.");
                    else
                        System.out.println("El resultado es: " + resultado);
                } else if (opcion != 5) {
                    System.out.println("Opción no válida.");
                }
                
                System.out.println(); 
            } while (opcion != 5);
            System.out.println("Saliendo del programa...");
        }
    }
}
