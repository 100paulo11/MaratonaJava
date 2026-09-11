public class Main {

    public static void main(String[] args) {

        int idade = 24;
        boolean possuiCarteira = true;

        // Operador AND (&&)
        boolean podeDirigir = idade >= 18 && possuiCarteira;

        // Operador OR (||)
        boolean podeEntrar = idade >= 18 || possuiCarteira;

        // Operador NOT (!)
        boolean naoPossuiCarteira = !possuiCarteira;

        System.out.println("Idade: " + idade);
        System.out.println("Possui carteira: " + possuiCarteira);

        System.out.println("Pode dirigir? " + podeDirigir);
        System.out.println("Pode entrar? " + podeEntrar);
        System.out.println("Não possui carteira? " + naoPossuiCarteira);
    }
}