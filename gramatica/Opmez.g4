grammar Opmez;

program: DEFINEFUNC INITIAL PO PC KO body* KC #cuerpo;


body:
    PRINT expr  SCOL #impresion
    |
    if_sentence else_sentence? #ifElse
    |
    INT ID SCOL #declaracion
    |
    ID ASSIGN expr SCOL #asignacion
    |
    INT ID ASSIGN expr SCOL #asigDeclar
    ;

if_sentence: IF PO condition PC KO body* KC #sentenciaIf;
else_sentence: ELSE KO body* KC #sentenciaElse;

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
    NUM #num
    |
    ID #id
    |
    PO expr PC #parentesis
    ;

DEFINEFUNC: '#';
INITIAL:'initial';
KO:'{';
KC:'}';
PO: '(';
PC:')';
IF:'if';
ELSE:'else';
SCOL:';';
ASSIGN:'=';
PRINT:'systalk';
INT:'decimalnt';
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
NUM:[0-9]+;
ID:[a-zA-Z]+[a-zA-Z0-9]*;
LINECOM: '@' .*?  '\n' -> skip;
MULTILINECOM: '@{' .*? '}@' -> skip;

WS:[ \t\r\n]+ -> skip;