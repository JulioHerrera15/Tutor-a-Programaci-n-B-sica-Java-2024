public class ArrayBidimensional {
    public static void main(String[] args) {
        // Definir y asignar valores a un array bidimensional
        int[][] arrayBidimensional = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir los valores según su indice
        System.out.println("Array bidimensional:");
        System.out.println("Fila 1 Columna 1: " + arrayBidimensional[0][0]);
        System.out.println("Fila 1 Columna 2: " + arrayBidimensional[0][1]);
        System.out.println("Fila 1 Columna 3: " + arrayBidimensional[0][2]);
        System.out.println("------------------------------");
        System.out.println("Fila 2 Columna 1: " + arrayBidimensional[1][0]);
        System.out.println("Fila 2 Columna 2: " + arrayBidimensional[1][1]);
        System.out.println("Fila 2 Columna 3: " + arrayBidimensional[1][2]);
        System.out.println("------------------------------");
        System.out.println("Fila 3 Columna 1: " + arrayBidimensional[2][0]);
        System.out.println("Fila 3 Columna 2: " + arrayBidimensional[2][1]);
        System.out.println("Fila 3 Columna 3: " + arrayBidimensional[2][2]);
    }
}
