public class Main {
    public static void main(String[] args){
        int[] numero = {3,7,10,14,18,21,25,30};

        for (int c = 0; c < numero.length;c++ ){
            if (numero[c] % 2 != 0){
                continue;
            }
            System.out.println("Estamos contando " + numero[c]);
        }
    }
}