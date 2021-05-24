/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;

import java.util.ArrayList;
import java.util.List;


interface Iterator {
    public boolean hasNext();
    public Object next();
}

interface Container {
    public Iterator getIterator();
}

class CarData{
    public CarData(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
    }
    public String manufacturer, model;
}

class CarBase implements Container {
    public List<CarData> carDataList = new ArrayList <CarData>();
    
    public CarBase(){
        carDataList.add(new CarData("honda","civic"));
        carDataList.add(new CarData("fiat","punto"));
        carDataList.add(new CarData("opel","astra"));
        carDataList.add(new CarData("volkswagen","golf"));
    }

    @Override
    public Iterator getIterator() {
        return new CarDataIterator();
    }
    
    private class CarDataIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index < carDataList.size())
                return true;
            else
                return false;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return carDataList.get(index++);
            return null;
        }
    
    }
}



