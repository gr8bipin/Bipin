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
public class Actor extends Person{
    private int id;
    private String ActingStyle;

    public Actor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActingStyle() {
        return ActingStyle;
    }

    public void setActingStyle(String ActingStyle) {
        this.ActingStyle = ActingStyle;
    }

    @Override
    public void work() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
