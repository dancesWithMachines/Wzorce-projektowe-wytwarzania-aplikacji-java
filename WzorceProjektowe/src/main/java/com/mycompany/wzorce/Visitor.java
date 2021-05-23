/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Timax
 */
abstract class Fragment {
    public abstract void accept(Visitor visitor);
}

class SpecifiedFragment extends Fragment {
    
    @Override
    public void accept(Visitor visitor){
        visitor.goToSpecifiedFragment(this);
    }
    
    public void doStuff(){
        
    }
}

class AnotherSpecifiedFragment extends Fragment {
    
    @Override
    public void accept(Visitor visitor){
        visitor.goToAnotherSpecifiedFragment(this);
    }
    
    public void doStuff(){
        
    }
    
}

abstract class Visitor{
    public abstract void goToSpecifiedFragment(SpecifiedFragment fragment);
    public abstract void goToAnotherSpecifiedFragment(AnotherSpecifiedFragment fragment);
}

class MainVisitor extends Visitor{

    @Override
    public void goToSpecifiedFragment(SpecifiedFragment fragment) {
        System.out.println(fragment.getClass().getCanonicalName() + " has been visited by  " + this.getClass().getCanonicalName());
    }

    @Override
    public void goToAnotherSpecifiedFragment(AnotherSpecifiedFragment fragment) {
        System.out.println(fragment.getClass().getCanonicalName() + " has been visited by  " + this.getClass().getCanonicalName());
    }
    
}

class SecondaryVisitor extends Visitor {

    @Override
    public void goToSpecifiedFragment(SpecifiedFragment fragment) {
        System.out.println(fragment.getClass().getName() + " has been visited by " + this.getClass().getName());
    }

    @Override
    public void goToAnotherSpecifiedFragment(AnotherSpecifiedFragment fragment) {
        System.out.println(fragment.getClass().getName() + " has been visited by  " + this.getClass().getName());
    }
    
}

class Structure {
    private List<Fragment> fragments = new ArrayList<Fragment>();
    
    public void attach(Fragment fragment){
        fragments.add(fragment);
    }
    
    public void detach(Fragment fragment){
        fragments.remove(fragment);
    }
    
    public void accept (Visitor visitor){
        for (Fragment fragment: fragments)
            fragment.accept(visitor);
    }
}
