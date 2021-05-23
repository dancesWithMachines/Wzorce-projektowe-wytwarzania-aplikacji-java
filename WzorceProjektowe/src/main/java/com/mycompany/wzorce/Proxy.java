/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wzorce;

import java.util.List;

/**
 *
 * @author Timax
 */
abstract class Message{
    public abstract String getMessage();
}

class SecretMessage extends Message{
    
    private String message;
    
    public SecretMessage(){
        System.out.println("Secret message has been read");
        message = "Bill Gates is getting divorced";
    }

    @Override
    public String getMessage() {
        return message;
    }
    
}

class Messenger extends Message{
    
    private SecretMessage secretMessage;
    private boolean isAuthorized = false;
    private String secretPassword = "1234";
    
    public Messenger(String password){
        if (secretPassword == password){
            isAuthorized = true;
            System.out.println("Messenger has been activated");
        }
    }

    @Override
    public String getMessage() {
        if (isAuthorized){
            if (secretMessage == null)
                secretMessage = new SecretMessage();
            return "Secret message says: " + secretMessage.getMessage();
        } else 
            return "Access unauthorized, calling cops";
    }
    
}


