public class Main {
    public static void main(String[] args) {

        int[][] numeros = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for (int linha = 0; linha < numeros.length; linha++) {

            for (int coluna = 0; coluna < numeros[linha].length; coluna++) {

                System.out.println(numeros[linha][coluna]);
            }
        }
    }
}