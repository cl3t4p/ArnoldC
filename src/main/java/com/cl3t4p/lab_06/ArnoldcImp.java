package com.cl3t4p.lab_06;

import com.cl3t4p.lab_06.parser.ArnoldcBaseVisitor;
import com.cl3t4p.lab_06.parser.ArnoldcParser;
import com.cl3t4p.lab_06.parser.ArnoldcParser.BoolContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.CmdContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.CommandsContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.ExpContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.FunCallContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.FunDeclNonReturnContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.FunDeclReturnContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.Fun_decl_argsContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.IdContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.IfEndContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.NatContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.OpAndOrContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.OpEqContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.OpEqGrContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.OpMinPlusMultModDivContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.ParseErrorContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.PrintContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.ProgContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.StrContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.VarAssignContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.VarAssignFunContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.VarDeclContext;
import com.cl3t4p.lab_06.parser.ArnoldcParser.WhileContext;
import com.cl3t4p.lab_06.value.ComValue;
import com.cl3t4p.lab_06.value.ExpValue;
import com.cl3t4p.lab_06.value.FunValue;
import com.cl3t4p.lab_06.value.Function;
import com.cl3t4p.lab_06.value.NatValue;
import com.cl3t4p.lab_06.value.StringValue;
import com.cl3t4p.lab_06.value.Value;


public class ArnoldcImp extends ArnoldcBaseVisitor<Value> {


    Memory memory = new Memory();

    public Memory getMemory() {
        return memory;
    }

