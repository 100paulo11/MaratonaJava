\# Aula 17 - Precedência de Operadores



\## Objetivo



Aprender a ordem de prioridade que o Java utiliza ao realizar operações em uma expressão.



\---



\## O que é precedência de operadores?



Quando temos várias operações em uma mesma expressão, o Java precisa saber qual operação deve ser realizada primeiro.



Por exemplo:



```java

int resultado = 10 + 5 \* 2;



A multiplicação possui prioridade sobre a soma.



Então o Java faz:



5 \* 2 = 10

10 + 10 = 20



O resultado é:



20



Uso dos parênteses



Os parênteses possuem prioridade e podem alterar a ordem das operações.



Exemplo:



int resultado = (10 + 5) \* 2;



Primeiro:



10 + 5 = 15



Depois:



15 \* 2 = 30



Resultado:



30



Ordem de precedência



De forma simplificada, podemos considerar:



Parênteses

Multiplicação, divisão e resto (\*, /, %)

Soma e subtração (+, -)

Operadores relacionais

Operadores lógicos



Quando operações possuem a mesma prioridade, a avaliação normalmente acontece da esquerda para a direita.



Código utilizado

public class Main {



&#x20;   public static void main(String\[] args) {



&#x20;       int resultado1 = 10 + 5 \* 2;

&#x20;       int resultado2 = (10 + 5) \* 2;

&#x20;       int resultado3 = 20 / 2 + 5;

&#x20;       int resultado4 = 20 / (2 + 5);



&#x20;       System.out.println("10 + 5 \* 2 = " + resultado1);

&#x20;       System.out.println("(10 + 5) \* 2 = " + resultado2);

&#x20;       System.out.println("20 / 2 + 5 = " + resultado3);

&#x20;       System.out.println("20 / (2 + 5) = " + resultado4);

&#x20;   }

}

Resultado

10 + 5 \* 2 = 20

(10 + 5) \* 2 = 30

20 / 2 + 5 = 15

20 / (2 + 5) = 2

Observação sobre divisão inteira



Como as variáveis utilizadas são do tipo int, a divisão também será inteira.



Por exemplo:



20 / 7



matematicamente resulta em aproximadamente 2.857, mas em uma divisão entre int o Java descarta a parte decimal:



2





Conceitos aprendidos:



Precedência de operadores

Uso de parênteses

Prioridade entre operações

Multiplicação, divisão e resto antes de soma e subtração

Divisão inteira utilizando int

