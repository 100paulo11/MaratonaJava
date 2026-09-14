public class Main {

    public static void main(String[] args) {

        // WHILE
        System.out.println("===== WHILE =====");

        int contadorWhile = 0;

        while (contadorWhile <= 5) {
            System.out.println(contadorWhile);
            contadorWhile++;
        }


        // DO WHILE
        System.out.println("\n===== DO WHILE =====");

        int contadorDoWhile = 5;

        do {
            System.out.println(contadorDoWhile);
            contadorDoWhile--;
        } while (contadorDoWhile >= 0);


        // FOR
        System.out.println("\n===== FOR =====");

        for (int contadorFor = 1; contadorFor <= 10; contadorFor++) {
            System.out.println(contadorFor);
        }
    }
}