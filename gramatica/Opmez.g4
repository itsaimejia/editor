grammar Opmez;

program: DEFINEFUNC INITIAL ARROWOPEN ARROWCLOSE KEYSOC body* KEYSOC #cuerpo;


body:
    PRINT expr  ENDLINE #impresion
    |
    INT ID '=' expr ENDLINE #asigDeclar
    |
    INT ID ENDLINE #declaracion
    |
    ID '=' expr ENDLINE #asignacion
    ;

expr:
    expr op=(MULT|DIV) expr #multDiv
    |
    expr op=(SUM|SUB) expr #sumSub
    |
    NUM #num
    |
    ID #id
    |
    ARROWOPEN expr ARROWCLOSE #parentesis
    ;

DEFINEFUNC: '#';
KEYSOC:'|';
ARROWOPEN: '<';
ARROWCLOSE:'>';
INITIAL:'initial';
ENDLINE:'!';
PRINT:'systalk';
INT:'decimalnt';
MULT:'*';
DIV:'/';
SUM:'+';
SUB:'-';
NUM:[0-9]+;
ID:[a-zA-Z]+[a-zA-Z0-9]*;

LINECOM: '@' .*?  '\n' -> skip;
MULTILINECOM: '@{' .*? '}@' -> skip;
WS:[ \t\r\n]+ -> skip;