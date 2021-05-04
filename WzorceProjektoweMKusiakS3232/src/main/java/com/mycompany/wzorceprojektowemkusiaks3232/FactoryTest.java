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
public class FactoryTest {
    
    public static void main(String args[]){
        Manufacturer manufacturer = new Honda();

        Car nsx = manufacturer.makeCar(CarType.SportsCar);
        Car odyssey = manufacturer.makeCar(CarType.FamilyVan);

        System.out.println("Wyprodukowano samochód Honda nsx\nKolor: " + nsx.color + "\nMoc:" + String.valueOf(nsx.horsePower) + "\nType:" + nsx.type);
        System.out.println("Wyprodukowano samochód Honda odyssey\nKolor: " + odyssey.color + "\nMoc:" + String.valueOf(odyssey.horsePower) + "\nType:" + odyssey.type);
    }
}
