import java.util.Scanner;

public class CalculoTiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] actividades = {"estudiar", "hacer ejercicios", "leer", "tiempo libre"};
        double totalHoras = 0;
        int i = 0;

        do {
            System.out.print("Ingresa las horas dedicadas a " + actividades[i] + ": ");
            double horas = sc.nextDouble();
            totalHoras += horas; //Significa "suma lo que está a la derecha a lo que está a la izquierda".Esta línea suma las horas ingresadas a la variable totalHoras
            i++;
        } while (i < actividades.length);

        System.out.println("El tiempo total dedicado es: " + totalHoras + " horas.");
    }
}
