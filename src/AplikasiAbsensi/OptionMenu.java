/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiAbsensi;

/**
 *
 * @author Asus
 */
public class OptionMenu extends javax.swing.JInternalFrame {

    /**
     * Creates new form OptionMenu
     */
    public OptionMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        absensi = new javax.swing.JButton();
        rekapHarianForm = new javax.swing.JButton();
        rekapMingguanFrom = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setTitle("OPTION MENU");

        jPanel1.setBackground(new java.awt.Color(0, 255, 51));

        absensi.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        absensi.setText("Absensi");
        absensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absensiActionPerformed(evt);
            }
        });

        rekapHarianForm.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        rekapHarianForm.setText("Rekap Harian");
        rekapHarianForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekapHarianFormActionPerformed(evt);
            }
        });

        rekapMingguanFrom.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        rekapMingguanFrom.setText("Rekap Mingguan");
        rekapMingguanFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekapMingguanFromActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(absensi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(rekapHarianForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(rekapMingguanFrom)
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(absensi)
                    .addComponent(rekapHarianForm)
                    .addComponent(rekapMingguanFrom)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rekapHarianFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekapHarianFormActionPerformed
        // TODO add your handling code here:
        RekapHarian rekapHarian = new  RekapHarian();
        rekapHarian.setVisible(true);
        this.getDesktopPane().add(rekapHarian);
        this.dispose();
    }//GEN-LAST:event_rekapHarianFormActionPerformed

    private void absensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absensiActionPerformed
        // TODO add your handling code here:
        AbsensiForm absensiForm = new  AbsensiForm();
        absensiForm.setVisible(true);
        this.getDesktopPane().add(absensiForm);
        this.dispose();
        
    }//GEN-LAST:event_absensiActionPerformed

    private void rekapMingguanFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekapMingguanFromActionPerformed
        // TODO add your handling code here:
        RekapMingguan rekapMingguan = new  RekapMingguan();
        rekapMingguan.setVisible(true);
        this.getDesktopPane().add(rekapMingguan);
        this.dispose();                  
    }//GEN-LAST:event_rekapMingguanFromActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         LoginForm optionMenu = new LoginForm();
        optionMenu.setVisible(true);
        this.getDesktopPane().add(optionMenu);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton absensi;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rekapHarianForm;
    private javax.swing.JButton rekapMingguanFrom;
    // End of variables declaration//GEN-END:variables
}