/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;
import model.CityClass;
import model.CommunityClass;
import model.EncounterClass;
import model.HouseClass;
import model.PatientClass;
import model.PersonClass;

import model.SystemClass;
import model.VitalSignsClass;


/**
 *
 * @author fianrodrigues
 */
public class SystemJFrame extends javax.swing.JFrame 
{

    /**
     * Creates new form SystemJFrame
     */
     SystemClass system ;
     
    public SystemJFrame()
    {
        initComponents();
         system = new SystemClass();
        
//        String filepath = "//Users/fianrorigues/Desktop/info5100assignment4.txt";
//        File file = new File(filepath);
//        try 
//        {
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//
//            Object[] lines = br.lines().toArray();
//
//            for (int m = 0; m < lines.length; m++) 
//            {
//                String[] row = lines[m].toString().split(" ");
//                Date resultdate = new Date(System.currentTimeMillis());
//
//                PersonClass p= new PersonClass(row[0]+row[1],new HouseClass(row[2], row[3], row[4],new CommunityClass(row[13]), new CityClass(row[5]), Integer.valueOf(row[6])), row[7], new Date(row[8]),Integer.valueOf(row[9]));
//                
//                VitalSignsClass vs = new VitalSignsClass(Integer.valueOf(row[10]) , Integer.valueOf(row[11]), Integer.valueOf(row[12]));
//                EncounterClass enc = new EncounterClass(vs , resultdate, "Fever");
//                
//                PatientClass pat = new PatientClass(p.getName(), p.getAddress(), p.getDOB(), p.getID(), enc);
//                system.addPatient(pat);
//                system.addPerson(p);
//                
//            }
//        } 
//        catch (FileNotFoundException ex)
//        {
//            System.out.println("no file found");
//        }
        
       
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnAddPerson = new javax.swing.JButton();
        btnOldPatient = new javax.swing.JButton();
        ViewPerson = new javax.swing.JButton();
        btnDataCalculation = new javax.swing.JButton();
        btnPatientCatalog = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        btnOldPatient.setText("Old Patient");
        btnOldPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOldPatientActionPerformed(evt);
            }
        });

        ViewPerson.setText("View Person");
        ViewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPersonActionPerformed(evt);
            }
        });

        btnDataCalculation.setText("Data Calculation");
        btnDataCalculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataCalculationActionPerformed(evt);
            }
        });

        btnPatientCatalog.setText("Patient Catalog");
        btnPatientCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientCatalogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPatientCatalog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOldPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddPerson, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDataCalculation)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(btnAddPerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewPerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOldPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPatientCatalog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDataCalculation)
                .addContainerGap(411, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
        AddPersonJPanel view = new AddPersonJPanel(system);
        jSplitPane1.setRightComponent(view);
    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void ViewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPersonActionPerformed
        // TODO add your handling code here:

        ViewPersonJPanel view = new ViewPersonJPanel(system);
        jSplitPane1.setRightComponent(view);
    }//GEN-LAST:event_ViewPersonActionPerformed

    private void btnPatientCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientCatalogActionPerformed
        // TODO add your handling code here:
        PatientCatalogJPanel view = new PatientCatalogJPanel(system);
        jSplitPane1.setRightComponent(view);
    }//GEN-LAST:event_btnPatientCatalogActionPerformed

    private void btnDataCalculationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataCalculationActionPerformed
        // TODO add your handling code here:
        CalculationJPanel view = new CalculationJPanel(system);
        jSplitPane1.setRightComponent(view);
    }//GEN-LAST:event_btnDataCalculationActionPerformed

    private void btnOldPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOldPatientActionPerformed
        // TODO add your handling code here:
        
         OldPatientJPanel view = new OldPatientJPanel(system);
        jSplitPane1.setRightComponent(view);
    }//GEN-LAST:event_btnOldPatientActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(SystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new SystemJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewPerson;
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnDataCalculation;
    private javax.swing.JButton btnOldPatient;
    private javax.swing.JButton btnPatientCatalog;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
