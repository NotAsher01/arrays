public class ej13 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 4, 6, 8, 9};
        int sumanum=5 ;
        int sumar;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i +1; j < numeros.length; j++) {
                sumar = numeros[j] + numeros[i];
                if(sumar == sumanum){
                    System.out.println(numeros[i] + "+" + numeros[j] + "=" + sumanum);
                    break;
                }
            }
        }
    }
}
