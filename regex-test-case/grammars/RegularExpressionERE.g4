/**
 * Gramatica para expressoes regulares, padrao POSIX ERE
 * (Portable Operating System Interface Extended Regular Expressions)
 * 
 * http://pubs.opengroup.org/onlinepubs/000095399/basedefs/xbd_chap09.html
 */

grammar RegularExpressionERE;


/** Parser Rules */

//Definicao de uma exprecao regular, que pode ser
expression : multiple                //Multiplas opcoes
           | group                   //Um grupo de captura
           | repetition              //Repeticoes
           | expression expression   //Varias exprecoes
           | list                    //Uma lista de possiveis caracteres
           | characters              //Caracteres em sequencia
           | WS                      //Regra especial para ignorar espacamento
           ;

//Multiplas opcoes sao uma ou mais subexprecoes divididas por '|'
multiple : subExpression (PIPE subExpression)+ ;

//Uma subexpressao e como uma expressao, mas sem multiplas opcoes.
//Para se ter um nivel a mais de multiplas opcoes, estas obrigatoriamente devem
//estar dentro de um grupo.
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

//So e possivel quantificar grupos numericos ou caracteres individuais
quantified : group
           | character
           ;

//Um quantificador pode ser de tres tipos:
quantifier : oneOrMore    //+
           | zeroOrMore   //*
           | conditional  //?
           | exact        //{n}
           | atLeast      //{n,}
           | between      //{n,m}
           ;

oneOrMore   : PLUS ;      //+
zeroOrMore  : ASTERISC ;  //*
conditional : QUESTION ;  //?

//Abre chaves, numeros, fecha chaves
exact : CURLYOPEN value CURLYCLOSE ;

//Abre chaves, numeros, virgula, fecha chaves
atLeast  : CURLYOPEN value COMMA CURLYCLOSE ;

//Abre chaves, digito, virgula, digito, fecha chaves
between  : CURLYOPEN firstValue COMMA lastValue CURLYCLOSE ;

//Um ou mais digitos
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

//Uma colecao de caracteres pode conter um ou mais caracteres
characters : character+ ;

//Um caractere pode ser um digito, letra ou espaco
character : (DIGIT|LATIN|SPACE) ;


/** Lexer Rules */

COMMA              : ','        ;
QUESTION           : '?'        ;
PLUS               : '+'        ;
ASTERISC           : '*'        ;
CURLYOPEN          : '{'        ;
CURLYCLOSE         : '}'        ;
BRACKETOPEN        : '['        ;
BRACKETCLOSE       : ']'        ;
DASH               : '-'        ;
CIRCUMFLEX         : '^'        ;
PIPE               : '|'        ;
OPEN               : '('        ;
CLOSE              : ')'        ;
SPACE              : ' '        ;
DIGIT              : [0-9]      ;
LATIN              : [A-Za-z]   ;


/** Lexer Skip Rules */

WS : [\r\n\t] -> skip ; //Ignora quebras de linha e tabulacoes

