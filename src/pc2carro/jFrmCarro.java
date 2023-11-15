/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pc2carro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexi
 */
public class jFrmCarro extends javax.swing.JFrame {

    /**
     * Creates new form jFrmCarro
     */
    List<Carro> carros = new ArrayList<>();
    public jFrmCarro() {
        initComponents();
    }
    public jFrmCarro(Carro a, List<Carro> carros) {
        initComponents();
        ShowItems(a);
        this.carros = carros;
    }
    
    public jFrmCarro(List<Carro> carros) {
        initComponents();
        this.carros = carros;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        atodoriesgotxt = new javax.swing.JRadioButton();
        atercerostxt = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        modeltxt = new javax.swing.JTextField();
        colortxt = new javax.swing.JTextField();
        placatxt = new javax.swing.JTextField();
        aniofabricaciontxt = new javax.swing.JTextField();
        tipopinturatxt = new javax.swing.JCheckBox();
        tipodecarrotxt = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DATOS DEL CARRO");

        jLabel2.setText("Modelo");

        jLabel3.setText("Color:");

        jLabel4.setText("Placa:");

        atodoriesgotxt.setText("A todo riesgo ");
        atodoriesgotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atodoriesgotxtActionPerformed(evt);
            }
        });

        atercerostxt.setText("A terceros");
        atercerostxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atercerostxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Año Fabricacion:");

        jLabel6.setText("Tipo de carro:");

        jLabel7.setText("Tipo Pintura:");

        tipopinturatxt.setText("Metalizada");
        tipopinturatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipopinturatxtActionPerformed(evt);
            }
        });

        tipodecarrotxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mini", "Utilitario", "Familiar", "Deportivo" }));
        tipodecarrotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipodecarrotxtActionPerformed(evt);
            }
        });

        jButton1.setText("Terminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(aniofabricaciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tipodecarrotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tipopinturatxt)
                                            .addComponent(jButton1))
                                        .addGap(84, 84, 84))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modeltxt, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(colortxt)
                            .addComponent(placatxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(atodoriesgotxt)
                        .addGap(18, 18, 18)
                        .addComponent(atercerostxt)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(modeltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(colortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(placatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atodoriesgotxt)
                    .addComponent(atercerostxt))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(aniofabricaciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tipodecarrotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tipopinturatxt))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atodoriesgotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atodoriesgotxtActionPerformed
        // TODO add your handling code here:
        atercerostxt.setSelected(false);
    }//GEN-LAST:event_atodoriesgotxtActionPerformed

    private void tipopinturatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipopinturatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipopinturatxtActionPerformed

    private void tipodecarrotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipodecarrotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipodecarrotxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean riesgo = true;
        if(atercerostxt.isSelected()){
            riesgo = false;
        }
        Carro nuevoCarro = new Carro(modeltxt.getText(), colortxt.getText(),tipopinturatxt.isSelected(), placatxt.getText(), tipodecarrotxt.getSelectedItem().toString() ,aniofabricaciontxt.getText() ,riesgo);
        modeltxt.setText("");
        colortxt.setText("");
        placatxt.setText("");
        aniofabricaciontxt.setText("");
        carros.add(nuevoCarro);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void atercerostxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atercerostxtActionPerformed
        // TODO add your handling code here:
        atodoriesgotxt.setSelected(false);
    }//GEN-LAST:event_atercerostxtActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jFrmCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmCarro().setVisible(true);
            }
        });
    }
    private void ShowItems(Carro a){
        modeltxt.setText(a.getModelo());
        colortxt.setText(a.getColor());
        placatxt.setText(a.getPlaca());
        aniofabricaciontxt.setText(a.getAnoFabricacion());
        if(a.isPinturaMetalizada()){
            tipopinturatxt.setSelected(true);
        }
        
        if(a.isSeguroATerceros()){
            atercerostxt.setSelected(true);
        }else{
            atodoriesgotxt.setSelected(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aniofabricaciontxt;
    private javax.swing.JRadioButton atercerostxt;
    private javax.swing.JRadioButton atodoriesgotxt;
    private javax.swing.JTextField colortxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField modeltxt;
    private javax.swing.JTextField placatxt;
    private javax.swing.JComboBox<String> tipodecarrotxt;
    private javax.swing.JCheckBox tipopinturatxt;
    // End of variables declaration//GEN-END:variables

    Carro getCarro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
