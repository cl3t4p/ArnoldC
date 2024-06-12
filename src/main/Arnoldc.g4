grammar Arnoldc;

prog: fun_decl_cmd* BEGIN_MAIN commands END_MAIN;

commands: cmd*;

cmd:
	var_decl_cmd
	| var_assign_fun
	| var_assign_cmd
	| print_cmd
	| if_cmd
	| while_cmd
	| fun_decl_cmd
	| call_fun_cmd
	| perse_error_cmd;

perse_error_cmd: PARSE_ERROR exp? # parseError;

call_fun_cmd: FUN_CALL ID exp* # funCall;

print_cmd: PRINT exp # print;

var_decl_cmd: VAR_INIT ID VAR_SET_INIT exp operation* # varDecl;

if_cmd: IF exp commands ELSE commands END_IF # ifEnd;

while_cmd: WHILE exp commands END_WHILE # while;

exp: ID # id | NAT # nat | BOOL # bool | STRING # str;

var_assign_cmd:
	VAR_SET ID SETVALUE exp operation* VAR_ENDSET # varAssign;

var_assign_fun: OP_CALL_FUN ID FUN_CALL ID exp* # varAssignFun;

operation:
	op = (OP_MINUS | OP_PLUS | OP_MULT | OP_MOD | OP_DIV) exp	# opMinPlusMultModDiv
	| OP_EQUALS exp												# opEq
	| OP_GRTHAN exp												# opEqGr
	| op = (OP_OR | OP_AND) exp									# opAndOr;

fun_decl_cmd:
	FUN_DECL ID fun_decl_args* commands FUN_END									# funDeclNonReturn
	| FUN_DECL ID fun_decl_args* FUN_NON_VOID commands FUN_RETURN exp FUN_END	# funDeclReturn;
fun_decl_args: FUN_ARG_DEC ID;

IF: 'BECAUSE I\'M GOING TO SAY PLEASE';
ELSE: 'BULLSHIT';
END_IF: 'YOU HAVE NO RESPECT FOR LOGIC';
WHILE: 'STICK AROUND';
END_WHILE: 'CHILL';

OP_PLUS: 'GET UP';
OP_MINUS: 'GET DOWN';
OP_MULT: 'YOU\'RE FIRED';
OP_DIV: 'HE HAD TO SPLIT';
OP_MOD: 'I LET HIM GO';
OP_EQUALS: 'YOU ARE NOT YOU YOU ARE ME';
OP_GRTHAN: 'LET OFF SOME STEAM BENNET';
OP_OR: 'CONSIDER THAT A DIVORCE';
OP_AND: 'KNOCK KNOCK';

BEGIN_MAIN: 'IT\'S SHOWTIME';
END_MAIN: 'YOU HAVE BEEN TERMINATED';

FUN_DECL: 'LISTEN TO ME VERY CAREFULLY';
FUN_NON_VOID: 'GIVE THESE PEOPLE AIR';
FUN_ARG_DEC:
	'I NEED YOUR CLOTHES YOUR BOOTS AND YOUR MOTORCYCLE';
FUN_RETURN: 'I\'LL BE BACK';
FUN_END: 'HASTA LA VISTA, BABY';

PARSE_ERROR: 'WHAT THE FUCK DID I DO WRONG';

FUN_CALL: 'DO IT NOW';

OP_CALL_FUN: 'GET YOUR ASS TO MARS';

VAR_INIT: 'HEY CHRISTMAS TREE';
VAR_SET_INIT: 'YOU SET US UP';

PRINT: 'TALK TO THE HAND';

VAR_SET: 'GET TO THE CHOPPER';
SETVALUE: 'HERE IS MY INVITATION';

VAR_ENDSET: 'ENOUGH TALK';

BOOL: '@' ('NO PROBLEMO' | 'I LIED');
NAT: '0' | [1-9][0-9]*;

STRING: '"' ('\\' [btnfr"\\] | ~["\\])* '"';

ID: [a-zA-Z]+ [0-9]*;
WS: [ \n\r\t]+ -> skip;