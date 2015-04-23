/**
 * Gramatica para expressoes regulares, padrao POSIX ERE
 * (Portable Operating System Interface Extended Regular Expressions)
 * 
 * http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/V1_chap09.html
 * 
 * E assumido local UTF-8 para as entradas, entao nao existe implementacao
 * de “Collating Sequences” e “Character Equivalents”.
 * 
 * http://www.regular-expressions.info/posixbrackets.html
 * 
 */

grammar RegularExpressionERE;

//Utilizar os tokens do lexer 'RegularExpressionsERELexer'
options { tokenVocab=RegularExpressionERELexer; }

//Adiciona o nome do pacote nas classes Java geradas
@header {
	package gerado;
}

//Adiciona os metodos de validacao nas classes Java geradas
@members {
	
	/**
	 * Recebe duas Strings e as converte para inteiros.
	 * Compara se a primeira e menor ou igual a segunda
	 * e retorna um boolean.
	 */
	protected boolean menorOuIgual(String primeiro, String segundo) {
		int a = Integer.parseInt(primeiro);
		int b = Integer.parseInt(segundo);
		return (a<=b);
	}
	
	/**
	 * Recebe duas Strings e extrai o primeiro caractere de cada.
	 * Descobre o numero Unicode dos caracteres, e compara se
	 * o primeiro e menor ou igual ao segundo. Retorna um boolean.
	 */
	protected boolean vemAntesDe(String primeiro, String segundo) {
		char a = primeiro.charAt(0);
		char b = segundo.charAt(0);
		int unicodeA = (int) a;
		int unicodeB = (int) b;
		return (unicodeA<=unicodeB);
	}
}

//Definicao de uma exprecao regular, que pode ser:
expression : group                   //Um grupo
           | multiple                //Multiplas opcoes
           | anchor                  //Uma posicao
           | repetition              //Uma repeticao
           | expression expression   //Varias exprecoes
           | list                    //Uma lista de possiveis caracteres
           | charclass               //Uma classe de caracteres
           | anychar                 //Qualquer caractere
           | characters              //Caracteres em sequencia
           
           //Regra especial para ignorar quebras de linha e tabulacoes
           | WS
           ;

//Multiplas opcoes sao uma ou mais subexprecoes divididas por '|'
multiple : subExpression (PIPE subExpression)+ ;

/** Uma subexpressao e como uma expressao, mas sem multiplas opcoes.
 * Para se ter multiplas opcoes dentro de multiplas opcoes,
 * estas obrigatoriamente devem estar dentro de um grupo. 
 */
subExpression : group                         //Um grupo de captura
              | anchor                        //Uma posicao
              | repetition                    //Repeticoes
              | subExpression subExpression   //Varias subexprecoes
              | list                          //Uma lista de possiveis caracteres
              | charclass                     //Uma classe de caracteres
              | anychar                       //Qualquer caractere
              | characters                    //Caracteres em sequencia
              ;

//Grupos de captura sao expressoes entre parenteses
group : GROUPOPEN expression GROUPCLOSE;

//Uma posicao pode ser de inicio ou fim
anchor : startAnchor //inicio
       | endAnchor   //fim
       ;

startAnchor : CIRCUMFLEX ; //^
endAnchor   : DOLAR ;      //$

/**
 * Um elemento a ser quantificado e o simbolo repetidor.
 * O simbolo repetidor se associa pela esquerda do elemento quantificado.
 */
repetition : <assoc=right> quantified quantifier
             #correctRepetition
           
             //Erro
           | quantifier quantifier+ 
             {notifyErrorListeners("Quantificadores nao podem quantificar outros quantificadores.");}
             #wrongRepetition
           ;

//So e possivel quantificar itens individuais
quantified : group
           | list
           | charclass
           | anychar
           | escaped
           | character
           ;

//Um quantificador pode ser: 
quantifier : oneOrMore    //Um ou mais
           | zeroOrMore   //Zero ou mais
           | conditional  //Pode ou nao conter (condicional)
           | exact        //Exatamente uma quantidade
           | atLeast      //Pelo menos uma quantidade
           | between      //Entre uma quantidade X e Y
           ;

oneOrMore   : PLUS     ;  //+
zeroOrMore  : ASTERISC ;  //*
conditional : QUESTION ;  //?
exact       : CURLYOPEN value CURLYCLOSE ;        //{n}
atLeast     : CURLYOPEN value COMMA CURLYCLOSE ;  //{n,}

/**
 * Quantificador {n,m}, onde n>=0 e n<=m
 * Para garantir que n<=m, a regra abaixo contem um "predicador semantico"
 * (Semantic Predicate), que e uma condicional em linguagem Java
 * no formato {...}?. A regra so sera verdadeira se a condicional for verdadeira.
 */
between :
	
	//Armazena "firstValue" na variavel local 'a' e "lastValue" na variavel local 'b'
	CURLYOPEN a=firstValue COMMA b=lastValue CURLYCLOSE
	
	//Semantic Predicate
	//Compara se o valor 'a' e menor ou igual ao valor 'b'
	{menorOuIgual($a.text,$b.text)}?
	
	;

//Um numero inteiro positivo
value      : DIGIT+ ;
firstValue : DIGIT+ ;
lastValue  : DIGIT+ ;

//Uma lista pode ser positiva ou negativa, e fica entre colchetes
list : LISTOPEN (negativeList|positiveList) LISTCLOSE ;

/**
 * Uma lista negativa e qualquer quantidade de elementos de lista, com ^ no comeco.
 * Pode ou nao conter elementos especiais no inicio e no fim.
 */
