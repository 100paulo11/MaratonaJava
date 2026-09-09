\# Aula 13 — Operadores de Atribuição



\## 📚 Tema



Operadores de atribuição em Java.



\## 🧠 O que aprendi



O operador `=` é utilizado para atribuir um valor a uma variável.



Exemplo:



```java

int numero = 10;



Nesse caso, o valor 10 é armazenado na variável numero.



O Java também possui operadores de atribuição que permitem realizar uma

operação matemática e atribuir o resultado à própria variável.



Operadores

Operador	Exemplo	Equivalente

=	x = 10	Atribuição

+=	x += 5	x = x + 5

\-=	x -= 5	x = x - 5

\*=	x \*= 5	x = x \* 5

/=	x /= 5	x = x / 5

%=	x %= 5	x = x % 5

💻 Exemplo

public class Main {



&#x20;   public static void main(String\[] args) {



&#x20;       int numero = 10;



&#x20;       System.out.println("Valor inicial: " + numero);



&#x20;       numero += 5;

&#x20;       System.out.println("Depois do += 5: " + numero);



&#x20;       numero -= 3;

&#x20;       System.out.println("Depois do -= 3: " + numero);



&#x20;       numero \*= 2;

&#x20;       System.out.println("Depois do \*= 2: " + numero);



&#x20;       numero /= 4;

&#x20;       System.out.println("Depois do /= 4: " + numero);



&#x20;       numero %= 3;

&#x20;       System.out.println("Depois do %= 3: " + numero);

&#x20;   }

}

🧪 Execução



Compilei o programa com:



javac Main.java



E executei com:



java Main



Resultado:



Valor inicial: 10

Depois do += 5: 15

Depois do -= 3: 12

Depois do \*= 2: 24

Depois do /= 4: 6

Depois do %= 3: 0



💡 Resumo



Os operadores de atribuição permitem escrever operações de maneira mais

curta.



Por exemplo:



numero += 5;



é equivalente a:



numero = numero + 5;



Esses operadores são muito utilizados para atualizar o valor de variáveis.

