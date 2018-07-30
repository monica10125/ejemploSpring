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
public class SaludoIngles {
    @Value("Hello world")
  private String saludoIngles;

    public String getSaludoIngles() {
        return saludoIngles;
    }

    public void setSaludoIngles(String saludoIngles) {
        this.saludoIngles = saludoIngles;
    }
  
    
}
