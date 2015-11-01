# Tradutor de Expressões Regulares

Tradutor de expressões regulares para linguagem natural em estrutura de árvore no padrão  [POSIX ERE (inglês)](http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/V1_chap09.html), criado utilizando a ferramenta ANTLR.

Para todos os casos, é assumido o padrão de codificação Unicode UTF-8. Sendo assim, não será dado suporte a “Collating Sequences” e “Character Equivalents” no padrão POSIX. Veja uma explicação [aqui (inglês)](http://www.regular-expressions.info/posixbrackets.html).

##Aplicação de Teste

Contêm um JAR executável em console que implementa o algorítimo de tradução. Recebe os seguintes comandos:

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
