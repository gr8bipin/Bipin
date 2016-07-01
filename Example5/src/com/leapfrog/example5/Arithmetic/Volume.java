/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.example5.Arithmetic;

/**
 *
 * @author Bipins
 */
public class Volume {
     private double length, breadth, height;
       
       public void setLength(double length)
       {
           this.length= length;
       }
       public void setBreadth(double breadth)
       {
           this.breadth= breadth;
       }
       public void setHeight(double height)
       {
           this.height= height;
       }
       
       public Volume(double length, double breadth, double height)
       {
           this.length= length;
           this.breadth= breadth;
           this.height= height;
       }
      
       public double calculate()
       {
           return length*breadth*height;
       }

    
    }
    

