/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplospring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author pc lenovo
 */

@Configuration
public class AppConfig {
    
    @Bean
    public Mundo mundo(){
        return new Mundo();
    }
    @Bean
    public SaludoIngles saludoIngles(){
    return new SaludoIngles();
    }
    
}
