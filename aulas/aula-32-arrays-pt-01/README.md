\# Aula 32 - Arrays pt. 01



\## Conteúdo



Nesta aula foi apresentada a estrutura de dados `array` em Java.



Arrays são utilizados para armazenar vários valores do mesmo tipo dentro de uma única variável.



\## O que é um Array?



Um array permite armazenar diversos valores do mesmo tipo.



Por exemplo:



```java

int\[] numeros = new int\[5];

```



Nesse caso, foi criado um array chamado `numeros` capaz de armazenar 5 valores do tipo `int`.



\## Índices



Os elementos de um array são acessados através de índices.



Em Java, o primeiro índice sempre começa em `0`.



Exemplo:



```text

Índice:   0    1    2    3    4

&#x20;         ↓    ↓    ↓    ↓    ↓

Array:   \[10] \[20] \[30] \[40] \[50]

```



Portanto:



```java

numeros\[0]

```



acessa o primeiro elemento.



```java

numeros\[4]

```



acessa o quinto e último elemento.



\## Criando e preenchendo um Array



Podemos criar um array e atribuir os valores individualmente:



```java

int\[] numeros = new int\[5];



numeros\[0] = 10;

numeros\[1] = 20;

numeros\[2] = 30;

numeros\[3] = 40;

numeros\[4] = 50;

```



Também podemos inicializar o array diretamente:



```java

int\[] numeros = {10, 20, 30, 40, 50};

```



\## Tamanho do Array



Ao utilizar:



```java

int\[] numeros = new int\[5];

```



o array possui 5 posições.



Os índices serão:



```text

0, 1, 2, 3 e 4

```



O índice `5` não existe nesse array.



\## Conceitos aprendidos



\* O que são arrays

\* Declaração de arrays

\* Criação de arrays

\* Índices

\* Acesso aos elementos de um array

\* Inicialização de arrays

\* Relação entre tamanho e índices



