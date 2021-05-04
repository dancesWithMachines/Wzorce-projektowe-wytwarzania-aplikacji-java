/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorceprojektowemkusiaks3232;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Timax
 */
//Pattern
public class Singleton {
    private static Singleton instance;
    
    private static Object syncLock = new Object();
    
    protected Singleton(){}
    
    public static Singleton returnInstance(){
        synchronized (syncLock){
            if (instance == null)
                instance = new Singleton();
            return instance;
        }
    }
    
}

//Pattern Implementation
class VetRegistryController{
    private static VetRegistryController vetRegistryController;
    private static Object syncLock = new Object();
    private List<String> patientsList = new ArrayList<String>();
    
    protected VetRegistryController(){
        patientsList.add("Kot Tomek");
        patientsList.add("Żółw Franklin");
        patientsList.add("Biedronka Borys");     
    }
    
    public void addPatient(String patientName){
        patientsList.add(patientName);
    }
    
    public List<String> getPatients(){
        return patientsList;
    }
    
    public static VetRegistryController getVetGegistryController(){
        synchronized (syncLock){
            if (vetRegistryController == null)
                vetRegistryController = new VetRegistryController();
        }
        return vetRegistryController;
    }
}
