package com.innovatian.idea.powershell.lang.parser.parsing.statements.expressions;

import com.innovatian.idea.powershell.lang.parser.PsParser;
import com.intellij.lang.PsiBuilder;

public class BitwiseExpressionStatement extends LogicalExpressionStatement {
    /*
    <bitwiseExpressionRule> = <comparisonExpressionRule> [<BitwiseOperatorToken> comparisonExpressionRule>]*
     */
    public static boolean parse(PsiBuilder builder, PsParser parser) {
        return false;
    }
}

