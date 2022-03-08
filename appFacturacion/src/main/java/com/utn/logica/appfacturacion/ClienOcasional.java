/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.logica.appfacturacion;

/**
 *
 * @author Elian L
 */
public class ClienOcasional extends Cliente{
    private String direcion;

    public ClienOcasional(){
        super();
        this.direcion = "";      
    }
    
    public ClienOcasional(String direcion, String nombre, String sexo) {
        super(nombre, sexo);
        this.direcion = direcion;
    }
    
    @Override
    public String toString() {
        
        return super.toString()+ 
                "ClienOcasional \n" + "direcion: " + direcion;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

}
