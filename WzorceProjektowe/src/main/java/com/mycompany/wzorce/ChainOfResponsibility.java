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
abstract class Contractor{
    protected Contractor subcontractor;
    
    public void hireSubcontractor(Contractor subcontractor){
        this.subcontractor = subcontractor;
    }
    
    public abstract void takeTheJob(int amount);
}

class SubContractorOne extends Contractor{

    @Override
    public void takeTheJob(int amount) {
        if (amount > 0 && amount < 15)
            System.out.println(this.getClass().getSimpleName() + " Job amount: " + amount);
        else if (subcontractor != null)
            subcontractor.takeTheJob(amount);
    }    
}

class SubContractorTwo extends Contractor{

    @Override
    public void takeTheJob(int amount) {
        if (amount >+ 15 && amount < 30)
            System.out.println(this.getClass().getSimpleName() + " Job amount: " + amount);
        else if (subcontractor != null)
            subcontractor.takeTheJob(amount);
    }    
}




