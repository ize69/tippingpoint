/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tippingpoint;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 22worseni
 */
public class scoringframe extends javax.swing.JFrame {
    // 0 nither, 1 red , 2 blue, 3 tie
    int redautonBonus = 0;
    int blueautonBonus = 0;
    boolean tempRed = false;
    boolean tempBlue = false;
    //Color winningcolor = Color.white;
    /**
     * Creates new form scoring frame
     */
    public scoringframe() {
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

        jLabel1 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textField6 = new java.awt.TextField();
        textField7 = new java.awt.TextField();
        textField8 = new java.awt.TextField();
        textField9 = new java.awt.TextField();
        textField10 = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        autonRed = new java.awt.Checkbox();
        jLabel10 = new javax.swing.JLabel();
        autonBlue = new java.awt.Checkbox();
        textField11 = new java.awt.TextField();
        textField12 = new java.awt.TextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipping Point Scoring Utllity");

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tipping point scoring");

        textField1.setName(""); // NOI18N
        textField1.setText("0");
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        textField1.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField1TextValueChanged(evt);
            }
        });

        textField2.setText("0");
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });
        textField2.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField2TextValueChanged(evt);
            }
        });

        textField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textField3.setText("0");
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });
        textField3.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField3TextValueChanged(evt);
            }
        });

        textField4.setText("0");
        textField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField4ActionPerformed(evt);
            }
        });
        textField4.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField4TextValueChanged(evt);
            }
        });

        textField5.setText("0");
        textField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField5ActionPerformed(evt);
            }
        });
        textField5.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField5TextValueChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0");

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0");

        textField6.setText("0");
        textField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField6ActionPerformed(evt);
            }
        });
        textField6.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField6TextValueChanged(evt);
            }
        });

        textField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textField7.setText("0");
        textField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField7ActionPerformed(evt);
            }
        });
        textField7.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField7TextValueChanged(evt);
            }
        });

        textField8.setText("0");
        textField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField8ActionPerformed(evt);
            }
        });
        textField8.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField8TextValueChanged(evt);
            }
        });

        textField9.setText("0");
        textField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField9ActionPerformed(evt);
            }
        });
        textField9.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField9TextValueChanged(evt);
            }
        });

        textField10.setText("0");
        textField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField10ActionPerformed(evt);
            }
        });
        textField10.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField10TextValueChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("made posible by 44012E");

        jLabel5.setText("High Rings");

        jLabel6.setText("Low Rings");

        jLabel7.setText("High Goals");

        jLabel8.setText("Bin Rings");

        jLabel9.setText("auton");

        autonRed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                autonRedItemStateChanged(evt);
            }
        });
        autonRed.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                autonRedPropertyChange(evt);
            }
        });

        jLabel10.setText("Low Goals");

        autonBlue.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        autonBlue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                autonBlueItemStateChanged(evt);
            }
        });

        textField11.setText("0");
        textField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField11ActionPerformed(evt);
            }
        });
        textField11.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                textField11PropertyChange(evt);
            }
        });
        textField11.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField11TextValueChanged(evt);
            }
        });

        textField12.setText("0");
        textField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField12ActionPerformed(evt);
            }
        });
        textField12.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                textField12PropertyChange(evt);
            }
        });
        textField12.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField12TextValueChanged(evt);
            }
        });

        jLabel11.setText("parked bots");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(autonRed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addComponent(textField11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(423, 423, 423)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textField10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(autonBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(textField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(textField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(autonRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autonBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(15, 15, 15))
        );

        getAccessibleContext().setAccessibleDescription("score a match of vex Tipping point 2021-2022");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private int boxvalue(String insidebox,int pointvalue){
        if(!"".equals(insidebox)){}
    return 0;
    }
    private void calculatescroes(boolean red){
        int temp=0;
    if (red){
        temp+=(Integer.valueOf(textField1.getText()))*10;
        temp+=(Integer.valueOf(textField2.getText()))*3;
        temp+=Integer.valueOf(textField3.getText());
        temp+=(Integer.valueOf(textField4.getText()))*20;
        temp+=(Integer.valueOf(textField5.getText()))*40;
        temp+=(Integer.valueOf(textField11.getText()))*30;
        temp+=redautonBonus;
        jLabel2.setText(String.valueOf(temp));
    }
    else{
        temp+=(Integer.valueOf(textField6.getText()))*10;
        temp+=(Integer.valueOf(textField7.getText()))*3;
        temp+=Integer.valueOf(textField8.getText());
        temp+=(Integer.valueOf(textField9.getText()))*20;
        temp+=(Integer.valueOf(textField10.getText()))*40;
        temp+=(Integer.valueOf(textField12.getText()))*30;
        temp+=blueautonBonus;
        jLabel3.setText(String.valueOf(temp));
    }
    }
    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
       
    }//GEN-LAST:event_textField3ActionPerformed

    private void textField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField5ActionPerformed

    private void textField1TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField1TextValueChanged
        // TODO add your handling code here:
        if(textField1.getText().isEmpty()){
        textField1.setText("0");
        textField1.setCaretPosition(1);
        }
        calculatescroes(true);
    }//GEN-LAST:event_textField1TextValueChanged
    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed
    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed
    private void textField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4ActionPerformed
    private void textField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField6ActionPerformed
    private void textField6TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField6TextValueChanged
        if(textField6.getText().isEmpty()){
        textField6.setText("0");
        textField6.setCaretPosition(1);
        } 
        calculatescroes(false);
    }//GEN-LAST:event_textField6TextValueChanged
    private void textField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField7ActionPerformed
    private void textField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField8ActionPerformed
    private void textField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField9ActionPerformed
    private void textField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField10ActionPerformed
    private void textField2TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField2TextValueChanged
        if(textField2.getText().isEmpty()){
        textField2.setText("0");
        textField2.setCaretPosition(1);
        }
        calculatescroes(true);
    }//GEN-LAST:event_textField2TextValueChanged
    private void textField3TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField3TextValueChanged
        if(textField3.getText().isEmpty()){
        textField3.setText("0");  
        textField3.setCaretPosition(1);
        }
        calculatescroes(true);
    }//GEN-LAST:event_textField3TextValueChanged
    private void textField4TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField4TextValueChanged
        if(textField4.getText().isEmpty()){
        textField4.setText("0");
        textField4.setCaretPosition(1);
        }
        calculatescroes(true);
    }//GEN-LAST:event_textField4TextValueChanged
    private void textField5TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField5TextValueChanged
        if(textField5.getText().isEmpty()){
        textField5.setText("0");  
        textField5.setCaretPosition(1);
        }
        calculatescroes(true);
    }//GEN-LAST:event_textField5TextValueChanged
    private void textField7TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField7TextValueChanged
         if(textField7.getText().isEmpty()){
        textField7.setText("0");
        textField7.setCaretPosition(1);
        }
        calculatescroes(false); 
    }//GEN-LAST:event_textField7TextValueChanged
    private void textField8TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField8TextValueChanged
        if(textField8.getText().isEmpty()){
        textField8.setText("0");
        textField8.setCaretPosition(1);
        } 
        calculatescroes(false);
    }//GEN-LAST:event_textField8TextValueChanged
    private void textField9TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField9TextValueChanged
         if(textField9.getText().isEmpty()){
        textField9.setText("0");
        textField9.setCaretPosition(1);
        }
        calculatescroes(false);
    }//GEN-LAST:event_textField9TextValueChanged

    private void textField10TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField10TextValueChanged
        if(textField10.getText().isEmpty()){
        textField10.setText("0");   
        }
        calculatescroes(false);
    }//GEN-LAST:event_textField10TextValueChanged
    public void setautonstate(){
        if(tempRed&&tempBlue){
            redautonBonus=3;
            blueautonBonus=3;
        }
        else if(tempRed){
            redautonBonus=6;
            blueautonBonus=0;
        }
        else if(tempBlue){
            blueautonBonus=6;
            redautonBonus=0;
        }
        else{
        redautonBonus=0;
        blueautonBonus=0;}
    }
    private void autonRedPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_autonRedPropertyChange
        
    }//GEN-LAST:event_autonRedPropertyChange

    private void autonRedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_autonRedItemStateChanged
       tempRed=!tempRed;
        setautonstate();
        calculatescroes(true);
        calculatescroes(false);
        System.out.println(redautonBonus);
    }//GEN-LAST:event_autonRedItemStateChanged

    private void autonBlueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_autonBlueItemStateChanged
        tempBlue=!tempBlue;
        setautonstate();
        calculatescroes(true);
        calculatescroes(false);
        System.out.println(redautonBonus);
    }//GEN-LAST:event_autonBlueItemStateChanged

    private void textField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField11ActionPerformed

    private void textField11TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField11TextValueChanged
        if(textField11.getText().isEmpty()){
        textField11.setText("0");
        textField11.setCaretPosition(1);
        }
        calculatescroes(true);
    }//GEN-LAST:event_textField11TextValueChanged

    private void textField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField12ActionPerformed

    private void textField12TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField12TextValueChanged
        if(textField12.getText().isEmpty()){
        textField12.setText("0");
        textField12.setCaretPosition(1);
        }
        calculatescroes(false);
    }//GEN-LAST:event_textField12TextValueChanged

    private void textField11PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textField11PropertyChange
        
    }//GEN-LAST:event_textField11PropertyChange

    private void textField12PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textField12PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_textField12PropertyChange

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
            java.util.logging.Logger.getLogger(scoringframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scoringframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scoringframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scoringframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scoringframe().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox autonBlue;
    private java.awt.Checkbox autonRed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.TextField textField1;
    private java.awt.TextField textField10;
    private java.awt.TextField textField11;
    private java.awt.TextField textField12;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    private java.awt.TextField textField7;
    private java.awt.TextField textField8;
    private java.awt.TextField textField9;
    // End of variables declaration//GEN-END:variables
    }
