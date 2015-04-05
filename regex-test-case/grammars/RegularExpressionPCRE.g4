/**
 * Gramatica para expressoes regulares, padrao PCRE
 * (Perl Compatible Regular Expressions)
 * 
 * http://www.pcre.org/
 * 
 * OBS: Comentarios com @Override indicam que a regra imediatamente abaixo
 * e uma sobreposicao de uma regra da gramatica importada.
 */

grammar RegularExpressionPCRE;
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

//Uma subexpressao e como uma expressao, mas sem multiplas opcoes.
//Para se ter um nivel a mais de multiplas opcoes, estas obrigatoriamente devem
//estar dentro de um grupo.
//@Override 
subExpression : group                         //Um grupo de captura
              | repetition                    //Repeticoes
              | comment                       //Comentarios
              | subExpression subExpression   //Varias subexprecoes
              | list                          //Uma lista de possiveis caracteres
              | characters                    //Caracteres em sequencia
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
groupName : character+ ;

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

//O texto de um comentario pode conter um ou mais caracteres
commentText: character+ ;


/** Lexer Rules */

NAMESTART          : '(?<'      ;
NAMEEND            : '>'        ;
NOCAPTUREGROUP     : '(?:'      ;
COMMENT            : '(?#'      ;
