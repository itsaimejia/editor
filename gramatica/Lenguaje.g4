grammar Lenguaje;

program: file;
file: VOID MAIN '('')' '{' body* '}' #archivo;

body:
    PRINTF  '(' expr ')'  ';' #impresion
    |
    INT ID '=' expr ';' #asigDeclar
    |
    INT ID ';' #declaracion
    |
    ID '=' expr ';' #asignacion
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
    '('expr')' #parentesis
    ;

VOID: 'void';
MAIN:'main';
PRINTF:'printf';
INT:'int';
MULT:'*';
DIV:'/';
SUM:'+';
SUB:'-';
NUM:[0-9]+;
ID:[a-zA-Z]+[a-zA-Z0-9]*;
LINECOM: '//' .*?  '\n' -> skip;
MULTILINECOM: '/*' .*? '*/' -> skip;
WS:[ \t\r\n]+ -> skip;
