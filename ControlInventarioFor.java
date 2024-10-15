import java.util.Scanner;

public class ControlInventarioFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el número de productos: ");
        int numProductos = scanner.nextInt();


        for (int i = 1; i <= numProductos; i++) {
            System.out.print("Ingrese la cantidad disponible del producto " + i + ": ");
            int cantidad = scanner.nextInt();


            if (cantidad < 5) {
                System.out.println("El producto " + i + " necesita realizar un pedido.");
            }
        }
    }
}
