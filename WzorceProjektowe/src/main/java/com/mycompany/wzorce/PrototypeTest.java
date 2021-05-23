/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;

/**
 *
 * @author Timax
 */
public class PrototypeTest {
    public static void main(String[] args){
        PrototypeA prototypeA = new PrototypeA("First");
        PrototypeA prototypaAClone = (PrototypeA) prototypeA.clonePrototype();
        System.out.println("Cloned prototype name:" + prototypaAClone.name);
        
        PrototypeB prototypeB = new PrototypeB("Second");
        PrototypeB prototypaBClone = (PrototypeB) prototypeB.clonePrototype();
        System.out.println("Cloned prototype name:" + prototypaBClone.name);
    }
}
    
