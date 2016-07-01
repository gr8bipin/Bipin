/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.basic;
import com.leapfrog.basic.arithmetic.SimpleInterest;
/**
 *
 * @author Bipins
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();
        si.setPrinciple(10000);
        si.setRate(10.5);
        si.setTime(5);
        si.calculate();
        
        // TODO code application logic here
    }
    
}
