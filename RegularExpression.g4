grammar RegularExpression;  //Nome da gramatica

/** Parser Rules*/

//Definicao de uma exprecao regular, que pode ser
expression : group                  //Um grupo de captura
           | expression expression  //Varias exprecoes
           | characters             //Caracteres
           | WS
           ;

group : groupstart expression groupend ; //O tipo do grupo, uma expressao, e o fechamento do grupo

groupstart : NUMERICALGROUP  //Grupo numerado
           | NOCAPTUREGROUP  //Grupo de nao-captura
           | NAMEDGROUP      //Grupo nomeado
           ; 
 
groupend : CLOSE ;

characters : CHAR+ ; //Caracteres alpha numericos



/** Lexer Rules */

NAMEDGROUP         : '(?<' [a-zA-Z0-9]+ '>'     ;
NUMERICALGROUP     : '('                        ;
NOCAPTUREGROUP     : '(?:'                      ;
CLOSE              : ')'                        ;
CHAR               : [A-Za-z0-9]                ;
WS                 : [\s\r\n\t] -> skip         ;