    public ExpValue<?> visitExp(ExpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    public Function visitFunExp(ExpContext ctx) {
        try {
            return ((ExpValue<Function>) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Function expression expected.");
            System.exit(1);
        }

        return null; // unreachable code
    }

    public int visitNatExp(ExpContext ctx) {
        try {
            return ((ExpValue<Integer>) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Natural number expected.");
            System.exit(1);
        }

        return 0; // unreachable code
    }

    @Override
    public Value visitWhile(WhileContext ctx) {
        while (visitNatExp(ctx.exp()) != 0) {
            visit(ctx.commands());
        }
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitIfEnd(IfEndContext ctx) {
        if (visitNatExp(ctx.exp()) != 0){
            visit(ctx.commands(0));
        }else{
            visit(ctx.commands(1));
        }
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitBool(BoolContext ctx) {
        if (ctx.getText().equals("@NO PROBLEMO")) {
            return new NatValue(1);
        } else {
            return new NatValue(0);
        }
    }

    public Value visitFunCall(FunCallContext ctx) {
        Value fun = memory.get(ctx.ID().getText());
        if (fun instanceof ExpValue<?>) {
            ExpValue<?> expValue = (ExpValue<?>) fun;
            if (expValue.toJavaValue() instanceof Function) {
                Function function = (Function) expValue.toJavaValue();
                function.callMethod(ctx.exp());
                return ComValue.INSTANCE;
            }
        }
        System.err.println(ctx.ID().getText() + " is not a function.");
        System.exit(1);
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitFunDeclNonReturn(FunDeclNonReturnContext ctx) {
        Function funcion = new Function(ctx, this);
        memory.put(funcion.getName(),new FunValue(funcion));
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitFunDeclReturn(FunDeclReturnContext ctx) {
        Function funcion = new Function(ctx, this);
        memory.put(funcion.getName(),new FunValue(funcion));
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitId(IdContext ctx) {
        return memory.get(ctx.getText());
    }

    @Override
    public Value visitNat(NatContext ctx) {
        return new NatValue(Integer.parseInt(ctx.getText()));
    }

    @Override
    public Value visitOpAndOr(OpAndOrContext ctx) {
        boolean val2 = visitNatExp(ctx.exp()) != 0;
        if (memory.getActive_variable() == null) {
            System.err.println("Active variable is null.");
            System.exit(1);
        }

        boolean val1 = memory.getActive_variable().toJavaValue() != 0;

        switch (ctx.op.getType()) {
            case ArnoldcParser.OP_AND -> 
                memory.setActive_variable(new NatValue(val1 && val2 ? 1 : 0));

            case ArnoldcParser.OP_OR -> 
                memory.setActive_variable(new NatValue(val1 || val2 ? 1 : 0));
        }
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitOpEq(OpEqContext ctx) {
        int val2 = visitNatExp(ctx.exp());
        if (memory.getActive_variable() == null) {
            System.err.println("Active variable is null.");
            System.exit(1);
        }

        int val1 = memory.getActive_variable().toJavaValue();
        memory.setActive_variable(new NatValue(val1 == val2 ? 1 : 0));
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitOpEqGr(OpEqGrContext ctx) {
        int val2 = visitNatExp(ctx.exp());
        if (memory.getActive_variable() == null) {
            System.err.println("Active variable is null.");
            System.exit(1);
        }

        int val1 = memory.getActive_variable().toJavaValue();

        memory.setActive_variable(new NatValue(val1 >= val2 ? 1 : 0));
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitOpMinPlusMultModDiv(OpMinPlusMultModDivContext ctx) {
        int val2 = visitNatExp(ctx.exp());
        if (memory.getActive_variable() == null) {
            System.err.println("Active variable is null.");
            System.exit(1);
        }

        int val1 = memory.getActive_variable().toJavaValue();

        switch (ctx.op.getType()) {
            case ArnoldcParser.OP_PLUS -> 
                memory.setActive_variable(new NatValue(val1 + val2));

            case ArnoldcParser.OP_MINUS -> 
                memory.setActive_variable(new NatValue(val1 - val2));

            case ArnoldcParser.OP_MULT -> 
                memory.setActive_variable(new NatValue(val1 * val2));

            case ArnoldcParser.OP_DIV -> 
                memory.setActive_variable(new NatValue(val1 / val2));

            case ArnoldcParser.OP_MOD -> 
                memory.setActive_variable(new NatValue(val1 % val2));
        }
        return ComValue.INSTANCE;
    }
    
    @Override
    public Value visitPrint(PrintContext ctx) {
        System.out.println(visitExp(ctx.exp()).toJavaValue().toString());
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitStr(StrContext ctx) {
        return new StringValue(ctx.getText());
    }

    @Override
    public Value visitVarAssign(VarAssignContext ctx) {
        String key = ctx.ID().getText();
        Value value = visitExp(ctx.exp());
        if (value instanceof NatValue natVal) {
            memory.setActive_variable(natVal);
            ctx.operation().forEach(this::visit);
            value = memory.getActive_variable();
            memory.setActive_variable(null);
        }
        memory.put(key, value);
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitVarAssignFun(VarAssignFunContext ctx) {
        String key = ctx.ID(0).getText();
        String funName = ctx.ID(1).getText();
        Value fun = memory.get(funName);
        if (fun instanceof FunValue funVal) {
            
            Function function = funVal.toJavaValue();
            
            function.callMethod(ctx.exp(), key);
        } else {
            System.err.println(funName + " is not a function.");
            System.exit(1);
        }
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitVarDecl(VarDeclContext ctx) {
        String key = ctx.ID().getText();
        Value value = visitExp(ctx.exp());
        if (value instanceof NatValue natVal) {
            memory.setActive_variable(natVal);
            ctx.operation().forEach(this::visit);
            value = memory.getActive_variable();
            memory.setActive_variable(null);
        }
        memory.put(key, value);
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitProg(ProgContext ctx) {
        ctx.fun_decl_cmd().forEach(this::visit);
        visit(ctx.commands());
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitFun_decl_args(Fun_decl_argsContext arg0) {
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitCommands(CommandsContext ctx) {
        ctx.cmd().forEach(this::visit);
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitCmd(CmdContext ctx) {
        visit(ctx.getChild(0));
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitParseError(ParseErrorContext ctx) {
        if(ctx.exp() != null){
            String value = visitExp(ctx.exp()).toJavaValue().toString();
            Colors.print("\n%rParse error msg : %g"+value+"%d");
        }else{
            Colors.print("%rParse error!");
        }

        System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
        System.exit(1);
        return ComValue.INSTANCE;
    }
    
}
