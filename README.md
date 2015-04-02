# Gramática Regex

Gramática ANTLR que define expressões regulares. Inclui uma aplicação de teste Java que realiza a tradução da expressão para linguagem natural em estrutura de árvore.

##Traduzindo

Para traduzir uma expressão, execute o comando `java -jar test-case.jar` e digite sua expressão seguida de uma quebra de linha e o caractere de fim de arquivo EOF (Ctrl+Z em Windows, Ctrl+D em Unix). Exemplo:

```
$  java -jar test-case.jar
a(b|c)
EOF
```

##Visualizando

Você pode exibir uma representação gráfica da parse tree criada a partir de uma expressão regular utilizando o `TestRig` da biblioteca ANTLR. Para isso, primeiro siga as instruções de como configurar o ANTRL em seu sistema pelo [Quick Start Guide](http://www.antlr.org/) ou pelo [Getting Started with ANTLR v4](https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4).

Com o ANTRL configurado, execute estes comandos no mesmo diretório da gramatica, para gerar e compilar os arquivos necessários:

```
$ antlr4  RegularExpression.g4
$ javac  RegularExpression*.java
```
Agora você pode ver a representação gráfica de uma expressão qualquer executando:

```
$ grun RegularExpression expression -gui
a(b|c)
EOF
```

##Suporte

A gramatica em seu estado atual consegue reconhecer:
	
- Caracteres alfanuméricos e espaços
- Grupos
	- Numéricos 
	- Nomeados
	- Não captura
- Comentários
- Múltiplas opções
- Quantificadores
	- Greedy
	- Lazy

##Bugs Conhecidos

- Não existe validação do quantificador `{n,m}` para garantir que `n > 0` e `n < m`
- Aplicação de teste sem suporte para tradução de quantificadores

##TODO

- Listas
	- Caracteres
	- Conjuntos de caracteres
	- Listas negativas
- Posições
- Classes de caracteres
	- Classes positivas
	- Classes negativas
	- Unicode
	- Hexadecimal
	- ASCII
	- Controle
- Lookarouds
	- Positive Look Ahead
	- Negative Look Ahead
	- Positive Look Behind
	- Negative Look Behind
- Suporte a todos os caracteres imprimíveis
- Suporte a caracteres especiais escapados


## Changelog

0.4 (30/03/2015)

	- Reconhece quantificadores

0.3  (29/03/2015)

	- Reconhece múltiplas opções
	- Reconhece vários níveis de múltiplas opções dentro de grupos
	- Possível fazer teste de expressões com múltiplas opções

0.2.1 (29/03/2015)

	- Reconhece comentários
	- Melhorado o reconhecimento de grupos
	- Caso de teste agora em JAR executável
	- Possível fazer teste de expressões com todos os tipos de grupos

0.2 (27/03/2015)

	- Reconhece grupos numéricos, nomeados e de não captura
	- Reconhece grupos dentro de grupos
	- Criado caso de teste com aplicação Java
	- Criado Listener que imprime texto traduzido

0.1 (27/03/2015)

	- Reconhece caracteres alfanuméricos

IVOSAF (Incontrolável Vontade de Sair Fazendo) (25/03/2015)

	- Gramatica Completa de Regex feita em 4 horas
	- Não funciona
	- Inviável fazer debug
