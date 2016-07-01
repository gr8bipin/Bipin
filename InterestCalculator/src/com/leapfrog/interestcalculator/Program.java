/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.interestcalculator;

/**
 *
 * @author Bipins
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double principle= 10000;
        double time= 5;
        double rate= 10.5;
        
        double interest= (principle*time*rate)/ 100;
        System.out.println("The interest is:" + interest);
    }
    
}
