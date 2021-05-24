/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;


public class FlyweightTest {
    private static final String greetings[] = {"Hello", "Greetings", "Howdy"};
    public static void main (String[] args){
        for (int i=0; i< 10; i++){
            Man man = (Man) WorkPlace.getMan(getRandomGreeting());
        }
    }
    private static String getRandomGreeting(){
        return greetings[(int)(Math.random()*greetings.length)];
    }
}
