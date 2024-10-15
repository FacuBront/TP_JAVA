import java.util.Scanner;

public class Inventario {

    // Función para generar el reporte de productos con bajo stock
    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("Productos con menos de 5 unidades en stock:");
        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                System.out.println(productos[i] + " tiene " + stocks[i] + " unidades.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arreglo con los nombres de los productos
        String[] productos = {"Laptop", "Mouse", "Teclado", "Monitor", "Impresora"};
        // Arreglo para almacenar las cantidades de stock que ingresará el usuario
        int[] stocks = new int[productos.length];

        // Solicitar al usuario que ingrese el stock para cada producto
        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingrese la cantidad de stock para " + productos[i] + ": ");
            stocks[i] = scanner.nextInt();
        }

        // Llamar a la función para generar el reporte de productos con bajo stock
        generarReporteBajoStock(productos, stocks);
    }
}
