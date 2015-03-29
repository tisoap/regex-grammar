grammar RegularExpression;  //Nome da gramatica

/** Parser Rules*/

//Definicao de uma exprecao regular, que pode ser
expression : multiple               //Multiplas opcoes
           | group                  //Um grupo de captura
           | expression expression  //Varias exprecoes
           | characters             //Caracteres
           | WS                     //Regra especial para ignorar espacamento
           ;

//Multiplas opcoes sao uma ou mais subexprecoes divididas por '|'
multiple : subexpression (VERTICAL subexpression)+ ;

/** Uma subexprecao tem a mesma defincao de uma expressao,
 *  exceto pela falta da regra 'multiple', pois para que existam
 *  multiplas opcoes dentro de multiplas opcoes, o uso de grupos
 *  e obrigatorio. */
subexpression : group                         //Um grupo de captura
              | subexpression subexpression   //Varias subexprecoes
              | characters                    //Caracteres
              | WS                            //Regra especial para ignorar espacamento
              ;

//Grupos podem ser divididos em: 
group : numericalgroup  //Grupos de captura numericos
      | namedgroup      //Grupos de captura nomeados
      | nocapturegroup  //Grupos de nao captura
      | comment         //Comentarios
      ;

//Um grupo numerado inicia com '(', contem uma expressao, e termina com ')'
numericalgroup : NUMERICALGROUP expression CLOSE ;

//Um grupo nomeado inicia com '(?<Nome do grupo>', contem uma expressao, e termina com ')'
namedgroup : NAMESTART groupname NAMEEND expression CLOSE ;

//O nome de um grupo pode ser um ou mais caracteres
groupname : CHAR+ ;

//Um grupo de nao captura inicia com '(?:', contem uma expressao, e termina com ')'
nocapturegroup : NOCAPTUREGROUP expression CLOSE ;

//Um comentario inicia com '(?#', contem um texto qualquer, e termina com ')'
comment : COMMENT characters CLOSE;

characters : CHAR+ ; //Caracteres alpha numericos



/** Lexer Rules */

VERTICAL           : '|'                 ;
NAMESTART          : '(?<'               ;
NAMEEND            : '>'                 ;
NUMERICALGROUP     : '('                 ;
NOCAPTUREGROUP     : '(?:'               ;
COMMENT            : '(?#'               ;
CLOSE              : ')'                 ;
CHAR               : [A-Za-z0-9 ]        ;
WS                 : [\r\n\t] -> skip    ;
