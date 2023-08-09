import java.util.Scanner;

public class Main {

    // Función para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Función para calcular el área de la corona circular
    public static double calcularAreaCorona(double radioGrande, double radioPequeno) {
        double areaCirculoGrande = calcularAreaCirculo(radioGrande);
        double areaCirculoPequeno = calcularAreaCirculo(radioPequeno);
        return areaCirculoGrande - areaCirculoPequeno;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio grande (R): ");
        double radioGrande = scanner.nextDouble();

        System.out.print("Ingrese el radio pequeño (r): ");
        double radioPequeno = scanner.nextDouble();

        // Calcular el área de la corona circular utilizando la función calcularAreaCorona
        double areaCorona = calcularAreaCorona(radioGrande, radioPequeno);

        // Mostrar el resultado del área de la corona circular
        System.out.println("El área de la corona circular es: " + areaCorona);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
