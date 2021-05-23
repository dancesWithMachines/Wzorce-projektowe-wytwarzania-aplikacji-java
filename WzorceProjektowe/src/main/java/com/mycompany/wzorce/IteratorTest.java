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
public class IteratorTest {
    public static void main(String[] args){
        CarBase base = new CarBase();
        for (Iterator iterator = base.getIterator(); iterator.hasNext();){
            CarData data = (CarData) iterator.next();
            System.out.println("Manufacturer: " + data.manufacturer + " Model: " + data.model);
        }
    }
}
