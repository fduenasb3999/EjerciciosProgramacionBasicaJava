import java.util.Scanner;

public class Main {

    // Función para calcular el área de un rectángulo a partir de su base y altura
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Función para calcular la hipotenusa de un triángulo rectángulo a partir de sus catetos
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    // Función para calcular el área de un triángulo a partir de su base y altura
    public static double calcularAreaTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }

    // Función para calcular el perímetro del terreno a partir de los lados A, B y C
    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        double hipotenusa = calcularHipotenusa(ladoA - ladoC, ladoB);
        return ladoA + ladoB + ladoC + hipotenusa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado A del terreno: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese el lado B del terreno: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese el lado C del terreno: ");
        double ladoC = scanner.nextDouble();

        // Calcular el área del terreno utilizando las funciones
        double areaTriangulo = calcularAreaTriangulo(ladoB, ladoA - ladoC);
        double areaRectangulo = calcularAreaRectangulo(ladoB, ladoC);
        double areaTerreno = areaTriangulo + areaRectangulo;

        // Calcular el perímetro del terreno utilizando la función calcularPerimetroTerreno
        double perimetroTerreno = calcularPerimetroTerreno(ladoA, ladoB, ladoC);

        // Mostrar los resultados
        System.out.println("Área del terreno: " + areaTerreno);
        System.out.println("Perímetro del terreno: " + perimetroTerreno);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
