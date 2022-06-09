grammar Lenguaje;

program: file;
file: VOID MAIN PO PC KO body* KC #archivo;

body:
    print
    |
    if_else_elif
    |
    assigment_declaration
    |
    declaration
    |
    assigment
    |
    cicle
    ;

print: PRINTF  PO expr PC  SCOL #impresionExpr |PRINTF  PO STRING PC  SCOL #impresionString;
assigment: ID ASSIGN expr SCOL #asignacion;
assigment_declaration: INT ID ASSIGN expr SCOL #asigDeclar;
declaration: INT ID SCOL #declaracion;
cicle: WHILE PO condition PC KO body* KC #ciclo;
if_else_elif: if_sentence (elif_sentence | else_sentence)? #ifElse;
elif_sentence: ELSE if_sentence (elif_sentence | else_sentence)? #sentenciaElif;
if_sentence: IF PO condition PC KO body* KC #sentenceIf;
else_sentence: ELSE KO body* KC #sentenciaElse;

condition:
    NOT condition #condicionNegacion
    |
    condition (EQT|NEQT) condition #condicionesIgualdad
    |
    condition (GT|LT|GEQT|LEQT) condition #condicionesRelacional
    |
    condition AND condition #condicionY
    |
    condition OR condition #condicionO
    |
    TRUE #verdadero
    |
    FALSE #falso
    |
    PO condition PC #condicionParentesis
    |
    expr #expresion
    ;


expr:
    expr op=(MULT|DIV) expr #multDiv
    |
    expr op=(SUM|SUB) expr #sumSub
    |
    SUB? NUM #num
    |
    ID #id
    |
    PO expr PC #parentesis
    ;

VOID: 'void';
MAIN:'main';
PO:'(';
PC:')';
KO:'{';
KC:'}';
PRINTF:'printf';
INT:'int';
IF:'if';
ELSE:'else';
FOR:'for';
WHILE: 'while';
MULT:'*';
DIV:'/';
SUM:'+';
SUB:'-';
ASSIGN:'=';
SCOL:';';
EQT:'==';
NEQT:'!=';
GT:'>';
LT:'<';
GEQT:'>=';
LEQT:'<=';
AND:'&&';
OR:'||';
TRUE:'true';
FALSE:'false';
NOT:'!';
NUM:[0-9]+;
ID:[a-zA-Z]+[a-zA-Z0-9]*;
STRING: '"'.*?'"';
LINECOM: '//' .*?  '\n' -> skip;
MULTILINECOM: '/*' .*? '*/' -> skip;
WS:[ \t\r\n]+ -> skip;