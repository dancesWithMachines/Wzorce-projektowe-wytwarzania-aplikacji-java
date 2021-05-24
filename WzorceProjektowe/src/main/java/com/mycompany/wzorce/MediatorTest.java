/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;


public class MediatorTest {
    public static void main(String args[]){
        SpecifiedMediator mediator = new SpecifiedMediator();
        CoworkerA a = new CoworkerA(mediator);
        CoworkerB b = new CoworkerB(mediator);
        
        mediator.setCoworkerA(a);
        mediator.setCoworkerB(b);
        
        a.send("Please send me a new box");
        b.send("Oi mate, I'm afraid I can't do that");
        a.send("Why tho?");
        b.send("We are out of boxes mate, hard to believe init?");
        a.send("Bloody he...");
        
    }
}
