public class Main {

    public static void main(String[] args) {

        int numero = 10;

        System.out.println("Valor inicial: " + numero);

        numero += 5;
        System.out.println("Depois do += 5: " + numero);

        numero -= 3;
        System.out.println("Depois do -= 3: " + numero);

        numero *= 2;
        System.out.println("Depois do *= 2: " + numero);

        numero /= 4;
        System.out.println("Depois do /= 4: " + numero);

        numero %= 3;
        System.out.println("Depois do %= 3: " + numero);
    }
}