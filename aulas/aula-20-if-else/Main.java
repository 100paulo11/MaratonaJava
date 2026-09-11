public class Main {

    public static void main(String[] args) {

        int idade = 16;

        if (idade >= 18) {
            System.out.println("Pode entrar na festa");
        } else {
            System.out.println("Não pode entrar na festa");
        }

        int numero = 7;

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

        double salario = 2500;

        if (salario >= 3000) {
            System.out.println("Salário acima ou igual a R$ 3.000");
        } else {
            System.out.println("Salário abaixo de R$ 3.000");
        }
    }
}