// Clase base Vehiculo con encapsulamiento
class Vehiculo {
    // Atributos privados (encapsulamiento)
    private String marca;
    private String modelo;
    private int anio;
    private String color;    

    // Constructor de la clase base Vehiculo
    public Vehiculo(String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;        
    }

    // Getters y setters para acceder a los atributos encapsulados
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    

    // Método para encender el vehículo
    public void encender() {
        System.out.println("Encendiendo el vehículo...");
    }

    // Método para apagar el vehículo
    public void apagar() {
        System.out.println("Apagando el vehículo...");
    }

    // Método polimórfico para conducir, que será sobreescrito por las clases hijas
    public void conducir() {
        System.out.println("Conduciendo un vehículo.");
    }

    // Método para mostrar la información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Color: " + color);        
    }
}

// Clase Coche que hereda de Vehiculo
class Coche extends Vehiculo {
    // Constructor de Coche que llama al constructor de Vehiculo
    public Coche(String marca, String modelo, int anio, String color) {
        super(marca, modelo, anio, color);
    }

    // Sobreescribir el método conducir (polimorfismo)
    @Override
    public void conducir() {
        System.out.println("Conduciendo un coche.");
    }

    // Método específico del coche
    public void tocarBocina() {
        System.out.println("Bip Bip! El coche está tocando la bocina.");
    }
}

// Clase Moto que hereda de Vehiculo
class Moto extends Vehiculo {
    // Constructor de Moto que llama al constructor de Vehiculo
    public Moto(String marca, String modelo, int anio, String color) {
        super(marca, modelo, anio, color);
    }

    // Sobreescribir el método conducir (polimorfismo)
    @Override
    public void conducir() {
        System.out.println("Conduciendo una moto.");
    }

    // Método específico de la moto
    public void hacerCaballito() {
        System.out.println("La moto está haciendo un caballito.");
    }
}

// Clase principal para probar el polimorfismo y herencia
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Coche
        Vehiculo miCoche = new Coche("Toyota", "Corolla", 2020, "Rojo");

        // Crear un objeto de tipo Moto
        Vehiculo miMoto = new Moto("Honda", "CBR", 2021, "Negra");

        // Polimorfismo: ambos objetos son Vehiculo, pero llaman a métodos específicos
        System.out.println("Información del coche:");
        miCoche.mostrarInformacion();
        miCoche.encender();
        miCoche.conducir();  // Llamará al método conducir de Coche

        System.out.println("\nInformación de la moto:");
        miMoto.mostrarInformacion();
        miMoto.encender();
        miMoto.conducir();  // Llamará al método conducir de Moto

        // Para llamar métodos específicos de cada clase, se usa casting
        Coche coche = (Coche) miCoche;
        coche.tocarBocina();

        Moto moto = (Moto) miMoto;
        moto.hacerCaballito();
    }
}
