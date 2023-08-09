import java.util.Scanner;

public class Main {

    // Función estática para calcular el número de autobuses necesarios
    public static int calculateBusesNeeded(int totalSillas, int estudiantesGordos, int estudiantesFlacos) {
        // Cada estudiante gordo ocupa 2 sillas y cada estudiante flaco ocupa 1 silla
        int totalSillasOcupadas = estudiantesGordos * 2 + estudiantesFlacos;

        // Calcular el número de autobuses necesarios
        int busesNecesarios = (int) Math.ceil((double) totalSillasOcupadas / totalSillas);

        return busesNecesarios;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número total de sillas en un bus: ");
        int totalSillas = scanner.nextInt();

        System.out.print("Ingrese el número de estudiantes gordos: ");
        int estudiantesGordos = scanner.nextInt();

        System.out.print("Ingrese el número de estudiantes flacos: ");
        int estudiantesFlacos = scanner.nextInt();

        // Calcular el número de autobuses necesarios utilizando la función calculateBusesNeeded
        int busesNecesarios = calculateBusesNeeded(totalSillas, estudiantesGordos, estudiantesFlacos);

        // Imprimir el resultado
        System.out.println("Se necesitan " + busesNecesarios + " buses para llevar a todos los estudiantes al paseo.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
