\# Aula 38 - Arrays Multidimensionais pt. 03 - Inicialização



\## Conteúdo



Nesta aula foi estudado como realizar a inicialização de arrays multidimensionais em Java.



Existem diferentes formas de inicializar arrays multidimensionais, podendo definir os valores diretamente ou criar o array informando previamente seu tamanho.



\### Inicialização diretamente com valores



Podemos criar um array multidimensional já informando seus valores:



```java

int\[]\[] numeros = {

&#x20;       {10, 20, 30},

&#x20;       {40, 50, 60},

&#x20;       {70, 80, 90}

};



Nesse caso, o Java identifica automaticamente a quantidade de linhas e elementos de cada linha.



Inicialização definindo o tamanho



Também podemos criar um array multidimensional informando a quantidade de linhas e colunas:



int\[]\[] numeros = new int\[3]\[3];



Nesse exemplo temos:



3 linhas

3 colunas em cada linha



Como o tipo utilizado é int, os elementos são inicializados com o valor padrão 0.



Podemos posteriormente atribuir valores utilizando os índices:



numeros\[0]\[0] = 10;

numeros\[0]\[1] = 20;

numeros\[0]\[2] = 30;

Arrays multidimensionais irregulares



Em Java, as linhas de um array multidimensional não precisam possuir necessariamente o mesmo tamanho.



Podemos criar:



int\[]\[] numeros = new int\[3]\[];



Nesse caso, criamos três linhas, mas ainda não definimos o tamanho de cada uma.



Podemos definir cada linha separadamente:



numeros\[0] = new int\[2];

numeros\[1] = new int\[4];

numeros\[2] = new int\[3];



Assim, cada linha pode possuir uma quantidade diferente de elementos.



Conceito de array de arrays



Um int\[]\[] pode ser entendido como um array que possui outros arrays de int dentro dele.



Por isso:



int\[]\[] numeros;



possui elementos do tipo:



int\[]



E cada int\[] possui elementos do tipo:



int



Essa estrutura também explica por que podemos utilizar:



for (int\[] linha : numeros) {



&#x20;   for (int numero : linha) {



&#x20;       System.out.println(numero);



&#x20;   }

}



O primeiro foreach percorre as linhas e o segundo percorre os valores existentes dentro de cada linha.



Conceitos importantes

Arrays multidimensionais podem ser inicializados diretamente com valores.

Podemos utilizar new int\[3]\[3] para definir previamente o tamanho.

Os valores padrão de um array de int são 0.

Podemos preencher os elementos posteriormente utilizando seus índices.

Um array multidimensional pode possuir linhas com tamanhos diferentes.

Um int\[]\[] pode ser entendido como um array de arrays.

Cada linha de um int\[]\[] é um int\[].

