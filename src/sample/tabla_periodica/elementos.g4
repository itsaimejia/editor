grammar elementos;


inicio  : elem+;
elem    : n=NAME
        {
            Evaluar e = new Evaluar($n.text);
            e.informacion();
        };

NAME    : [a-zA-Z]+;

WS      : [ \n\r\t]->skip;