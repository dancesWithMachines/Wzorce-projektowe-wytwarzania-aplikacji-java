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
interface Cake {
    String taste();
}

class ChocolateCake implements Cake {

    @Override
    public String taste() {
        return "tastes like chocolate";
    }
    
}

class StrawberryCake implements Cake {

    @Override
    public String taste() {
        return "tastes like strawberries";
    }
    
}

abstract class Dessert {
    protected Cake cake;
    
    protected Dessert (Cake cake){
        this.cake = cake;
    }
    
    abstract public String make();
}

class CakeDessert extends Dessert{
    
    public CakeDessert(Cake cake){
        super(cake);
    }

    @Override
    public String make() {
        return "Prepaired dessert that. " + cake.taste();
    }
    
}
