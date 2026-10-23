import java.util.Arrays;
import java.util.Scanner;

public class Estacion {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] temperatura={25,31,28,32,33,29,32};
        double media = 0, suma = 0, posmax = 0, posmin = 0;
        int dia_max = 0, dia_min = 0;
        String encima_med = "";
        String[] dias = {"Lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        for (int i = 0; i < temperatura.length; i++) {
            do {
                if (temperatura[i] < -30 || temperatura[i] > 50) {
                    System.out.println("No valido, tiene que estar entre -30 y 50");

                }
            } while (temperatura[i] < -30 || temperatura[i] > 50);
        }
        //Mostrar la temperatura media de la semana con dos decimales.
        for(int h=0; h< temperatura.length; h++){
            suma = suma + temperatura[h];
        }
        media = suma / temperatura.length;

        //Mostrar la temperatura máxima y la mínima indicando en qué día se produjeron.
        for(int i = 0; i < temperatura.length; i++){
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
        System.out.printf("La temperatura media de la semana es: %.2f°C%n", media);
        System.out.println("Maxima: " + posmax + "ºC " + dias[dia_max] + " | Minima: " + posmin + "ºC " + dias[dia_min]);
        for (int j = 0; j < temperatura.length; j++) {
            if(temperatura[j]>media){
                encima_med += dias[j] + " ";
            }
        }
        System.out.println("Dias por encima de la media: " + encima_med);

        double mayorsub=0;
        double sub;
        int pos=0;
        for (int i = 0; i < temperatura.length -1; i++) {
            sub=temperatura[i] - temperatura[i +1];
            if(sub<mayorsub){
                mayorsub=sub;
            }
        }
        System.out.println("mayor subida: de " + dias[pos] + " a " + dias[pos+1] + " (+" + Math.abs(mayorsub) + ")");

        // grafica
        String RESET = "\u001B[0m";
        String AZUL = "\u001B[34m";
        String CIAN = "\u001B[36m";
        String VERDE = "\u001B[32m";
        String AMARILLO = "\u001B[33m";
        String ROJO = "\u001B[31m";
        System.out.println("\nGráfico de temperaturas:");
        for(int i = 0; i < temperatura.length; i++) {
            System.out.printf("%-12s ", dias[i]);

            String colorActual = RESET;
            if (temperatura[i] < 0) {
                colorActual = AZUL;
            } else if (temperatura[i] >= 0 && temperatura[i] <= 9) {
                colorActual = CIAN;
            } else if (temperatura[i] >= 10 && temperatura[i] <= 19) {
                colorActual = VERDE;
            } else if (temperatura[i] >= 20 && temperatura[i] <= 29) {
                colorActual = AMARILLO;
            } else if (temperatura[i] >= 30) {
                colorActual = ROJO;
            }

            System.out.print(colorActual);
            int longitudBarra = (int) Math.abs(temperatura[i]);
            for(int j = 0; j < longitudBarra; j++){
                System.out.print("█");
            }
            System.out.print(RESET);
            System.out.printf(" %.1f%n", temperatura[i]);
        }
        System.out.println("\nLeyenda: " + AZUL + "█ bajo 0  " + CIAN + "█ 0-9  " + VERDE + "█ 10-19  " + AMARILLO + "█ 20-29  " + ROJO + "█ 30 o más" + RESET + "\n");
    }
}
