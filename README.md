# Gramática Regex

Gramática ANTLR que define expressões regulares. Dividida em duas vertentes: [POSIX ERE](http://pubs.opengroup.org/onlinepubs/000095399/basedefs/xbd_chap09.html) e [PCRE](http://www.pcre.org/).

Inclui uma aplicação de teste Java que realiza tradução de expressões regulares para linguagem natural em estrutura de árvore, fazendo uso de classes geradas pelo ANTLR.

Para todos os casos, é assumido o padrão de codificação UTF-8.

##Aplicação de Teste

O caso de teste é um JAR executável que recebe os seguintes comandos:

```
test-case.jar <modo> [<visualização>]
```

`<modo>` é um argumento obrigatório que pode ser:

- **-posix**: executa em modo de compatibilidade `POSIX ERE`
- **-pcre**:  executa em modo de compatibilidade `PCRE`

`[<visualização>]` é um argumento opcional que pode ser:

- **-gui**: Exibe a parse tree de modo gráfico
- **-list**: Exibe a parse tree em forma de listas

Para traduzir uma expressão, execute o JAR com um argumento de modo e digite sua expressão seguida de uma quebra de linha. Exemplo:

```
$  java -jar test-case.jar -posix
a(b|c)
```

Para gerar uma visualização da parse tree, adicione um argumento de visualização. Exemplo:

```
$  java -jar test-case.jar -pcre -gui
a(b|c)
```

Adicionar um argumento de visualização faz com que a expressão não seja traduzida para linguagem natural.

##Suporte

Cada vertente da gramática tem um nível de suporte diferente. Por enquanto nenhuma vertente tem suporte completo de acordo com as definições oficiais.

###POSIX ERE:
	
- Caracteres alfanuméricos e espaços
- Grupos Numéricos 
- Múltiplas opções
- Quantificadores
- Listas
	- Caracteres
	- Séries de caracteres
	- Listas Negativas

###PCRE:

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

- Não existe validação dos quantificadores `{n}`,`{n,}` e `{n,m}` para garantir que `n > 0` e `m > 0`
- Não existe validação do quantificador `{n,m}` para garantir que `n < m`
- Não existe validação de séries de caracteres `A-B` dentro de listas para garantir que `A` precede `B`, dentro do padrão UTF-8
- Tradução em linguagem natural de quantificadores não implementada

##TODO

Implementar nas gramáticas:

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

Implementar na aplicação de teste:

- Tradução de todos os elementos POSIX ERE
- Validação de elementos

## Changelog

Padrão *DD/MM/AAAA* para as datas e padrão *X.Y.Z* para o versionamento, onde:

- **X**: Versões finais
- **Y**: Alterações na gramática
- **Z**: Alterações no caso de teste

0.7.4 (07/04/2015)

- Melhorada definição de caracteres dentro de listas
- Implementada tradução por meio de visitor de:
	- Grupos
	- Múltiplas Opções 
	- Repetições
	- Listas

0.6.13 (06/04/2015)

- Desativado modo PCRE
- Desativada tradução por listener
- Criado método de tradução por visitor
- Implementada tradução por meio de visitor de caracteres alfanuméricos e espaços

0.6.9 (05/04/2015)

- Corrigido erro do tradutor introduzido na divisão da gramática
- Não é mais necessário digitar o caractere de fim de arquivo EOF
- Implementada tradução de listas é series de caracteres
- Implementada tradução do quantificador `+`

0.6.5 (05/04/2015)

- Todas as ocorrências de `Perl` e `Perlre` foram renomeadas para `PCRE`
- Entrada de dados pelo usuário abstraída das classes geradoras de parse tree
- Melhorada a definição da regra de caracteres

0.6.2 (04/04/2015)

- Reconhece listas positivas, negativas e séries
- Gramática dividida em dois padrões: `POSIX ERE` e `Perl`
- Adicionado parâmetros `-posix` e `-perl` na aplicação de teste

0.5.2 (02/04/2015)

- O caso de teste agora é capaz de exibir a parse tree de forma gráfica ou em listas
- Adicionado parâmetros `-gui` e `-list` na aplicação de teste

0.5 (30/03/2015)

- Reconhece quantificadores

0.4.1  (29/03/2015)

- Reconhece múltiplas opções
- Possível fazer teste de expressões com múltiplas opções

0.3.3 (29/03/2015)

- Reconhece comentários
- Melhorado o reconhecimento de grupos
- Caso de teste agora em JAR executável
- Possível fazer teste de expressões com todos os tipos de grupos

0.2.2 (27/03/2015)

- Reconhece grupos numéricos, nomeados e de não captura
- Criado caso de teste com aplicação Java
- Criado Listener que imprime texto traduzido

0.1 (27/03/2015)

- Reconhece caracteres alfanuméricos

IVOSAF (Incontrolável Vontade de Sair Fazendo) (25/03/2015)

- Gramatica Completa de Regex feita em 4 horas
- Não funciona
