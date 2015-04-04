# Gramática Regex

Gramática ANTLR que define expressões regulares. Dividida em duas vertentes: `POSIX ERE` e `Perlre`.

Inclui uma aplicação de teste Java que realiza tradução de expressões regulares para linguagem natural em estrutura de árvore, fazendo uso de classes geradas pelo ANTLR.

##Aplicação de Teste

O caso de teste é um JAR executável que recebe os seguintes comandos:

```
test-case.jar <modo> [<visualização>]
```

`<modo>` é um argumento obrigatório que pode ser:

- `-posix`: executa em modo de compatibilidade `POSIX ERE`
- `-perl`:  executa em modo de compatibilidade `Perlre`

`[<visualização>]` é um argumento opcional que pode ser:

- `-gui`: Exibe a parse tree de modo gráfico
- `-list`: Exibe a parse tree em forma de listas

Para traduzir uma expressão, execute o JAR com um argumento de modo e digite sua expressão seguida de uma quebra de linha e o caractere de fim de arquivo EOF (`Ctrl+Z` seguido de `Enter` no Windows, `Ctrl+D` em sistemas Unix). Exemplo:

```
$  java -jar test-case.jar -posix
a(b|c)
EOF
```

Para gerar uma visualização da parse tree, adicione um argumento de visualização. Exemplo:

```
$  java -jar test-case.jar -perl -gui
a(b|c)
EOF
```

Adicionar um argumento de visualização faz com que a expressão não seja traduzida para linguagem natural.

##Suporte

Cada vertente da gramática tem um nível de suporte diferente.

###POSIX ERE:
	
- Caracteres alfanuméricos e espaços
- Grupos Numéricos 
- Múltiplas opções
- Quantificadores
- Listas
	- Caracteres
	- Séries de caracteres
	- Listas Negativas

###Perl:

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
- Listas
	- Caracteres
	- Séries de caracteres
	- Listas Negativas

##Bugs Conhecidos

- Não existe validação do quantificador `{n,m}` para garantir que `n > 0` e `n < m`
- Tradução de quantificadores e listas não implementada

##TODO

- Posições
- Referências
- Classes de caracteres
	- Classes positivas
	- Classes negativas
	- POSIX
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

0.6 (04/04/2015)

- Reconhece listas
- Reconhece listas negativas
- Reconhece série de caracteres dentro de listas
- Gramática dividida em dois padrões: `POSIX ERE` e `Perl`
- Adicionado parâmetros `-posix` e `-perl` na aplicação de teste

0.5 (02/04/2015)

- O caso de teste agora é capaz de exibir a parse tree de forma gráfica ou em listas
- Adicionado parâmetros `-gui` e `-list` na aplicação de teste

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
