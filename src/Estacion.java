import java.util.Scanner;

public class Estacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double media = 0, suma = 0, posmax = 0, posmin = 0;
        int dia_max = 0, dia_min = 0, encima_med=0;
        double[] temperatura = new double[7];
        String[] dias = {"Lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        for (int i = 0; i < temperatura.length; i++) {
            do {
                System.out.println("Dime la temperatura del dia de la semana: " + dias[i]);
                temperatura[i] = input.nextDouble();
                suma = suma + temperatura[i];
                if (temperatura[i] < -30 || temperatura[i] > 50) {
                    System.out.println("No valido, tiene que estar entre -30 y 50");

                }
            } while (temperatura[i] < -30 || temperatura[i] > 50);
            if (i == 0) {
                posmax = temperatura[0];
                posmin = temperatura[0];
            } else {
                if (temperatura[i] > posmax) {
                    posmax = temperatura[i];
                    dia_max = i;
                }
                if (temperatura[i] < posmin) {
                    posmin = temperatura[i];
                    dia_min = i;
                }

            }
        }
        media = suma / temperatura.length;
        System.out.printf("La temperatura media de la semana es: %.2f°C%n", media);
        System.out.println("La temperatura maxima es: " + posmax + "ºC y se produjo el " + dias[dia_max]);
        System.out.println("La temperatura minima es: " + posmin + "ºC y se produjo el " + dias[dia_min]);
    }

}