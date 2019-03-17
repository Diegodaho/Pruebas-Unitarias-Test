/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebasunitarias;

import java.util.HashMap;

/**
 *
 * @author Diego
 */
public class Persona {
    private int documento;
    private String nombre;
    private HashMap<Integer,Persona> datos;
    
    /**
     * Metodo constructor
     * @param documento documento de la  persona
     * @param nombre nombre de la persona
     */

    public Persona(int documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
        datos = new HashMap<>();
    }
    
    /**
     * metodo para ver documento de la persona
     * @return documento int
     */

    public int getDocumento() {
        return documento;
    }
    
   /**
    * metodo para ver nombre de la persona
    * @return nombre String
    */

    public String getNombre() {
        return nombre;
    }
    
    /**
     * metodo para ver el datos de la persona
     * @return datos 
     */

    public HashMap<Integer, Persona> getDatos() {
        return datos;
    }
    
}
