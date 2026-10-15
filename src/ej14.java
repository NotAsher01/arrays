import java.lang.reflect.Array;
import java.util.Arrays;

public class ej14 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 4, 6, 8, 9};
        int elm = 1;
        for (int i = elm; i < numeros.length -1; i++){
            numeros[i] = numeros[i+1];

        }
        numeros[numeros.length-1]=0;
        System.out.println(Arrays.toString(numeros));
    }
}
