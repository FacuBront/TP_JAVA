//Ejercicio 1: Cálculo de ingresos mensuales
  //      Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una función que use un bucle para calcular los ingresos totales mensuales.
//
  ////    - Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
      //  - Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
       // - Imprime el total de ingresos mensuales.




import java.util.Scanner;

public class CalculoIngresosMensuales {

    // Función para calcular los ingresos mensuales
    public static double calcularIngresosMensuales(double[] ventas) {
        double totalIngresos = 0;
        // Bucle para sumar las ventas diarias
        for (int i = 0; i < ventas.length; i++) {
            totalIngresos += ventas[i];
        }
        return totalIngresos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] ventas = new double[30];  // Arreglo para almacenar las ventas diarias

        // Pedir al usuario que ingrese las ventas diarias
        System.out.println("Ingrese las ventas diarias para 30 días:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
        }

        // Llamada a la función para calcular los ingresos mensuales
        double totalIngresosMensuales = calcularIngresosMensuales(ventas);

        // Imprimir el total de ingresos mensuales
        System.out.println("El total de ingresos mensuales es: $" + totalIngresosMensuales);
    }
}

