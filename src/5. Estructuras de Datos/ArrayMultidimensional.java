public class ArrayMultidimensional {
    public static void main(String[] args) {
        // Definir y asignar valores a un array multidimensional
        int[][][] arrayMultidimensional = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        // Imprimir los valores según su índice
        System.out.println("Array multidimensional:");
        System.out.println("Array 1 Fila 1 Columna 1: " + arrayMultidimensional[0][0][0]);
        System.out.println("Array 1 Fila 1 Columna 2: " + arrayMultidimensional[0][0][1]);
        System.out.println("Array 1 Fila 1 Columna 3: " + arrayMultidimensional[0][0][2]);
        System.out.println("------------------------------");
        System.out.println("Array 1 Fila 2 Columna 1: " + arrayMultidimensional[0][1][0]);
        System.out.println("Array 1 Fila 2 Columna 2: " + arrayMultidimensional[0][1][1]);
        System.out.println("Array 1 Fila 2 Columna 3: " + arrayMultidimensional[0][1][2]);
        System.out.println("------------------------------------------------------------");
        System.out.println("Array 2 Fila 1 Columna 1: " + arrayMultidimensional[1][0][0]);
        System.out.println("Array 2 Fila 1 Columna 2: " + arrayMultidimensional[1][0][1]);
        System.out.println("Array 2 Fila 1 Columna 3: " + arrayMultidimensional[1][0][2]);
        System.out.println("------------------------------");
        System.out.println("Array 2 Fila 2 Columna 1: " + arrayMultidimensional[1][1][0]);
        System.out.println("Array 2 Fila 2 Columna 2: " + arrayMultidimensional[1][1][1]);
        System.out.println("Array 2 Fila 2 Columna 3: " + arrayMultidimensional[1][1][2]);


    }    
}
