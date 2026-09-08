\# Aula 04 - Variáveis de Ambiente



\## 📚 Tema



Configuração das variáveis de ambiente do Java no sistema operacional.



\## 🧠 O que aprendi ?



As variáveis de ambiente ajudam o sistema operacional a encontrar e utilizar ferramentas que existem no java.



A variável 'JAVA\_HOME' indica onde a JDK está instalada no computador.

A variável 'PATH' permite que comandos como 'java' e 'javac' sejam encontrados pelo terminal sem precisar informar o caminho completo da instalação da JDK.

Por exemplo, podemos verificar a instalação do Java pelo terminal utilizando:

```bash java -version



E também verificar a versão do compilador:

javac -version



## 💻 Experiência prática

Verifiquei a configuração do Java pelo terminal.

Ao executar:

```bash
javac -version

obtive:

javac 26.0.2.1

Ao executar:

java -version

obtive:

java version "26.0.2.1"

Isso confirmou que o compilador e o ambiente de execução do Java estão
configurados e podem ser acessados pelo terminal.

