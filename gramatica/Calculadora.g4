grammar Calculadora;

program: instructions+;

instructions:
        expr NL #impresion
        |
        ID '=' expr NL #asignacion
        |
        NL #vacio
        ;

expr:
        expr op=(MULT|DIV) expr #multDiv
        |
        expr op=(SUM|SUB) expr #sumSub
        |
        INT #int
        |
        ID #id
        |
        '('expr')' #parentesis
        ;

NL:[\n];
MULT:'*';
DIV:'/';
SUM:'+';
SUB:'-';
INT:[0-9]+;
ID:[a-zA-Z]+;

WS:[ \t\r]+ -> skip;


