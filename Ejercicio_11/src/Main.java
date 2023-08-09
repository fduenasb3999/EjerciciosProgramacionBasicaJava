import java.util.Scanner;

public class Main {

    // Función para obtener la cifra de las decenas de un número de dos cifras
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    // Función para obtener la cifra de las unidades de un número de dos cifras
    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    // Función para convertir un número entero de un dígito a número romano
    public static String convertirUnidadARomano(int numero) {
        String[] romanos = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return romanos[numero];
    }

    // Función para convertir un número entero de un dígito a decenas romanas
    public static String convertirDecenasARomano(int numero) {
        String[] decenasRomanas = {"","X", "XX", "XXX", "XL", "L","LX","LXX","LXXX","XC"};
        return decenasRomanas[numero];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero (entre 1 y 99): ");
        int numero = scanner.nextInt();

        if (numero > 0 && numero < 100) {
            int decenas = obtenerDecenas(numero);
            int unidades = obtenerUnidades(numero);

            String romanoDecenas = convertirDecenasARomano(decenas);
            String romanoUnidades = convertirUnidadARomano(unidades);

            System.out.println("Número romano: " + romanoDecenas + romanoUnidades);
        } else {
            System.out.println("Error: El número debe estar entre 1 y 99.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
