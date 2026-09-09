\# Aula 12 — Operadores Aritméticos



\## 📚 Tema



Operadores aritméticos em Java.



\## 🧠 O que aprendi



Os operadores aritméticos são utilizados para realizar operações matemáticas

com valores e variáveis.



Os principais operadores são:



| Operador | Operação |

|---|---|

| `+` | Soma |

| `-` | Subtração |

| `\*` | Multiplicação |

| `/` | Divisão |

| `%` | Resto da divisão |



\## ➕ Soma



O operador `+` realiza uma soma:



```java

int resultado = 10 + 3;



Resultado:



13

➖ Subtração



O operador - realiza uma subtração:



int resultado = 10 - 3;



Resultado:



7

✖️ Multiplicação



O operador \* realiza uma multiplicação:



int resultado = 10 \* 3;



Resultado:



30

➗ Divisão



O operador / realiza uma divisão:



int resultado = 10 / 3;



Quando os valores são int, o resultado também será inteiro.



Nesse caso:



10 / 3 = 3



A parte decimal é descartada.



Para obter um resultado decimal podemos utilizar double:



double resultado = (double) 10 / 3;

% Resto da divisão



O operador % retorna o resto de uma divisão.



Exemplo:



int resto = 10 % 3;



Resultado:



1



Isso acontece porque:



10 ÷ 3 = 3

resto = 1



O operador % também pode ser utilizado para verificar se um número é par

ou ímpar:



numero % 2 == 0



Se o resultado for 0, o número é par.



💻 Experiência prática



Criei um programa utilizando os principais operadores aritméticos:



public class Main {



&#x20;   public static void main(String\[] args) {



&#x20;       int numero1 = 10;

&#x20;       int numero2 = 3;



&#x20;       int soma = numero1 + numero2;

&#x20;       int subtracao = numero1 - numero2;

&#x20;       int multiplicacao = numero1 \* numero2;

&#x20;       int divisao = numero1 / numero2;

&#x20;       int resto = numero1 % numero2;



&#x20;       System.out.println("Número 1: " + numero1);

&#x20;       System.out.println("Número 2: " + numero2);



&#x20;       System.out.println("Soma: " + soma);

&#x20;       System.out.println("Subtração: " + subtracao);

&#x20;       System.out.println("Multiplicação: " + multiplicacao);

&#x20;       System.out.println("Divisão: " + divisao);

&#x20;       System.out.println("Resto: " + resto);

&#x20;   }

}



Compilei e executei com:



javac Main.java

java Main



Resultado:



Número 1: 10

Número 2: 3

Soma: 13

Subtração: 7

Multiplicação: 30

Divisão: 3

Resto: 1



💡 Minha observação



Aprendi os principais operadores aritméticos do Java e entendi que a divisão

entre valores int descarta a parte decimal.



Também aprendi que o operador % retorna o resto da divisão e pode ser muito

útil em situações como a identificação de números pares e ímpares.

