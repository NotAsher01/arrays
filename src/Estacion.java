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
        for (int i=0; i<temperatura.length; i++) {
            System.out.print(dias[i] + " ");
            for(int j=0; j<temperatura[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
