/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com._2dmedicalImageprocessingusingmapreduce.admin;

import com._2dmedicalImageprocessingusingmapreduce.pojo.Images;
import com._2dmedicalImageprocessingusingmapreduce.service.ServiceImpl;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author akshay
 */
public class AdminLoadImages extends javax.swing.JFrame {

    private static final Logger LOGGER = Logger.getLogger(AdminLoadImages.class.getName());
    Images images;

    public AdminLoadImages() {
        images=new Images();
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
        lblType = new javax.swing.JLabel();
        lblTreatment = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        cmbTreatment = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblVector = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVector = new javax.swing.JTextArea();
        pnlImage = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        btnLoadImage = new javax.swing.JButton();
        btnLoadToHdfs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");

        pnlImageDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblType.setText("Type :");

        lblTreatment.setText("Treatment :");

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Stage 1", "Stage 2", "Stage 3" }));

        cmbTreatment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No_Treatment", "Surgary", "Radiotherapy", "Chemotherapy" }));

        btnSave.setText("S a v e");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("C a n c e l");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblVector.setText("Vector");

        txtVector.setEditable(false);
        txtVector.setBackground(new java.awt.Color(0, 0, 0));
        txtVector.setColumns(20);
        txtVector.setForeground(new java.awt.Color(245, 231, 231));
        txtVector.setLineWrap(true);
        txtVector.setRows(5);
        jScrollPane1.setViewportView(txtVector);

        javax.swing.GroupLayout pnlImageDetailsLayout = new javax.swing.GroupLayout(pnlImageDetails);
        pnlImageDetails.setLayout(pnlImageDetailsLayout);
        pnlImageDetailsLayout.setHorizontalGroup(
            pnlImageDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageDetailsLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(lblVector)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlImageDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlImageDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlImageDetailsLayout.setVerticalGroup(
            pnlImageDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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
        btnLoadToHdfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadToHdfsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlImageLayout = new javax.swing.GroupLayout(pnlImage);
        pnlImage.setLayout(pnlImageLayout);
        pnlImageLayout.setHorizontalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLoadToHdfs, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(btnLoadImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlImageLayout.setVerticalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
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
            images.setPath(filePath);
            BufferedImage  bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2dO = bufferedImage.createGraphics();
            g2dO.drawImage(image, 0, 0, image.getWidth(null), image.getHeight(null), null);
            bufferedImage=new ServiceImpl().resizeImage(bufferedImage, 256, 256);
            lblImage.setIcon(new ImageIcon(bufferedImage));
            String vector =new ServiceImpl().getVector(bufferedImage);
            LOGGER.info("Image Vector: "+vector);
            images.setVector(vector);
            txtVector.setText(vector);
        } catch (InterruptedException ex) {
            Logger.getLogger(AdminLoadImages.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IllegalArgumentException ex){
            LOGGER.log(Level.SEVERE,"Image Not Loaded");
        }
    }//GEN-LAST:event_btnLoadImageActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Properties properties=new ServiceImpl().getProperties("2d-mirum.properties");
        images.setType(cmbType.getSelectedItem().toString());
        images.setTreatment(cmbTreatment.getSelectedItem().toString());
        try{
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(properties.getProperty("localDump").toString()), true));
            bw.write(""+images.getVector()+"\t"+images.getType()+"\t"+images.getTreatment()+"\t"+images.getPath()+"\n");
            bw.close();
            LOGGER.info("Record Added to File: "+images.getVector()+"\t"+images.getType()+"\t"+images.getTreatment()+"\t"+images.getPath());
        }catch(IOException ex){
            LOGGER.log(Level.SEVERE,"File Not Found");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtVector.setText("");
        cmbType.setSelectedIndex(0);
        cmbTreatment.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnLoadToHdfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadToHdfsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoadToHdfsActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTreatment;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblVector;
    private javax.swing.JPanel pnlImage;
    private javax.swing.JPanel pnlImageDetails;
    private javax.swing.JTextArea txtVector;
    // End of variables declaration//GEN-END:variables
}
