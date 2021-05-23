/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorceprojektowemkusiaks3232;

/**
 *
 * @author Timax
 */
class Context {
}

abstract class AbstractExpression{
    public abstract void interpret(Context context);
}

class TerminalExpression extends AbstractExpression{

    @Override
    public void interpret(Context context) {
        System.out.println("Interpret method in TerminalExpression has been awaken");
    }
    
}

class NonTerminalExpression extends AbstractExpression{

    @Override
    public void interpret(Context context) {
        System.out.println("Interpret method in NonTerminalExpression has been awaken");
    }
    
}
