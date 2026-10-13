public class ej6 {
    public static void main(String[] args) {
        int[] numeros = {4,7,10,20};
        int mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < mayor){
                mayor = numeros[i];
            }
        }
        System.out.println(mayor);
    }
}
