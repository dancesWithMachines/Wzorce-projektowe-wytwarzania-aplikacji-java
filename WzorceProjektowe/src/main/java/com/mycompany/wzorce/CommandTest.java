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
public class CommandTest {
    public static void main(String[] args){
        Recipient recipient = new Recipient();
        Order order = new SpecifiedOrder(recipient);
        Principal principal = new Principal();
        
        principal.setOrder(order);
        principal.executeOrder();
    }
}
