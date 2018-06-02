# Tradutor de Expressões Regulares para Linguagem Natural Restrita

Tradutor de expressões regulares para linguagem natural em estrutura de árvore no padrão  [POSIX ERE (inglês)](http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/V1_chap09.html), criado utilizando a ferramenta [ANTLR](https://www.antlr.org/).

Este projeto fez parte do meu Trabalho de Conclusão de Curso na Universidade São Judas Tadeu.

## Testando o algorítimo

A raiz do projeto contêm um JAR executável `test-case.jar` que implementa o algorítimo de tradução em uma CLI. Ele pode ser executado da seguinte forma:

```
test-case.jar [<visualização>]
```

...onde `[<visualização>]` é um argumento opcional que pode ser:

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
