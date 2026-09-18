\# Aula 31 - Estruturas de Repetição pt 05 - Continue



\## Conteúdo



Nesta aula foi apresentado o comando `continue`, utilizado dentro de estruturas de repetição para interromper a execução da iteração atual e passar para a próxima iteração do loop.



\## Continue



O `continue` não encerra o loop. Ele apenas ignora o restante do código daquela iteração.



\### Exemplo



```java

for (int i = 0; i < 10; i++) {

&#x20;   if (i == 5) {

&#x20;       continue;

&#x20;   }



&#x20;   System.out.println(i);

}

```



\### Resultado



```text

0

1

2

3

4

6

7

8

9

```



Quando `i` é igual a `5`, o `continue` impede que o `System.out.println(i)` seja executado naquela iteração.



\## Continue x Break



\* `continue`: pula a iteração atual.

\* `break`: encerra o loop completamente.



\## Exemplo com números ímpares



```java

for (int i = 0; i <= 10; i++) {

&#x20;   if (i % 2 != 0) {

&#x20;       continue;

&#x20;   }



&#x20;   System.out.println(i);

}

```



Nesse exemplo, os números ímpares são ignorados e somente os números pares são exibidos.



\## Conceitos aprendidos



\* Comando `continue`

\* Controle de iterações

\* Diferença entre `continue` e `break`

\* Uso do operador `%` em conjunto com estruturas de repetição



