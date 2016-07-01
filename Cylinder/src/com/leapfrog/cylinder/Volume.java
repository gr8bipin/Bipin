/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cylinder;
import com.leapfrog.cylinder.Calculate;


/**
 *
 * @author Bipins
 */
public class Volume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculate c = new Calculate(5,10);
        System.out.println(c.volume());
  
    }
    
}
