grammar Opmez;

program: DEFINEFUNC INITIAL PO PC KO body KC #cuerpo;

instructions:
    PRINT PO expr PC SCOL #impresion
    |
    if_sentence (elif_sentence | else_sentence)? #ifElse
    |
    DECLARE ID SCOL #declaracion
    |
    ID ASSIGN expr SCOL #asignacion
    |
    DECLARE ID ASSIGN expr SCOL #asigDeclar
    ;

elif_sentence: elif_frag_condition (elif_sentence | else_sentence)? #sentenciaElif;
elif_frag_condition: ELIF PO condition PC KO body KC #condicionElif;
if_sentence: IF PO condition PC KO body KC #sentenciaIf;
else_sentence: ELSE KO body KC #sentenciaElse;

body: instructions*;

condition:
    NOT condition #condicionNegacion
    |
    expr op=(EQT|NEQT) expr #condicionesIgualdadExpr
    |
    condition op=(EQT|NEQT) condition #condicionesIgualdad
    |
    expr op=(GT|LT) expr #condicionesMayMen
    |
    expr op=(GEQT|LEQT) expr #condicionesMayMenIgual
    |
    condition AND condition #condicionY
    |
    condition OR condition #condicionO
    |
    PO condition PC #condicionParentesis
    |
    TRUE #verdadero
    |
    FALSE #falso
    |
    '1' #uno
    |
    '0' #cero
    ;




expr:
    expr op=(MULT|DIV) expr #multDiv
    |
    expr op=(SUM|SUB) expr #sumSub
    |
    SUB? op=(INT| DOUBLE) #numero
    |
    SUB? ID #id
    |
    PO expr PC #parentesis
    ;


DEFINEFUNC: '#';
INITIAL:'initial';
KO:'->';
KC:'<-';
PO: '(';
PC:')';
IF:'if';
ELSE:'else';
ELIF:'elif';
SCOL:';';
ASSIGN:'=';
PRINT:'systalk';
DECLARE:'use';
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
MULT:'*';
DIV:'/';
SUM:'+';
SUB:'-';
INT:[0-9]+;
DOUBLE: [0-9]+'.'[0-9]+?;
ID:[a-zA-Z]+[a-zA-Z0-9]*;
LINECOM: '@' .*?  '\n' -> skip;
MULTILINECOM: '@{' .*? '}@' -> skip;

WS:[ \t\r\n]+ -> skip;