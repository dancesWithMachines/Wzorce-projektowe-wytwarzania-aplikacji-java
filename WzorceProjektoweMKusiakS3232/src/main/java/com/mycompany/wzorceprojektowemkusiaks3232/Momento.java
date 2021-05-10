/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorceprojektowemkusiaks3232;

import java.util.ArrayList;
import java.util.List;

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

class Manager{
    private String state;
    
    public void setState(String state){
        System.out.println("State set to " + state );
        this.state = state;
    }
    
    public Momento saveStatus(){
        System.out.println("Saving status...");
        return new Momento(state);
    }
    
    public void restoreStatus(Momento momento){
        this.state = momento.getState();
        System.out.println("Resttored state: " + momento.getState());
    }
   
}

class Handler {
    private List<Momento> list = new ArrayList<Momento>();
    
    public void addSaveState(Momento momento){
        list.add(momento);
    }
    
    public Momento getSaveState(int stateNo){
        return list.get(stateNo);
    }
}
