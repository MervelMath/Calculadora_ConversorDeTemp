
public class ConverterWindow extends javax.swing.JFrame {

    public ConverterWindow() {
        initComponents();
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        jComboBox1.addItem("Celsius");
        jComboBox1.addItem("Kelvin");
        jComboBox1.addItem("Fahrenheit");
        jComboBox2.addItem("Celsius");
        jComboBox2.addItem("Kelvin");
        jComboBox2.addItem("Fahrenheit");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExit = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextFieldTemp1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaResult = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonGoToCalc = new javax.swing.JButton();
        jButtonCleanConv = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(460, 150));
        setPreferredSize(new java.awt.Dimension(480, 350));

        jButtonExit.setText("Sair");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextFieldTemp1.setBorder(javax.swing.BorderFactory.createTitledBorder("Temperatura"));
        jTextFieldTemp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTemp1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextAreaResult.setColumns(20);
        jTextAreaResult.setRows(5);
        jTextAreaResult.setBorder(javax.swing.BorderFactory.createTitledBorder("Temperatura Convertida"));
        jScrollPane2.setViewportView(jTextAreaResult);

        jButton1.setText("CONVERTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("De:");

        jLabel2.setText("Para:");

        jButtonGoToCalc.setText("Calculadora>");
        jButtonGoToCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoToCalcActionPerformed(evt);
            }
        });

        jButtonCleanConv.setText("Limpar");
        jButtonCleanConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanConvActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldTemp1)
                            .addComponent(jComboBox2, 0, 121, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButtonCleanConv))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(jButtonGoToCalc))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jComboBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldTemp1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCleanConv)
                        .addGap(13, 13, 13)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonGoToCalc)
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldTemp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTemp1ActionPerformed
        
    }//GEN-LAST:event_jTextFieldTemp1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jComboBox1.getSelectedItem().equals("Celsius")&&jComboBox2.getSelectedItem().equals("Kelvin")){
            double a = Double.parseDouble(jTextFieldTemp1.getText()) + 273.15;
            
            jTextAreaResult.setText(String.valueOf(a) + " K");
        }
        
        if(jComboBox1.getSelectedItem().equals("Celsius")&&jComboBox2.getSelectedItem().equals("Fahrenheit")){
            double a = (Double.parseDouble(jTextFieldTemp1.getText()) *9/5) + 32;
            
            jTextAreaResult.setText(String.valueOf(a) + "ºF");
        }
        
        if(jComboBox1.getSelectedItem().equals("Celsius")&&jComboBox2.getSelectedItem().equals("Celsius")){
            double a = Double.parseDouble(jTextFieldTemp1.getText());
            
            jTextAreaResult.setText(String.valueOf(a) + "ºC");
        }
        
        if(jComboBox1.getSelectedItem().equals("Fahrenheit")&&jComboBox2.getSelectedItem().equals("Kelvin")){
            double a = ((Double.parseDouble(jTextFieldTemp1.getText())-32) * 5/9) + 273.15;
            
            jTextAreaResult.setText(String.valueOf(a) + " K");
        }
        if(jComboBox1.getSelectedItem().equals("Fahrenheit")&&jComboBox2.getSelectedItem().equals("Celsius")){
            double a = ((Double.parseDouble(jTextFieldTemp1.getText())-32) * 5/9);
            
            jTextAreaResult.setText(String.valueOf(a) + "ºC");
        }
        
        if(jComboBox1.getSelectedItem().equals("Fahrenheit")&&jComboBox2.getSelectedItem().equals("Fahrenheit")){
            double a = Double.parseDouble(jTextFieldTemp1.getText());
            
            jTextAreaResult.setText(String.valueOf(a) + "ºF");
        }
          
        if(jComboBox1.getSelectedItem().equals("Kelvin")&&jComboBox2.getSelectedItem().equals("Celsius")){
            double a = Double.parseDouble(jTextFieldTemp1.getText())-273.15;
            
            jTextAreaResult.setText(String.valueOf(a) + " ºC");
        }
        if(jComboBox1.getSelectedItem().equals("Kelvin")&&jComboBox2.getSelectedItem().equals("Fahrenheit")){
            double a = ((Double.parseDouble(jTextFieldTemp1.getText())-273.15) * 9/5) + 32;
            
            jTextAreaResult.setText(String.valueOf(a) + "ºF");
        }
        if(jComboBox1.getSelectedItem().equals("Kelvin")&&jComboBox2.getSelectedItem().equals("Kelvin")){
            double a = Double.parseDouble(jTextFieldTemp1.getText());
            
            jTextAreaResult.setText(String.valueOf(a) + " K");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonGoToCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoToCalcActionPerformed
        CalculatorWindow c = new CalculatorWindow();
        this.dispose();
        c.setVisible(true);
    }//GEN-LAST:event_jButtonGoToCalcActionPerformed

    private void jButtonCleanConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanConvActionPerformed
        jTextFieldTemp1.setText("");
        jTextAreaResult.setText("");
    }//GEN-LAST:event_jButtonCleanConvActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConverterWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCleanConv;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonGoToCalc;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaResult;
    private javax.swing.JTextField jTextFieldTemp1;
    // End of variables declaration//GEN-END:variables
}
