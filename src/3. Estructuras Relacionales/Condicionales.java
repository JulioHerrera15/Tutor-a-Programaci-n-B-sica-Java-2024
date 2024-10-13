public class Condicionales {
    public static void main(String[] args) {
        int numero = 10;

        // if-else
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo o cero");
        }

        // switch
        int dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            default:
                System.out.println("Otro día");
        }
    }

}
