\# Aula 27 - Estruturas de Repetição



Nesta aula foram estudadas as principais estruturas de repetição do Java:



\- `while`

\- `do while`

\- `for`



Essas estruturas permitem executar um determinado bloco de código várias vezes enquanto uma condição for verdadeira.



\---



\## 1. While



O `while` executa um bloco de código enquanto uma condição for verdadeira.



\### Código



```java

int contadorWhile = 0;



while (contadorWhile <= 5) {

&#x20;   System.out.println(contadorWhile);

&#x20;   contadorWhile++;

}



Saída

0

1

2

3

4

5

Como funciona



A condição é verificada antes de cada execução.



Enquanto:



contadorWhile <= 5



for verdadeira, o código continuará sendo executado.



O contadorWhile++ aumenta o valor da variável em 1 a cada repetição.



2\. Do While



O do while é parecido com o while, porém o bloco de código é executado primeiro e a condição é verificada depois.



Código

int contadorDoWhile = 5;



do {

&#x20;   System.out.println(contadorDoWhile);

&#x20;   contadorDoWhile--;

} while (contadorDoWhile >= 0);

Saída

5

4

3

2

1

0

Como funciona



O código dentro do do será executado pelo menos uma vez.



Neste exemplo:



contadorDoWhile--;



diminui o valor da variável em 1 a cada repetição.



3\. For



O for é uma estrutura de repetição muito utilizada quando sabemos a lógica de inicialização, condição e incremento.



Código

for (int contadorFor = 1; contadorFor <= 10; contadorFor++) {

&#x20;   System.out.println(contadorFor);

}

Saída

1

2

3

4

5

6

7

8

9

10

Estrutura do for

for (inicialização; condição; incremento) {

&#x20;   // código

}



Neste exemplo:



int contadorFor = 1;



Inicializa o contador.



contadorFor <= 10;



Define a condição para continuar a repetição.



contadorFor++;



Aumenta o contador em 1 após cada repetição.



Comparação entre os laços

While

while (condição) {

&#x20;   // código

}



A condição é verificada antes da execução.



Do While

do {

&#x20;   // código

} while (condição);



O código é executado primeiro e a condição é verificada depois.



For

for (inicialização; condição; incremento) {

&#x20;   // código

}



É bastante utilizado quando temos um contador e uma quantidade ou condição clara de repetições.



Código completo

public class Main {



&#x20;   public static void main(String\[] args) {



&#x20;       // WHILE

&#x20;       System.out.println("===== WHILE =====");



&#x20;       int contadorWhile = 0;



&#x20;       while (contadorWhile <= 5) {

&#x20;           System.out.println(contadorWhile);

&#x20;           contadorWhile++;

&#x20;       }



&#x20;       // DO WHILE

&#x20;       System.out.println("\\n===== DO WHILE =====");



&#x20;       int contadorDoWhile = 5;



&#x20;       do {

&#x20;           System.out.println(contadorDoWhile);

&#x20;           contadorDoWhile--;

&#x20;       } while (contadorDoWhile >= 0);



&#x20;       // FOR

&#x20;       System.out.println("\\n===== FOR =====");



&#x20;       for (int contadorFor = 1; contadorFor <= 10; contadorFor++) {

&#x20;           System.out.println(contadorFor);

&#x20;       }

&#x20;   }

}

Saída completa

===== WHILE =====

0

1

2

3

4

5



===== DO WHILE =====

5

4

3

2

1

0



===== FOR =====

1

2

3

4

5

6

7

8

9

10

Conceitos aprendidos

Estruturas de repetição

while

do while

for

Contadores

Incremento com ++

Decremento com --

Condições de repetição

Diferença entre while e do while

Estrutura do for

Compilação com javac

