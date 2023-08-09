import java.util.Scanner;

public class Main {

    // Función para calcular el aumento de sueldo según las condiciones establecidas
    public static double calcularAumentoSueldo(double sueldoActual) {
        if (sueldoActual <= 800000) {
            return sueldoActual * 0.10;
        } else if (sueldoActual > 800000 && sueldoActual <= 1200000) {
            return sueldoActual * 0.08;
        } else {
            return sueldoActual * 0.05;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo actual del empleado: ");
        double sueldoActual = scanner.nextDouble();

        // Utilizar la función calcularAumentoSueldo para obtener el valor del aumento
        double aumento = calcularAumentoSueldo(sueldoActual);

        // Calcular el nuevo salario sumando el sueldo actual y el aumento
        double nuevoSalario = sueldoActual + aumento;

        // Mostrar el resultado
        System.out.println("El valor del aumento es: " + aumento);
        System.out.println("El nuevo salario del empleado es: " + nuevoSalario);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
