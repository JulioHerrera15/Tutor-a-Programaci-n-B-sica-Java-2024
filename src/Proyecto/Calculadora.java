package Proyecto;

import java.util.Scanner;

public class Calculadora {

    // Función para sumar dos números
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Función para restar dos números
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Función para multiplicar dos números
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Función para dividir dos números
    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            return Double.NaN;  // Devuelve "No es un número" en caso de error
        }
    }

    // Función para mostrar los resultados almacenados en el array
    public static void mostrarResultados(double[] resultados, int contador) {
        System.out.println("\nResultados almacenados:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Resultado " + (i + 1) + ": " + resultados[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        

        while (true) {
            System.out.println("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("Seleccione la operación (1. Suma, 2. Resta, 3. Multiplicación, 4. División) o 'q' para salir: ");
            int  operacion = scanner.nextInt();

            if (operacion == 'q') {
                break;  // Sale del bucle si el usuario elige 'q'
            }

            double resultado = 0;
            boolean operacionValida = true;

            // Usamos las funciones en vez de operadores dentro de los condicionales
            switch (operacion) {
                case 1:
                    resultado = sumar(num1, num2);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    if (Double.isNaN(resultado)) {  // Si ocurrió error en división
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Operación no válida.");
                    operacionValida = false;
            }

            // Si la operación fue válida, almacenamos el resultado
            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);                
            }
        }        

        scanner.close();
    }
}
