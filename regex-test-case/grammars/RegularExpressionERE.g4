/**
 * Gramatica para expressoes regulares, padrao POSIX ERE
 * (Portable Operating System Interface Extended Regular Expressions)
 * 
 * http://pubs.opengroup.org/onlinepubs/000095399/basedefs/xbd_chap09.html
 */

grammar RegularExpressionERE;


/** Parser Rules */

//Definicao de uma exprecao regular, que pode ser:
expression : multiple                //Multiplas opcoes
           | group                   //Um grupo de captura
           | repetition              //Uma repeticao
           | expression expression   //Varias exprecoes
           | list                    //Uma lista de possiveis caracteres
           | characters              //Caracteres em sequencia
           
           //Regra especial para ignorar espacamento
           | WS
           ;

//Multiplas opcoes sao uma ou mais subexprecoes divididas por '|'
multiple : subExpression (PIPE subExpression)+ ;

//Uma subexpressao e como uma expressao, mas sem multiplas opcoes.
//Para se ter multiplas opcoes dentro de multiplas opcoes,
//estas obrigatoriamente devem estar dentro de um grupo.
subExpression : group                         //Um grupo de captura
              | repetition                    //Repeticoes
              | subExpression subExpression   //Varias subexprecoes
              | list                          //Uma lista de possiveis caracteres
              | characters                    //Caracteres em sequencia
              ;

//Grupos de captura so podem ser numericos, de acordo com o padrao POSIX
group : numericalGroup ;

//Um grupo numerado inicia com '(', contem uma expressao, e termina com ')'
numericalGroup : OPEN expression CLOSE ;

//Um elemento a ser quantificado e o simbolo repetidor
//O simbolo repetidor se associa a esquerda do elemento quantificado
repetition : <assoc=right> quantified quantifier;

//So e possivel quantificar grupos, listas ou caracteres individuais
quantified : group
           | list
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

oneOrMore   : PLUS ;      //+
zeroOrMore  : ASTERISC ;  //*
conditional : QUESTION ;  //?
exact       : CURLYOPEN value CURLYCLOSE ; //{n}
atLeast     : CURLYOPEN value COMMA CURLYCLOSE ; //{n,}
between     : CURLYOPEN firstValue COMMA lastValue CURLYCLOSE ; //{n,m}

//Um numero inteiro positivo
value      : DIGIT+ ;
firstValue : DIGIT+ ;
lastValue  : DIGIT+ ;

//Uma lista pode ser positiva ou negativa
list : negativeList
     | positiveList
     ;

//Uma lista negativa pode ser uma ou mais colecoes de caracteres ou series, com um ^ no comeco, entre colchetes
negativeList : BRACKETOPEN CIRCUMFLEX (characters|range)+ BRACKETCLOSE;

//Uma lista positiva pode ser uma ou mais colecoes de caracteres ou series, entre colchetes
positiveList : BRACKETOPEN (characters|range)+ BRACKETCLOSE;

//Uma serie sao dois caracteres separados por um traco
range: character DASH character;

//Uma colecao de caracteres pode ser um ou mais digitos, letras do alfabeto latino ou espacos
//A aplicacao nao precisa distinguir cada caractere de uma colecao de caracteres,
//por isso o uso de tokens.
characters : (DIGIT|LATIN|SPACE)+ ;

//Um caractere pode ser um digito, letra do alfabeto latino ou espaco
character : (DIGIT|LATIN|SPACE) ;


/** Lexer Rules */

COMMA              : ','          ;
QUESTION           : '?'          ;
PLUS               : '+'          ;
ASTERISC           : '*'          ;
CURLYOPEN          : '{'          ;
CURLYCLOSE         : '}'          ;
BRACKETOPEN        : '['          ;
BRACKETCLOSE       : ']'          ;
DASH               : '-'          ;
CIRCUMFLEX         : '^'          ;
PIPE               : '|'          ;
OPEN               : '('          ;
CLOSE              : ')'          ;
SPACE              : ' '          ;
DIGIT              : [0-9]        ;
LATIN              : [A-Za-z]     ;


/** Lexer Skip Rules */

WS : [\r\n\t] -> skip ; //Ignora quebras de linha e tabulacoes