negativeList : CIRCUMFLEX listFirstElement? listElement*  listLastElement? ;

/**
 * Uma lista positiva e qualquer quantidade de elementos de lista
 * Pode ou nao conter elementos especiais no inicio e no fim.
 */
positiveList : listFirstElement? listElement* listLastElement? ;


//Um elemento de lista pode ser:
listElement : range            //Uma serie de caracteres
            | charclass        //Uma classe de caracteres
            | listCharacter    //Um caractere
            ;

/**
 * Uma serie sao dois caracteres separados por um traco.
 * 
 * O proprio caractere de traco pode ser o elemento da direita,
 * mas nao da esquerda.
 * 
 * O primeiro caractere deve preceder o segundo. Para garantir isto,
 * a regra abaixo contem um "predicador semantico" (Semantic Predicate),
 * que e uma condicional em linguagem Java no formato {...}? .
 * A regra so sera verdadeira se a condicional for verdadeira.
 */
range : 
	
	//Armazena o primeiro caractere na variavel local 'a',
	//e o segundo caractere na variavel local 'b'
	a=listCharacter DASH b=listCharacter
	
	//Semantic Predicate
	//Compara se o valor 'a' vem antes ou e igual a 'b'
	{vemAntesDe($a.text,$b.text)}?
	
	|
	
	//O mesmo que a opcao anterior, mas para o caso especial
	//de traco como sendo o segundo caractere
	
	c=listCharacter DASH d=DASH
	{vemAntesDe($c.text,$d.text)}?
	
	;

/**
 * O primeiro elemento da lista pode ser um caractere que 
 * perdeu seu significado especial, ou este mesmo caractere
 * porem dentro de uma serie.
 */
listFirstElement : listFirstRange
                 | listNoSpecial
                 ;

/**
 * No padrao POSIX ERE, o traco e o fecha colchetes perdem seu significado
 * especial se eles forem o primeiro elemento da lista.
 */
listNoSpecial : LISTCLOSE
              | DASH
              ;

/**
 * E possivel que o traco ou fecha colchetes que reside no primeiro elemento da lista
 * seja parte de uma serie de caracteres.
 * 
 * Esta e a unica situacao em que o traco pode ser o primeiro elemento em uma
 * serie de caracteres.
 */
listFirstRange : a=LISTCLOSE  DASH  b=DASH          {vemAntesDe($a.text,$b.text)}?
               | DASH         DASH  DASH            //serie valida em qualquer local
               | c=LISTCLOSE  DASH  d=listCharacter {vemAntesDe($c.text,$d.text)}?
               | e=DASH       DASH  f=listCharacter {vemAntesDe($e.text,$f.text)}?
               ;

/**
 * No padrao POSIX ERE, o traco perde seu significado especial se
 * ele for o ultimo elemento da lista.
 */
listLastElement : DASH ;

/**
 * Qualquer caractere que nao seja de controle.
 * E necessario definir caracteres de lista desta forma
 * para nao haver conflito com outras regras.
 */
listCharacter : DIGIT
              | COMMA
              | DOT
              | QUESTION
              | PLUS
              | ASTERISC
              | CURLYOPEN
              | CURLYCLOSE
              | LISTOPEN
              | ESCAPE
              | DOLAR
              | CIRCUMFLEX
              | PIPE
              | GROUPOPEN
              | GROUPCLOSE
              | OTHER
              ;

//Uma classe de caracteres POSIX e o nome da classe entre [: e :]
charclass: CLASSOPEN classname CLASSCLOSE;

//Uma classe pode ser: 
classname : alnum         //Caracteres alphanumericos
          | alpha         //Caracteres alfabeticos
          | blank         //Espacos e tabulacoes
          | cntrl         //Caracteres de controle
          | digitclass    //Digitos
          | graph         //Caracteres visiveis
          | lower         //Letras minusculas
          | print         //Caracteres visiveis e espacos
          | punct         //Caracteres de pontuacao
          | spaceclass    //Caracteres de espaco branco
          | upper         //Letras maiusculas
          | xdigit        //Digitos hexadecimais
          ;

//A aplicacao precisa saber o tipo da classe, por isso sao usadas
//varia regras de parser.
alnum       : ALNUM      ;
alpha       : ALPHA      ;
blank       : BLANK      ;
cntrl       : CNTRL      ;
digitclass  : DIGITCLASS ;
graph       : GRAPH      ;
lower       : LOWER      ;
print       : PRINT      ;
punct       : PUNCT      ;
spaceclass  : SPACECLASS ;
upper       : UPPER      ;
xdigit      : XDIGIT     ;


//O elemento que representa qualquer caractere
anychar : DOT ;

//Um caractere escapado e uma barra invertida seguida do caractere
escaped : ESCAPE special    #escapedSpecial
        | ESCAPE character  #escapedChar
        ;

//Todos os possiveis caracteres especiais
special : DOT
        | QUESTION
        | PLUS
        | ASTERISC
        | CURLYOPEN
        | CURLYCLOSE
        | LISTOPEN
        | LISTCLOSE
        | CIRCUMFLEX
        | DOLAR
        | PIPE
        | GROUPOPEN
        | GROUPCLOSE
        | ESCAPE
        ;

//Uma colecao de caracteres sao um ou mais caracteres comuns ou escapados
characters : (character|escaped)+ ;

/**
 * Qualquer caractere que nao seja de controle.
 * E necessario definir caracteres desta forma para que
 * nao entre em conflito com outras regras.
 */
character : DIGIT
          | COMMA
          | DASH
          | OTHER
          ;
