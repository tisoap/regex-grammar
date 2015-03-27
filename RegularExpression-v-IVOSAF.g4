grammar RegularExpression;  //Nome da gramatica

/** Parser Rules */

//Regra incial de uma expressao regular, que pode ser:
expression : group                             //Um grupo de captura
           | position                         //Um "anchor" de posicionamento
           | list                             //Uma lista de caracteres
           | charclass                        //Uma classe de caracteres
           | CHAR                             //Caracteres quaisquer
           | expression quantifier          //uma expressao seguida de um quantificador
           | expression CHOICE expression   //Duas ou mais alternativas dentre varias expressoes
           | precondition expression      //Uma condicao seguida de uma expressao
           | expression postcondition     //Uma expressao seguida de uma condicao
           | expression expression             //Varias sub-expressoes
           ;

group : groupstart expression groupend ; //O tipo do grupo, uma expressao, e o fechamento do grupo

groupstart : NUMERICALGROUP  //Grupo numerado
           | NOCAPTUREGROUP  //Grupo de nao-captura
           | NAMEDGROUP      //Grupo nomeado
           ; 
 
groupend : CLOSE ;

precondition : preconditionstart expression preconditionend ; //O tipo de condicao, uma expressao, e o fechamento da condicao

preconditionstart : POSITIVELOOKBEHIND  //"Deve ter antes"
                  | NEGATIVELOOKBEHIND  //"Nao pode ter antes"
                  ;

preconditionend : CLOSE ;

postcondition : postconditionstart expression postconditionend ; //O tipo de condicao, uma expressao, e o fechamento da condicao

postconditionstart : POSITIVELOOKAHEAD  //"Deve ter depois"
                   | NEGATIVELOOKAHEAD  //"Nao pode ter depois"
                   ;
                   
postconditionend : CLOSE ;

quantifier: lazy    //A menor quantidade possivel
          | greedy  //A maior quantidade possivel
          ;

lazy   : quantifiersimbol QUESTION ; //Um simbolo quantificador seguido de ?
greedy : quantifiersimbol ; //Um simbolo quantificador

quantifiersimbol :  PLUS     //Um ou mais
                 | ASTERISC  //Zero ou mais
                 | QUESTION  //Zero ou um (pode ou nao conter)
                 | EXACT     //Exatamente X
                 | ATLEAST   //Pelo menos X
                 | BETWEEN   //Entre X e Y
                  ; 

list : BRACKETOPEN listype BRACKETCLOSE ; //O tipo de lista, entre colchetes

listype : negativelist  //lista de caracteres que devem existir 
        | positivelist   //lista de caracteres que nao devem existir
        ;

negativelist : CIRCUMFLEX characters+;  //^ Seguido de um ou mais caracteres
positivelist : characters+;             //apenas um ou mais caracteres

characters : charlist   //Lista de caracteres, como A-Z
           | charclass  //Classe de caracteres
           | CHAR       //Qualquer caractere
           ;

charlist : CHAR DASH CHAR ;  //Um caractere, uma traco, um caractere

position : CIRCUMFLEX  //^
         | DOLAR       //$
         ;

charclass : REVERSESOLIDUS classtype  // A barra invertida seguido do caratere que representa a classe
          | DOT                       // Um ponto . que representa qualquer caractere
          ;

classtype : positiveclass   //Classes de caracteres que indicam a presenca deles
          | negativeclass   //Classes de caracteres que indicam a ausencia deles
//        | codeclass       Selecao de um caratere por codigos numericos
          ;

//codeclass : ASCII           //Caracteres em codigo octal
//          | HEXADECIMAL       Caracteres em codigo hexadecimal
//          | UNICODE         //Caracteres em codigo UNICODE
//          | CONTROL         //Caracteres de controle. Ex: Ctrl+M
//          ;

positiveclass : LOWERW  //Alpha-numerico
              | LOWERS  //Espacos
              | LOWERD  //Digitos
              | LOWERT  //Tabulacoes
              | LOWERR  //"Carriage Return"
              | LOWERN  //Quebra de linha
              ;

negativeclass : UPERW  //Nao Alpha-numerico
              | UPERS  //Nao Espacos
              | UPERD  //Nao Digitos
              | UPERT  //Nao Tabulacoes
              | UPERR  //Nao "Carriage Return"
              | UPERN  //Nao Quebra de linha
              ;

/** Lexer Rules */

NAMEDGROUP         : '(?<' [a-zA-Z0-9]+ '>'     ;
NUMERICALGROUP     : '('                        ;
NOCAPTUREGROUP     : '(?:'                      ;
CLOSE              : ')'                        ;
POSITIVELOOKBEHIND : '(?<='                     ;
NEGATIVELOOKBEHIND : '(?<!'                     ;
POSITIVELOOKAHEAD  : '(?='                      ;
NEGATIVELOOKAHEAD  : '(?!'                      ;
QUESTION           : '?'                        ;
PLUS               : '+'                        ;
ASTERISC           : '*'                        ;
EXACT              : '{' [\d]+ '}'              ;
ATLEAST            : '{' [\d]+ ',}'             ;
BETWEEN            : '{' [\d]+ ',' [\d]+ '}'    ;
CHOICE             : '|'                        ;
BRACKETOPEN        : '['                        ;
BRACKETCLOSE       : ']'                        ;
CIRCUMFLEX         : '^'                        ;
DOLAR              : '$'                        ;
DASH               : '-'                        ;
CHAR               : (.)                        ;
REVERSESOLIDUS     : '\\'                       ;
DOT                : '.'                        ;
LOWERW             : 'w'                        ;
LOWERS             : 's'                        ;
LOWERD             : 'd'                        ;
LOWERT             : 't'                        ;
LOWERR             : 'r'                        ;
LOWERN             : 'n'                        ;
UPERW              : 'W'                        ;
UPERS              : 'S'                        ;
UPERD              : 'D'                        ;
UPERT              : 'T'                        ;
UPERR              : 'R'                        ;
UPERN              : 'N'                        ;
WS                 : [\t\r\n]+ -> skip          ;
