public class Main {

    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println("=== AND (&&) ===");
        System.out.println(verdadeiro && verdadeiro);
        System.out.println(verdadeiro && falso);
        System.out.println(falso && verdadeiro);
        System.out.println(falso && falso);

        System.out.println();

        System.out.println("=== OR (||) ===");
        System.out.println(verdadeiro || verdadeiro);
        System.out.println(verdadeiro || falso);
        System.out.println(falso || verdadeiro);
        System.out.println(falso || falso);

        System.out.println();

        System.out.println("=== NOT (!) ===");
        System.out.println(!verdadeiro);
        System.out.println(!falso);
    }
}