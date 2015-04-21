/**
 * Lexer para expressoes regulares, padrao POSIX ERE.
 */

lexer grammar RegularExpressionERELexer;

DOT             : '.'   ;
COMMA           : ','   ;
QUESTION        : '?'   ;
PLUS            : '+'   ;
ASTERISC        : '*'   ;
CURLYOPEN       : '{'   ;
CURLYCLOSE      : '}'   ;
LISTOPEN        : '['   ;
LISTCLOSE       : ']'   ;
DASH            : '-'   ;
CIRCUMFLEX      : '^'   ;
DOLAR           : '$'   ;
PIPE            : '|'   ;
GROUPOPEN       : '('   ;
GROUPCLOSE      : ')'   ;
ESCAPE          : '\\'  ;  //OBS: Apenas uma barra invertida
DIGIT           : [0-9] ;  //Digitos de 0 a 9


//Entra no modo CLASS quando encontra a abertura de uma classe
CLASSOPEN  : '[:' -> mode(CLASS) ;

//Todos os caracteres que nao sejam de controle
OTHER : ~[\u0000-\u001F\u007F-\u009F] ; //~ significa negacao

//Ignora quebras de linha e tabulacoes
WS : [\r\n\t] -> skip ;


/** ----- Island Grammars ----- */

/**
 * "Gramaticas Ilha" sao sub-gramaticas dentro de uma gramatica.
 * Definicao necessaria para que nao exista conflito entre as regras
 * dela e da gramatica principal.
 */

//Quando entra em uma classe, considera apenas os tokens abaixo.
mode CLASS ;

DIGITCLASS  : 'digit'  ;
SPACECLASS  : 'space'  ;
ALNUM       : 'alnum'  ;
ALPHA       : 'alpha'  ;
BLANK       : 'blank'  ;
CNTRL       : 'cntrl'  ;
GRAPH       : 'graph'  ;
LOWER       : 'lower'  ;
PRINT       : 'print'  ;
PUNCT       : 'punct'  ;
UPPER       : 'upper'  ;
XDIGIT      : 'xdigit' ;

//Sai do modo CLASS quando encontra o fechamento da classe
CLASSCLOSE  : ':]' -> mode(DEFAULT_MODE) ;
