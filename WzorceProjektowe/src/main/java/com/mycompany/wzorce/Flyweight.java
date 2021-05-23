/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Timax
 */
interface Human {
    public void sayHello();
}

class Man implements Human{
    private String greeting;
    
    public Man(String greeting){
        this.greeting = greeting;
    }

    @Override
    public void sayHello() {
        System.out.println(greeting);
    }    
}

class WorkPlace {
    private static final HashMap men = new HashMap();
    
    public static Human getMan(String greeting) {
        Man man = (Man)men.get(greeting);
        
        if (man == null) {
            man = new Man(greeting);
            men.put(greeting, man);
            System.out.println("New man joins workplace and says: " + greeting);            
        }
        return man;
    }
}

