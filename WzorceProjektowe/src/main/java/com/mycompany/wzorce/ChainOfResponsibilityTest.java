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
public class ChainOfResponsibilityTest {
    public static void main(String[] args){
        SubContractorOne contractorOne = new SubContractorOne();
        SubContractorTwo contractorTwo = new SubContractorTwo();
        
        contractorOne.hireSubcontractor(contractorTwo);
        
        int[] jobAmounts = {1, 4, 8, 12, 16, 20, 24, 28, 32};
        
        for (int jobAmount: jobAmounts)
            contractorOne.takeTheJob(jobAmount);
    }
}
