/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorceprojektowemkusiaks3232;

import java.util.List;

/**
 *
 * @author Timax
 */
public class SingletonTest {
    public static void main(String[] args){
        VetRegistryController firstController = VetRegistryController.getVetGegistryController();
        VetRegistryController secondController = VetRegistryController.getVetGegistryController();
        
        firstController.addPatient("Kot Filemon");
        
        if (firstController == secondController)
            System.out.println("These are the same controllers");
        
        List<String> patients = secondController.getPatients();
        System.out.println("Lista pacjentów:");
        for (String patient : patients){
            System.out.println(patient);
        }
        
    }
}
