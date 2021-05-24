/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;


public class MomentoTest {
    public static void main(String[] args){
        Manager manager = new Manager();
        Handler handler = new Handler();    
        manager.setState("First state");
        manager.setState("Second state");
        handler.addSaveState(manager.saveStatus());
        manager.setState("Third state");
        handler.addSaveState(manager.saveStatus());
        manager.setState("Fourth state");
        manager.restoreStatus(handler.getSaveState(0));
    }
}
