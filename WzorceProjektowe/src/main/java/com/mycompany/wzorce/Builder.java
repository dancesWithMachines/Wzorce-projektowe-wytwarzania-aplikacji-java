/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;

import java.util.ArrayList;
import java.util.List;


class MedicamentsList{
    private List<String> medicaments = new ArrayList<String>();
    
    public void addMedicament(String medicament){
        medicaments.add(medicament);
    }
    
    public List<String> getMedicamentsList(){
        return medicaments;
    }
    
}

abstract class Vet{
    public abstract void incjectMedicine();
    public abstract void feedPills();
    public abstract MedicamentsList getListOfMedicationsAdministered();
}

class DogVet extends Vet{    
    private MedicamentsList medicamentsList = new MedicamentsList();

    @Override
    public void incjectMedicine() {
        medicamentsList.addMedicament("Zastrzyk odrobaczający");
    }

    @Override
    public void feedPills() {
        medicamentsList.addMedicament("Tabletka na ból brzucha");
    }

    @Override
    public MedicamentsList getListOfMedicationsAdministered() {
        return medicamentsList;
    }    
}

class CatVet extends Vet{
    
    private MedicamentsList medicamentsList = new MedicamentsList();

    @Override
    public void incjectMedicine() {
        medicamentsList.addMedicament("Zastrzyk na krzepnięcie krwi");
    }

    @Override
    public void feedPills() {
        medicamentsList.addMedicament("Tabletka na apetyt");
    }

    @Override
    public MedicamentsList getListOfMedicationsAdministered() {
        return medicamentsList;
    }    
}

class VetSalonOwner{
    public void makeVetHelp(Vet vet){
        vet.feedPills();
        vet.incjectMedicine();
    }
}
