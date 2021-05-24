/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;


abstract class Order{
    protected Recipient recipient;
    
    public Order(Recipient recipient){
        this.recipient = recipient;
    }
    
    public abstract void execute();
}

class SpecifiedOrder extends Order{

    public SpecifiedOrder(Recipient recipient) {
        super(recipient);
    }

    @Override
    public void execute() {
        recipient.run();
    }
    
}

class Recipient{
    public void run(){
        System.out.println("Recipient has been called, run executed");
    }
}

class Principal{
    private Order order;
    
    public void setOrder(Order order){
        this.order = order;
    }
    
    public void executeOrder(){
        order.execute();
    }
}