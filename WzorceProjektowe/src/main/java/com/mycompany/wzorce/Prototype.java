/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;

import java.util.logging.Level;
import java.util.logging.Logger;


abstract class Prototype {
    public Prototype(String name){
        this.name = name;
    }
    
    public String name;
    
    public abstract Prototype clonePrototype();
}

class PrototypeA extends Prototype{

    public PrototypeA(String name) {
        super(name);
    }

    @Override
    public Prototype clonePrototype() {
        return new PrototypeA(this.name);
    }
    
}

class PrototypeB extends Prototype{

    public PrototypeB(String name) {
        super(name);
    }

    @Override
    public Prototype clonePrototype() {
        return new PrototypeB(this.name);
    }
    
}
