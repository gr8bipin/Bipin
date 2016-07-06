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
public class Doctor extends Person{
    private int id;
    private int NMC_No;

    public Doctor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNMC_No() {
        return NMC_No;
    }

    public void setNMC_No(int NMC_No) {
        this.NMC_No = NMC_No;
    }

    @Override
    public void work() {
        System.out.println(getFullName() + ":" + "Doctor is working.");
    }

    
    
}
