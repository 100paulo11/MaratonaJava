📚 Aula 26 — Exercício com switch e Operadores Lógicos

🎯 Objetivo



Praticar a estrutura de decisão switch junto com os operadores lógicos || e as estruturas condicionais if e else if.



Neste exercício, o programa recebe um número representando um dia da semana, identifica o dia correspondente e informa se é um dia de semana ou final de semana.



📅 Representação dos dias



Neste exercício, definimos a seguinte relação:



1 → Domingo

2 → Segunda-feira

3 → Terça-feira

4 → Quarta-feira

5 → Quinta-feira

6 → Sexta-feira

7 → Sábado



Essa relação foi definida através dos case dentro do switch.



🔀 Utilizando switch



O switch verifica o valor armazenado na variável dia e procura o case correspondente.



Exemplo:



int dia = 1;



switch (dia) {



&#x20;   case 1:

&#x20;       System.out.println("Domingo");

&#x20;       break;



&#x20;   case 2:

&#x20;       System.out.println("Segunda-feira");

&#x20;       break;



&#x20;   case 3:

&#x20;       System.out.println("Terça-feira");

&#x20;       break;



&#x20;   case 4:

&#x20;       System.out.println("Quarta-feira");

&#x20;       break;



&#x20;   case 5:

&#x20;       System.out.println("Quinta-feira");

&#x20;       break;



&#x20;   case 6:

&#x20;       System.out.println("Sexta-feira");

&#x20;       break;



&#x20;   case 7:

&#x20;       System.out.println("Sábado");

&#x20;       break;



&#x20;   case 8:

&#x20;       System.out.println("Valor invalido");

&#x20;       break;

}



Como:



int dia = 1;



o programa encontra:



case 1:



e imprime:



Domingo

🧠 Verificando o dia da semana



Depois do switch, utilizamos uma estrutura if para verificar se o número representa um dia de semana.



if (dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {

&#x20;   System.out.println("Dia de semana");

} else if (dia == 1 || dia == 7) {

&#x20;   System.out.println("Final de semana");

}



O operador || significa OU.



Portanto:



dia == 2 || dia == 3 || dia == 4



significa:



dia é 2 OU 3 OU 4?



Se qualquer uma dessas condições for verdadeira, o bloco será executado.



💻 Código completo

public class Main {



&#x20;   public static void main(String\[] args) {



&#x20;       int dia = 1;



&#x20;       switch (dia) {



&#x20;           case 1:

&#x20;               System.out.println("Domingo");

&#x20;               break;



&#x20;           case 2:

&#x20;               System.out.println("Segunda-feira");

&#x20;               break;



&#x20;           case 3:

&#x20;               System.out.println("Terça-feira");

&#x20;               break;



&#x20;           case 4:

&#x20;               System.out.println("Quarta-feira");

&#x20;               break;



&#x20;           case 5:

&#x20;               System.out.println("Quinta-feira");

&#x20;               break;



&#x20;           case 6:

&#x20;               System.out.println("Sexta-feira");

&#x20;               break;



&#x20;           case 7:

&#x20;               System.out.println("Sábado");

&#x20;               break;



&#x20;           case 8:

&#x20;               System.out.println("Valor invalido");

&#x20;               break;

&#x20;       }



&#x20;       if (dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {

&#x20;           System.out.println("Dia de semana");

&#x20;       } else if (dia == 1 || dia == 7) {

&#x20;           System.out.println("Final de semana");

&#x20;       }

&#x20;   }

}

▶️ Resultado



Com:



int dia = 1;



o resultado será:



Domingo

Final de semana



Se alterarmos para:



int dia = 4;



o resultado será:



Quarta-feira

Dia de semana



Se utilizarmos:



int dia = 7;



teremos:



Sábado

Final de semana

🧩 Conceitos praticados

Estrutura switch

case

break

if

else if

Operador lógico ||

Comparação com ==

Valores int

Combinação de estruturas condicionais

Identificação de dias da semana

Classificação entre dia de semana e final de semana

