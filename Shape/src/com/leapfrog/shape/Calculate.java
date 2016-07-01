/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.shape;

import java.util.Scanner;

public class Calculate
        {
    public static void main(String[] args) 
    {
     double length, height, radius,total=0;
     int choice;
     
     Scanner input= new Scanner(System.in);
     System.out.println("Enter length:");
     length=input.nextDouble();
     System.out.println("Enter height:");
     height=input.nextDouble();
     System.out.println("Enter radius:");
     radius=input.nextDouble();
     System.out.println("Enter your choice:");
     System.out.println("1.Area 2.Perimeter 3.Volume");
     choice= input.nextInt();
 
      switch(choice)
      {
         case 1 :
             
            System.out.println("Area of Square:");
            total= length* length;
            break;
         case 2 :
            System.out.println("Perimeter of Circle:");
            total= 2*3.14*radius;
            break;
         case 3 :
            System.out.println("Volume of cylinder:");
            total=3.14*radius*radius*height;
            break;
         
             
         default :
            System.out.println("Invalid choice");
      }
      System.out.println("Your answer is:" + total);
   }
}
    
    

