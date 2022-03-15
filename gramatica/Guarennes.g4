grammar Guarennes;

program: FUNCOPEN INITIAL '('')' ':' body* FUNCCLOSE #cuerpo;


body:
    PRINT  expr  ';' #impresion
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

FUNCOPEN:'__func';
FUNCCLOSE:'func__';
INITIAL:'initial';
PRINT:'tanganana';
INT:'tangananica';
MULT:'*';
DIV:'/';
SUM:'+';
SUB:'-';
NUM:[0-9]+;
ID:[a-zA-Z]+;

WS:[ \t\r\n]+ -> skip;