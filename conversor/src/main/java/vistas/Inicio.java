/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import java.awt.Color;

/**
 *
 * @author pittu
 */
public class Inicio extends javax.swing.JPanel {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        iniciadorEstilos();
    }
    
    private void iniciadorEstilos() {
        
        bienvenido.putClientProperty( "FlatLaf.style", "font: $h2.font" );
        bienvenido.setForeground(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoInicio = new javax.swing.JPanel();
        bienvenido = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        fondoInicio.setBackground(new java.awt.Color(255, 255, 255));
        fondoInicio.setPreferredSize(new java.awt.Dimension(557, 445));

        bienvenido.setText("¡Bienvenido!");

        javax.swing.GroupLayout fondoInicioLayout = new javax.swing.GroupLayout(fondoInicio);
        fondoInicio.setLayout(fondoInicioLayout);
        fondoInicioLayout.setHorizontalGroup(
            fondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        fondoInicioLayout.setVerticalGroup(
            fondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(fondoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido;
    private javax.swing.JPanel fondoInicio;
    // End of variables declaration//GEN-END:variables
}



