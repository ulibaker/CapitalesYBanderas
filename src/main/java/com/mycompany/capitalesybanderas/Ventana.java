package com.mycompany.capitalesybanderas;
import javax.swing.ImageIcon;
/**
 *
 * @author uli
 */
public class Ventana extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ventana.class.getName());
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Capitales y Banderas");
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon icono = new ImageIcon(getClass().getClassLoader().getResource("0.png"));
        setIconImage(icono.getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PBtn1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        PBtn2 = new javax.swing.JButton();
        PBtn3 = new javax.swing.JButton();
        PBtn4 = new javax.swing.JButton();
        PBtn5 = new javax.swing.JButton();
        PBtn6 = new javax.swing.JButton();
        PBtn7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PBtn8 = new javax.swing.JButton();
        PBtn9 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Capitales y Banderas!");

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("UliBaker :)");

        PBtn.setBackground(new java.awt.Color(0, 0, 149));
        PBtn.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        PBtn.setForeground(new java.awt.Color(255, 255, 255));
        PBtn.setText("JUGAR!");
        PBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PBtn.addActionListener(this::PBtnActionPerformed);

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("193 paises miembros de la ONU.");

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Estados con reconocimiento limitado.");

        PBtn1.setBackground(new java.awt.Color(0, 0, 0));
        PBtn1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        PBtn1.setForeground(new java.awt.Color(255, 255, 255));
        PBtn1.setText("JUGAR!");
        PBtn1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PBtn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PBtn1.addActionListener(this::PBtn1ActionPerformed);

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Continetes*");

        PBtn2.setBackground(new java.awt.Color(100, 100, 100));
        PBtn2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        PBtn2.setForeground(new java.awt.Color(255, 255, 255));
        PBtn2.setText("JUGAR!");
        PBtn2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PBtn2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PBtn2.addActionListener(this::PBtn2ActionPerformed);

        PBtn3.setBackground(new java.awt.Color(0, 0, 0));
        PBtn3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        PBtn3.setForeground(new java.awt.Color(255, 255, 255));
        PBtn3.setText("JUGAR!");
        PBtn3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PBtn3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PBtn3.addActionListener(this::PBtn3ActionPerformed);

        PBtn4.setBackground(new java.awt.Color(0, 0, 0));
        PBtn4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        PBtn4.setForeground(new java.awt.Color(255, 255, 255));
        PBtn4.setText("JUGAR!");
        PBtn4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PBtn4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PBtn4.addActionListener(this::PBtn4ActionPerformed);

        PBtn5.setBackground(new java.awt.Color(0, 0, 0));
        PBtn5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        PBtn5.setForeground(new java.awt.Color(255, 255, 255));
        PBtn5.setText("JUGAR!");
        PBtn5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PBtn5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PBtn5.addActionListener(this::PBtn5ActionPerformed);

        PBtn6.setBackground(new java.awt.Color(0, 0, 0));
        PBtn6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        PBtn6.setForeground(new java.awt.Color(255, 255, 255));
        PBtn6.setText("JUGAR!");
        PBtn6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PBtn6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PBtn6.addActionListener(this::PBtn6ActionPerformed);

        PBtn7.setBackground(new java.awt.Color(0, 0, 0));
        PBtn7.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        PBtn7.setForeground(new java.awt.Color(255, 255, 255));
        PBtn7.setText("JUGAR!");
        PBtn7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PBtn7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PBtn7.addActionListener(this::PBtn7ActionPerformed);

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Sub-nacionales.");

        PBtn8.setBackground(new java.awt.Color(255, 0, 0));
        PBtn8.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        PBtn8.setForeground(new java.awt.Color(255, 255, 255));
        PBtn8.setText("JUGAR!");
        PBtn8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PBtn8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PBtn8.addActionListener(this::PBtn8ActionPerformed);

        PBtn9.setBackground(new java.awt.Color(235, 235, 0));
        PBtn9.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        PBtn9.setForeground(new java.awt.Color(255, 255, 255));
        PBtn9.setText("JUGAR!");
        PBtn9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PBtn9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PBtn9.addActionListener(this::PBtn9ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PBtn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PBtn1)
                                .addGap(28, 28, 28)
                                .addComponent(PBtn3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PBtn7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PBtn5)
                                .addGap(28, 28, 28)
                                .addComponent(PBtn6))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PBtn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(PBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBtnActionPerformed
        this.dispose();
        new Juego().setVisible(true);
    }//GEN-LAST:event_PBtnActionPerformed

    private void PBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PBtn1ActionPerformed

    private void PBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBtn2ActionPerformed
        this.dispose();
        new JuegoLimRecon().setVisible(true);
    }//GEN-LAST:event_PBtn2ActionPerformed

    private void PBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PBtn3ActionPerformed

    private void PBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PBtn4ActionPerformed

    private void PBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBtn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PBtn5ActionPerformed

    private void PBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBtn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PBtn6ActionPerformed

    private void PBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBtn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PBtn7ActionPerformed

    private void PBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBtn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PBtn8ActionPerformed

    private void PBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBtn9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PBtn9ActionPerformed
    public static void main(String args[]) {     
        java.awt.EventQueue.invokeLater(() -> new Ventana().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PBtn;
    private javax.swing.JButton PBtn1;
    private javax.swing.JButton PBtn2;
    private javax.swing.JButton PBtn3;
    private javax.swing.JButton PBtn4;
    private javax.swing.JButton PBtn5;
    private javax.swing.JButton PBtn6;
    private javax.swing.JButton PBtn7;
    private javax.swing.JButton PBtn8;
    private javax.swing.JButton PBtn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
