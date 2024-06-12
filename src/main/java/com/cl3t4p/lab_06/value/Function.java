package com.cl3t4p.lab_06.value;

import com.cl3t4p.lab_06.ArnoldcImp;
import com.cl3t4p.lab_06.parser.ArnoldcParser;
import com.cl3t4p.lab_06.parser.ArnoldcParser.ExpContext;

import java.util.List;

public class Function {

    private final ArnoldcImp imp;
    private final String name;
    private final List<String> args;
    private final ArnoldcParser.ExpContext returnValue;
    private final List<ArnoldcParser.CmdContext> commands;

    private static List<String> getArgs(List<ArnoldcParser.Fun_decl_argsContext> ctxs){
        return ctxs.stream()
        .map(ct -> ct.ID().getText())
        .toList();
    }

    public Function(ArnoldcParser.FunDeclReturnContext ctx,ArnoldcImp imp){
        this.imp = imp;
        this.name = ctx.ID().getText();
        this.args = getArgs(ctx.fun_decl_args());
        this.returnValue = ctx.exp();
        this.commands = ctx.commands().cmd();
    }

    public Function(ArnoldcParser.FunDeclNonReturnContext ctx, ArnoldcImp imp){
        this.imp = imp;
        this.name = ctx.ID().getText();
        this.args = getArgs(ctx.fun_decl_args());
        this.returnValue = null;
        this.commands = ctx.commands().cmd();
    }

    public String getName() {
        return name;
    }



    public void callMethod(List<ExpContext> values,String returnVar){
        if(values.size() != args.size()){
            System.err.println("Method " + name + " called with wrong number of arguments");
            System.exit(1);
        }
        for(int i = 0; i < args.size(); i++){
            imp.getMemory().put(args.get(i),imp.visit(values.get(i)));
        }

        commands.forEach(imp::visit);

        if (returnVar != null){
            Value returnValue = imp.visit(this.returnValue);
            imp.getMemory().put(returnVar,returnValue);
        }
    }



    public void callMethod(List<ExpContext> values){
        callMethod(values,null);
    }

    @Override
    public String toString() {
        return "%rFunction{" +
                "name='%c" + name + '\'' +
                "%r, args=%c" + args +
                "%r, returnValue=%c" + returnValue +
                "%r, commands=%c" + commands.size() +
                "%r}%d";
    }
}
