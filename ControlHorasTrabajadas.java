import java.util.Scanner;

public class ControlHorasTrabajadas {

    // Función para calcular el pago semanal
    public static double calcularPagoSemanal(double horasTrabajadas) {
        final double TARIFA_HORA = 15.0; // Tarifa por hora trabajada
        return horasTrabajadas * TARIFA_HORA; // Calcular el pago
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el tamaño del arreglo
        System.out.print("Ingrese el número de empleados: ");
        int tamaño = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        String[] empleados = new String[tamaño];
        double[] horasTrabajadas = new double[tamaño];

        // Solicitar al usuario que ingrese los nombres de los empleados y las horas trabajadas
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            empleados[i] = scanner.nextLine();
            System.out.print("Ingrese las horas trabajadas por " + empleados[i] + " en la semana: ");
            horasTrabajadas[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
        }

        // Calcular y mostrar el pago semanal para cada empleado
        System.out.println("\nPagos semanales de los empleados:");
        for (int i = 0; i < tamaño; i++) {
            double pago = calcularPagoSemanal(horasTrabajadas[i]);
            System.out.println("Empleado: " + empleados[i] + " - Horas trabajadas: " + horasTrabajadas[i] + " - Pago semanal: $" + pago);
        }
    }
}
