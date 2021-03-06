/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import controlador.AdministradorInventario;

/**
 *
 * @author rodrigopeniche
 */
class PanelEliminarArticulo extends javax.swing.JPanel {

    /**
     * Creates new form PanelEliminarArticulo
     */
    PanelVerInventario panelVerInventario;
    
    PanelEliminarArticulo(PanelVerInventario panelVerInventario) {
        initComponents();
        this.panelVerInventario= panelVerInventario;
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
        campoTextoClave = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        etiquetaEliminar = new javax.swing.JLabel();

        etiquetaClave.setText("Clave:");

        botonEliminar.setText("Eliminar articulo");
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarMouseClicked(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarMouseClicked(evt);
            }
        });

        etiquetaEliminar.setText("Eliminar artículo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaEliminar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonEliminar)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(etiquetaClave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addComponent(botonCancelar)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaClave)
                    .addComponent(campoTextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminar)
                    .addComponent(botonCancelar))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseClicked
        // TODO add your handling code here:
       String claveArticulo= campoTextoClave.getText();
       AdministradorInventario admin= new AdministradorInventario();
       admin.eliminar(claveArticulo);
       
       panelVerInventario.actualizarTablaArticulos();
    }//GEN-LAST:event_botonEliminarMouseClicked

    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_botonCancelarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JTextField campoTextoClave;
    private javax.swing.JLabel etiquetaClave;
    private javax.swing.JLabel etiquetaEliminar;
    // End of variables declaration//GEN-END:variables
}
