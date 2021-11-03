/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import model.CalculateClass;
import model.EncounterClass;
import model.SystemClass;
import model.PatientClass;

/**
 *
 * @author fianrodrigues
 */
public class CalculationJPanel extends javax.swing.JPanel 
{

    /**
     * Creates new form CalculationJPanel
     */
    HashMap<String, Integer> ageGroup;
    SystemClass system;
    ArrayList<CalculateClass> ana;
    
    public CalculationJPanel(SystemClass system) 
    {
        initComponents();this.system = system;

        ana = new ArrayList<>();

        for (PatientClass pat : system.getListOfPatients().getPatients()) 
        {
            for (EncounterClass enc : pat.getEncounterHistory().getEncounterHistory()) 
            {
                int bp = enc.getVitalSign().getBloodPressure();
                Period period = Period.between(pat.getDOB().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now());
                System.out.println("sdf " + isAbnormal(period.getYears(), bp));

                int age = period.getYears();
                int index = isInArray(pat.getAddress().getCommunity().getCommunity());
                if (age < 21)
                {
                    if (!isAbnormal(period.getYears(), bp)) 
                    {
                        if (index < 0)
                        {
                            CalculateClass analytics = new CalculateClass(pat.getAddress().getCommunity().getCommunity(), 0);
                            ana.add(analytics);
                        } else 
                        {
                            int res = ana.get(index).key[0];
                            ana.get(index).addAgeAnalytics(0, ++res);
                        }
                    }

                }
                else if (age < 46) 
                {
                    if (!isAbnormal(period.getYears(), bp))
                    {
                        if (index < 0) 
                        {
                            CalculateClass analytic = new CalculateClass(pat.getAddress().getCommunity().getCommunity(), 1);
                            ana.add(analytic);
                        } 
                        else 
                        {
                            int res = ana.get(index).key[1];
                            ana.get(index).addAgeAnalytics(1, ++res);
                        }
                    }

                } 
                else if (age < 65)
                {
                    if (!isAbnormal(period.getYears(), bp))
                    {

                        if (index < 0)
                        {
                            CalculateClass analytic = new CalculateClass(pat.getAddress().getCommunity().getCommunity(), 2);
                            ana.add(analytic);
                        }
                        else
                        {
                            int res = ana.get(index).key[2];
                            ana.get(index).addAgeAnalytics(2, ++res);
                        }

                    }
                } 
                else 
                {
                    if (!isAbnormal(period.getYears(), bp)) 
                    {

                        if (index < 0) 
                        {
                            CalculateClass analytic = new CalculateClass(pat.getAddress().getCommunity().getCommunity(), 3);
                            ana.add(analytic);
                        } 
                        else
                        {
                            int res = ana.get(index).key[3];
                            ana.get(index).addAgeAnalytics(3, ++res);
                        }
                    }
                }
            }
        }
        displayPatient();

    }


    public int isInArray(String comm) 
    {
        int i = 0;
        for (CalculateClass anc : ana)
        {

            if (anc.getCommunity().equals(comm))
            {
                return i;
            }

            i++;
        }
        return -1;
    }

    public boolean isAbnormal(int age, int val) 
    {
        System.out.println("jkdsf" + age + " " + val);

        if (age < 21) {
            if (val >= 109 && val <= 121) 
            {
                return true;
            } else 
            {
                return false;
            }
        } else if (age < 46)
        {
            if (val >= 115 && val <= 125)
            {
                return true;
            } else 
            {
                return false;
            }
        } 
        else if (age < 65)
        {
            if (val >= 118 && val <= 129)
            {
                return true;
            } else
            {
                return false;
            }
        } else 
        {
            if (val >= 130 && val <= 143) 
            {
                return true;
            } else 
            {
                return false;
            }
        }

    }

    private void displayPatient()
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        int i = 0;
        for (Object key : ana.toArray())
        {

            Object[] row = new Object[5];
            row[0] = ana.get(i).community;
            row[1] = ana.get(i).key[0];
            row[2] = ana.get(i).key[1];
            row[3] = ana.get(i).key[2];
            row[4] = ana.get(i).key[3];
            i++;
            model.addRow(row);
        }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMMUNITY WISE HEALTH ABNORMALITIES");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name of Community", "< 20", "20 to 45", "45 to 70", "70+"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(411, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
