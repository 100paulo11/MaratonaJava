\# Aula 23 - Tabela Verdade e Operadores Lógicos



\## Objetivo



Compreender o funcionamento dos operadores lógicos em Java através da tabela verdade.



Os principais operadores lógicos são:



\- `\&\&` - AND (E)

\- `||` - OR (OU)

\- `!` - NOT (NÃO)



\---



\## Operador AND (`\&\&`)



O operador `\&\&` retorna `true` somente quando \*\*todas as condições são verdadeiras\*\*.



| A | B | A \&\& B |

|---|---|---|

| true | true | true |

| true | false | false |

| false | true | false |

| false | false | false |



Exemplo:



```java

boolean resultado = true \&\& true;

System.out.println(resultado);

Conceitos aprendidos:

Valores booleanos true e false

Tabela verdade

Operador AND \&\&

Operador OR ||

Operador NOT !

Combinação de condições

Utilização de operadores lógicos em estruturas condicionais

