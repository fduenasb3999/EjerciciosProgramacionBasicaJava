import java.util.Scanner;

public class Main {

    // Función para obtener el nombre del día siguiente
    public static String obtenerDiaSiguiente(String diaActual) {
        String[] diasSemana = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        int indiceDiaActual = -1;

        for (int i = 0; i < diasSemana.length; i++) {
            if (diasSemana[i].equalsIgnoreCase(diaActual)) {
                indiceDiaActual = i;
                break;
            }
        }

        if (indiceDiaActual != -1) {
            int indiceDiaSiguiente = (indiceDiaActual + 1) % diasSemana.length;
            return diasSemana[indiceDiaSiguiente];
        } else {
            return "Día no válido";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de un día: ");
        String diaActual = scanner.nextLine();

        // Utilizar la función obtenerDiaSiguiente para obtener el nombre del día siguiente
        String diaSiguiente = obtenerDiaSiguiente(diaActual);

        // Mostrar el resultado
        System.out.println("El día de mañana es: " + diaSiguiente);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
