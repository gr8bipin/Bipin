/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.square.area;

/**
 *
 * @author Bipins
 */
public class total {
    double length;

    public void setLength(double length) {
        this.length = length;
    }
    public Total(double length){
        this.length= length;
    }
     public double calculate()
       {
           return length*length;
       }
}
