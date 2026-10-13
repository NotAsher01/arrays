public class ej8 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, -3, 4, 5, 6, 7, -8, 9, 10};
        int suma = 0;
        int negativo = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0){
                suma = suma + numeros[i];
            }
            else {
                negativo = negativo + numeros[i];
            }
        }
        System.out.println("suma = " + suma + "\n" + "resta = " + negativo );
    }
}
