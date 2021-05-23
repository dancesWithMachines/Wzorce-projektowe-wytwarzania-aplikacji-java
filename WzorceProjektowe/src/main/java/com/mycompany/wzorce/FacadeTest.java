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
public class FacadeTest {
    public static void main(String[] args){
        Shop shop = new Shop();
        
        shop.packAndSend();
        shop.sellAndPack();
    }
}
