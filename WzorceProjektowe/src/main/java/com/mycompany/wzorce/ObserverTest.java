/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;


public class ObserverTest {
    public static void main(String[] args){
        Program program = new Program();
        
        program.addWatchdog(new Watchdog(program,"First watchdog"));
        program.addWatchdog(new Watchdog(program,"Second watchdog"));
        program.addWatchdog(new Watchdog(program,"Third watchdog"));
        
        program.setProgramState("ERROR");
        program.Allert();
    }
}
