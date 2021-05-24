/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;

import java.util.ArrayList;
import java.util.List;


public class InterpreterTest {
    public static void main(String args[]){
        Context context = new Context();
        List<AbstractExpression> expressions = new ArrayList();
        
        expressions.add(new TerminalExpression());
        expressions.add(new NonTerminalExpression());
        expressions.add(new TerminalExpression());
        expressions.add(new TerminalExpression());
        
        for (AbstractExpression expression: expressions){
            expression.interpret(context);
        }
    }
}
