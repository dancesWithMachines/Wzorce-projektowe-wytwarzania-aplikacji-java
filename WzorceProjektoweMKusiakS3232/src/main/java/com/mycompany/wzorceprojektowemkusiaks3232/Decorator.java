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
abstract class Component{
    public abstract void operation();
}

class Product extends Component{

    @Override
    public void operation() {
        System.out.println("Executing operation in Product");
    }
    
}

abstract class Decorator extends Component{
    
    protected Component component;
    
    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null)
            component.operation();
    }
    
}

class FirstDecorator extends Decorator{
    
    @Override
    public void operation(){
        super.operation();
        
        addedFunctionality();
        System.out.println("Executing operation on First Decorator");
    }
    
    void addedFunctionality(){
        System.out.print("New fuctionality has been added from first decorator");
    }
}

class SecondDecorator extends Decorator{
    
    @Override
    public void operation(){
        super.operation();
        System.out.print("New fuctionality has been added from second decorator");
    }
}


