/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;

import java.util.ArrayList;
import java.util.List;


abstract class Element{
    protected String name;
    public Element(String name){
        this.name = name;
    }
    
    public abstract void add(Element element);
    public abstract void remove(Element element);
    public abstract void show(int level);
}

class Composite extends Element{
    private List<Element> kids = new ArrayList<Element>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Element element) {
        kids.add(element);
    }

    @Override
    public void remove(Element element) {
        kids.remove(element);
    }

    @Override
    public void show(int level) {
        for (int i=0; i<level;i++)
            System.out.print('-');
        System.out.println(name);
        for (Element kid: kids)
            kid.show(level + 2);
    }
}

class Leaf extends Element{

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Element element) {
        System.out.println("Cannot add to leaf");
    }

    @Override
    public void remove(Element element) {
        System.out.println("Cannot remove from leaf");
    }

    @Override
    public void show(int level) {
        for (int i=0; i<level;i++)
            System.out.print('-');
        System.out.println(name);
    }
    
}
