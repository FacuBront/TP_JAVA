import java.util.Scanner;

public class CalcularPrecioFinal {

    // Función para calcular el precio final después de aplicar el descuento
    public static double calcularPrecioFinal(double precioOriginal) {
        final double DESCUENTO = 0.10; // 10% de descuento
        return precioOriginal * (1 - DESCUENTO); // Calcular el precio final
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el tamaño del arreglo
        System.out.print("Ingrese el número de productos: ");
        int tamaño = scanner.nextInt();
        double[] preciosOriginales = new double[tamaño];

        // Solicitar al usuario que ingrese los precios originales de los productos
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el precio original del producto " + (i + 1) + ": ");
            preciosOriginales[i] = scanner.nextDouble();
        }

        // Calcular y mostrar el precio final para cada producto
        System.out.println("\nPrecios finales de los productos después del descuento:");
        for (int i = 0; i < tamaño; i++) {
            double precioFinal = calcularPrecioFinal(preciosOriginales[i]);
            System.out.printf("Producto %d - Precio original: $%.2f - Precio final: $%.2f%n",
                    (i + 1), preciosOriginales[i], precioFinal);
        }
    }
}

