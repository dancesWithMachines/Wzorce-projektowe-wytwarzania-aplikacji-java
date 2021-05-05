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
public class MomentoTest {
    public static void main(String[] args){
        Initiator init = new Initiator();
        init.setState("Trun on");
        
        Managaer managaer = new Managaer();
        managaer.setMomento(init.getMomento());
        
        init.setMomento(managaer.getMomento());
    }
}
