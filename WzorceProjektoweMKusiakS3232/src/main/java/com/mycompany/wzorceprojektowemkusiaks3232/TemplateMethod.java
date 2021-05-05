/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorceprojektowemkusiaks3232;

/**
 *
 * @author Timax
 */
abstract class Dishwasher{
    public abstract void clean();
    public abstract void dry();
    
    public void work(){
        clean();
        dry();
        System.out.println("Done working");
    }
}

class SuperDishwasher extends Dishwasher{

    @Override
    public void clean() {
        System.out.println("Cleaning two times faster");
    }

    @Override
    public void dry() {
        System.out.println("Drying four times faster");
    }
    
}

class BrokenDishwasher extends Dishwasher {

    @Override
    public void clean() {
        System.out.println("Not cleaning at all");
    }

    @Override
    public void dry() {
        System.out.println("Barely drying");
    }
    
}