\# Aula 35 - Arrays pt. 04



\## Conteúdo



Nesta aula foi apresentado o `foreach`, também conhecido como enhanced for.



O `foreach` é uma forma simplificada de percorrer os elementos de um array quando não precisamos trabalhar diretamente com os índices.



\### For tradicional



Com o `for` tradicional:



```java

int\[] numeros = {10, 20, 30, 40};



for (int i = 0; i < numeros.length; i++) {

&#x20;   System.out.println(numeros\[i]);

}

