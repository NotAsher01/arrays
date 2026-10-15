public class ej11 {
    public static void main(String[] args) {
        int[] numeros = {1, 1, 3, 4, 6, 6, 8, 8, 9, 10};
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] == numeros[i]) {
                    System.out.println(numeros[i] + " se repite");
                }
            }
        }
    }
}
