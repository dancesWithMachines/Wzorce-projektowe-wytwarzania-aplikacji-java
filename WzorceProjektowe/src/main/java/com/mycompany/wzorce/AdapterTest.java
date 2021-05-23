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
public class AdapterTest {
    public static void main(String[] args){
        Sensor psiSensor = new PressureSensorAdapter(new PressureSensor());
        
        System.out.println("Ciśnienie podane w PSI " + psiSensor.getTirePressure());
    }
}
