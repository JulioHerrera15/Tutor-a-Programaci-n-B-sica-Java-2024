public class FuncionesConRetorno {
    public static void main(String[] args) {
        // Llamada a una función con retorno
        int resultado = sumar(10, 5);
        System.out.println("La suma es: " + resultado);
    }

    // Función con retorno
    public static int sumar(int a, int b) {
        return a + b;
    }
}
