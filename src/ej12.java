public class ej12 {
    public static void main(String[] args) {
        int[] numeros = {3, 4, 6, 8, 9, 10,13,18};
        int[] numeros2 = {1, 1, 3, 6, 8, 10, 18};
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros2.length; j++) {
                if (numeros2[j] == numeros[i]) {
                    System.out.println(numeros[i] + " se repite");
                }
            }
        }
    }
}
