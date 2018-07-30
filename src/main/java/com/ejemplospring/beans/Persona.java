/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplospring.beans;

/**
 *
 * @author pc lenovo
 */
public class Persona {
 
    private int codigo;
    private String nombre;
    private String sobrenombre;
    private Pais pais;

    /*
    Comentarios para el ejemplo 2 de inyeccion del objecto pais
     public Persona(int codigo, String nombre, String sobrenombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sobrenombre = sobrenombre;
    }
    public Persona(int codigo){
    this.codigo = codigo;
    }
    */

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
   
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSobrenombre() {
        return sobrenombre;
    }

    public void setSobrenombre(String sobrenombre) {
        this.sobrenombre = sobrenombre;
    }
    
}
