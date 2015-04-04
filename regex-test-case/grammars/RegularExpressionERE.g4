/**
 * Gramatica para expressoes regulares, padrao POSIX ERE
 * (Portable Operating System Interface Extended Regular Expressions)
 * 
 * http://pubs.opengroup.org/onlinepubs/000095399/basedefs/xbd_chap09.html#tag_09_04
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

//Uma subexpressao nao contem multiplas opcoes
subExpression : group                         //Um grupo de captura
              | repetition                    //Repeticoes
              | subExpression subExpression   //Varias subexprecoes
              | list                          //Uma lista de possiveis caracteres
              | characters                    //Caracteres em sequencia
              | WS                            //Regra especial para ignorar espacamento
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

//Abre chaves, digito, fecha chaves
exact : CURLYOPEN value CURLYCLOSE ;

//Abre chaves, digito, virgula, fecha chaves
atLeast  : CURLYOPEN DIGIT+ COMMA CURLYCLOSE ;

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

//Uma lista negativa pode ser um ou mais caracteres ou series, com um ^ no comeco, entre colchetes
negativeList : BRACKETOPEN CIRCUMFLEX (characters|range)+ BRACKETCLOSE;

//Uma lista positiva pode ser um ou mais caracteres ou series, entre colchetes
positiveList : BRACKETOPEN (characters|range)+ BRACKETCLOSE;

//Uma serie sao dois caracteres separados por um traco
range: character DASH character;

//Uma colecao de caracteres pode conter um ou mais caracteres alpha-numericos e/ou espacos
characters : (CHAR|DIGIT)+ ;

//Um caractere alpha numerico ou um espaco
character : (CHAR|DIGIT) ;


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
DIGIT              : [0-9]      ;
PIPE               : '|'        ;
OPEN               : '('        ;
CLOSE              : ')'        ;
CHAR               : [A-Za-z ]  ;


/** Skip Rules */

WS : [\r\n\t] -> skip ;

