import java.util.Scanner;

public class DescuentosFidelizacion {

    // Función para calcular y mostrar los descuentos
    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("Descuentos para clientes:");
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                double descuento = 0.10; // 10% de descuento
                System.out.println(clientes[i] + " tiene un descuento del " + (descuento * 100) + "% por haber realizado " + compras[i] + " compras.");
            } else {
                System.out.println(clientes[i] + " no califica para descuentos.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arreglo con los nombres de los clientes
        String[] clientes = {"Juan", "Ana", "Luis", "María", "Pedro"};
        // Arreglo para almacenar la cantidad de compras de cada cliente
        int[] compras = new int[clientes.length];

        // Solicitar al usuario que ingrese la cantidad de compras de cada cliente
        for (int i = 0; i < clientes.length; i++) {
            System.out.print("Ingrese la cantidad de compras realizadas por " + clientes[i] + ": ");
            compras[i] = scanner.nextInt();
        }

        // Llamar a la función para calcular descuentos
        calcularDescuentos(clientes, compras);
    }
}
