/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplospring.beans;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author pc lenovo
 */
public class Mundo {
    @Value("Hola Mundo !")
    private String holaMundo;

    public String getHolaMundo() {
        return holaMundo;
    }

    public void setHolaMundo(String holaMundo) {
        this.holaMundo = holaMundo;
    }
    
}
