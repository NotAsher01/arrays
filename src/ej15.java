import java.util.Arrays;

public class ej15 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 4, 6, 8, 9};
        int[] numeros2 = new int[numeros.length];
        int j=0;
        for (int i = numeros.length -1; i >= 0; i--) {
                numeros2[j] = numeros[i];
                j++;
        }
        System.out.print(Arrays.toString(numeros2));
    }
}