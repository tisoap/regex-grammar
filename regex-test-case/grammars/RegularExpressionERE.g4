/**
 * Gramatica para expressoes regulares, padrao POSIX ERE
 * (Portable Operating System Interface Extended Regular Expressions)
 * 
 * http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/V1_chap09.html
 */

grammar RegularExpressionERE;


/** Parser Rules */

//Definicao de uma exprecao regular, que pode ser:
expression : multiple                //Multiplas opcoes
           | group                   //Um grupo de captura
           | anchor                  //Uma posicao
           | repetition              //Uma repeticao
           | expression expression   //Varias exprecoes
           | list                    //Uma lista de possiveis caracteres
           | charclass               //Uma classe de caracteres
           | anychar                 //Qualquer caractere
           | escaped                 //Caracteres escapados
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
              | charclass                     //Uma classe de caracteres
              | anychar                       //Qualquer caractere
              | characters                    //Caracteres em sequencia
              ;

//Grupos de captura sao expressoes entre parenteses
group : OPEN expression CLOSE ;

//Uma posicao pode ser de inicio ou fim
anchor : startAnchor //inicio
       | endAnchor   //fim
       ;

startAnchor : CIRCUMFLEX ; //^
endAnchor   : DOLAR ;      //$

//Um elemento a ser quantificado e o simbolo repetidor
//O simbolo repetidor se associa a esquerda do elemento quantificado
repetition : <assoc=right> quantified quantifier ;

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

oneOrMore   : PLUS ;      //+
zeroOrMore  : ASTERISC ;  //*
conditional : QUESTION ;  //?

//TODO Garantir que n>0 e n<m
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

//Uma lista negativa e qualquer quantidade de elementos de lista entre colchetes, com ^ no comeco
negativeList : BRACKETOPEN CIRCUMFLEX listElement* BRACKETCLOSE;

//Uma lista positiva e qualquer quantidade de elementos de lista entre colchetes
positiveList : BRACKETOPEN listElement* BRACKETCLOSE;

//Um elemento de lista pode ser:
listElement : range        //Uma serie de caracteres
            | charclass    //Uma classe de caracteres
            | listEscaped  //Um caractere especial de lista escapado
            | character    //Um caractere
            ;

//Uma serie sao dois caracteres separados por um traco
//TODO Garantir que o primeiro caractere precede o segundo
range : (character|listEscaped) DASH (character|listEscaped) ;

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

//O elemento que representa qualquer caractere e o ponto.
anychar : DOT ;

//Um caractere escapado e uma barra invertida seguida do caractere
escaped : REVERSESOLIDUS special
        | REVERSESOLIDUS character
        ;

//Todos os possiveis caracteres especiais
special : DOT
        | QUESTION
        | PLUS
        | ASTERISC
        | CURLYOPEN
        | CURLYCLOSE
        | BRACKETOPEN
        | BRACKETCLOSE
        | CIRCUMFLEX
        | DOLAR
        | PIPE
        | OPEN
        | CLOSE
        | REVERSESOLIDUS
        ;

//Um caractere escapado e uma barra invertida seguida do caractere
listEscaped : REVERSESOLIDUS listEspecial
            | REVERSESOLIDUS character
            ;

//Todos os possiveis caracteres especiais de lista
listEspecial : DASH
             | BRACKETOPEN
             | BRACKETCLOSE
             | REVERSESOLIDUS
             ;

//Uma colecao de caracteres sao um ou mais caracteres
characters : character+ ;

//Um caractere pode ser um digito, letra do alfabeto latino ou espaco
character  : (DIGIT|LATIN|SPACE) ;


/** Lexer Rules */

SPACE              : ' '  ;
DOT                : '.'  ;
COMMA              : ','  ;
QUESTION           : '?'  ;
PLUS               : '+'  ;
ASTERISC           : '*'  ;
CURLYOPEN          : '{'  ;
CURLYCLOSE         : '}'  ;
BRACKETOPEN        : '['  ;
BRACKETCLOSE       : ']'  ;
DASH               : '-'  ;
CIRCUMFLEX         : '^'  ;
DOLAR              : '$'  ;
PIPE               : '|'  ;
OPEN               : '('  ;
CLOSE              : ')'  ;
CLASSOPEN          : '[:' ;
CLASSCLOSE         : ':]' ;
REVERSESOLIDUS     : '\\' ;


ALNUM              : 'alnum'  ;
ALPHA              : 'alpha'  ;
BLANK              : 'blank'  ;
CNTRL              : 'cntrl'  ;
DIGITCLASS         : 'digit'  ;
GRAPH              : 'graph'  ;
LOWER              : 'lower'  ;
PRINT              : 'print'  ;
PUNCT              : 'punct'  ;
SPACECLASS         : 'space'  ;
UPPER              : 'upper'  ;
XDIGIT             : 'xdigit' ;


DIGIT              : [0-9]    ;
LATIN              : [A-Za-z] ;

//ALL                : [\u0000-\uFFFF] ;
//PRINTABLE          : [^\x00-\x1F\x80-\x9F] ;

/** Lexer Skip Rules */

WS : [\r\n\t] -> skip ; //Ignora quebras de linha e tabulacoes

