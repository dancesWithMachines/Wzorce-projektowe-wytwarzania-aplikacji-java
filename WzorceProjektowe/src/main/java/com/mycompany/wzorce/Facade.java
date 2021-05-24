/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;


class Seller{
    public void sellProduct(){
        System.out.println("Product sold");
    } 
}

class Packer{
    public void packProduct(){
        System.out.println("Product packed");
    }
}

class Warehouseman{
    public void sendProduct(){
        System.out.println("Product send");
    }
}

class Shop{
    private Seller seller;
    private Packer packer;
    private Warehouseman warehouseman;
    
    public Shop(){
        seller = new Seller();
        packer = new Packer();
        warehouseman = new Warehouseman();
    }
    
    public void packAndSend(){
        System.out.println("Pack and send");
        packer.packProduct();
        warehouseman.sendProduct();
    }
    
    public void sellAndPack(){
        System.out.println("Sell and Pack");
        seller.sellProduct();
        packer.packProduct();
    }
}
