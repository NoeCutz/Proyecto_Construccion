/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



/**
 *
 * @author rodrigopeniche
 */
public class Articulo {
    
    private final String clave;
    private final String claveProveedor;
    private final String descripcion;
    private final int cantidad;
    private final float precio;
    

    public Articulo ( String clave, String claveProveedor, String descripcion, int cantidad, float precio ) {
        this.clave = clave;
        this.claveProveedor = claveProveedor;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getClave() {
        return clave;
    }
    
    public String getClaveProveedor() {
       return claveProveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }
    
    
}
