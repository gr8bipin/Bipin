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
public class Nurse extends Person {
    private int id;
    private String NursingCareer;
    
    public Nurse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNursingCareer() {
        return NursingCareer;
    }

    public void setNursingCareer(String NursingCareer) {
        this.NursingCareer = NursingCareer;
    }

    @Override
    public void work() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
