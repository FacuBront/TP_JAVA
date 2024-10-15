import java.util.Scanner;

public class PromedioSatisfaccion {

    // Función para calcular el promedio de satisfacción
    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion; // Sumar las calificaciones
        }
        return (double) suma / calificaciones.length; // Calcular el promedio
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el tamaño del arreglo
        System.out.print("Ingrese el número de calificaciones: ");
        int tamaño = scanner.nextInt();
        int[] calificaciones = new int[tamaño];

        // Solicitar al usuario que ingrese las calificaciones
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese la calificación del cliente " + (i + 1) + " (1 a 5): ");
            calificaciones[i] = scanner.nextInt();
            // Validar que la calificación esté ent
        }
        // Calcular y mostrar el promedio de satisfacción
        double promedio = calcularPromedioSatisfaccion(calificaciones);
        System.out.println("El promedio de satisfacción de los clientes es: " + promedio);
    }
}