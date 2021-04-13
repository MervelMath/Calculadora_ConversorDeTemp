
public class CalculatorWindow extends javax.swing.JFrame {


    public CalculatorWindow() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExitCalc = new javax.swing.JButton();
        jTextFieldCalc = new javax.swing.JTextField();
        jTextFieldCalc2 = new javax.swing.JTextField();
        jButtonSum = new javax.swing.JButton();
        jButtonSubtraction = new javax.swing.JButton();
        jButtonMultiplication = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultCalc = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonBacktoConv = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCleanCalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(460, 150));

        jButtonExitCalc.setText("Sair");
        jButtonExitCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitCalcActionPerformed(evt);
            }
        });

        jButtonSum.setText("+");
        jButtonSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumActionPerformed(evt);
            }
        });

        jButtonSubtraction.setText("-");
        jButtonSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtractionActionPerformed(evt);
            }
        });

        jButtonMultiplication.setText("x");
        jButtonMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicationActionPerformed(evt);
            }
        });

        jButtonDivision.setText("/");
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisionActionPerformed(evt);
            }
        });

        jTextAreaResultCalc.setColumns(20);
        jTextAreaResultCalc.setRows(5);
        jTextAreaResultCalc.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jScrollPane1.setViewportView(jTextAreaResultCalc);

        jButtonBacktoConv.setText("< Voltar");
        jButtonBacktoConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBacktoConvActionPerformed(evt);
            }
        });

        jLabel1.setText("Número:");

        jLabel2.setText("Número:");

        jButtonCleanCalc.setText("Limpar");
        jButtonCleanCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBacktoConv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExitCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButtonSum)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonSubtraction)
                        .addGap(44, 44, 44)
                        .addComponent(jButtonMultiplication)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCleanCalc)
                        .addGap(60, 60, 60)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCalc2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDivision)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCalc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButtonCleanCalc)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSum)
                    .addComponent(jButtonSubtraction)
                    .addComponent(jButtonMultiplication)
                    .addComponent(jButtonDivision))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExitCalc)
                    .addComponent(jButtonBacktoConv))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumActionPerformed
        double a = Double.parseDouble(jTextFieldCalc.getText()) + 
                Double.parseDouble(jTextFieldCalc2.getText());
        
        jTextAreaResultCalc.setText(String.valueOf(a));
    }//GEN-LAST:event_jButtonSumActionPerformed

    private void jButtonBacktoConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBacktoConvActionPerformed
        this.dispose();
        ConverterWindow conv = new ConverterWindow();
        conv.setVisible(true);
    }//GEN-LAST:event_jButtonBacktoConvActionPerformed

    private void jButtonExitCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitCalcActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitCalcActionPerformed

    private void jButtonSubtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtractionActionPerformed
       double a = Double.parseDouble(jTextFieldCalc.getText()) - 
                Double.parseDouble(jTextFieldCalc2.getText());
        
        jTextAreaResultCalc.setText(String.valueOf(a));
    }//GEN-LAST:event_jButtonSubtractionActionPerformed

    private void jButtonMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicationActionPerformed
        double a = Double.parseDouble(jTextFieldCalc.getText()) * 
                Double.parseDouble(jTextFieldCalc2.getText());
        
        jTextAreaResultCalc.setText(String.valueOf(a));
    }//GEN-LAST:event_jButtonMultiplicationActionPerformed

    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisionActionPerformed
        double a = Double.parseDouble(jTextFieldCalc.getText()) / 
                Double.parseDouble(jTextFieldCalc2.getText());
        
        jTextAreaResultCalc.setText(String.valueOf(a));
    }//GEN-LAST:event_jButtonDivisionActionPerformed

    private void jButtonCleanCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanCalcActionPerformed
        jTextFieldCalc.setText("");
        jTextFieldCalc2.setText("");
        jTextAreaResultCalc.setText("");
    }//GEN-LAST:event_jButtonCleanCalcActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CalculatorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CalculatorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CalculatorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CalculatorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CalculatorWindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBacktoConv;
    private javax.swing.JButton jButtonCleanCalc;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonExitCalc;
    private javax.swing.JButton jButtonMultiplication;
    private javax.swing.JButton jButtonSubtraction;
    private javax.swing.JButton jButtonSum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaResultCalc;
    private javax.swing.JTextField jTextFieldCalc;
    private javax.swing.JTextField jTextFieldCalc2;
    // End of variables declaration//GEN-END:variables
}
