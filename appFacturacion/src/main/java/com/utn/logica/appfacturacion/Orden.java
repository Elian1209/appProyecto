/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.logica.appfacturacion;

import javax.xml.crypto.Data;

/**
 *
 * @author Elian L
 */
public class Orden {

    private Data fecha;
    private DetalleOrden oDetalleOrden;
    private Pago oPago;
    private Cliente oCliente;

    public float calcularTotal() {
        float total = 0;

        return total;
    }
    
    public float calcularImpuesto(){
        float impuesto = 0;
        
        return impuesto;
    }

}
