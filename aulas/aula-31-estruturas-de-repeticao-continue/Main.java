public class Main{
    public static void main(String[] args){
        int numero = 0;
        
        for (numero = 0; numero <= 20; numero += 1){
            if (numero % 3 == 0) {
                continue;
            }
            System.out.println("A contagem esta em " + numero);
        }

    }
}