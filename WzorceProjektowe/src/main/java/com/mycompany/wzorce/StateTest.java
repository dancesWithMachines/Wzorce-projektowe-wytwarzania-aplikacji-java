/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;


public class StateTest {
    public static void main (String args[]){
        StateContext context = new StateContext(new SpecifiedState());
        
        context.ask();
        context.ask();
        context.ask();
        context.ask();
        context.ask();
    }
}
