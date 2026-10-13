public class ej4 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma= 0;
        for (int i = 0; i < numeros.length; i++){
            suma = suma + numeros[i];
        }
        System.out.println("La media es " + (suma/numeros.length));
    }
}
