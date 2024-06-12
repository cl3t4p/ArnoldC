grammar Imp;

prog : com EOF ;

com : IF exp THEN com RBRACE ELSE LBRACE com RBRACE    # if
    | ID ASSIGN exp                                                     # assign
    | SKIPP                                                             # skip
    | com NEW_L com                                                     # seq
    | WHILE exp NEW_L com END_WHILE                                     # while
    | OUT LPAR exp RPAR                                                 # out
    | DECLAR                                                            # decMethod
    ;
met :

exp : NAT                                 # nat
    | BOOL                                # bool
    | STRING                              # string
    | TOSTR LPAR exp RPAR                 # tostr
    | exp CONCAT exp                      # concat
    | LPAR exp RPAR                       # parExp
    | <assoc=right> exp POW exp           # pow
    | NOT exp                             # not
    | exp op=(DIV | MUL | MOD) exp        # divMulMod
    | exp op=(PLUS | MINUS) exp           # plusMinus
    | exp op=(LT | LEQ | GEQ | GT) exp    # cmpExp
    | exp op=(EQQ | NEQ) exp              # eqExp
    | exp op=(AND | OR) exp               # logicExp
    | ID                                  # id
    | ID LSQUARE exp RSQUARE              # array
    ;

NAT : '0' | [1-9][0-9]* ;
BOOL : 'NO PROBLEMO' | 'I LIED' ;

CONCAT: '.' ;
PLUS  : 'GET UP' ;
MINUS : 'GET DOWN';
MUL   : 'YOU\'RE FIRED';
DIV   : 'HE HAD TO SPLIT' ;
MOD   : 'I LET HIM GO' ;
POW   : '^' ;

AND : 'KNOCK KNOCK' ;
OR  : 'CONSIDER THAT A DIVORCE' ;

EQQ : 'YOU ARE NOT YOU YOU ARE ME' ;
NEQ : '!=' ;
LEQ : '<=' ;
GEQ : '>=' ;
LT  : '<' ;
GT  : 'LET OFF SOME STEAM BENNET' ;
NOT : '!' ;

IF     : 'BECAUSE I\'M GOING TO SAY PLEASE';
THEN   : 'then' ;
ELSE   : 'BULLSHIT' ;
WHILE  : 'STICK AROUND' ;
END_WHILE: 'CHILL';
SKIPP  : 'skip' ;
ASSIGN : '=' ;
OUT    : 'out' ;


LPAR      : '(' ;
RPAR      : ')';
LBRACE    : '{' ;
RBRACE    : '}' ;
LSQUARE   : '[' ;
RSQUARE   : ']' ;
SEMICOLON : ';' ;
NEW_L     : '\n';

TOSTR     : 'tostr';
STRING    : '"' (ESC | ~["\\])* '"'
    ;

fragment ESC
    : '\\' [btnfr"\\];


ID : [a-z]+ ;

WS : [ \t\r\n]+ -> skip ;