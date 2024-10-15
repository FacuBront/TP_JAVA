import java.util.Scanner;

public class CalculoImpuestos {

    // Función para calcular el impuesto sobre una factura
    public static double calcularImpuesto(double factura) {
        final double TASA_IMPUESTO = 0.21; // Tasa de impuesto del 21%
        return factura * TASA_IMPUESTO; // Calcular el impuesto
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el tamaño del arreglo
        System.out.print("Ingrese el número de facturas: ");
        int tamaño = scanner.nextInt();
        double[] facturas = new double[tamaño];

        // Solicitar al usuario que ingrese los montos de las facturas
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el monto de la factura " + (i + 1) + ": ");
            facturas[i] = scanner.nextDouble();
        }

        // Mostrar el impuesto calculado para cada factura
        System.out.println("\nImpuestos calculados para cada factura:");
        for (int i = 0; i < tamaño; i++) {
            double impuesto = calcularImpuesto(facturas[i]);
            System.out.println("Factura " + (i + 1) + ": $" + facturas[i] + " - Impuesto: $" + impuesto);
        }
    }
}
