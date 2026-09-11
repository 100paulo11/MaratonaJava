\# Aula 16 — Operadores de Incremento e Decremento



\## 📚 Tema



Operadores de incremento e decremento em Java.



\## 🧠 O que aprendi



Java possui operadores que permitem aumentar ou diminuir o valor de uma

variável em 1.



São eles:



```text

++ → incremento

\-- → decremento





💻 Exemplo completo



public class Main {



&#x20;   public static void main(String\[] args) {



&#x20;       int numero = 10;



&#x20;       System.out.println("Valor inicial: " + numero);



&#x20;       numero++;

&#x20;       System.out.println("Depois do incremento: " + numero);



&#x20;       numero++;

&#x20;       System.out.println("Depois de outro incremento: " + numero);



&#x20;       numero--;

&#x20;       System.out.println("Depois do decremento: " + numero);



&#x20;       numero--;

&#x20;       System.out.println("Depois de outro decremento: " + numero);

&#x20;   }

}







🧪 Execução



Compilei com:



javac Main.java



Executei com:



java Main



Resultado:



Valor inicial: 10

Depois do incremento: 11

Depois de outro incremento: 12

Depois do decremento: 11

Depois de outro decremento: 10



💡 Resumo



++ aumenta uma variável em 1.

\-- diminui uma variável em 1.

numero++ é pós-incremento.

++numero é pré-incremento.

numero-- é pós-decremento.

\--numero é pré-decremento.

