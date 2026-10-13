public class ej9 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int par = 0;
        int impar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0){
                par = par +1;
            }
            else {
                impar = impar +1;
            }
        }
        System.out.println("Hay " + par + " pares");
        System.out.println("Hay " + impar + " impares");
    }
}
