/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.simpleinterest;

/**
 *
 * @author Bipins
 */
public class Program {
    private double principle;
    private int time;
    private double rate;
    
    public void setPrinciple(double principle)
    {
        this.principle= principle;
    }

    public void setTime(int time)
    {
        this.time=time;
    }
   
    public void setRate(double rate)
    {
        this.rate= rate;
    }
    
    public void calculate()
    {
        double interest = (principle*time*rate)/100;
    }
    
    System.out.println(The total interest is: + interest)
  
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
