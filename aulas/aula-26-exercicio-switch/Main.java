public class Main{
    public static void main(String[] args){
        int dia = 1;

        switch (dia) {

            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            case 8:
                System.out.println("Valor invalido");
                break;
        }
         if (dia ==  2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ) {
            System.out.println("Dia de semana");} else if (dia == 1 || dia == 7){
                System.out.println("Final de semana");
            }

    }
}