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
public class TemplateMethodTest {
    public static void main(String[] args){
        Dishwasher superDishwasher = new SuperDishwasher();
        superDishwasher.work();
        
        Dishwasher brokenDishwasher = new BrokenDishwasher();
        brokenDishwasher.work();
    }
       
}
