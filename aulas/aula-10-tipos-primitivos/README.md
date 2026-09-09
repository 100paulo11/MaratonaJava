\# Aula 10 — Tipos Primitivos



\## 📚 Tema



Tipos primitivos da linguagem Java.



\## 🧠 O que aprendi



Java possui 8 tipos primitivos:



\- `byte`

\- `short`

\- `int`

\- `long`

\- `float`

\- `double`

\- `char`

\- `boolean`



Cada tipo possui uma finalidade diferente.



\## 🔢 Tipos inteiros



Os tipos utilizados para representar números inteiros são:



```java

byte

short

int

long

Apesar de ser muito utilizada, String não é um tipo primitivo. Ela é
uma classe da linguagem Java.

💻 Experiência prática

Criei um programa utilizando diferentes tipos de dados:

public class Main {

    public static void main(String[] args) {

        byte idade = 24;
        short ano = 2026;
        int populacao = 215000000;
        long numeroGrande = 10000000000L;

        float altura = 1.75f;
        double salario = 4500.50;

        char inicial = 'P';
        boolean estudante = true;

        String nome = "Paulo";

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("População: " + populacao);
        System.out.println("Número grande: " + numeroGrande);
        System.out.println("Altura: " + altura);
        System.out.println("Salário: " + salario);
        System.out.println("Inicial: " + inicial);
        System.out.println("Estudante: " + estudante);
    }
}

Compilei e executei com:

javac Main.java
java Main
💡 Minha observação

Aprendi que cada variável possui um tipo e que o tipo determina quais valores
podem ser armazenados nela.

Também entendi qual é a diferença entre tipos primitivos e String.

Esses conceitos serão importantes para trabalhar com variáveis, operações,
condições e estruturas de controle nas próximas aulas.

