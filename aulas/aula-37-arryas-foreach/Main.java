public class Main {
    public static void main(String[] args) {

        int[][] numeros = {
                {3, 6, 9},
                {12, 15, 18},
                {21, 24, 27}
        };

        for (int[] linha : numeros) {

            for (int numero : linha) {
                System.out.println(numero);
            }

        }
    }
}