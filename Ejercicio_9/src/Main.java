import java.util.Scanner;

public class Main {

    // Función para encontrar el mayor número entre dos enteros
    public static int encontrarMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Utilizar la función encontrarMayor para obtener el mayor número
        int mayorNumero = encontrarMayor(numero1, numero2);

        // Mostrar el resultado
        System.out.println("El mayor número es: " + mayorNumero);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
