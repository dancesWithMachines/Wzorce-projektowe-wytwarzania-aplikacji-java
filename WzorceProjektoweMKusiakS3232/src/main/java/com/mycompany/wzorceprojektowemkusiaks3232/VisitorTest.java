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
public class VisitorTest {
    public static void main(String args[]){
        Structure structure = new Structure();
        structure.attach(new SpecifiedFragment());
        structure.attach(new AnotherSpecifiedFragment());
        
        MainVisitor main = new MainVisitor();
        SecondaryVisitor secondary = new SecondaryVisitor();
        
        structure.accept(main);
        structure.accept(secondary);
    }
}
