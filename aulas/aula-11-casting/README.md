\# Aula 11 — Casting



\## 📚 Tema



Conversão de tipos primitivos em Java.



\## 🧠 O que aprendi



Casting é o processo de converter um valor de um tipo para outro.



Existem situações em que o Java consegue realizar a conversão

automaticamente e situações em que precisamos informar explicitamente

o tipo desejado.



\## 🔄 Casting implícito



O casting implícito acontece quando o Java consegue realizar a conversão

automaticamente.



Exemplo:



```java

int numeroInteiro = 10;

double numeroDecimal = numeroInteiro;





Nesse caso, o int é convertido automaticamente para double.



int → double

🔄 Casting explícito



Quando queremos converter um tipo que pode causar perda de informação,

precisamos informar explicitamente o tipo.



Exemplo:



double valorDecimal = 10.5;

int valorInteiro = (int) valorDecimal;



O (int) informa ao Java que o valor deve ser convertido para int.



O resultado será:



10



A parte decimal é descartada.



O casting de double para int não arredonda o número.



Por exemplo:



10.9 → 10

10.5 → 10

10.1 → 10

💻 Experiência prática



Criei um programa utilizando casting implícito e explícito:



public class Main {



&#x20;   public static void main(String\[] args) {



&#x20;       int numeroInteiro = 10;

&#x20;       double numeroDecimal = numeroInteiro;



&#x20;       System.out.println("Casting implícito:");

&#x20;       System.out.println("int: " + numeroInteiro);

&#x20;       System.out.println("double: " + numeroDecimal);



&#x20;       double valorDecimal = 10.5;

&#x20;       int valorInteiro = (int) valorDecimal;



&#x20;       System.out.println();

&#x20;       System.out.println("Casting explícito:");

&#x20;       System.out.println("double: " + valorDecimal);

&#x20;       System.out.println("int: " + valorInteiro);



&#x20;       double outroValor = 99.99;

&#x20;       int outroNumero = (int) outroValor;



&#x20;       System.out.println();

&#x20;       System.out.println("Outro exemplo:");

&#x20;       System.out.println("double: " + outroValor);

&#x20;       System.out.println("int: " + outroNumero);

&#x20;   }

}





Compilei e executei utilizando no gitbash :



javac Main.java

java Main



Resultado:



Casting implícito:

int: 10

double: 10.0



Casting explícito:

double: 10.5

int: 10



Outro exemplo:

double: 99.99

int: 99



💡 Minha observação



Aprendi que o Java pode realizar algumas conversões automaticamente,

mas em outras situações é necessário informar explicitamente o tipo

para o qual queremos converter.



Também entendi que algumas conversões podem causar perda de informação,

como acontece ao converter um double para int.

