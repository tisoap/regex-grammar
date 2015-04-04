/**
 * Gramatica para expressoes regulares, padrao Perlre
 * (Perl Regular Expressions)
 * 
 * http://perldoc.perl.org/perlre.html
 */

grammar RegularExpressionPerl;
import RegularExpressionERE;


/** Parser Rules */

//Definicao de uma exprecao regular, que pode ser
//@Override 
expression : multiple                //Multiplas opcoes
           | group                   //Um grupo de captura
           | repetition              //Repeticoes
           | comment                 //Comentarios
           | expression expression   //Varias exprecoes
           | list                    //Uma lista de possiveis caracteres
           | characters              //Caracteres em sequencia
           | WS                      //Regra especial para ignorar espacamento
           ;

//Uma subexpressao nao contem multiplas opcoes
//@Override 
subExpression : group                         //Um grupo de captura
              | repetition                    //Repeticoes
              | comment                       //Comentarios
              | subExpression subExpression   //Varias subexprecoes
              | list                          //Uma lista de possiveis caracteres
              | characters                    //Caracteres em sequencia
              | WS                            //Regra especial para ignorar espacamento
              ;

//Grupos podem ser divididos em: 
//@Override 
group : numericalGroup  //Grupos de captura numericos
      | namedGroup      //Grupos de captura nomeados
      | noCaptureGroup  //Grupos de nao captura
      ;

//Um grupo nomeado inicia com '(?<Nome do grupo>', contem uma expressao, e termina com ')'
namedGroup : NAMESTART groupName NAMEEND expression CLOSE ;

//O nome de um grupo pode ser um ou mais caracteres
groupName : CHAR+ ;

//Um grupo de nao captura inicia com '(?:', contem uma expressao, e termina com ')'
noCaptureGroup : NOCAPTUREGROUP expression CLOSE ;

//Um quantificador pode ser de tres tipos:
//@Override 
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

greedyOneOrMore   : PLUS ;      //+
greedyZeroOrMore  : ASTERISC ;  //*
greedyConditional : QUESTION ;  //?
greedyAtLeast     : CURLYOPEN DIGIT+ COMMA CURLYCLOSE ; //{n,}
greedyBetween     : CURLYOPEN firstValue COMMA lastValue CURLYCLOSE ; //{n,m}

lazyOneOrMore   : PLUS QUESTION;      //+?
lazyZeroOrMore  : ASTERISC QUESTION;  //*?
lazyConditional : QUESTION QUESTION;  //??
lazyAtLeast     : CURLYOPEN DIGIT+ COMMA CURLYCLOSE QUESTION; //{n,}?
lazyBetween     : CURLYOPEN firstValue COMMA lastValue CURLYCLOSE QUESTION; //{n,m}?

//Um comentario inicia com '(?#', contem um texto qualquer, e termina com ')'
comment : COMMENT commentText CLOSE;

//O texto de um comentario pode conter um ou mais caracteres alpha-numericos e/ou espacos
commentText: (CHAR|DIGIT)+ ;


/** Lexer Rules */

NAMESTART          : '(?<'      ;
NAMEEND            : '>'        ;
NOCAPTUREGROUP     : '(?:'      ;
COMMENT            : '(?#'      ;
