grammar RegularExpression;

/** Parser Rules*/

//Definicao de uma exprecao regular, que pode ser
expression : multiple                //Multiplas opcoes
           | group                   //Um grupo de captura
           | repetition              //Repeticoes
           | comment                 //Comentarios
           | expression expression   //Varias exprecoes
           | characters              //Caracteres
           | WS                      //Regra especial para ignorar espacamento
           ;

//Multiplas opcoes sao uma ou mais subexprecoes divididas por '|'
multiple : subExpression (PIPE subExpression)+ ;

//Uma subexpressao nao contem multiplas opcoes
subExpression : group                         //Um grupo de captura
              | repetition                    //Repeticoes
              | comment                       //Comentarios
              | subExpression subExpression   //Varias subexprecoes
              | characters                    //Caracteres alpha numericos
              | WS                            //Regra especial para ignorar espacamento
              ;

//Grupos podem ser divididos em: 
group : numericalGroup  //Grupos de captura numericos
      | namedGroup      //Grupos de captura nomeados
      | noCaptureGroup  //Grupos de nao captura
      ;

//Um grupo numerado inicia com '(', contem uma expressao, e termina com ')'
numericalGroup : NUMERICALGROUP expression CLOSE ;

//Um grupo nomeado inicia com '(?<Nome do grupo>', contem uma expressao, e termina com ')'
namedGroup : NAMESTART groupName NAMEEND expression CLOSE ;

//O nome de um grupo pode ser um ou mais caracteres
groupName : CHAR+ ;

//Um grupo de nao captura inicia com '(?:', contem uma expressao, e termina com ')'
noCaptureGroup : NOCAPTUREGROUP expression CLOSE ;

//Um elemento a ser quantificado e o simbolo repetidor
//O simbolo repetidor se associa a esquerda do elemento quantificado
repetition : <assoc=right> quantified quantifier ;

//So e possivel quantificar grupos ou caracteres individuais
quantified : group
           | character
           ;

//Um quantificador pode ser de tres tipos:
quantifier : lazy    //Quantidade minima possivel (preguicoso)
           | greedy  //Quantidade maxima possivel (guloso)
           | exact   //Exatamente uma quantidade
           ;

//Quantificadores "preguicosos" podem ser:
lazy : lazyOneOrMore    //Um ou mais
     | lazyZeroOrMore   //Zero ou mais
     | lazyConditional  //Zero ou um
     | lazyAtLeast      //Pelo menos X
     | lazyBetween      //Entre X e Y
     ;

//Quantificadores "gulosos" podem ser:
greedy : greedyOneOrMore    //Um ou mais
       | greedyZeroOrMore   //Zero ou mais
       | greedyConditional  //Zero ou um
       | greedyAtLeast      //Pelo menos X
       | greedyBetween      //Entre X e Y
       ;

//Abre chaves, digito, fecha chaves
exact : CURLYOPEN value CURLYCLOSE ;

greedyOneOrMore   : PLUS ;      //+
greedyZeroOrMore  : ASTERISC ;  //*
greedyConditional : QUESTION ;  //?

//Abre chaves, digito, virgula, fecha chaves
greedyAtLeast  : CURLYOPEN DIGIT+ COMMA CURLYCLOSE ;

//Abre chaves, digito, virgula, digito, fecha chaves
greedyBetween  : CURLYOPEN firstValue COMMA lastValue CURLYCLOSE ;

lazyOneOrMore   : PLUS QUESTION;      //+?
lazyZeroOrMore  : ASTERISC QUESTION;  //*?
lazyConditional : QUESTION QUESTION;  //??

//Abre chaves, digito, virgula, fecha chaves, interrogacao
lazyAtLeast  : CURLYOPEN DIGIT+ COMMA CURLYCLOSE QUESTION;

//Abre chaves, digito, virgula, digito, fecha chaves, interrogacao
lazyBetween  : CURLYOPEN firstValue COMMA lastValue CURLYCLOSE QUESTION;

//Um ou mais digitos
value      : DIGIT+ ;
firstValue : DIGIT+ ;
lastValue  : DIGIT+ ;

//Um comentario inicia com '(?#', contem um texto qualquer, e termina com ')'
comment : COMMENT commentText CLOSE;

//Um comentario pode conter um ou mais caracteres alpha-numericos e/ou espacos
commentText: (CHAR|DIGIT)+ ;

//Uma colecao de caracteres pode conter um ou mais caracteres alpha-numericos e/ou espacos
characters : (CHAR|DIGIT)+ ;

//Um caractere alpha numerico ou um espaco
character : (CHAR|DIGIT) ;


/** Lexer Rules */
COMMA              : ','                 ;
QUESTION           : '?'                 ;
PLUS               : '+'                 ;
ASTERISC           : '*'                 ;
CURLYOPEN          : '{'                 ;
CURLYCLOSE         : '}'                 ;
DIGIT              : [0-9]               ;
PIPE               : '|'                 ;
NAMESTART          : '(?<'               ;
NAMEEND            : '>'                 ;
NUMERICALGROUP     : '('                 ;
NOCAPTUREGROUP     : '(?:'               ;
COMMENT            : '(?#'               ;
CLOSE              : ')'                 ;
CHAR               : [A-Za-z ]           ;
WS                 : [\r\n\t] -> skip    ;
