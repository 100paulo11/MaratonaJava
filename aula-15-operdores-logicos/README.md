\# Aula 15 — Operadores Lógicos



\## 📚 Tema



Operadores lógicos em Java.



\## 🧠 O que aprendi



Os operadores lógicos são utilizados para combinar ou inverter condições.



Os principais operadores são:



| Operador | Nome | Significado |

|---|---|---|

| `\&\&` | AND | E |

| `||` | OR | OU |

| `!` | NOT | NÃO / negação |



O resultado de uma expressão lógica é um valor booleano:



```text

true

false



\&\& — AND



O operador \&\& significa E.



Todas as condições precisam ser verdadeiras para o resultado ser true.



Exemplo:



boolean resultado = true \&\& true;



Resultado:



true



Exemplo prático:



int idade = 24;

boolean possuiCarteira = true;



boolean podeDirigir = idade >= 18 \&\& possuiCarteira;



As duas condições são verdadeiras, então:



podeDirigir = true

|| — OR



O operador || significa OU.



Basta uma das condições ser verdadeira para o resultado ser true.



Exemplo:



boolean resultado = true || false;



Resultado:



true



Exemplo:



boolean podeEntrar = idade >= 18 || possuiCarteira;

! — NOT



O operador ! realiza a negação de uma condição.



Ele inverte o valor booleano:



!true  → false

!false → true



Exemplo:



boolean possuiCarteira = true;



boolean naoPossuiCarteira = !possuiCarteira;



Resultado:



false





💻 Exemplo completo





public class Main {



&#x20;   public static void main(String\[] args) {



&#x20;       int idade = 24;

&#x20;       boolean possuiCarteira = true;



&#x20;       boolean podeDirigir = idade >= 18 \&\& possuiCarteira;



&#x20;       boolean podeEntrar = idade >= 18 || possuiCarteira;



&#x20;       boolean naoPossuiCarteira = !possuiCarteira;



&#x20;       System.out.println("Idade: " + idade);

&#x20;       System.out.println("Possui carteira: " + possuiCarteira);



&#x20;       System.out.println("Pode dirigir? " + podeDirigir);

&#x20;       System.out.println("Pode entrar? " + podeEntrar);

&#x20;       System.out.println("Não possui carteira? " + naoPossuiCarteira);

&#x20;   }

}

🧪 Execução



Compilei com:



javac Main.java



Executei com:



java Main



Resultado:



Idade: 24

Possui carteira: true

Pode dirigir? true

Pode entrar? true

Não possui carteira? false



💡 Resumo

\&\& significa E e exige que todas as condições sejam verdadeiras.

|| significa OU e exige que pelo menos uma condição seja verdadeira.

! significa NÃO e inverte um valor booleano.

