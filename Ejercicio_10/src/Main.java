import java.util.Scanner;

public class Main {

    // Función para realizar operaciones aritméticas
    public static double realizarOperacion(double numero1, double numero2, String operador) {
        double resultado = 0.0;

        switch (operador) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            case "%":
                if (numero2 != 0) {
                    resultado = numero1 % numero2;
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            case "**":
                resultado = Math.pow(numero1, numero2);
                break;
            default:
                System.out.println("Operador inválido.");
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el operador aritmético (+, -, *, /, %, **): ");
        String operador = scanner.next();

        // Utilizar la función realizarOperacion para obtener el resultado
        double resultado = realizarOperacion(numero1, numero2, operador);

        // Mostrar el resultado
        System.out.println("El resultado es: " + resultado);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
