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
public class DecoratorTest {
    public static void main (String[] main){
        Product product = new Product();
        FirstDecorator first = new FirstDecorator();
        SecondDecorator second = new SecondDecorator();
        
        second.setComponent(product);
        first.setComponent(second);
        
        second.operation();
        
    }    
}
