/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.logica.appfacturacion;

/**
 *
 * @author Elian L
 */
public class Contado {

    protected String tipoMoneda;
    
    

    public float conversionDolaresColones(float equivalenciaColonDolar, float cantidadDolares) {
        float conversionMoneda = 0f;
        conversionMoneda = cantidadDolares * equivalenciaColonDolar;
        return conversionMoneda;
        
    }

    public float descuento(int porcentajeDescuento, float totalAPagar){
        float descuentoFinal = 0f;
        float descuento = 0f;
        descuento = (porcentajeDescuento /100)*totalAPagar;
        descuentoFinal = totalAPagar - descuento;
        return descuentoFinal;
    }
}

