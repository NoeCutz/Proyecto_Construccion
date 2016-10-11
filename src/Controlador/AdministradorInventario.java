/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Articulo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigopeniche
 */
public class AdministradorInventario {
    
    private ManejadorBD manejadorBD;
    
    public AdministradorInventario(){
        manejadorBD = new ManejadorBD();
        
        try {
            manejadorBD.conectarConBD( "root", "", "ElCaballoDeHierro" );
        } 
        catch (ClassNotFoundException excepcionBibliotecaNoHallada) {
            JOptionPane.showMessageDialog(null, excepcionBibliotecaNoHallada.getMessage() + 
            "\nNo se puede conectar a la base de datos porque la libreria MySQL Conector no se encuentra");
        } 
        catch ( SQLException excepcionBaseDatosNoEncontrada ) {
            JOptionPane.showMessageDialog( null, excepcionBaseDatosNoEncontrada.getMessage() +  
            "\nNo se puede conectar a la base de datos porque no existe la base de datos" );
        }
    }
    
   public void agregarArticulo( String clave, String descripcion, int cantidad, int precio ){
        Articulo articulo= new Articulo( clave, descripcion, cantidad, precio );
        
        try {
            String valoresArticulo = "\"" + articulo.getClave() + "\", " + 
                      "\"" + articulo.getDescripcion() + "\", " +
                      "\"" + articulo.getCantidad() + "\", "    +
                      "\"" + articulo.getPrecio() + "\"";      
            manejadorBD.insertarFila( "Articulos", valoresArticulo );
            manejadorBD.desconectarConBD();
            JOptionPane.showMessageDialog(null, "Artículo agregado exitosamente");
        } 
        catch (SQLException excepcionElementoNoAgregado) {
            JOptionPane.showMessageDialog(null, excepcionElementoNoAgregado.getMessage() + 
            "\nElemento no agregado");
        }
    }

    public ResultSet buscarArticulo( String claveArticulo ) {
        ResultSet resultadoConsultaSQL = null;
        
        try {
            resultadoConsultaSQL = manejadorBD.buscarFila( "Articulos", "Clave", claveArticulo );
            // HAY QUE CERRAR LA MALDITA CONEXION A LA BD
        } 
        catch (SQLException excepcionElementoNoEncontrado) {
            JOptionPane.showMessageDialog( null, "No se encontró el artículo" );
        }
        return resultadoConsultaSQL;
    }
    
    public void eliminarArticulo( String claveDeArticulo ){
        try{
            manejadorBD.eliminarFila( "Articulos", "Clave", claveDeArticulo );
            manejadorBD.desconectarConBD();
            JOptionPane.showMessageDialog( null, "Articulo eliminado exitosamente" );
        }  
        catch (SQLException ex) {
           JOptionPane.showMessageDialog( null, "Artículo no encontrado" );
        }
    }
    
    public ResultSet verInventario() throws ClassNotFoundException{
        ResultSet resultadoConsultaSQL= null;
        
        try {
            resultadoConsultaSQL= manejadorBD.obtenerFilas( "Articulos" );
            // HAY QUE ENCONTRAR UNA FORMA DE CERRAR LA CONEXION CON LA BASE DE DATOS
        } 
        catch (SQLException ex) {
            Logger.getLogger( AdministradorInventario.class.getName() ).log( Level.SEVERE, null, ex );
        }
        
        return resultadoConsultaSQL;
    }

}
