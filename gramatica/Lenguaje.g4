grammar Lenguaje;

program: file;
file: VOID MAIN PO PC KO body* KC #archivo;

body:
    PRINTF  PO expr PC  SCOL #impresion
    |
    if_sentence (elif_sentence | else_sentence)? #ifElse
    |
    INT ID ASSIGN expr SCOL #asigDeclar
    |
    INT ID SCOL #declaracion
    |
    ID ASSIGN expr SCOL #asignacion
    ;
elif_sentence: ELSE if_sentence #sentenciaElif;
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
LINECOM: '//' .*?  '\n' -> skip;
MULTILINECOM: '/*' .*? '*/' -> skip;
WS:[ \t\r\n]+ -> skip;