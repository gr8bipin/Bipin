/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.oop.entity;

/**
 *
 * @author Bipins
 */
public class Employee extends Person{
    private int id;
    private String designation;
    public int getId()
    { 
        return id;
    }
    
    public void setId(int id)
    { 
       this.id=id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public void work() {
        System.out.println(getFirstName() + ":" + "Employee is working.");  
    }
    
    
}
