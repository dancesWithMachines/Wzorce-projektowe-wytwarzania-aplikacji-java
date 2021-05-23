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
abstract class Strategy{
    public abstract void solveProblem();
}

class SpecifedStrategy extends Strategy {

    @Override
    public void solveProblem() {
        System.out.println("SpecifiedStrategy solveProblem method awaken");
    }
    
}

class AnotherSpecifedStrategy extends Strategy {

    @Override
    public void solveProblem() {
        System.out.println("AnotherSpecifiedStrategy solveProblem method awaken");
    }
    
}

class StrategyContext {
    private Strategy strategy;
    
    public StrategyContext(Strategy strategy){
        this.strategy = strategy;
    }
    
    public void returnProblem(){
        strategy.solveProblem();
    }
}