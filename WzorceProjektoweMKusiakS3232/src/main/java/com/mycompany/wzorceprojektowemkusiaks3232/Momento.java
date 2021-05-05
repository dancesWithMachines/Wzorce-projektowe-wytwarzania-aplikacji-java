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
public class Momento {
    private String state;
    
    public Momento(String state){
        this.state = state;
    }
    
    public String getState(){
        return state;
    }
}

class Managaer{
    private Momento momento;
    
    public Momento getMomento(){
        return momento;
    }
    
    public void setMomento(Momento momento){
        this.momento = momento;
    }
}

class Initiator{
    private String state;
    
    public String getState(){
        return state;        
    }
    
    public void setState(String state){
        this.state = state;
        System.out.println("Current state: " + state);
    }
    
    public Momento getMomento(){
        return new Momento(state);
    }
    
    public void setMomento(Momento momento){
        System.out.println("Restoring ...");
        state = momento.getState();
    }
}
