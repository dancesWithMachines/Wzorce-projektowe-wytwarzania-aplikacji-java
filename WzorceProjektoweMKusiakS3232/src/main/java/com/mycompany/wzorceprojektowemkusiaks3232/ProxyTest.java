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
public class ProxyTest {
    public static void main (String[] args){
        Messenger accountOne = new Messenger("4321");
        System.out.println(accountOne.getMessage());
        
        Messenger accountTwo = new Messenger("1234");
        System.out.println(accountTwo.getMessage());
    }
}
