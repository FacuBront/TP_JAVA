import java.util.Scanner;

public class RegistroVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalVentas = 0;
        int dia = 1;

        // Bucle while para registrar las ventas durante 7 días
        while (dia <= 7) {
            System.out.print("Ingrese las ventas del día " + dia + ": ");
            double ventas = scanner.nextDouble();
            totalVentas += ventas;
            dia++;
        }

        // Mostrar el total de ventas de la semana
        System.out.println("Total de ventas de la semana: $" + totalVentas);
    }
}
