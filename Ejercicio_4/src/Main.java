import java.util.Scanner;

public class Main {

    // Función para calcular el gasto en arriendo
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.4;
    }

    // Función para calcular el gasto en comida
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo de Pedro: ");
        double sueldo = scanner.nextDouble();

        // Calcular los gastos en arriendo y comida utilizando las funciones respectivas
        double gastoArriendo = calcularGastoArriendo(sueldo);
        double gastoComida = calcularGastoComida(sueldo);

        // Calcular el dinero restante después de los gastos
        double dineroRestante = sueldo - gastoArriendo - gastoComida;

        // Mostrar los resultados
        System.out.println("Gasto en arriendo: " + gastoArriendo);
        System.out.println("Gasto en comida: " + gastoComida);
        System.out.println("Dinero restante: " + dineroRestante);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
