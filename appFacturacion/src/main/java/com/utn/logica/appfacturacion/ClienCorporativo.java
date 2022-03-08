/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.logica.appfacturacion;

/**
 *
 * @author Elian L
 */
public class ClienCorporativo extends Cliente {
    private String telefono;
    private String email;

    public ClienCorporativo(){
        super();
        this.telefono = "-1";
        this.email = "@gmail.com";
    }
    
    public ClienCorporativo(String telefono, String email, String nombre, String sexo) {
        super(nombre, sexo);
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "Cliente Corporativo \n" + "telefono: " + telefono + "\n email: " + email;
    }
    
    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
