/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.example3.Program;
import com.leapfrog.example3.SimpleInterest2;

/**
 *
 * @author Bipins
 */
public class Program 
{
    public static void main(String args[])
    {
        SimpleInterest2 si= new SimpleInterest2;
        si.setPrinciple(10000);
        si.setRate(10.5);
        si.setTime(5);
        si.calculate();
    }
    
}
