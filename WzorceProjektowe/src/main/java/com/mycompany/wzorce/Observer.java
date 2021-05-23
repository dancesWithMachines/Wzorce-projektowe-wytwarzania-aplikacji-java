/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Timax
 */
abstract class AbstractWatchdog{
    public  abstract void watch();
}

abstract class AnstractProgram{
    private List<AbstractWatchdog> watchdogs = new ArrayList<AbstractWatchdog>();
    
    public void addWatchdog(AbstractWatchdog watchdog){
        watchdogs.add(watchdog);
    }
    
    public void removeWatchdog(AbstractWatchdog watchdog) {
        watchdogs.remove(watchdog);
    }
    
    public void Allert(){
        for (AbstractWatchdog watchdog: watchdogs)
            watchdog.watch();
    }
}

class Program extends AnstractProgram{
    String programState;

    public String getProgramState() {
        return programState;
    }

    public void setProgramState(String programState) {
        this.programState = programState;
    }
}

class Watchdog extends AbstractWatchdog{
    private String name, state;
    public Program program;
    
    public Watchdog(Program program, String name){
        this.program = program;
        this.name = name;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    @Override
    public void watch() {
        state = program.getProgramState();
        System.out.println("Watchdog " + name + " detected state change: " + state);
    }
    
}
