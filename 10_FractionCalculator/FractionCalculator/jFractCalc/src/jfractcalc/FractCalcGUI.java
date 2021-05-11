/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfractcalc;

/**
 *
 * @author bodyflicker
 */
public class FractCalcGUI extends javax.swing.JFrame {

    /**
     * Creates new form FractCalcGUI
     */
    public FractCalcGUI() {
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

        jButtonAddition = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonSubstraction = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDen1 = new javax.swing.JTextField();
        jTextFieldResNum = new javax.swing.JTextField();
        jTextFieldDen2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldResDen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNum1 = new javax.swing.JTextField();
        jTextFieldNum2 = new javax.swing.JTextField();
        jButtonMultiply = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAddition.setText("+");
        jButtonAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdditionActionPerformed(evt);
            }
        });

        jLabel6.setText("/");

        jButtonSubstraction.setText("-");
        jButtonSubstraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubstractionActionPerformed(evt);
            }
        });

        jLabel7.setText("/");

        jLabel4.setText("Result = ");

        jTextFieldResNum.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MINI FRACTIONAL CALCULATOR");

        jTextFieldResDen.setEnabled(false);

        jLabel2.setText("Number 1 = ");

        jLabel3.setText("Number 2 = ");

        jButtonMultiply.setText("*");
        jButtonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplyActionPerformed(evt);
            }
        });

        jButtonDivision.setText("/");
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisionActionPerformed(evt);
            }
        });

        jLabel5.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldResNum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldNum1))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldResDen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldDen1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldDen2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonMultiply)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDivision)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAddition)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSubstraction)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldDen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldDen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMultiply)
                    .addComponent(jButtonDivision)
                    .addComponent(jButtonAddition)
                    .addComponent(jButtonSubstraction))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldResNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldResDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdditionActionPerformed
        try {
            int num1 = Integer.parseInt(jTextFieldNum1.getText());
            int den1 = Integer.parseInt(jTextFieldDen1.getText());
            int num2 = Integer.parseInt(jTextFieldNum2.getText());
            int den2 = Integer.parseInt(jTextFieldDen2.getText());

            String fractResult = add(num1, den1, num2, den2);
            String[] arrayFract = fractResult.split("/");
            jTextFieldResNum.setText(arrayFract[0]);
            jTextFieldResDen.setText(arrayFract[1]);
            System.out.println(fractResult);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonAdditionActionPerformed

    private void jButtonSubstractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubstractionActionPerformed
        try {
            int num1 = Integer.parseInt(jTextFieldNum1.getText());
            int den1 = Integer.parseInt(jTextFieldDen1.getText());
            int num2 = Integer.parseInt(jTextFieldNum2.getText());
            int den2 = Integer.parseInt(jTextFieldDen2.getText());

            String fractResult = substract(num1, den1, num2, den2);
            String[] arrayFract = fractResult.split("/");
            jTextFieldResNum.setText(arrayFract[0]);
            jTextFieldResDen.setText(arrayFract[1]);
            System.out.println(fractResult);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonSubstractionActionPerformed

    private void jButtonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplyActionPerformed
        try {
            int num1 = Integer.parseInt(jTextFieldNum1.getText());
            int den1 = Integer.parseInt(jTextFieldDen1.getText());
            int num2 = Integer.parseInt(jTextFieldNum2.getText());
            int den2 = Integer.parseInt(jTextFieldDen2.getText());

            String fractResult = multiply(num1, den1, num2, den2);
            String[] arrayFract = fractResult.split("/");
            jTextFieldResNum.setText(arrayFract[0]);
            jTextFieldResDen.setText(arrayFract[1]);
            System.out.println(fractResult);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonMultiplyActionPerformed

    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisionActionPerformed
        try {
            int num1 = Integer.parseInt(jTextFieldNum1.getText());
            int den1 = Integer.parseInt(jTextFieldDen1.getText());
            int num2 = Integer.parseInt(jTextFieldNum2.getText());
            int den2 = Integer.parseInt(jTextFieldDen2.getText());

            String fractResult = division(num1, den1, num2, den2);
            String[] arrayFract = fractResult.split("/");
            jTextFieldResNum.setText(arrayFract[0]);
            jTextFieldResDen.setText(arrayFract[1]);
            System.out.println(fractResult);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonDivisionActionPerformed

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
            java.util.logging.Logger.getLogger(FractCalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FractCalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FractCalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FractCalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FractCalcGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddition;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonMultiply;
    private javax.swing.JButton jButtonSubstraction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextFieldDen1;
    private javax.swing.JTextField jTextFieldDen2;
    private javax.swing.JTextField jTextFieldNum1;
    private javax.swing.JTextField jTextFieldNum2;
    private javax.swing.JTextField jTextFieldResDen;
    private javax.swing.JTextField jTextFieldResNum;
    // End of variables declaration//GEN-END:variables

    private static String add(int num1, int den1, int num2, int den2) {
        com.ubaya.peter.FractWebService_Service service = new com.ubaya.peter.FractWebService_Service();
        com.ubaya.peter.FractWebService port = service.getFractWebServicePort();
        return port.add(num1, den1, num2, den2);
    }

    private static String division(int num1, int den1, int num2, int den2) {
        com.ubaya.peter.FractWebService_Service service = new com.ubaya.peter.FractWebService_Service();
        com.ubaya.peter.FractWebService port = service.getFractWebServicePort();
        return port.division(num1, den1, num2, den2);
    }

    private static String multiply(int num1, int den1, int num2, int den2) {
        com.ubaya.peter.FractWebService_Service service = new com.ubaya.peter.FractWebService_Service();
        com.ubaya.peter.FractWebService port = service.getFractWebServicePort();
        return port.multiply(num1, den1, num2, den2);
    }

    private static String substract(int num1, int den1, int num2, int den2) {
        com.ubaya.peter.FractWebService_Service service = new com.ubaya.peter.FractWebService_Service();
        com.ubaya.peter.FractWebService port = service.getFractWebServicePort();
        return port.substract(num1, den1, num2, den2);
    }
}