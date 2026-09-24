\# Aula 37 - Arrays Multidimensionais com foreach



\## Conteúdo



Nesta aula foi estudado como utilizar o `foreach` para percorrer arrays multidimensionais em Java.



Arrays multidimensionais podem possuir outros arrays como elementos. Por isso, ao utilizar `foreach`, podemos percorrer primeiro cada linha e depois cada elemento existente dentro daquela linha.



\### Array multidimensional



Um exemplo de array bidimensional:



```java

int\[]\[] numeros = {

&#x20;       {3, 6, 9},

&#x20;       {12, 15, 18},

&#x20;       {21, 24, 27}

};



Nesse caso, numeros possui três arrays internos:



{3, 6, 9}

{12, 15, 18}

{21, 24, 27}

Utilizando foreach



Para percorrer as linhas do array multidimensional:



for (int\[] linha : numeros) {



}



A variável linha representa o array atual que está sendo percorrido.



Como cada linha é um array de inteiros, seu tipo é:



int\[]



Por exemplo, durante as repetições:



linha = {3, 6, 9}

linha = {12, 15, 18}

linha = {21, 24, 27}

Percorrendo os valores



Para acessar os valores existentes dentro de cada linha, podemos utilizar outro foreach:



for (int\[] linha : numeros) {



&#x20;   for (int numero : linha) {

&#x20;       System.out.println(numero);

&#x20;   }



}



O primeiro foreach percorre as linhas.



O segundo foreach percorre os valores existentes dentro da linha atual.



Código completo

public class Main {

&#x20;   public static void main(String\[] args) {



&#x20;       int\[]\[] numeros = {

&#x20;               {3, 6, 9},

&#x20;               {12, 15, 18},

&#x20;               {21, 24, 27}

&#x20;       };



&#x20;       for (int\[] linha : numeros) {



&#x20;           for (int numero : linha) {

&#x20;               System.out.println(numero);

&#x20;           }



&#x20;       }

&#x20;   }

}



Resultado:



3

6

9

12

15

18

21

24

27

foreach x for tradicional



Em arrays multidimensionais, podemos utilizar tanto o for tradicional quanto o foreach.



For tradicional

for (int i = 0; i < numeros.length; i++) {



&#x20;   for (int j = 0; j < numeros\[i].length; j++) {



&#x20;       System.out.println(numeros\[i]\[j]);



&#x20;   }

}



O for tradicional permite trabalhar diretamente com os índices.



i = linha

j = coluna



Podemos acessar um elemento específico utilizando:



numeros\[i]\[j]

Foreach

for (int\[] linha : numeros) {



&#x20;   for (int numero : linha) {



&#x20;       System.out.println(numero);



&#x20;   }

}



O foreach trabalha diretamente com os valores, sem a necessidade de controlar os índices.



linha = array atual

numero = valor atual

Conceitos importantes

Arrays multidimensionais podem conter outros arrays.

Cada linha de uma matriz é um int\[].

for (int\[] linha : numeros) percorre as linhas.

for (int numero : linha) percorre os valores da linha atual.

foreach é útil quando precisamos apenas percorrer os valores.

O for tradicional é mais adequado quando precisamos controlar os índices.

Podemos utilizar um foreach dentro de outro foreach.

O primeiro foreach trabalha com arrays.

O segundo foreach trabalha com os valores dentro desses arrays.

