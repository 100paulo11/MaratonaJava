public class Main {

    public static void main(String[] args) {

        int idade = 24;

        String resultado = idade >= 18
                ? "Maior de idade"
                : "Menor de idade";

        System.out.println("Idade: " + idade);
        System.out.println("Resultado: " + resultado);

        int numero = 10;

        String parOuImpar = numero % 2 == 0
                ? "Par"
                : "Ímpar";

        System.out.println("Número: " + numero);
        System.out.println("O número é: " + parOuImpar);
    }
}