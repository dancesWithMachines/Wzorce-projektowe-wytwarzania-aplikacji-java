/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;


public class StrategyTest {
    public static void main(String args[]){
        StrategyContext context;
        
        context = new StrategyContext(new SpecifedStrategy());
        context.returnProblem();
        
        context = new StrategyContext(new AnotherSpecifedStrategy());
        context.returnProblem();
    }
}
