package com.mycompany.capitalesybanderas;
import java.awt.Font;
import java.awt.Image;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
/**
 *
 * @author uli
 */
public class US extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(US.class.getName());

    private Map<Character, List<String>> dictionary;
    HashMap<Integer, String[]> mapaBanderas = new HashMap<>();
    private Generador<Integer> genBanderas;
    private int num = 0;
    
    public US() {
        initComponents();
        CBtn.registerKeyboardAction(
            e -> {
                NBtn.doClick();
                CBtn.doClick();
                TFld1.requestFocusInWindow();
                WLbl.setVisible(false);
            },
            javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0),
            javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW
        );
        FlagLbl.setFont(new Font("Microsoft YaHei", Font.PLAIN, 250));   
        setLocationRelativeTo(null);
        setTitle("Capitales y Banderas!");
        getContentPane().setBackground(new java.awt.Color(0, 73, 144));
        ImageIcon icono = new ImageIcon(getClass().getClassLoader().getResource("0.png"));
        setIconImage(icono.getImage());
        
        mapaBanderas.put(1, new String[]{"Alabama", "Montgomery"});
        mapaBanderas.put(2, new String[]{"Alaska", "Juneau"});
        mapaBanderas.put(3, new String[]{"Arizona", "Phoenix"});
        mapaBanderas.put(4, new String[]{"Arkansas", "Little Rock"});
        mapaBanderas.put(5, new String[]{"California", "Sacramento"});
        mapaBanderas.put(6, new String[]{"Colorado", "Denver"});
        mapaBanderas.put(7, new String[]{"Connecticut", "Hartford"});
        mapaBanderas.put(8, new String[]{"Delaware", "Dover"});
        mapaBanderas.put(9, new String[]{"Florida", "Tallahassee"});
        mapaBanderas.put(10, new String[]{"Georgia", "Atlanta"});
        mapaBanderas.put(11, new String[]{"Hawaii", "Honolulu"});
        mapaBanderas.put(12, new String[]{"Idaho", "Boise"});
        mapaBanderas.put(13, new String[]{"Illinois", "Springfield"});
        mapaBanderas.put(14, new String[]{"Indiana", "Indianapolis"});
        mapaBanderas.put(15, new String[]{"Iowa", "Des Moines"});
        mapaBanderas.put(16, new String[]{"Kansas", "Topeka"});
        mapaBanderas.put(17, new String[]{"Kentucky", "Frankfort"});
        mapaBanderas.put(18, new String[]{"Louisiana", "Baton Rouge"});
        mapaBanderas.put(19, new String[]{"Maine", "Augusta"});
        mapaBanderas.put(20, new String[]{"Maryland", "Annapolis"});
        mapaBanderas.put(21, new String[]{"Massachusetts", "Boston"});
        mapaBanderas.put(22, new String[]{"Michigan", "Lansing"});
        mapaBanderas.put(23, new String[]{"Minnesota", "Saint Paul"});
        mapaBanderas.put(24, new String[]{"Mississippi", "Jackson"});
        mapaBanderas.put(25, new String[]{"Missouri", "Jefferson City"});
        mapaBanderas.put(26, new String[]{"Montana", "Helena"});
        mapaBanderas.put(27, new String[]{"Nebraska", "Lincoln"});
        mapaBanderas.put(28, new String[]{"Nevada", "Carson City"});
        mapaBanderas.put(29, new String[]{"New Hampshire", "Concord"});
        mapaBanderas.put(30, new String[]{"New Jersey", "Trenton"});
        mapaBanderas.put(31, new String[]{"New Mexico", "Santa Fe"});
        mapaBanderas.put(32, new String[]{"New York", "Albany"});
        mapaBanderas.put(33, new String[]{"North Carolina", "Raleigh"});
        mapaBanderas.put(34, new String[]{"North Dakota", "Bismarck"});
        mapaBanderas.put(35, new String[]{"Ohio", "Columbus"});
        mapaBanderas.put(36, new String[]{"Oklahoma", "Oklahoma"});
        mapaBanderas.put(37, new String[]{"Oregon", "Salem"});
        mapaBanderas.put(38, new String[]{"Pennsylvania", "Harrisburg"});
        mapaBanderas.put(39, new String[]{"Rhode Island", "Providence"});
        mapaBanderas.put(40, new String[]{"South Carolina", "Columbia"});
        mapaBanderas.put(41, new String[]{"South Dakota", "Pierre"});
        mapaBanderas.put(42, new String[]{"Tennessee", "Nashville"});
        mapaBanderas.put(43, new String[]{"Texas", "Austin"});
        mapaBanderas.put(44, new String[]{"Utah", "Salt Lake City"});
        mapaBanderas.put(45, new String[]{"Vermont", "Montpelier"});
        mapaBanderas.put(46, new String[]{"Virginia", "Richmond"});
        mapaBanderas.put(47, new String[]{"Washington", "Olympia"});
        mapaBanderas.put(48, new String[]{"West Virginia", "Charleston"});
        mapaBanderas.put(49, new String[]{"Wisconsin", "Madison"});
        mapaBanderas.put(50, new String[]{"Wyoming", "Cheyenne"});
        mapaBanderas.put(51, new String[]{"District of Columbia", ""});
        mapaBanderas.put(52, new String[]{"Puerto Rico", "San Juan"});
        mapaBanderas.put(53, new String[]{"Guam", "Agana"});
        mapaBanderas.put(54, new String[]{"United States Virgin Islands","Charlotte Amalie"});
        mapaBanderas.put(55, new String[]{"Northern Mariana Islands", "Saipan"});
        mapaBanderas.put(56, new String[]{"American Samoa", "Pago Pago"});

        
        Integer[] FlagArray = {
            1,2,3,4,5,6,7,8,9,10,
            11,12,13,14,15,16,17,18,19,20,
            21,22,23,24,25,26,27,28,29,30,
            31,32,33,34,35,36,37,38,39,40,
            41,42,43,44,45,46,47,48,49,50,
            51,52,53,54,55,56
        };
        
        genBanderas = new Generador<>(FlagArray);

        Generador<Integer> genBanderas = new Generador<>(FlagArray);
        FlagLbl.setText("");
        num = genBanderas.obtenerAleatorio();       
        String ruta = "/us/" + num + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(ruta));
        Image img = icon.getImage();
        FlagLbl.setIcon(new ImageIcon(img));
        FlagLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FlagLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        
        
        update();
        NBtn.setEnabled(false);
        WLbl.setVisible(false);
        CLbl.setVisible(false);
        }
    private void update() { 
        FlagLbl.setText("");
        num = genBanderas.obtenerAleatorio(); 
        //num =197;
        NLbl.setText(""+num);
        HLbl.setText(mapaBanderas.get(num)[0].toLowerCase()+" "+mapaBanderas.get(num)[1].toLowerCase());
        String ruta = "/us/" + num + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(ruta));
        Image img = icon.getImage();
        Image imgEscalada = img.getScaledInstance(FlagLbl.getWidth(), FlagLbl.getHeight(), Image.SCALE_SMOOTH);
        FlagLbl.setIcon(new ImageIcon(imgEscalada));
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
        jLabel5 = new javax.swing.JLabel();
        FlagLbl = new javax.swing.JLabel();
        NBtn = new javax.swing.JButton();
        TFld2 = new javax.swing.JTextField();
        CBtn = new javax.swing.JButton();
        CLbl = new javax.swing.JLabel();
        WLbl = new javax.swing.JLabel();
        TFld1 = new javax.swing.JTextField();
        PLbl1 = new javax.swing.JLabel();
        PLbl2 = new javax.swing.JLabel();
        NLbl = new javax.swing.JLabel();
        HLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Introduce el territorio y la capital según la bandera:");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("UliBaker :)");

        FlagLbl.setFont(new java.awt.Font("Segoe UI", 0, 200)); // NOI18N
        FlagLbl.setForeground(new java.awt.Color(204, 204, 0));
        FlagLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        NBtn.setText("Siguiente");
        NBtn.addActionListener(this::NBtnActionPerformed);

        CBtn.setText("Check");
        CBtn.addActionListener(this::CBtnActionPerformed);

        CLbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        CLbl.setForeground(new java.awt.Color(0, 204, 102));
        CLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CLbl.setText("Correcto!");

        WLbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        WLbl.setForeground(new java.awt.Color(204, 0, 51));
        WLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WLbl.setText("Incorrecto!");

        PLbl1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        PLbl1.setForeground(new java.awt.Color(255, 0, 0));
        PLbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PLbl1.setText("Territorio:");

        PLbl2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        PLbl2.setForeground(new java.awt.Color(255, 0, 0));
        PLbl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PLbl2.setText("Capital:");

        NLbl.setBackground(new java.awt.Color(255, 255, 255));
        NLbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        NLbl.setForeground(new java.awt.Color(255, 0, 0));
        NLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NLbl.setText("n");

        HLbl.setBackground(new java.awt.Color(255, 255, 255));
        HLbl.setForeground(new java.awt.Color(0, 65, 140));
        HLbl.setText("Hola");

        jButton1.setText("Volver");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addComponent(CLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFld1)
                            .addComponent(TFld2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(NLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(FlagLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HLbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(FlagLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFld2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(HLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NBtnActionPerformed
        update();
        TFld2.setText("");
        TFld1.setText("");
        NBtn.setEnabled(false);
        WLbl.setVisible(false);
        CLbl.setVisible(false);
    }//GEN-LAST:event_NBtnActionPerformed

    private void CBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBtnActionPerformed
        String pc = mapaBanderas.get(num)[0].toLowerCase();
        String pu = TFld1.getText().trim().toLowerCase();
        String cc = mapaBanderas.get(num)[1].toLowerCase();
        String cu = TFld2.getText().trim().toLowerCase();
        
        if(TFld1.getText()!=null && TFld2.getText()!=null) {
            if(cu.equals(cc) && pu.equals(pc)) {
                NBtn.setEnabled(true);
                WLbl.setVisible(false);
                CLbl.setVisible(true);         
            } else {
                WLbl.setVisible(true);
            }       
        }
        
    }//GEN-LAST:event_CBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Ventana().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new US().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CBtn;
    private javax.swing.JLabel CLbl;
    private javax.swing.JLabel FlagLbl;
    private javax.swing.JLabel HLbl;
    private javax.swing.JButton NBtn;
    private javax.swing.JLabel NLbl;
    private javax.swing.JLabel PLbl1;
    private javax.swing.JLabel PLbl2;
    private javax.swing.JTextField TFld1;
    private javax.swing.JTextField TFld2;
    private javax.swing.JLabel WLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
