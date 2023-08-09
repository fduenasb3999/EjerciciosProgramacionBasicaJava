import java.util.Scanner;

public class Main {

    // Función para calcular la distancia entre dos puntos
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

    // Función para calcular la pendiente de la recta entre dos puntos
    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la coordenada x del primer punto: ");
        double x1 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada y del primer punto: ");
        double y1 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada x del segundo punto: ");
        double x2 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada y del segundo punto: ");
        double y2 = scanner.nextDouble();

        // Calcular la distancia entre los puntos utilizando la función calcularDistancia
        double distancia = calcularDistancia(x1, y1, x2, y2);

        // Calcular la pendiente de la recta utilizando la función calcularPendiente
        double pendiente = calcularPendiente(x1, y1, x2, y2);

        // Mostrar los resultados
        System.out.println("Distancia entre los puntos: " + distancia);
        System.out.println("Pendiente de la recta: " + pendiente);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
