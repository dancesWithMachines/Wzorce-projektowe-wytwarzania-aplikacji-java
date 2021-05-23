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
abstract class Mediator {
    public abstract void sendMessage(String message, Coworker coworker);
}

abstract class Coworker{
    protected Mediator mediator;
    
    public Coworker(Mediator mediator){
        this.mediator = mediator;
    }
}

class CoworkerA extends Coworker {
    
    public CoworkerA(Mediator mediator) {
        super(mediator);
    }
    
    public void send(String message){
        mediator.sendMessage(message, this);
    }
    
    public void notify(String message){
        System.out.println("CoworkerA gets message: " + message);
    }
    
}

class CoworkerB extends Coworker {
    
    public CoworkerB(Mediator mediator) {
        super(mediator);
    }
    
    public void send(String message){
        mediator.sendMessage(message, this);
    }
    
    public void notify(String message){
        System.out.println("CoworkerB gets message: " + message);
    }    
}

class SpecifiedMediator extends Mediator{
    private CoworkerA a;
    private CoworkerB b;
    
    public void setCoworkerA(CoworkerA coworker){
        a = coworker;
    }
    
    public void setCoworkerB(CoworkerB coworker){
        b = coworker;
    }
    
    @Override
    public void sendMessage(String message, Coworker coworker) {
        if (coworker == a)
            b.notify(message);
        else
            a.notify(message);
    }
    
}
