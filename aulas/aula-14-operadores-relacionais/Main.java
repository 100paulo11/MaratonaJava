public class Main {

    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 20;

        boolean maior = numero1 > numero2;
        boolean menor = numero1 < numero2;
        boolean maiorOuIgual = numero1 >= numero2;
        boolean menorOuIgual = numero1 <= numero2;
        boolean igual = numero1 == numero2;
        boolean diferente = numero1 != numero2;

        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);

        System.out.println("Número 1 é maior? " + maior);
        System.out.println("Número 1 é menor? " + menor);
        System.out.println("Número 1 é maior ou igual? " + maiorOuIgual);
        System.out.println("Número 1 é menor ou igual? " + menorOuIgual);
        System.out.println("Os números são iguais? " + igual);
        System.out.println("Os números são diferentes? " + diferente);
    }
}