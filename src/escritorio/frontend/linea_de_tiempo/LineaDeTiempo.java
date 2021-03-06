/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritorio.frontend.linea_de_tiempo;

import escritorio.frontend.linea_de_tiempo.EventoDeTiempo;
import escritorio.frontend.linea_de_tiempo.AgregarEvento;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import modelos.database.HechoHistoricoDb;
import modelos.objetos.HechoHistorico;
import modelos.objetos.Usuario;

/**
 *
 * @author sergio
 */
public class LineaDeTiempo extends javax.swing.JFrame {

    private ArrayList<EventoDeTiempo> eventos;
    private ArrayList<String> categorias=new ArrayList<>();
    private Usuario usuario;
    public final static ImageIcon BG = new ImageIcon("Imagenes/fondoLineaTiempo.jpg");
    public final static ImageIcon REFRESH = new ImageIcon("Imagenes/refresh.png");
    public final static ImageIcon SEARCH = new ImageIcon("Imagenes/search.png");
    private int index = 0;

    /**
     * Creates new form LineaDeTiempo
     */
    public LineaDeTiempo(Usuario usuario) {
        initComponents();
        HechoHistoricoDb hechoHistoricoDb = new HechoHistoricoDb();
        obtenerHechos();
        setLocationRelativeTo(null);
        this.usuario = usuario;
        this.eventos = eventos;
        verificarUsuario();
        addPrimerHecho();
        setBackground();
        this.setLocationRelativeTo(null);
        lblRefresh.setIcon(REFRESH);
        lblSearch.setIcon(SEARCH);
        agregarCategorias();
        categorias= hechoHistoricoDb.obtenerCategorias();
        agregarCategorias();
    }
public void agregarCategorias(){
    for (int i = 0; i < categorias.size(); i++) {
        categoria.addItem(categorias.get(i));
    }
}
    public void obtenerHechos() {
        HechoHistoricoDb hechoHistoricoDb = new HechoHistoricoDb();
        LinkedList<HechoHistorico> hechoHistoricos = hechoHistoricoDb.leerHechosHistoricos();
        eventos = new ArrayList<>();

        for (int i = 0; i < hechoHistoricos.size(); i++) {

            eventos.add(new EventoDeTiempo(hechoHistoricos.get(i)));

        }
    }
        public void obtenerHechosPorCategoria() {
        HechoHistoricoDb hechoHistoricoDb = new HechoHistoricoDb();
        LinkedList<HechoHistorico> hechoHistoricos = hechoHistoricoDb.leerHechosHistoricosPorCategoria(categoria.getSelectedIndex()+1);
        eventos = new ArrayList<>();

        for (int i = 0; i < hechoHistoricos.size(); i++) {

            eventos.add(new EventoDeTiempo(hechoHistoricos.get(i)));

        }
    }

    private void setBackground() {

        JLabel backgroundLbl = new JLabel();
        backgroundLbl.setSize(1001, 411);
        backgroundLbl.setLocation(0, 0);
        backgroundLbl.setIcon(BG);
        this.add(backgroundLbl);
        backgroundLbl.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        navMenu4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        btnCholqij4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        lblRefresh = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Courier 10 Pitch", 0, 24)); // NOI18N
        jLabel1.setText("Linea De Tiempo");

        jPanel1.setPreferredSize(new java.awt.Dimension(735, 300));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );

        btnAnterior.setText("<");
        btnAnterior.setEnabled(false);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        navMenu4.setBackground(new java.awt.Color(106, 248, 47));

        jButton6.setBackground(new java.awt.Color(134, 134, 134));
        jButton6.setFont(new java.awt.Font("Courier 10 Pitch", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Agregar Evento");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnCholqij4.setBackground(new java.awt.Color(134, 134, 134));
        btnCholqij4.setFont(new java.awt.Font("Courier 10 Pitch", 1, 12)); // NOI18N
        btnCholqij4.setForeground(new java.awt.Color(0, 0, 0));
        btnCholqij4.setText("Eliminar Evento");
        btnCholqij4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCholqij4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCholqij4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navMenu4Layout = new javax.swing.GroupLayout(navMenu4);
        navMenu4.setLayout(navMenu4Layout);
        navMenu4Layout.setHorizontalGroup(
            navMenu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navMenu4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCholqij4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navMenu4Layout.setVerticalGroup(
            navMenu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navMenu4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navMenu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(btnCholqij4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setText("Categoria");

        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });

        lblRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRefreshMouseClicked(evt);
            }
        });

        lblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navMenu4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 343, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiguiente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navMenu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        index++;
        jPanel1.removeAll();
        jPanel1.add(eventos.get(index));
        eventos.get(index).setVisible(true);
        jPanel1.validate();
        jPanel1.repaint();
        if (index == eventos.size() - 1) {
            btnSiguiente.setEnabled(false);

        } else {
            btnSiguiente.setEnabled(true);
        }
        btnAnterior.setEnabled(true);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        index--;
        jPanel1.removeAll();
        jPanel1.add(eventos.get(index));
        eventos.get(index).setVisible(true);
        jPanel1.validate();
        jPanel1.repaint();
        if (index == 0) {
            btnAnterior.setEnabled(false);

        } else {
            btnAnterior.setEnabled(true);
        }
        btnSiguiente.setEnabled(true);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        AgregarEvento ae= new AgregarEvento();
        ae.setLinea(this);
        ae.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnCholqij4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCholqij4ActionPerformed

    }//GEN-LAST:event_btnCholqij4ActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaActionPerformed

    private void lblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchMouseClicked
        obtenerHechosPorCategoria();
        addPrimerHecho();
        
        this.repaint();
        this.validate();
        btnAnterior.setEnabled(false);
        if (eventos.size()>1) {
            btnSiguiente.setEnabled(true);
        }else{
            btnSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_lblSearchMouseClicked

    private void lblRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshMouseClicked
        obtenerHechos();
        addPrimerHecho();
        
        this.repaint();
        this.validate();
        System.out.println("hola");
        btnAnterior.setEnabled(false);
        if (eventos.size()>1) {
            btnSiguiente.setEnabled(true);
        }else{
            btnSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_lblRefreshMouseClicked
    private void addPrimerHecho() {
        jPanel1.removeAll();
        if (eventos.size() > 0) {
            jPanel1.add(eventos.get(0));
            eventos.get(0).setVisible(true);
            jPanel1.validate();
            jPanel1.repaint();
        }

    }

    /**
     * @param args the command line arguments
     */
    private void verificarUsuario() {
        if (usuario.getRol() == 1) {
            navMenu4.setVisible(true);
        } else {
            navMenu4.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCholqij4;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRefresh;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JPanel navMenu4;
    // End of variables declaration//GEN-END:variables
}
