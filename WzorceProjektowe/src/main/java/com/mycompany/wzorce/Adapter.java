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
abstract class Sensor{
    public abstract double getTirePressure();
}

class PressureSensor{
    double pressureInBar = 2.1;
    
    public double getTirePressure(){
        return pressureInBar;
    }
}

class PressureSensorAdapter extends Sensor{
    PressureSensor ps;
    
    public PressureSensorAdapter(PressureSensor s){
        ps = s;
    }

    @Override
    public double getTirePressure() {
        double pressureInPsi = ps.getTirePressure() * 14.5;
        return pressureInPsi;
    }
}
