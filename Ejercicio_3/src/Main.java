import java.util.Scanner;

public class Main {

    // Función estática para calcular la longitud de la escalera (y) usando la altura (x) y el ángulo (α) en radianes
    public static double calcularLongitudEscalera(double altura, double anguloEnRadianes) {
        double longitud = altura / Math.sin(anguloEnRadianes);
        return longitud;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura de la escalera (x): ");
        double altura = scanner.nextDouble();

        System.out.print("Ingrese el ángulo de inclinación de la escalera (α) en grados: ");
        double anguloEnGrados = scanner.nextDouble();

        // Convertir el ángulo de grados a radianes
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);

        // Calcular la longitud de la escalera utilizando la función calcularLongitudEscalera
        double longitudEscalera = calcularLongitudEscalera(altura, anguloEnRadianes);

        // Imprimir el resultado
        System.out.println("La longitud de la escalera es: " + longitudEscalera);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
