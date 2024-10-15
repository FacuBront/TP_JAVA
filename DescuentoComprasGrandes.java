import java.util.Scanner;

public class DescuentoComprasGrandes {

    // Función para aplicar el descuento a una compra
    public static double aplicarDescuento(double compra) {
        final double TASA_DESCUENTO = 0.15; // Tasa de descuento del 15%
        if (compra > 500) {
            return compra * (1 - TASA_DESCUENTO); // Aplicar el descuento
        } else {
            return compra; // No se aplica descuento
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el tamaño del arreglo
        System.out.print("Ingrese el número de compras: ");
        int tamaño = scanner.nextInt();
        double[] compras = new double[tamaño];

        // Solicitar al usuario que ingrese los montos de las compras
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el monto de la compra " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
        }

        // Mostrar el monto final de cada compra después de aplicar el descuento
        System.out.println("\nMontos finales después de aplicar descuentos:");
        for (int i = 0; i < tamaño; i++) {
            double montoFinal = aplicarDescuento(compras[i]);
            System.out.println("Compra " + (i + 1) + ": $" + compras[i] + " - Monto final: $" + montoFinal);
        }
    }
}

