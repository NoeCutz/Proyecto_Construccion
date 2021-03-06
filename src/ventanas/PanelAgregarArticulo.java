/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import controlador.AdministradorInventario;
import modelo.Articulo;

/**
 *
 * @author rodrigopeniche
 */
class PanelAgregarArticulo extends javax.swing.JPanel {

    /**
     * Creates new form PanelAgregarArticulo
     */
    PanelAgregarArticulo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaClave = new javax.swing.JLabel();
        etiquetaDescripcion = new javax.swing.JLabel();
        etiquetaCantidad = new javax.swing.JLabel();
        etiquetaPrecio = new javax.swing.JLabel();
        campoTextoClave = new javax.swing.JTextField();
        campoTextoDescripcion = new javax.swing.JTextField();
        campoTextoCantidad = new javax.swing.JTextField();
        campoTextoPrecio = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        etiquetaClaveProveedor = new javax.swing.JLabel();
        campoTextoClaveProveedor = new javax.swing.JTextField();
        etiquetaAgregarArticulo = new javax.swing.JLabel();

        etiquetaClave.setText("Clave:");

        etiquetaDescripcion.setText("Descripción:");

        etiquetaCantidad.setText("Cantidad:");

        etiquetaPrecio.setText("Precio:");

        botonAgregar.setText("Agregar");
        botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarMouseClicked(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarMouseClicked(evt);
            }
        });

        etiquetaClaveProveedor.setText("Clave Proveedor:");

        etiquetaAgregarArticulo.setText("Agregar artículo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(botonAgregar)
                        .addGap(58, 58, 58)
                        .addComponent(botonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaDescripcion)
                                    .addComponent(etiquetaCantidad)
                                    .addComponent(etiquetaPrecio))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoTextoDescripcion)
                                    .addComponent(campoTextoCantidad)
                                    .addComponent(campoTextoPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaAgregarArticulo)
                                    .addComponent(etiquetaClaveProveedor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTextoClaveProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaClave)
                                .addGap(70, 70, 70)
                                .addComponent(campoTextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(etiquetaAgregarArticulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaClave)
                    .addComponent(campoTextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaClaveProveedor)
                    .addComponent(campoTextoClaveProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDescripcion)
                    .addComponent(campoTextoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCantidad)
                    .addComponent(campoTextoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPrecio)
                    .addComponent(campoTextoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonCancelar))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseClicked
        // TODO add your handling code here:
        String claveArticulo= campoTextoClave.getText();
        String claveProveedor = campoTextoClaveProveedor.getText();
        String descripcion= campoTextoDescripcion.getText();
        String cantidad= campoTextoCantidad.getText();
        String precio= campoTextoPrecio.getText();
        
        
        AdministradorInventario admin= new AdministradorInventario();
        
        Articulo articulo = new Articulo(claveArticulo, claveProveedor, descripcion, 
                                         Integer.parseInt(cantidad),  Float.parseFloat(precio));
        admin.agregar(articulo);
        
        campoTextoClave.setText(null);
        campoTextoClaveProveedor.setText(null);
        campoTextoDescripcion.setText(null);
        campoTextoCantidad.setText(null);
        campoTextoPrecio.setText(null);
    }//GEN-LAST:event_botonAgregarMouseClicked

    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_botonCancelarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField campoTextoCantidad;
    private javax.swing.JTextField campoTextoClave;
    private javax.swing.JTextField campoTextoClaveProveedor;
    private javax.swing.JTextField campoTextoDescripcion;
    private javax.swing.JTextField campoTextoPrecio;
    private javax.swing.JLabel etiquetaAgregarArticulo;
    private javax.swing.JLabel etiquetaCantidad;
    private javax.swing.JLabel etiquetaClave;
    private javax.swing.JLabel etiquetaClaveProveedor;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel etiquetaPrecio;
    // End of variables declaration//GEN-END:variables
}
