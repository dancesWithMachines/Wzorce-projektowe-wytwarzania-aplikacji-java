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
abstract class Car{
    protected Car(String color, int horsePower, String type){
        this.horsePower = horsePower;
        this.color = color;
        this.type = type;
    }
    public int horsePower;
    public String color, type;
}

class SportsCar extends Car{   
    public SportsCar(String color, int horsePower, String type) {
        super(color, horsePower, type);
    }    
}

class FamilyVan extends Car{   
    public FamilyVan(String color, int horsePower, String type) {
        super(color, horsePower, type);
    }  
}

abstract class Manufacturer{
    public abstract Car makeCar(CarType type);
}

enum CarType{
    SportsCar,
    FamilyVan
}

class Honda extends Manufacturer{

    @Override
    public Car makeCar(CarType type) {
        switch (type)
        {
            case SportsCar:
                return new SportsCar("red",500,"convertible");
            case FamilyVan:
                return new FamilyVan("silver",120,"minivan");
            default:
                return null;
        }
    }
    
}
