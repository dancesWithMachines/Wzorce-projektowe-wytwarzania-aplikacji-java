/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;


public class AbstractFactoryTest {
    public static void main(String[] args){
        Factory volkswagen = new VolkswagenFactory();
        Factory honda = new HondaFactory();
        
        Van odyssey = honda.makeFamilyCar(CarTypes.Minivan);
        CityCar civic = honda.makeCityCar(CarTypes.Hatchback);
        
        Van sharan = volkswagen.makeFamilyCar(CarTypes.Minivan);
        CityCar polo = volkswagen.makeCityCar(CarTypes.Hatchback);
        
        PerformanceCar s2000 = honda.makePerformanceCar(CarTypes.Convertible);
        PerformanceCar golf = volkswagen.makePerformanceCar(CarTypes.Convertible);
        
        System.out.println("Pojazd Honda Odyssey\nKolor:" + odyssey.color + "\nMoc:" + String.valueOf(odyssey.horsepower) + "\nTyp:" + odyssey.type);
        System.out.println("Pojazd Honda Civic\nKolor:" + civic.color + "\nMoc:" + String.valueOf(civic.horsepower) + "\nTyp:" + civic.type);
        System.out.println("Pojazd Volkswagen Sharan\nKolor:" + sharan.color + "\nMoc:" + String.valueOf(sharan.horsepower) + "\nTyp:" + sharan.type);
        System.out.println("Pojazd volkswagen Polo\nKolor:" + polo.color + "\nMoc:" + String.valueOf(polo.horsepower) + "\nTyp:" + polo.type);
        System.out.println("Pojazd Honda S2000\nKolor:" + s2000.color + "\nMoc:" + String.valueOf(s2000.horsepower) + "\nTyp:" + s2000.type);
        System.out.println("Pojazd Volkswagen Golf\nKolor:" + golf.color + "\nMoc:" + String.valueOf(golf.horsepower) + "\nTyp:" + golf.type);
    }
}
