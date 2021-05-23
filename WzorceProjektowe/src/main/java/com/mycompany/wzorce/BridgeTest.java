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
public class BridgeTest {
    public static void main(String[] args){
        Dessert chocolateDessert = new CakeDessert(new ChocolateCake());
        Dessert strawberryDessert = new CakeDessert(new StrawberryCake());
        
        System.out.println(chocolateDessert.make());
        System.out.println(strawberryDessert.make());
    }
}

