\# Aula 02 — Como Java funciona



\## 📚 Tema



Entender como o Java funciona desde a criação do código até a sua execução.



\## 🧠 O que aprendi

O Java utiliza uma maquina virtual, chamamos de JVM (Java Virtual Machine) para executar seus programas.

Quando o programa é escrito geralmente criamos um arquivo de extensão '.java', Esse código precisa ser compilado

antes de ser executado.

A compilação transforma o código do java em bytecode, geralmente fica em um arquivo '.class' para que o sistema possa compreender. A JVM interpreta esse bytecode no computador.

O processo pode ser representado como :
.java -> compilador Java -> .class (bytecode) -> JVM -> execução

## 🔑 Conceitos importantes



\- \*\*JDK (Java Development Kit):\*\* conjunto de ferramentas utilizado para desenvolver programas Java.

\- \*\*JRE (Java Runtime Environment):\*\* ambiente necessário para executar aplicações Java.

\- \*\*JVM (Java Virtual Machine):\*\* máquina virtual responsável por executar o bytecode Java.

\- \*\*Bytecode:\*\* código intermediário gerado pela compilação de um programa Java.



\## 💻 Experiência prática



Criei um programa simples em Java utilizando a classe `Main`.



Depois compilei o código com:



```bash

javac Main.java



A compilação criou o arquivo Main.class, que contém o bytecode.



Em seguida executei o programa com:



java Main

O resultado foi:



Olá, Java! Olá, mundo.



Essa experiência me mostrou na prática a diferença entre

compilar e executar um programa Java.

