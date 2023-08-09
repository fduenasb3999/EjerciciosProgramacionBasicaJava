import java.util.Scanner;

public class Main {
    // Función estática para calcular el valor de la función algebraica f(x, y) = x^2 + 2xy + y^2
    public static double calculateFunctionValue(double x, double y) {
        return Math.pow(x, 2) + 2 * x * y + Math.pow(y, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el valor de x
        System.out.print("Ingrese el valor de x: ");
        double x = scanner.nextDouble();

        // Solicitar al usuario que ingrese el valor de y
        System.out.print("Ingrese el valor de y: ");
        double y = scanner.nextDouble();

        // Calcular el valor de la función utilizando la función calculateFunctionValue
        double result = calculateFunctionValue(x, y);

        // Imprimir el resultado de la función
        System.out.println("f(" + x + ", " + y + ") = " + result);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}