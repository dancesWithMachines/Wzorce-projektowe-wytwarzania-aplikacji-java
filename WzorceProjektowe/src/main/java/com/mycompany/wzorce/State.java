/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;


abstract class State
{
    public abstract void reply(StateContext context);
}

class StateContext{
    private State state;
    
    public StateContext(State state){
        this.state = state;
    }
    
    public State getState(){
        return state;
    }
    
    public void setState(State state){
        this.state = state;
        System.out.println("State " + state.getClass().getCanonicalName());
    }
    
    public void ask(){
        state.reply(this);
    }
}

class SpecifiedState extends State{

    @Override
    public void reply(StateContext context) {
        context.setState(new AnotherSpecifiedState());
    }
    
}

class AnotherSpecifiedState extends State {

    @Override
    public void reply(StateContext context) {
        context.setState(new SpecifiedState());
    }
    
}
