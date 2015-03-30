# Gramática Regex

Gramática ANTLR que define expressões regulares.

A gramatica em seu estado atual consegue reconhecer:
	
	* Caracteres alpha numericos e espacos
	* Grupos
		* Numericos 
		* Nomeados
		* Nao captura
		* Comentarios
	* Multiplas opcoes
	* Quantificadores
		* Greedy
		* Lazy


##Todo

	* Listas
		* Caracteres
		* Conjuntos de caracteres
		* Listas negativas
	* Posicoes
	* Classes de caracteres
		* Classes positivas
		* Classes negativas
		* Unicode
		* Hexadecimal
		* ASCII
		* Controle
	* Lookarouds
		* Positive Look Ahead
		* Negative Look Ahead
		* Positive Look Behind
		* Negative Look Behind
	* Suporte a todos os caracteres imprimiveis
	* Suporte a caracteres especiais escapados


## Changelog
0.4 (30/03/2015)
	* Reconhece quantificadores

0.3  (29/03/2015)
	* Reconhece multiplas opcoes
	* Reconhece varios niveis de multiplas opcoes dentro de grupos
	* Possivel fazer teste de expressoes com multiplas opcoes

0.2.1 (29/03/2015)
	* Reconhece comentarios
	* Melhorado o reconhecimento de grupos
	* Caso de teste agora em JAR executavel
	* Possivel fazer teste de exprecoes com todos os tipos de grupos

0.2 (27/03/2015)
	* Reconhece grupos numericos, nomeados e de nao captura
	* Reconhece grupos dentro de grupos
	* Criado caso de teste com aplicacao Java
	* Criado Listener que imprime texto traduzido

0.1 (27/03/2015)
	* Reconhece caracteres alpha numericos

IVOSAF (Incontrolavel Vontade de Sair Fazendo) (25/03/2015)
	* Gramatica Completa de Regex feita em 4 horas
	* Nao funciona
	* Inviavel fazer debug
