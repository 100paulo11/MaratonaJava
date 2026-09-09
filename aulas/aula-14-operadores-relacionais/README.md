\# Aula 14 — Operadores Relacionais



\## 📚 Tema



Operadores relacionais em Java.



\## 🧠 O que aprendi



Os operadores relacionais são utilizados para comparar valores.



O resultado de uma comparação é sempre um valor booleano:



```text

true

false



Operadores

Operador	Significado

>	Maior que

<	Menor que

>=	Maior ou igual

<=	Menor ou igual

==	Igual

!=	Diferente





💻 Exemplo

int numero1 = 10;

int numero2 = 20;



boolean maior = numero1 > numero2;

boolean menor = numero1 < numero2;

boolean maiorOuIgual = numero1 >= numero2;

boolean menorOuIgual = numero1 <= numero2;

boolean igual = numero1 == numero2;

boolean diferente = numero1 != numero2;



Nesse exemplo:



10 > 20  → false

10 < 20  → true

10 >= 20 → false

10 <= 20 → true

10 == 20 → false

10 != 20 → true

⚠️ Diferença entre = e ==



O operador = é utilizado para atribuição:



int idade = 24;



O operador == é utilizado para comparação:



idade == 24



Portanto:



=  → atribuição

== → comparação





🔎 Exemplo prático



Podemos utilizar operadores relacionais para verificar se uma pessoa é

maior de idade:



int idade = 24;



boolean maiorDeIdade = idade >= 18;



O resultado será:



true





💡 Resumo



Os operadores relacionais permitem que o programa compare valores e descubra

se uma condição é verdadeira ou falsa.



Eles serão fundamentais para utilizar estruturas condicionais como if,

else e else if.

