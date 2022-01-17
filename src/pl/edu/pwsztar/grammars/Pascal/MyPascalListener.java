package pl.edu.pwsztar.grammars.Pascal;

public class MyPascalListener extends pascalBaseListener{
    @Override
    public void enterProgram(pascalParser.ProgramContext ctx) {
        super.enterProgram(ctx);
        System.out.println();
    }

    @Override
    public void exitProgram(pascalParser.ProgramContext ctx) {
        super.exitProgram(ctx);
        System.out.println();
    }

    @Override
    public void enterProgramHeading(pascalParser.ProgramHeadingContext ctx) {
        super.enterProgramHeading(ctx);
        String mainFunction = "int " + ctx.PROGRAM() + "(";
        System.out.print(mainFunction);
    }

    @Override
    public void exitProgramHeading(pascalParser.ProgramHeadingContext ctx) {
        super.exitProgramHeading(ctx);
        System.out.println(")");
    }

    @Override
    public void enterBlock(pascalParser.BlockContext ctx) {
        super.enterBlock(ctx);
        System.out.println("{");
    }

    @Override
    public void exitBlock(pascalParser.BlockContext ctx) {
        super.exitBlock(ctx);
        System.out.println("return 0;");
        System.out.println("}");
    }

    @Override
    public void exitTypeDefinitionPart(pascalParser.TypeDefinitionPartContext ctx) {
        super.exitTypeDefinitionPart(ctx);
        System.out.println(";");
    }

    @Override
    public void enterTypeDefinition(pascalParser.TypeDefinitionContext ctx) {
        System.out.print("int " + ctx.identifier().IDENT() + ctx.EQUAL());
    }

    @Override
    public void enterProcedureStatement(pascalParser.ProcedureStatementContext ctx) {
        super.enterProcedureStatement(ctx);
        String val = ctx.identifier().IDENT().getText();

        if(val.equals("writeln")){
            val = "printf";
        }

        if(val.equals("readln")){
            val = "scanf";
        }

        System.out.print(val + ctx.LPAREN());
    }

    @Override
    public void exitProcedureStatement(pascalParser.ProcedureStatementContext ctx) {
        super.exitProcedureStatement(ctx);
        System.out.println(");");
    }

    @Override
    public void enterRecordType(pascalParser.RecordTypeContext ctx) {
        System.out.print(ctx.RECORD());
    }

    @Override
    public void enterIdentifierList(pascalParser.IdentifierListContext ctx) {
        super.enterIdentifierList(ctx);
        System.out.print(ctx.getText());
    }

    @Override
    public void enterParameterList(pascalParser.ParameterListContext ctx) {
        super.enterParameterList(ctx);
        System.out.print(ctx.getText());
    }

    @Override
    public void enterVariableDeclaration(pascalParser.VariableDeclarationContext ctx) {
        String val = ctx.type_().simpleType().typeIdentifier().getChild(0).getText();
        if(val.equals("integer")){
            val = "int";
        }
        System.out.print(val + " ");
    }

    @Override
    public void exitVariableDeclaration(pascalParser.VariableDeclarationContext ctx) {
        super.exitVariableDeclaration(ctx);
        System.out.println(";");
    }

    @Override
    public void enterIfStatement(pascalParser.IfStatementContext ctx) {
        super.enterIfStatement(ctx);
        System.out.println("if" + ctx.expression().getText() + "{");
    }

    @Override
    public void exitIfStatement(pascalParser.IfStatementContext ctx) {
        super.exitIfStatement(ctx);
        System.out.println("}");
    }

    @Override
    public void enterForStatement(pascalParser.ForStatementContext ctx) {
        super.enterForStatement(ctx);
        System.out.println("for(" + ctx.identifier().IDENT() + "=" + ctx.forList().initialValue().getText() + ";"+
                         ctx.identifier().IDENT() + "<=" + ctx.forList().finalValue().getText() + ";"+
                         ctx.identifier().IDENT() + "++){");
    }

    @Override
    public void exitForStatement(pascalParser.ForStatementContext ctx) {
        super.exitForStatement(ctx);
        System.out.println("}");
    }
}
