import java.util.Scanner;

public class GestionClientes {

    // Función para enviar facturas a clientes con montos mayores a $500
    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas pendientes mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i] + " tiene una factura pendiente de $" + facturasPendientes[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arreglo con los nombres de los clientes
        String[] clientes = {"Juan", "Ana", "Luis", "María", "Pedro"};
        // Arreglo para almacenar las facturas pendientes de cada cliente
        double[] facturasPendientes = new double[clientes.length];

        // Solicitar al usuario que ingrese el monto de las facturas pendientes
        for (int i = 0; i < clientes.length; i++) {
            System.out.print("Ingrese el monto de la factura pendiente para " + clientes[i] + ": ");
            facturasPendientes[i] = scanner.nextDouble();
        }

        // Llamar a la función para enviar facturas
        enviarFacturas(clientes, facturasPendientes);
    }
}
