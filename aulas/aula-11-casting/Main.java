public class Main {

    public static void main(String[] args) {

        // Casting implícito
        int numeroInteiro = 10;
        double numeroDecimal = numeroInteiro;

        System.out.println("Casting implícito:");
        System.out.println("int: " + numeroInteiro);
        System.out.println("double: " + numeroDecimal);

        // Casting explícito
        double valorDecimal = 10.5;
        int valorInteiro = (int) valorDecimal;

        System.out.println();
        System.out.println("Casting explícito:");
        System.out.println("double: " + valorDecimal);
        System.out.println("int: " + valorInteiro);

        // Outro exemplo
        double outroValor = 99.99;
        int outroNumero = (int) outroValor;

        System.out.println();
        System.out.println("Outro exemplo:");
        System.out.println("double: " + outroValor);
        System.out.println("int: " + outroNumero);
    }
}