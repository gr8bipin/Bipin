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
public class Army extends Person {
    private int id;
    private String MilitaryForce;

    public Army() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMilitaryForce() {
        return MilitaryForce;
    }

    public void setMilitaryForce(String MilitaryForce) {
        this.MilitaryForce = MilitaryForce;
    }

    @Override
    public void work() {
        System.out.println(getFullName() + ":" + "Army is working.");
    }
    
    
}
