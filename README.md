# Gramática Regex

Gramática ANTLR que define expressões regulares no padrão  [POSIX ERE (inglês)](http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/V1_chap09.html) .

Inclui uma aplicação de teste Java que realiza tradução de expressões regulares para linguagem natural em estrutura de árvore, fazendo uso de classes geradas pelo ANTLR.

Para todos os casos, é assumido o padrão de codificação Unicode UTF-8. Sendo assim, não será dado suporte a “Collating Sequences” e “Character Equivalents” no padrão POSIX. Veja uma explicação [aqui (inglês)](http://www.regular-expressions.info/posixbrackets.html).

##Aplicação de Teste

O caso de teste é um JAR executável que recebe os seguintes comandos:

```
test-case.jar [<visualização>]
```

`[<visualização>]` é um argumento opcional que pode ser:

- **-gui**: Exibe a parse tree de modo gráfico
- **-list**: Exibe a parse tree em forma de listas

Para traduzir uma expressão, execute o JAR e digite sua expressão seguida de uma quebra de linha. Exemplo:

```
$  java -jar test-case.jar
a(b|c)
```

Para gerar uma visualização da parse tree, adicione um argumento de visualização. Exemplo:

```
$  java -jar test-case.jar -gui
a(b|c)
```

Adicionar um argumento de visualização faz com que a expressão não seja traduzida para linguagem natural.

##TODO

- Melhorar mensagens de erro, se possível
- Testes com expressões complexas

## Changelog

Padrão `DD/MM/AAAA` para as datas e padrão `X.Y.Z` para o versionamento, onde:

- **X**: Versões finais
- **Y**: Alterações na gramática
- **Z**: Alterações no caso de teste

2.0 (29/04/2015)

- Corrigida tradução da barra de escape
- Criado Transfer Object para traduções individuais
- Criada classe enum com os nomes de regras utilizados pelo tradutor
- Criada classe Tradução que armazena os objetos de transferência
- Tradutor agora popula e retorna uma instancia da classe Tradução
- Montagem final do texto traduzido agora feito pela classe Tradução

1.16.6 (24/04/2015)

- Tradutor agora monta uma String em vez de imprimir no console
- Método validar() agora retorna um valor boolean
- Método traduzir()  executa o método validar() se necessário
- Método traduzir() agora retorna uma String

1.16.2  (23/04/2015)

- Caracteres escapados agora fazem parte da regra de coleção de caracteres
- Corrigida tradução de caracteres escapados
- Corrigida tradução de múltiplas opções

1.15.4 (23/04/2015)

- Corrigido caso onde `[]--]` era identificado como um lista válida
- Abstraída a variável de opção de visualização da classe Regex para a Main
- Removida criação da parse tree do construtor
- Criado método validar() que cria a parse tree
- Error Handler não suprime mais as exceções 

1.14.2 (21/04/2015)

- Erros comuns com mensagens em português
- Removidas regras não utilizadas
- Corrigida definição de listas
- Corrigida tradução de listas
- Removido Error Listener customizado

1.11.0 (20/04/2015)

- Gramática separada em Parser e Lexer
- Criada uma “Island Grammar” para classes de caracteres
- Corrigida definição de séries
- Removida definição de caracteres escapados dentro de listas
- Validação de séries de caracteres

1.6.1 (19/04/2015)

- Criada definição de caracteres de lista
- Melhorada definição de caracteres escapados
- Adicionado `^` nos caracteres especiais de lista
- Corrigida tradução de séries com caracteres escapados

1.3.3 (18/04/2015)

- Validação do quantificador `{n,m}` garantindo que `n<=m`
- Melhorada definição de caracteres
- Inserido o nome de pacote nas classes geradas pela gramática
- Nomes de classes e pacotes mais simples
- Removida pasta `target`, código gerado agora vai direto para o pacote

1.1.3 (15/04/2015)

- Adicionado Error Handler em português

1.1.2 (15/04/2015)

- Melhorada definição de caracteres
- Removido completamente modo PCRE
- Adicionado Error Listener customizado

1.0 (13/04/2015)

- Suporte a todos os caracteres Unicode
- Suporte completo ao padrão POSIX ERE (salvo  *Collating Sequences* e *Character Equivalents*)

0.14.3 (10/04/2015)

- Melhorada definição de grupos
- Melhorada definição de listas
- Melhorar definição de caracteres
- Suporte a caracteres especiais escapados
- Removida completamente tradução por listener
- Implementada tradução de caracteres especiais escapados
- Adicionado código fonte do ANTLR4 no projeto em formato zip, para debugs

0.10.3 (08/04/2015)

- Reconhece posições
- Reconhece classes
- Reconhece ponto como qualquer caractere
- Implementada tradução por meio de visitor de posições, classes e ponto

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
