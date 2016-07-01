/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator;

import com.leapfrog.calculator.util.Calculator;
import java.util.Scanner;

/**
 *
 * @author Bipins
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void menu(){
         System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("5. Pow");
        System.out.println("6. Min");
        System.out.println("7. Max");
        System.out.println("8. Exit");
        
        System.out.println("Enter your choice[1-8]");
    }
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        Calculator calc=new Calculator();
        
        while(true)
        {
            
        System.out.println("Enter first number:");
        double x= input.nextDouble();
        
        System.out.println("Enter second number:");
        double y= input.nextDouble();
        menu();
        int choice = input.nextInt();
        double total=0;
        
        
       
        switch(choice)
        {
            case 1:
                total= calc.add(x,y);
                break;
            case 2:
                total= calc.sub(x,y);
                break;
            case 3:
                total= calc.mul(x,y);
                break;
            case 4:
                total= calc.div(x,y);
                break;
            case 5:
                total= calc.pow(x,y);
                break;
            case 6:
                total= calc.min(x,y);
                break;
            case 7:
                total= calc.max(x,y);
                break;
            case 8:
                System.exit(0);
                break;
        }
        
      
        System.out.println("Total is" + " " + total);
        
        System.out.println("Do you want to continue[Y/N]?");
        String ch= input.next();
        if (ch.equalsIgnoreCase("n"))
        {
            System.exit(1);
        } 
        
    }
    
}
}
