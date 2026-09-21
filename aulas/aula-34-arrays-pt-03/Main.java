public class Main {
    public static void main(String[] args) {

        int[] numeros = {5, 10, 15, 20, 25};

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * 2;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}