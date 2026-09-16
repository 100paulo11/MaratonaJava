public class Exercicio5 {
    public static void main(String[] args) {

        int opc = 2;

        switch (opc) {

            case 1:
                int i = 0;

                for (i = 1; i <= 5; i++) {
                    System.out.println("usando o for podemos contar até: " + i);
                }
                break;

            case 2:
                i = 5;

                while (i > 0) {
                    System.out.println("Contagem regressiva com while: " + i);
                    i--;
                }
                break;

            case 3:
                i = 0;

                do {
                    System.out.println("do while com switch: " + i);
                    i += 2;
                } while (i <= 10);
                break;

            case 4:
                System.out.println("Saindo do loop...");
                break;

            default:
                System.out.println("Opção inválida. Escolha de 1 a 4 para realizar a ação.");
                break;
        }
    }
}
