import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de empleados: ");
        int empleados = scanner.nextInt();
        double salarioPorHora = 15.0;
        int contador = 1;

        while (contador <= empleados) {
            System.out.print("Ingresa las horas trabajadas por el empleado " + contador + ": ");
            int horasTrabajadas = scanner.nextInt();
            double salarioSemanal = horasTrabajadas * salarioPorHora;
            System.out.println("El salario semanal del empleado " + contador + " es: $" + salarioSemanal);
            contador++;
        }
    }
}
