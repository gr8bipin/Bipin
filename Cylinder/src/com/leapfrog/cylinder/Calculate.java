/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cylinder;

/**
 *
 * @author Bipins
 */
public class Calculate
{
    double radius, height;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }
  
    public Calculate(double radius, double height)
    {
        this.radius= radius;
        this.height= height;
    }
    
    public double volume()
    {
        return 3.14*radius*radius*height;
    }
}
