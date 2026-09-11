public class Main {

    public static void main(String[] args) {

        int idade = 20;
        boolean possuiIngresso = true;

        if (idade >= 18 && possuiIngresso) {
            System.out.println("Pode entrar na festa");
        } else {
            System.out.println("Não pode entrar na festa");
        }

        boolean possuiConvite = false;
        boolean estaNaLista = true;

        if (possuiConvite || estaNaLista) {
            System.out.println("Entrada liberada");
        } else {
            System.out.println("Entrada negada");
        }

        boolean bloqueado = false;

        if (!bloqueado) {
            System.out.println("Usuário está ativo");
        }
    }
}