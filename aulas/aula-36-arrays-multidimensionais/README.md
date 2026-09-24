\# Aula 36 - Arrays Multidimensionais



\## Conteúdo



Nesta aula foi estudado o conceito de arrays multidimensionais em Java.



Um array multidimensional pode ser entendido como um array que possui outros arrays dentro dele. O exemplo mais comum é uma matriz com linhas e colunas.



\### Array unidimensional



Um array comum possui apenas uma dimensão:



```java

int\[] numeros = {10, 20, 30, 40};



Cada elemento pode ser acessado utilizando apenas um índice:



numeros\[0];

numeros\[1];

numeros\[2];

Array bidimensional



Um array bidimensional possui duas dimensões, normalmente representadas por linha e coluna:



int\[]\[] numeros = {

&#x20;       {10, 20, 30},

&#x20;       {40, 50, 60},

&#x20;       {70, 80, 90}

};



Nesse caso, o primeiro índice representa a linha e o segundo representa a coluna:



numeros\[0]\[0]; // 10

numeros\[0]\[1]; // 20

numeros\[1]\[0]; // 40

numeros\[2]\[2]; // 90

Percorrendo uma matriz



Para percorrer todos os elementos de um array bidimensional, podemos utilizar um for dentro de outro for:



for (int linha = 0; linha < numeros.length; linha++) {



&#x20;   for (int coluna = 0; coluna < numeros\[linha].length; coluna++) {



&#x20;       System.out.println(numeros\[linha]\[coluna]);

&#x20;   }

}



O primeiro for percorre as linhas.



O segundo for percorre as colunas da linha atual.



Conceitos importantes

Arrays multidimensionais possuem mais de uma dimensão.

Em uma matriz, podemos trabalhar com linhas e colunas.

array.length indica a quantidade de linhas.

array\[linha].length indica a quantidade de elementos daquela linha.

array\[linha]\[coluna] acessa um elemento específico.

Podemos utilizar for aninhados para percorrer uma matriz.

O primeiro índice representa a linha.

O segundo índice representa a coluna.

