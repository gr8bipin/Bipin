/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.marksheet;

import java.util.Scanner;

/**
 *
 * @author Bipins
 */
public class Result {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int english, nepali, science, maths, computer;
        double total;
        double percentage;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks in English:");
        english = input.nextInt();
        System.out.println("Enter marks in Nepali:");
        nepali = input.nextInt();
        System.out.println("Enter marks in Science:");
        science = input.nextInt();
        System.out.println("Enter marks in Maths:");
        maths = input.nextInt();
        System.out.println("Enter marks in Computer:");
        computer = input.nextInt();
        
        
        
        if(english < 32 || nepali < 32 || science < 32 || maths < 32 || computer < 32)
            System.out.println("The result is Fail."); 
        else
        {
            System.out.println("Congratulations! You are pass.");
     
        
        total= english + nepali + science + maths + computer;
        System.out.println("The total marks is" + " " + total);
        
        percentage= (total/500)*100;
        System.out.println("The total percentage is" + " " + percentage + "%");
        
         if (percentage >= 80)
        {
            System.out.println("You are pass in Distinction.");
        }
        else if (percentage < 80 && percentage >=60) 
        {
            System.out.println("You are pass in First Division.");
        } 
        else if (percentage < 60 && percentage >= 45) 
        {
            System.out.println("You are pass in Second Division.");
        } 
        else if(percentage < 45 && percentage >= 32) 
        {
            System.out.println("You are pass in Third Division.");
        }  
        }
    }

}
