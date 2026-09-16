public class Main {
    public static void main(String[] args) {

        int opc = 2;

        switch (opc) {
            case 1:
                System.out.println("cadastrar usuario");
                break;

            case 2:
                System.out.println("Listar usuarios");
                break;

            case 3:
                System.out.println("Excluir usuario");
                break;

            case 4:
                System.out.println("Sair");
                break;

            default:
                System.out.println("Escolha uma opção de 1 a 4");
        }

        int cont = 0;

        while (cont <= 10) {
            System.out.println("O contador esta em " + cont);
            cont++;
        }

        int cont2 = 20;

        do {
            System.out.println("contador regressivo em " + cont2);
            cont2--;
        } while (cont2 >= 0);

        int c = 0;

        for (c = 0; c <= 20; c += 2) {
            System.out.println("Contagem: " + c);
        }
    }
}