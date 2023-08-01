/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.challengeoneconversor.igu;


import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;

import javax.swing.JPanel;
import vistas.Inicio;
import vistas.Longitud;
import vistas.Moneda;
import vistas.Temperatura;

/**
 *
 * @author pittu
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
       
        initComponents();
        iniciadorContenido();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        botonInicio = new javax.swing.JButton();
        botonMonedas = new javax.swing.JButton();
        botonLongitud = new javax.swing.JButton();
        botonTemperatura = new javax.swing.JButton();
        nombrePrograma = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setMaximumSize(new java.awt.Dimension(800, 600));
        fondo.setMinimumSize(new java.awt.Dimension(800, 600));

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setPreferredSize(new java.awt.Dimension(220, 0));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonInicio.setText("Inicio");
        botonInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonInicio.setBorderPainted(false);
        botonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonInicio.setPreferredSize(new java.awt.Dimension(220, 36));
        botonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActionPerformed(evt);
            }
        });
        menu.add(botonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 50));

        botonMonedas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonMonedas.setText("Monedas");
        botonMonedas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonMonedas.setBorderPainted(false);
        botonMonedas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMonedas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonMonedas.setPreferredSize(new java.awt.Dimension(220, 36));
        botonMonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMonedasActionPerformed(evt);
            }
        });
        menu.add(botonMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, 50));

        botonLongitud.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonLongitud.setText("Longitud");
        botonLongitud.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonLongitud.setBorderPainted(false);
        botonLongitud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLongitud.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonLongitud.setPreferredSize(new java.awt.Dimension(220, 36));
        botonLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLongitudActionPerformed(evt);
            }
        });
        menu.add(botonLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, 50));

        botonTemperatura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonTemperatura.setText("Temperatura");
        botonTemperatura.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonTemperatura.setBorderPainted(false);
        botonTemperatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonTemperatura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonTemperatura.setPreferredSize(new java.awt.Dimension(220, 36));
        botonTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTemperaturaActionPerformed(evt);
            }
        });
        menu.add(botonTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, 50));

        nombrePrograma.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        nombrePrograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePrograma.setText("CONVERSORES");
        menu.add(nombrePrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, -1));

        header.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo.setText("Inicio");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(titulo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        principal.setPreferredSize(new java.awt.Dimension(557, 450));
        principal.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTemperaturaActionPerformed
        mostrarPanel(new Temperatura());
        titulo.setText("Conversor de temperatura");
    }//GEN-LAST:event_botonTemperaturaActionPerformed

    private void botonMonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMonedasActionPerformed
        mostrarPanel(new Moneda());
        titulo.setText("Conversor de monedas");
    }//GEN-LAST:event_botonMonedasActionPerformed

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
        iniciadorContenido();

    }//GEN-LAST:event_botonInicioActionPerformed

    private void botonLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLongitudActionPerformed
        mostrarPanel(new Longitud());
        titulo.setText("Conversor de longitud");
    }//GEN-LAST:event_botonLongitudActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInicio;
    private javax.swing.JButton botonLongitud;
    private javax.swing.JButton botonMonedas;
    private javax.swing.JButton botonTemperatura;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nombrePrograma;
    private javax.swing.JPanel principal;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void iniciadorContenido() {
        mostrarPanel(new Inicio());
        titulo.setText("Inicio");
    }

    private void mostrarPanel(JPanel p) {
        p.setSize(557, 460);
        p.setLocation(0, 0);
        principal.removeAll();
        principal.add(p, BorderLayout.CENTER);
        principal.revalidate();
        principal.repaint();

    }

}
