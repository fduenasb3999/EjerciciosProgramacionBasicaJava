import java.util.Scanner;

public class Main {

    // Función para calcular el número de salones del nuevo edificio
    public static int calcularNumeroSalones(int numeroEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    // Función para calcular el número de pisos del nuevo edificio
    public static int calcularNumeroPisos(int numeroSalones, int salonesPorPiso) {
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes de la universidad: ");
        int numeroEstudiantes = scanner.nextInt();

        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();

        System.out.print("Ingrese el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();

        // Calcular el número de salones utilizando la función calcularNumeroSalones
        int numeroSalones = calcularNumeroSalones(numeroEstudiantes, capacidadSalon);

        // Calcular el número de pisos utilizando la función calcularNumeroPisos
        int numeroPisos = calcularNumeroPisos(numeroSalones, salonesPorPiso);

        // Mostrar los resultados
        System.out.println("Número de salones en el edificio: " + numeroSalones);
        System.out.println("Número de pisos en el edificio: " + numeroPisos);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
