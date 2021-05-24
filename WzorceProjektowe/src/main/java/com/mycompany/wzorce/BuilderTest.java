/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;

import java.util.List;


public class BuilderTest {
    public static void main(String[] args){
        VetSalonOwner manager = new VetSalonOwner();
        
        DogVet dogVet = new DogVet();
        CatVet catVet = new CatVet();
        
        manager.makeVetHelp(dogVet);
        
        List<String> dogMedicamentsList = dogVet.getListOfMedicationsAdministered().getMedicamentsList();
        System.out.println("Dog medicaments:");
        for (String medicament: dogMedicamentsList)
            System.out.println(medicament);
       
        manager.makeVetHelp(catVet);
        
        List<String> catMedicamentsList = catVet.getListOfMedicationsAdministered().getMedicamentsList();
        System.out.println("Cat medicaments:");
        for (String medicament: catMedicamentsList)
            System.out.println(medicament);
        
        
    }
}
