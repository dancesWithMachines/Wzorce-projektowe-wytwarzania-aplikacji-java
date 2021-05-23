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
enum CarTypes{
    Minivan,
    Convertible,
    Hatchback
}

abstract class FamilyCar{
    protected FamilyCar(String color, int horsepower, String type){
        this.horsepower = horsepower;
        this.type = type;
        this.color = color;
    }
    
    int horsepower;
    String type, color;
}

abstract class PerformanceCar{
    protected PerformanceCar(String color, int horsepower, String type){
        this.horsepower = horsepower;
        this.type = type;
        this.color = color;
    }
    
    int horsepower;
    String type, color;
}

abstract class CityCar{
    protected CityCar(String color, int horsepower, String type){
        this.horsepower = horsepower;
        this.type = type;
        this.color = color;
    }
    
    int horsepower;
    String type, color;
}

abstract class Factory{
    public abstract Van makeFamilyCar(CarTypes type);
    public abstract CityCar makeCityCar(CarTypes type);
    public abstract PerformanceCar makePerformanceCar(CarTypes type);
}

class Van extends FamilyCar{    
    public Van(String color, int horsepower, String type) {
        super(color, horsepower, type);
    }   
}

class Convertible extends PerformanceCar{
    
    public Convertible(String color, int horsepower, String type) {
        super(color, horsepower, type);
    }
    
}

class Hatchback extends CityCar{
    
    public Hatchback(String color, int horsepower, String type) {
        super(color, horsepower, type);
    }
    
}

class HondaFactory extends Factory{

    @Override
    public Van makeFamilyCar(CarTypes type) {
        switch (type){
            case Minivan:
                return new Van("silver", 130, "sliding doors");
            default:
                return null;
        }
    }

    @Override
    public CityCar makeCityCar(CarTypes type) {
        switch (type){
            case Hatchback:
                return new Hatchback("red", 222, "Type R");
            default:
                return null;
        }
    }

    @Override
    public PerformanceCar makePerformanceCar(CarTypes type) {
        switch (type){
            case Convertible:
                return new Convertible("purple", 230, "Premium edition");
            default:
                return null;
        }
    }
    
}

class VolkswagenFactory extends Factory{

    @Override
    public Van makeFamilyCar(CarTypes type) {
        switch (type){
            case Minivan:
                return new Van("grey", 150, "Volksburg edition");
            default:
                return null;
        }
    }

    @Override
    public CityCar makeCityCar(CarTypes type) {
        switch (type){
            case Hatchback:
                return new Hatchback("black", 150, "MK.4");
            default:
                return null;
        }
    }

    @Override
    public PerformanceCar makePerformanceCar(CarTypes type) {
        switch (type){
            case Convertible:
                return new Convertible("purple", 440, "GTI");
            default:
                return null;
        }
    }
    
}
