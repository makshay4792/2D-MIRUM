/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com._2dmedicalImageprocessingusingmapreduce.admin;

import com._2dmedicalImageprocessingusingmapreduce.service.ServiceImpl;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author akshay
 */
public class AdminLoadImages extends javax.swing.JFrame {

    private static final Logger LOGGER = Logger.getLogger(AdminLoadImages.class.getName());

    public AdminLoadImages() {
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

        pnlImageDetails = new javax.swing.JPanel();
        txtVector = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblTreatment = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        cmbTreatment = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblVector = new javax.swing.JLabel();
        pnlImage = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        btnLoadImage = new javax.swing.JButton();
        btnLoadToHdfs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");

        pnlImageDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtVector.setBackground(new java.awt.Color(0, 0, 0));
        txtVector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtVector.setOpaque(true);

        lblType.setText("Type :");

        lblTreatment.setText("Treatment :");

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Stage 1", "Stage 2", "Stage 3" }));

        cmbTreatment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Treatment", "Surgary", "Radiotherapy", "Chemotherapy" }));

        btnSave.setText("S a v e");

        btnCancel.setText("C a n c e l");

        lblVector.setText("Vector");

        javax.swing.GroupLayout pnlImageDetailsLayout = new javax.swing.GroupLayout(pnlImageDetails);
        pnlImageDetails.setLayout(pnlImageDetailsLayout);
        pnlImageDetailsLayout.setHorizontalGroup(
            pnlImageDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlImageDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlImageDetailsLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlImageDetailsLayout.createSequentialGroup()
                        .addComponent(lblTreatment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlImageDetailsLayout.createSequentialGroup()
                        .addComponent(lblType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(pnlImageDetailsLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(lblVector)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlImageDetailsLayout.setVerticalGroup(
            pnlImageDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtVector, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVector)
                .addGap(23, 23, 23)
                .addGroup(pnlImageDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlImageDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTreatment))
                .addGap(29, 29, 29)
                .addGroup(pnlImageDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        getContentPane().add(pnlImageDetails, java.awt.BorderLayout.LINE_END);

        pnlImage.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        lblImage.setBackground(new java.awt.Color(0, 0, 0));
        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lblImage.setOpaque(true);

        btnLoadImage.setText("L o a d          I m a g e");
        btnLoadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadImageActionPerformed(evt);
            }
        });

        btnLoadToHdfs.setText("L o a d           T o           H D F S");

        javax.swing.GroupLayout pnlImageLayout = new javax.swing.GroupLayout(pnlImage);
        pnlImage.setLayout(pnlImageLayout);
        pnlImageLayout.setHorizontalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLoadToHdfs, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(btnLoadImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlImageLayout.setVerticalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLoadImage)
                .addGap(18, 18, 18)
                .addComponent(btnLoadToHdfs)
                .addContainerGap())
        );

        getContentPane().add(pnlImage, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadImageActionPerformed

        FileDialog fd = new FileDialog(this, "Select Image File", FileDialog.LOAD);
        fd.setVisible(true);
        String filePath = fd.getDirectory() + fd.getFile();
        try {
            Image image = Toolkit.getDefaultToolkit().getImage(filePath);
            MediaTracker mediaTracker = new MediaTracker(new Container());
            mediaTracker.addImage(image, 0);
            mediaTracker.waitForID(0);
            LOGGER.info("Input Image Read from "+filePath);
            BufferedImage  bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
            bufferedImage=new ServiceImpl().resizeImage(bufferedImage, 256, 256);
            lblImage.setIcon(new ImageIcon(bufferedImage));
        } catch (InterruptedException ex) {
            Logger.getLogger(AdminLoadImages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoadImageActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLoadImages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLoadImages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLoadImages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLoadImages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLoadImages().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLoadImage;
    private javax.swing.JButton btnLoadToHdfs;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbTreatment;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTreatment;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblVector;
    private javax.swing.JPanel pnlImage;
    private javax.swing.JPanel pnlImageDetails;
    private javax.swing.JLabel txtVector;
    // End of variables declaration//GEN-END:variables
}
