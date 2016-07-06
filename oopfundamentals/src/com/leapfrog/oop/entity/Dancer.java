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
public class Dancer extends Person{
    private int id;
    private String Category;
    
    public Dancer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    @Override
    public void work() {
        System.out.println(getFirstName() + ":" + "Dancer is working.");
    }
    
    
    
    
    
    
}
