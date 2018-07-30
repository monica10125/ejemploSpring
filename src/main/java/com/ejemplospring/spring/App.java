/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplospring.spring;

import com.ejemplospring.beans.AppConfig;
import com.ejemplospring.beans.Mundo;
import com.ejemplospring.beans.Persona;
import com.ejemplospring.beans.SaludoIngles;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author pc lenovo
 */
public class App {
    public static void main(String [] args){
    
       ApplicationContext contexto= new ClassPathXmlApplicationContext("com/ejemplospring/xml/beans.xml");
     /*
        ApplicationContext contexto2= new AnnotationConfigApplicationContext(AppConfig.class);   
      
         Mundo objMundo= (Mundo)contexto2.getBean("mundo");
        SaludoIngles saludoingles= (SaludoIngles)contexto2.getBean("saludoIngles");
       
     
        System.out.println("Instacia clase mundo "+objMundo.getHolaMundo()
        +" Instacia clase mundo en Ingles  "+saludoingles.getSaludoIngles());
       */  
      
        
         Persona per= contexto.getBean(Persona.class);
        System.out.println("Nombre "+ per.getNombre()+"\n"
                + "Sobrenombre  "+per.getSobrenombre()+"\n"
                        + "codigo " +per.getCodigo()+"\n"
                                + "Pais "+per.getPais().getNombrePais()+"\n"
                                        + "Ciudad "+per.getPais().getCiudad().getNombreCiudad() );
        
         ((ConfigurableApplicationContext)contexto).close();
        
     
    
     
}
}