/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.logica.appfacturacion;

/**
 *
 * @author Elian L
 */
public class Cliente {
    
    private String nombre;
    private String sexo;

    public Cliente (){
        this.nombre = "";
        this.sexo = "M";
    }
    public Cliente(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cliente \n" + "nombre: " + nombre + "\n sexo: " + sexo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    
}
