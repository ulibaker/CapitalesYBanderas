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
        UNBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IsBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LRBtn = new javax.swing.JButton();
        LaBtn = new javax.swing.JButton();
        AsBtn = new javax.swing.JButton();
        SuBtn = new javax.swing.JButton();
        OcBtn = new javax.swing.JButton();
        MiBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        USBtn = new javax.swing.JButton();
        SpBtn = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Capitales y Banderas!");

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("UliBaker :)");

        UNBtn.setBackground(new java.awt.Color(0, 0, 149));
        UNBtn.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        UNBtn.setForeground(new java.awt.Color(255, 255, 255));
        UNBtn.setText("JUGAR!");
        UNBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        UNBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        UNBtn.addActionListener(this::UNBtnActionPerformed);

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("193 paises miembros de la ONU.");

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Estados con reconocimiento limitado.");

        IsBtn.setBackground(new java.awt.Color(0, 0, 0));
        IsBtn.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        IsBtn.setForeground(new java.awt.Color(255, 255, 255));
        IsBtn.setText("Islamico");
        IsBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        IsBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        IsBtn.addActionListener(this::IsBtnActionPerformed);

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Continetes*");

        LRBtn.setBackground(new java.awt.Color(100, 100, 100));
        LRBtn.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        LRBtn.setForeground(new java.awt.Color(255, 255, 255));
        LRBtn.setText("JUGAR!");
        LRBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LRBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LRBtn.addActionListener(this::LRBtnActionPerformed);

        LaBtn.setBackground(new java.awt.Color(0, 0, 0));
        LaBtn.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        LaBtn.setForeground(new java.awt.Color(255, 255, 255));
        LaBtn.setText("LATAM");
        LaBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LaBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LaBtn.addActionListener(this::LaBtnActionPerformed);

        AsBtn.setBackground(new java.awt.Color(0, 0, 0));
        AsBtn.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        AsBtn.setForeground(new java.awt.Color(255, 255, 255));
        AsBtn.setText("Asia");
        AsBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        AsBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AsBtn.addActionListener(this::AsBtnActionPerformed);

        SuBtn.setBackground(new java.awt.Color(0, 0, 0));
        SuBtn.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        SuBtn.setForeground(new java.awt.Color(255, 255, 255));
        SuBtn.setText("Subsahariana");
        SuBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        SuBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SuBtn.addActionListener(this::SuBtnActionPerformed);

        OcBtn.setBackground(new java.awt.Color(0, 0, 0));
        OcBtn.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        OcBtn.setForeground(new java.awt.Color(255, 255, 255));
        OcBtn.setText("Occidente");
        OcBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        OcBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        OcBtn.addActionListener(this::OcBtnActionPerformed);

        MiBtn.setBackground(new java.awt.Color(0, 0, 0));
        MiBtn.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        MiBtn.setForeground(new java.awt.Color(255, 255, 255));
        MiBtn.setText("Misc.");
        MiBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        MiBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MiBtn.addActionListener(this::MiBtnActionPerformed);

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Sub-nacionales.");

        USBtn.setBackground(new java.awt.Color(255, 0, 0));
        USBtn.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        USBtn.setForeground(new java.awt.Color(255, 255, 255));
        USBtn.setText("America");
        USBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        USBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        USBtn.addActionListener(this::USBtnActionPerformed);

        SpBtn.setBackground(new java.awt.Color(204, 204, 0));
        SpBtn.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        SpBtn.setForeground(new java.awt.Color(255, 255, 255));
        SpBtn.setText("España");
        SpBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        SpBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SpBtn.addActionListener(this::SpBtnActionPerformed);

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
                            .addComponent(UNBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LRBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(USBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(SpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(OcBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))))
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
                .addComponent(UNBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(USBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UNBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNBtnActionPerformed
        this.dispose();
        new Juego().setVisible(true);
    }//GEN-LAST:event_UNBtnActionPerformed

    private void IsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsBtnActionPerformed
        this.dispose();
        new Islam().setVisible(true);
    }//GEN-LAST:event_IsBtnActionPerformed

    private void LRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LRBtnActionPerformed
        this.dispose();
        new JuegoLimRecon().setVisible(true);
    }//GEN-LAST:event_LRBtnActionPerformed

    private void LaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaBtnActionPerformed
        this.dispose();
        new Latam().setVisible(true);
    }//GEN-LAST:event_LaBtnActionPerformed

    private void AsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsBtnActionPerformed
        this.dispose();
        new Asia().setVisible(true);
    }//GEN-LAST:event_AsBtnActionPerformed

    private void SuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SuBtnActionPerformed

    private void OcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OcBtnActionPerformed

    private void MiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MiBtnActionPerformed

    private void USBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USBtnActionPerformed

    private void SpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpBtnActionPerformed
    public static void main(String args[]) {     
        java.awt.EventQueue.invokeLater(() -> new Ventana().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AsBtn;
    private javax.swing.JButton IsBtn;
    private javax.swing.JButton LRBtn;
    private javax.swing.JButton LaBtn;
    private javax.swing.JButton MiBtn;
    private javax.swing.JButton OcBtn;
    private javax.swing.JButton SpBtn;
    private javax.swing.JButton SuBtn;
    private javax.swing.JButton UNBtn;
    private javax.swing.JButton USBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
