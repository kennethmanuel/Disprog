/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg160419041_fractionui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bodyflicker
 */
public class FractionUI extends javax.swing.JFrame {

    /**
     * Creates new form FractionUI
     */
    public FractionUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the
     * Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numerator1Field = new javax.swing.JTextField();
        denominator1Field = new javax.swing.JTextField();
        denominator2Field = new javax.swing.JTextField();
        numerator2Field = new javax.swing.JTextField();
        buttonSubstract = new javax.swing.JButton();
        buttonMultiply = new javax.swing.JButton();
        buttonDivide = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        denominatorResultField = new javax.swing.JTextField();
        numeratorResultField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonSubstract.setText("-");
        buttonSubstract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubstractActionPerformed(evt);
            }
        });

        buttonMultiply.setText("*");
        buttonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiplyActionPerformed(evt);
            }
        });

        buttonDivide.setText("/");
        buttonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivideActionPerformed(evt);
            }
        });

        buttonAdd.setText("+");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("=");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(denominator1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numerator1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(buttonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSubstract, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(denominator2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numerator2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(denominatorResultField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeratorResultField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(numerator2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(denominator2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numeratorResultField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(denominatorResultField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numerator1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonAdd)
                                .addComponent(buttonSubstract)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(denominator1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonDivide)
                                .addComponent(buttonMultiply)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int numerator1;
    int denominator1;
    int numerator2;
    int denominator2;
    Fraction fraction1;
    Fraction fraction2;
    Fraction result;
    
    private void buttonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivideActionPerformed
        try {
            getValue();
            result = Fraction.divide(fraction1, fraction2);
            setResult();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Denominator can't be 0.", "Error: input is not a number", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonDivideActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        try {
            getValue();
            result = Fraction.add(fraction1, fraction2);
            setResult();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Denominator can't be 0.", "Error: input is not a number", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultiplyActionPerformed
        try {
            getValue();
            result = Fraction.multiply(fraction1, fraction2);
            setResult();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Denominator can't be 0.", "Error: input is not a number", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonMultiplyActionPerformed

    private void buttonSubstractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubstractActionPerformed
        try {
            getValue();
            result = Fraction.substract(fraction1, fraction2);
            setResult();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Denominator can't be 0.", "Error: input is not a number", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonSubstractActionPerformed
    
    public void getValue() throws Exception{
        numerator1 = Integer.parseInt(numerator1Field.getText()); 
        denominator1 = Integer.parseInt(denominator1Field.getText());
        numerator2 = Integer.parseInt(numerator2Field.getText());
        denominator2 = Integer.parseInt(denominator2Field.getText());
        fraction1 = new Fraction(numerator1, denominator1);
        fraction2 = new Fraction(numerator2, denominator2);
    }
    
    public void setResult() {
        this.numeratorResultField.setText(Integer.toString(result.getNumerator()));
        this.denominatorResultField.setText(Integer.toString(result.getDenominator()));
    }
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
            java.util.logging.Logger.getLogger(FractionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FractionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FractionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FractionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FractionUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDivide;
    private javax.swing.JButton buttonMultiply;
    private javax.swing.JButton buttonSubstract;
    private javax.swing.JTextField denominator1Field;
    private javax.swing.JTextField denominator2Field;
    private javax.swing.JTextField denominatorResultField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField numerator1Field;
    private javax.swing.JTextField numerator2Field;
    private javax.swing.JTextField numeratorResultField;
    // End of variables declaration//GEN-END:variables
}