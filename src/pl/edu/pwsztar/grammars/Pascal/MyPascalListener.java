package pl.edu.pwsztar.grammars.Pascal;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyPascalListener extends pascalBaseListener{
    @Override
    public void enterProgram(pascalParser.ProgramContext ctx) {
        super.enterProgram(ctx);
    }

    @Override
    public void exitProgram(pascalParser.ProgramContext ctx) {
        super.exitProgram(ctx);
    }

    @Override
    public void enterProgramHeading(pascalParser.ProgramHeadingContext ctx) {
        super.enterProgramHeading(ctx);
    }

    @Override
    public void exitProgramHeading(pascalParser.ProgramHeadingContext ctx) {
        super.exitProgramHeading(ctx);
    }

    @Override
    public void enterIdentifier(pascalParser.IdentifierContext ctx) {
        super.enterIdentifier(ctx);
    }

    @Override
    public void exitIdentifier(pascalParser.IdentifierContext ctx) {
        super.exitIdentifier(ctx);
    }

    @Override
    public void enterBlock(pascalParser.BlockContext ctx) {
        super.enterBlock(ctx);
    }

    @Override
    public void exitBlock(pascalParser.BlockContext ctx) {
        super.exitBlock(ctx);
    }

    @Override
    public void enterUsesUnitsPart(pascalParser.UsesUnitsPartContext ctx) {
        super.enterUsesUnitsPart(ctx);
    }

    @Override
    public void exitUsesUnitsPart(pascalParser.UsesUnitsPartContext ctx) {
        super.exitUsesUnitsPart(ctx);
    }

    @Override
    public void enterLabelDeclarationPart(pascalParser.LabelDeclarationPartContext ctx) {
        super.enterLabelDeclarationPart(ctx);
    }

    @Override
    public void exitLabelDeclarationPart(pascalParser.LabelDeclarationPartContext ctx) {
        super.exitLabelDeclarationPart(ctx);
    }

    @Override
    public void enterLabel(pascalParser.LabelContext ctx) {
        super.enterLabel(ctx);
    }

    @Override
    public void exitLabel(pascalParser.LabelContext ctx) {
        super.exitLabel(ctx);
    }

    @Override
    public void enterConstantDefinitionPart(pascalParser.ConstantDefinitionPartContext ctx) {
        super.enterConstantDefinitionPart(ctx);
    }

    @Override
    public void exitConstantDefinitionPart(pascalParser.ConstantDefinitionPartContext ctx) {
        super.exitConstantDefinitionPart(ctx);
    }

    @Override
    public void enterConstantDefinition(pascalParser.ConstantDefinitionContext ctx) {
        super.enterConstantDefinition(ctx);
    }

    @Override
    public void exitConstantDefinition(pascalParser.ConstantDefinitionContext ctx) {
        super.exitConstantDefinition(ctx);
    }

    @Override
    public void enterConstantChr(pascalParser.ConstantChrContext ctx) {
        super.enterConstantChr(ctx);
    }

    @Override
    public void exitConstantChr(pascalParser.ConstantChrContext ctx) {
        super.exitConstantChr(ctx);
    }

    @Override
    public void enterConstant(pascalParser.ConstantContext ctx) {
        super.enterConstant(ctx);
    }

    @Override
    public void exitConstant(pascalParser.ConstantContext ctx) {
        super.exitConstant(ctx);
    }

    @Override
    public void enterUnsignedNumber(pascalParser.UnsignedNumberContext ctx) {
        super.enterUnsignedNumber(ctx);
    }

    @Override
    public void exitUnsignedNumber(pascalParser.UnsignedNumberContext ctx) {
        super.exitUnsignedNumber(ctx);
    }

    @Override
    public void enterUnsignedInteger(pascalParser.UnsignedIntegerContext ctx) {
        super.enterUnsignedInteger(ctx);
    }

    @Override
    public void exitUnsignedInteger(pascalParser.UnsignedIntegerContext ctx) {
        super.exitUnsignedInteger(ctx);
    }

    @Override
    public void enterUnsignedReal(pascalParser.UnsignedRealContext ctx) {
        super.enterUnsignedReal(ctx);
    }

    @Override
    public void exitUnsignedReal(pascalParser.UnsignedRealContext ctx) {
        super.exitUnsignedReal(ctx);
    }

    @Override
    public void enterSign(pascalParser.SignContext ctx) {
        super.enterSign(ctx);
    }

    @Override
    public void exitSign(pascalParser.SignContext ctx) {
        super.exitSign(ctx);
    }

    @Override
    public void enterBool_(pascalParser.Bool_Context ctx) {
        super.enterBool_(ctx);
    }

    @Override
    public void exitBool_(pascalParser.Bool_Context ctx) {
        super.exitBool_(ctx);
    }

    @Override
    public void enterString(pascalParser.StringContext ctx) {
        super.enterString(ctx);
    }

    @Override
    public void exitString(pascalParser.StringContext ctx) {
        super.exitString(ctx);
    }

    @Override
    public void enterTypeDefinitionPart(pascalParser.TypeDefinitionPartContext ctx) {
        super.enterTypeDefinitionPart(ctx);
    }

    @Override
    public void exitTypeDefinitionPart(pascalParser.TypeDefinitionPartContext ctx) {
        super.exitTypeDefinitionPart(ctx);
    }

    @Override
    public void enterTypeDefinition(pascalParser.TypeDefinitionContext ctx) {
        super.enterTypeDefinition(ctx);
    }

    @Override
    public void exitTypeDefinition(pascalParser.TypeDefinitionContext ctx) {
        super.exitTypeDefinition(ctx);
    }

    @Override
    public void enterFunctionType(pascalParser.FunctionTypeContext ctx) {
        super.enterFunctionType(ctx);
    }

    @Override
    public void exitFunctionType(pascalParser.FunctionTypeContext ctx) {
        super.exitFunctionType(ctx);
    }

    @Override
    public void enterProcedureType(pascalParser.ProcedureTypeContext ctx) {
        super.enterProcedureType(ctx);
    }

    @Override
    public void exitProcedureType(pascalParser.ProcedureTypeContext ctx) {
        super.exitProcedureType(ctx);
    }

    @Override
    public void enterType_(pascalParser.Type_Context ctx) {
        super.enterType_(ctx);
    }

    @Override
    public void exitType_(pascalParser.Type_Context ctx) {
        super.exitType_(ctx);
    }

    @Override
    public void enterSimpleType(pascalParser.SimpleTypeContext ctx) {
        super.enterSimpleType(ctx);
    }

    @Override
    public void exitSimpleType(pascalParser.SimpleTypeContext ctx) {
        super.exitSimpleType(ctx);
    }

    @Override
    public void enterScalarType(pascalParser.ScalarTypeContext ctx) {
        super.enterScalarType(ctx);
    }

    @Override
    public void exitScalarType(pascalParser.ScalarTypeContext ctx) {
        super.exitScalarType(ctx);
    }

    @Override
    public void enterSubrangeType(pascalParser.SubrangeTypeContext ctx) {
        super.enterSubrangeType(ctx);
    }

    @Override
    public void exitSubrangeType(pascalParser.SubrangeTypeContext ctx) {
        super.exitSubrangeType(ctx);
    }

    @Override
    public void enterTypeIdentifier(pascalParser.TypeIdentifierContext ctx) {
        super.enterTypeIdentifier(ctx);
    }

    @Override
    public void exitTypeIdentifier(pascalParser.TypeIdentifierContext ctx) {
        super.exitTypeIdentifier(ctx);
    }

    @Override
    public void enterStructuredType(pascalParser.StructuredTypeContext ctx) {
        super.enterStructuredType(ctx);
    }

    @Override
    public void exitStructuredType(pascalParser.StructuredTypeContext ctx) {
        super.exitStructuredType(ctx);
    }

    @Override
    public void enterUnpackedStructuredType(pascalParser.UnpackedStructuredTypeContext ctx) {
        super.enterUnpackedStructuredType(ctx);
    }

    @Override
    public void exitUnpackedStructuredType(pascalParser.UnpackedStructuredTypeContext ctx) {
        super.exitUnpackedStructuredType(ctx);
    }

    @Override
    public void enterStringtype(pascalParser.StringtypeContext ctx) {
        super.enterStringtype(ctx);
    }

    @Override
    public void exitStringtype(pascalParser.StringtypeContext ctx) {
        super.exitStringtype(ctx);
    }

    @Override
    public void enterArrayType(pascalParser.ArrayTypeContext ctx) {
        super.enterArrayType(ctx);
    }

    @Override
    public void exitArrayType(pascalParser.ArrayTypeContext ctx) {
        super.exitArrayType(ctx);
    }

    @Override
    public void enterTypeList(pascalParser.TypeListContext ctx) {
        super.enterTypeList(ctx);
    }

    @Override
    public void exitTypeList(pascalParser.TypeListContext ctx) {
        super.exitTypeList(ctx);
    }

    @Override
    public void enterIndexType(pascalParser.IndexTypeContext ctx) {
        super.enterIndexType(ctx);
    }

    @Override
    public void exitIndexType(pascalParser.IndexTypeContext ctx) {
        super.exitIndexType(ctx);
    }

    @Override
    public void enterComponentType(pascalParser.ComponentTypeContext ctx) {
        super.enterComponentType(ctx);
    }

    @Override
    public void exitComponentType(pascalParser.ComponentTypeContext ctx) {
        super.exitComponentType(ctx);
    }

    @Override
    public void enterRecordType(pascalParser.RecordTypeContext ctx) {
        super.enterRecordType(ctx);
    }

    @Override
    public void exitRecordType(pascalParser.RecordTypeContext ctx) {
        super.exitRecordType(ctx);
    }

    @Override
    public void enterFieldList(pascalParser.FieldListContext ctx) {
        super.enterFieldList(ctx);
    }

    @Override
    public void exitFieldList(pascalParser.FieldListContext ctx) {
        super.exitFieldList(ctx);
    }

    @Override
    public void enterFixedPart(pascalParser.FixedPartContext ctx) {
        super.enterFixedPart(ctx);
    }

    @Override
    public void exitFixedPart(pascalParser.FixedPartContext ctx) {
        super.exitFixedPart(ctx);
    }

    @Override
    public void enterRecordSection(pascalParser.RecordSectionContext ctx) {
        super.enterRecordSection(ctx);
    }

    @Override
    public void exitRecordSection(pascalParser.RecordSectionContext ctx) {
        super.exitRecordSection(ctx);
    }

    @Override
    public void enterVariantPart(pascalParser.VariantPartContext ctx) {
        super.enterVariantPart(ctx);
    }

    @Override
    public void exitVariantPart(pascalParser.VariantPartContext ctx) {
        super.exitVariantPart(ctx);
    }

    @Override
    public void enterTag(pascalParser.TagContext ctx) {
        super.enterTag(ctx);
    }

    @Override
    public void exitTag(pascalParser.TagContext ctx) {
        super.exitTag(ctx);
    }

    @Override
    public void enterVariant(pascalParser.VariantContext ctx) {
        super.enterVariant(ctx);
    }

    @Override
    public void exitVariant(pascalParser.VariantContext ctx) {
        super.exitVariant(ctx);
    }

    @Override
    public void enterSetType(pascalParser.SetTypeContext ctx) {
        super.enterSetType(ctx);
    }

    @Override
    public void exitSetType(pascalParser.SetTypeContext ctx) {
        super.exitSetType(ctx);
    }

    @Override
    public void enterBaseType(pascalParser.BaseTypeContext ctx) {
        super.enterBaseType(ctx);
    }

    @Override
    public void exitBaseType(pascalParser.BaseTypeContext ctx) {
        super.exitBaseType(ctx);
    }

    @Override
    public void enterFileType(pascalParser.FileTypeContext ctx) {
        super.enterFileType(ctx);
    }

    @Override
    public void exitFileType(pascalParser.FileTypeContext ctx) {
        super.exitFileType(ctx);
    }

    @Override
    public void enterPointerType(pascalParser.PointerTypeContext ctx) {
        super.enterPointerType(ctx);
    }

    @Override
    public void exitPointerType(pascalParser.PointerTypeContext ctx) {
        super.exitPointerType(ctx);
    }

    @Override
    public void enterVariableDeclarationPart(pascalParser.VariableDeclarationPartContext ctx) {
        super.enterVariableDeclarationPart(ctx);
    }

    @Override
    public void exitVariableDeclarationPart(pascalParser.VariableDeclarationPartContext ctx) {
        super.exitVariableDeclarationPart(ctx);
    }

    @Override
    public void enterVariableDeclaration(pascalParser.VariableDeclarationContext ctx) {
        super.enterVariableDeclaration(ctx);
    }

    @Override
    public void exitVariableDeclaration(pascalParser.VariableDeclarationContext ctx) {
        super.exitVariableDeclaration(ctx);
    }

    @Override
    public void enterProcedureAndFunctionDeclarationPart(pascalParser.ProcedureAndFunctionDeclarationPartContext ctx) {
        super.enterProcedureAndFunctionDeclarationPart(ctx);
    }

    @Override
    public void exitProcedureAndFunctionDeclarationPart(pascalParser.ProcedureAndFunctionDeclarationPartContext ctx) {
        super.exitProcedureAndFunctionDeclarationPart(ctx);
    }

    @Override
    public void enterProcedureOrFunctionDeclaration(pascalParser.ProcedureOrFunctionDeclarationContext ctx) {
        super.enterProcedureOrFunctionDeclaration(ctx);
    }

    @Override
    public void exitProcedureOrFunctionDeclaration(pascalParser.ProcedureOrFunctionDeclarationContext ctx) {
        super.exitProcedureOrFunctionDeclaration(ctx);
    }

    @Override
    public void enterProcedureDeclaration(pascalParser.ProcedureDeclarationContext ctx) {
        super.enterProcedureDeclaration(ctx);
    }

    @Override
    public void exitProcedureDeclaration(pascalParser.ProcedureDeclarationContext ctx) {
        super.exitProcedureDeclaration(ctx);
    }

    @Override
    public void enterFormalParameterList(pascalParser.FormalParameterListContext ctx) {
        super.enterFormalParameterList(ctx);
    }

    @Override
    public void exitFormalParameterList(pascalParser.FormalParameterListContext ctx) {
        super.exitFormalParameterList(ctx);
    }

    @Override
    public void enterFormalParameterSection(pascalParser.FormalParameterSectionContext ctx) {
        super.enterFormalParameterSection(ctx);
    }

    @Override
    public void exitFormalParameterSection(pascalParser.FormalParameterSectionContext ctx) {
        super.exitFormalParameterSection(ctx);
    }

    @Override
    public void enterParameterGroup(pascalParser.ParameterGroupContext ctx) {
        super.enterParameterGroup(ctx);
    }

    @Override
    public void exitParameterGroup(pascalParser.ParameterGroupContext ctx) {
        super.exitParameterGroup(ctx);
    }

    @Override
    public void enterIdentifierList(pascalParser.IdentifierListContext ctx) {
        super.enterIdentifierList(ctx);
    }

    @Override
    public void exitIdentifierList(pascalParser.IdentifierListContext ctx) {
        super.exitIdentifierList(ctx);
    }

    @Override
    public void enterConstList(pascalParser.ConstListContext ctx) {
        super.enterConstList(ctx);
    }

    @Override
    public void exitConstList(pascalParser.ConstListContext ctx) {
        super.exitConstList(ctx);
    }

    @Override
    public void enterFunctionDeclaration(pascalParser.FunctionDeclarationContext ctx) {
        super.enterFunctionDeclaration(ctx);
    }

    @Override
    public void exitFunctionDeclaration(pascalParser.FunctionDeclarationContext ctx) {
        super.exitFunctionDeclaration(ctx);
    }

    @Override
    public void enterResultType(pascalParser.ResultTypeContext ctx) {
        super.enterResultType(ctx);
    }

    @Override
    public void exitResultType(pascalParser.ResultTypeContext ctx) {
        super.exitResultType(ctx);
    }

    @Override
    public void enterStatement(pascalParser.StatementContext ctx) {
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(pascalParser.StatementContext ctx) {
        super.exitStatement(ctx);
    }

    @Override
    public void enterUnlabelledStatement(pascalParser.UnlabelledStatementContext ctx) {
        super.enterUnlabelledStatement(ctx);
    }

    @Override
    public void exitUnlabelledStatement(pascalParser.UnlabelledStatementContext ctx) {
        super.exitUnlabelledStatement(ctx);
    }

    @Override
    public void enterSimpleStatement(pascalParser.SimpleStatementContext ctx) {
        super.enterSimpleStatement(ctx);
    }

    @Override
    public void exitSimpleStatement(pascalParser.SimpleStatementContext ctx) {
        super.exitSimpleStatement(ctx);
    }

    @Override
    public void enterAssignmentStatement(pascalParser.AssignmentStatementContext ctx) {
        super.enterAssignmentStatement(ctx);
    }

    @Override
    public void exitAssignmentStatement(pascalParser.AssignmentStatementContext ctx) {
        super.exitAssignmentStatement(ctx);
    }

    @Override
    public void enterVariable(pascalParser.VariableContext ctx) {
        super.enterVariable(ctx);
    }

    @Override
    public void exitVariable(pascalParser.VariableContext ctx) {
        super.exitVariable(ctx);
    }

    @Override
    public void enterExpression(pascalParser.ExpressionContext ctx) {
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(pascalParser.ExpressionContext ctx) {
        super.exitExpression(ctx);
    }

    @Override
    public void enterRelationaloperator(pascalParser.RelationaloperatorContext ctx) {
        super.enterRelationaloperator(ctx);
    }

    @Override
    public void exitRelationaloperator(pascalParser.RelationaloperatorContext ctx) {
        super.exitRelationaloperator(ctx);
    }

    @Override
    public void enterSimpleExpression(pascalParser.SimpleExpressionContext ctx) {
        super.enterSimpleExpression(ctx);
    }

    @Override
    public void exitSimpleExpression(pascalParser.SimpleExpressionContext ctx) {
        super.exitSimpleExpression(ctx);
    }

    @Override
    public void enterAdditiveoperator(pascalParser.AdditiveoperatorContext ctx) {
        super.enterAdditiveoperator(ctx);
    }

    @Override
    public void exitAdditiveoperator(pascalParser.AdditiveoperatorContext ctx) {
        super.exitAdditiveoperator(ctx);
    }

    @Override
    public void enterTerm(pascalParser.TermContext ctx) {
        super.enterTerm(ctx);
    }

    @Override
    public void exitTerm(pascalParser.TermContext ctx) {
        super.exitTerm(ctx);
    }

    @Override
    public void enterMultiplicativeoperator(pascalParser.MultiplicativeoperatorContext ctx) {
        super.enterMultiplicativeoperator(ctx);
    }

    @Override
    public void exitMultiplicativeoperator(pascalParser.MultiplicativeoperatorContext ctx) {
        super.exitMultiplicativeoperator(ctx);
    }

    @Override
    public void enterSignedFactor(pascalParser.SignedFactorContext ctx) {
        super.enterSignedFactor(ctx);
    }

    @Override
    public void exitSignedFactor(pascalParser.SignedFactorContext ctx) {
        super.exitSignedFactor(ctx);
    }

    @Override
    public void enterFactor(pascalParser.FactorContext ctx) {
        super.enterFactor(ctx);
    }

    @Override
    public void exitFactor(pascalParser.FactorContext ctx) {
        super.exitFactor(ctx);
    }

    @Override
    public void enterUnsignedConstant(pascalParser.UnsignedConstantContext ctx) {
        super.enterUnsignedConstant(ctx);
    }

    @Override
    public void exitUnsignedConstant(pascalParser.UnsignedConstantContext ctx) {
        super.exitUnsignedConstant(ctx);
    }

    @Override
    public void enterFunctionDesignator(pascalParser.FunctionDesignatorContext ctx) {
        super.enterFunctionDesignator(ctx);
    }

    @Override
    public void exitFunctionDesignator(pascalParser.FunctionDesignatorContext ctx) {
        super.exitFunctionDesignator(ctx);
    }

    @Override
    public void enterParameterList(pascalParser.ParameterListContext ctx) {
        super.enterParameterList(ctx);
    }

    @Override
    public void exitParameterList(pascalParser.ParameterListContext ctx) {
        super.exitParameterList(ctx);
    }

    @Override
    public void enterSet_(pascalParser.Set_Context ctx) {
        super.enterSet_(ctx);
    }

    @Override
    public void exitSet_(pascalParser.Set_Context ctx) {
        super.exitSet_(ctx);
    }

    @Override
    public void enterElementList(pascalParser.ElementListContext ctx) {
        super.enterElementList(ctx);
    }

    @Override
    public void exitElementList(pascalParser.ElementListContext ctx) {
        super.exitElementList(ctx);
    }

    @Override
    public void enterElement(pascalParser.ElementContext ctx) {
        super.enterElement(ctx);
    }

    @Override
    public void exitElement(pascalParser.ElementContext ctx) {
        super.exitElement(ctx);
    }

    @Override
    public void enterProcedureStatement(pascalParser.ProcedureStatementContext ctx) {
        super.enterProcedureStatement(ctx);
    }

    @Override
    public void exitProcedureStatement(pascalParser.ProcedureStatementContext ctx) {
        super.exitProcedureStatement(ctx);
    }

    @Override
    public void enterActualParameter(pascalParser.ActualParameterContext ctx) {
        super.enterActualParameter(ctx);
    }

    @Override
    public void exitActualParameter(pascalParser.ActualParameterContext ctx) {
        super.exitActualParameter(ctx);
    }

    @Override
    public void enterParameterwidth(pascalParser.ParameterwidthContext ctx) {
        super.enterParameterwidth(ctx);
    }

    @Override
    public void exitParameterwidth(pascalParser.ParameterwidthContext ctx) {
        super.exitParameterwidth(ctx);
    }

    @Override
    public void enterGotoStatement(pascalParser.GotoStatementContext ctx) {
        super.enterGotoStatement(ctx);
    }

    @Override
    public void exitGotoStatement(pascalParser.GotoStatementContext ctx) {
        super.exitGotoStatement(ctx);
    }

    @Override
    public void enterEmptyStatement(pascalParser.EmptyStatementContext ctx) {
        super.enterEmptyStatement(ctx);
    }

    @Override
    public void exitEmptyStatement(pascalParser.EmptyStatementContext ctx) {
        super.exitEmptyStatement(ctx);
    }

    @Override
    public void enterEmpty_(pascalParser.Empty_Context ctx) {
        super.enterEmpty_(ctx);
    }

    @Override
    public void exitEmpty_(pascalParser.Empty_Context ctx) {
        super.exitEmpty_(ctx);
    }

    @Override
    public void enterStructuredStatement(pascalParser.StructuredStatementContext ctx) {
        super.enterStructuredStatement(ctx);
    }

    @Override
    public void exitStructuredStatement(pascalParser.StructuredStatementContext ctx) {
        super.exitStructuredStatement(ctx);
    }

    @Override
    public void enterCompoundStatement(pascalParser.CompoundStatementContext ctx) {
        super.enterCompoundStatement(ctx);
    }

    @Override
    public void exitCompoundStatement(pascalParser.CompoundStatementContext ctx) {
        super.exitCompoundStatement(ctx);
    }

    @Override
    public void enterStatements(pascalParser.StatementsContext ctx) {
        super.enterStatements(ctx);
    }

    @Override
    public void exitStatements(pascalParser.StatementsContext ctx) {
        super.exitStatements(ctx);
    }

    @Override
    public void enterConditionalStatement(pascalParser.ConditionalStatementContext ctx) {
        super.enterConditionalStatement(ctx);
    }

    @Override
    public void exitConditionalStatement(pascalParser.ConditionalStatementContext ctx) {
        super.exitConditionalStatement(ctx);
    }

    @Override
    public void enterIfStatement(pascalParser.IfStatementContext ctx) {
        super.enterIfStatement(ctx);
    }

    @Override
    public void exitIfStatement(pascalParser.IfStatementContext ctx) {
        super.exitIfStatement(ctx);
    }

    @Override
    public void enterCaseStatement(pascalParser.CaseStatementContext ctx) {
        super.enterCaseStatement(ctx);
    }

    @Override
    public void exitCaseStatement(pascalParser.CaseStatementContext ctx) {
        super.exitCaseStatement(ctx);
    }

    @Override
    public void enterCaseListElement(pascalParser.CaseListElementContext ctx) {
        super.enterCaseListElement(ctx);
    }

    @Override
    public void exitCaseListElement(pascalParser.CaseListElementContext ctx) {
        super.exitCaseListElement(ctx);
    }

    @Override
    public void enterRepetetiveStatement(pascalParser.RepetetiveStatementContext ctx) {
        super.enterRepetetiveStatement(ctx);
    }

    @Override
    public void exitRepetetiveStatement(pascalParser.RepetetiveStatementContext ctx) {
        super.exitRepetetiveStatement(ctx);
    }

    @Override
    public void enterWhileStatement(pascalParser.WhileStatementContext ctx) {
        super.enterWhileStatement(ctx);
    }

    @Override
    public void exitWhileStatement(pascalParser.WhileStatementContext ctx) {
        super.exitWhileStatement(ctx);
    }

    @Override
    public void enterRepeatStatement(pascalParser.RepeatStatementContext ctx) {
        super.enterRepeatStatement(ctx);
    }

    @Override
    public void exitRepeatStatement(pascalParser.RepeatStatementContext ctx) {
        super.exitRepeatStatement(ctx);
    }

    @Override
    public void enterForStatement(pascalParser.ForStatementContext ctx) {
        super.enterForStatement(ctx);
    }

    @Override
    public void exitForStatement(pascalParser.ForStatementContext ctx) {
        super.exitForStatement(ctx);
    }

    @Override
    public void enterForList(pascalParser.ForListContext ctx) {
        super.enterForList(ctx);
    }

    @Override
    public void exitForList(pascalParser.ForListContext ctx) {
        super.exitForList(ctx);
    }

    @Override
    public void enterInitialValue(pascalParser.InitialValueContext ctx) {
        super.enterInitialValue(ctx);
    }

    @Override
    public void exitInitialValue(pascalParser.InitialValueContext ctx) {
        super.exitInitialValue(ctx);
    }

    @Override
    public void enterFinalValue(pascalParser.FinalValueContext ctx) {
        super.enterFinalValue(ctx);
    }

    @Override
    public void exitFinalValue(pascalParser.FinalValueContext ctx) {
        super.exitFinalValue(ctx);
    }

    @Override
    public void enterWithStatement(pascalParser.WithStatementContext ctx) {
        super.enterWithStatement(ctx);
    }

    @Override
    public void exitWithStatement(pascalParser.WithStatementContext ctx) {
        super.exitWithStatement(ctx);
    }

    @Override
    public void enterRecordVariableList(pascalParser.RecordVariableListContext ctx) {
        super.enterRecordVariableList(ctx);
    }

    @Override
    public void exitRecordVariableList(pascalParser.RecordVariableListContext ctx) {
        super.exitRecordVariableList(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
