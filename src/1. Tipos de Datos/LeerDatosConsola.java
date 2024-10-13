import java.util.Scanner;

public class LeerDatosConsola {
    public static void main(String[] args) {
        // Crear un objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Leer un entero
        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();
        System.out.println("El número entero ingresado es: " + numeroEntero);
        
        // Leer un número decimal
        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();
        System.out.println("El número decimal ingresado es: " + numeroDecimal);
        
        // Leer una cadena
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.next();
        System.out.println("La cadena ingresada es: " + cadena);
        
        // Cerrar el objeto Scanner
        scanner.close();
        
    }
    
}
