
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas-pc
 */
public class TelaGasolinaXEtanol extends javax.swing.JFrame {

    /**
     * Creates new form TelaGasolinaXEtanol
     */
    public TelaGasolinaXEtanol() {
        initComponents();
        
        result.setVisible(false);
        eraseAll.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ethaValue = new javax.swing.JTextField();
        alertGasValue = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gasValue = new javax.swing.JTextField();
        alertEthaValue = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        gasKmLT = new javax.swing.JTextField();
        alertGasKm = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ethaKmLT = new javax.swing.JTextField();
        alertEthaKm = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        eraseAll = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setAutoscrolls(true);

        jLabel6.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 0));
        jLabel6.setText("Gasolina VS Etanol");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/GasolinaxEtanol/posto-de-gasolina.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Informe o valor do Etanol");

        ethaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ethaValueActionPerformed(evt);
            }
        });

        alertGasValue.setForeground(java.awt.Color.red);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Informe o valor da Gasolina");

        gasValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gasValueActionPerformed(evt);
            }
        });

        alertEthaValue.setForeground(java.awt.Color.red);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Km/litro Gasolina");

        gasKmLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gasKmLTActionPerformed(evt);
            }
        });

        alertGasKm.setForeground(java.awt.Color.red);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Km/litro Etanol");

        ethaKmLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ethaKmLTActionPerformed(evt);
            }
        });

        alertEthaKm.setForeground(java.awt.Color.red);

        calculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons-energia/calculadora.png"))); // NOI18N
        calculate.setText("Calcular");
        calculate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        result.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        result.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/GasolinaxEtanol/posto-de-gasolina (13).png"))); // NOI18N
        result.setText("Gasolina melhor escolha");

        eraseAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons-energia/eraser.png"))); // NOI18N
        eraseAll.setText("Limpar");
        eraseAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eraseAllMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(gasValue, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(alertGasValue, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ethaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(alertEthaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ethaKmLT, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(alertEthaKm, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(129, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gasKmLT, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alertGasKm, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(eraseAll, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gasValue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ethaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alertGasValue, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alertEthaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gasKmLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alertGasKm, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ethaKmLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alertEthaKm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(eraseAll)
                .addGap(23, 23, 23))
        );

        ethaValue.getAccessibleContext().setAccessibleName("ethaValue");
        alertGasValue.getAccessibleContext().setAccessibleName("valueGasAlert");
        gasValue.getAccessibleContext().setAccessibleName("gasValue");
        alertEthaValue.getAccessibleContext().setAccessibleName("valueEthaAlert");
        gasKmLT.getAccessibleContext().setAccessibleName("gasKmLt");
        alertGasKm.getAccessibleContext().setAccessibleName("kmGasAlert");
        ethaKmLT.getAccessibleContext().setAccessibleName("ethaKmLt");
        ethaKmLT.getAccessibleContext().setAccessibleDescription("");
        alertEthaKm.getAccessibleContext().setAccessibleName("kmEthaAlert");
        calculate.getAccessibleContext().setAccessibleName("calculate");
        result.getAccessibleContext().setAccessibleName("bestOption");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ethaValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ethaValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ethaValueActionPerformed

    private void gasValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gasValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gasValueActionPerformed

    private void gasKmLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gasKmLTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gasKmLTActionPerformed

    private void ethaKmLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ethaKmLTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ethaKmLTActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        sum();
    }//GEN-LAST:event_calculateActionPerformed

    private void eraseAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseAllMouseClicked
        eraseALL();
    }//GEN-LAST:event_eraseAllMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
         TelaPrincipal tp;
        tp = new TelaPrincipal();
        tp.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void eraseALL()
    {
        gasValue.setText("");
        ethaValue.setText("");
        gasKmLT.setText("");
        ethaKmLT.setText("");
      clearAlert();
       result.setVisible(false);
        eraseAll.setVisible(false);
        calculate.setVisible(true);
      
    }
    private boolean validadeEntries() 
    {
        boolean ref= false;
         if(gasValue.getText().isEmpty())
        {
           alertGasValue.setText("Informe o valor da gasolina");
              ref=true;
        }else
         {
              alertGasValue.setText("");
         }
         
        if(ethaValue.getText().isEmpty())
        {
         alertEthaValue.setText("Informe o valor do etanol");
         ref=true;
        }
        else
        {
             alertEthaValue.setText("");
        }
        
        if(gasKmLT.getText().isEmpty())
        {
            alertGasKm.setText("Informe o km/L gasolina");
         ref=true;
        }
        else
        {
             alertGasKm.setText("");
        }
        
       if(ethaKmLT.getText().isEmpty())
        {
            alertEthaKm.setText("Informe o km/L etanol");
           ref=true;
        }
       else
       {
            alertEthaKm.setText("");
       }
       return ref;
    }
    
    private void clearAlert()
    {
         alertGasValue.setText("");
         alertEthaValue.setText("");
         alertGasKm.setText("");
         alertEthaKm.setText("");


    }   
    
    private void comparative(float gPrice, float ePrice, float gKM, float eKm)
    {   
         eraseAll.setVisible(true);
         result.setVisible(true);
         
        float etanolForKm = ePrice/eKm;
        float gasolineForKm = gPrice / gKM;
        
        if(etanolForKm>gasolineForKm)
        {   
            result.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/GasolinaxEtanol/posto-de-gasolina (13).png"))); // NOI18N
            result.setText("Gasolina Melhor Escolha");
            
        }else{
            result.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/GasolinaxEtanol/etanol.png"))); // NOI18N
            result.setText("Etanol Melhor Escolha");
        }
       
  
    }
    
    
    private void sum()
    {
      
    if(!validadeEntries())
    {
        clearAlert();
      try{
      
      
       
       float valueG = Float.valueOf(gasValue.getText().replace(",", ".").trim());
       float valueE = Float.valueOf(ethaValue.getText().replace(",", ".").trim());
       float kmG = Float.valueOf(gasKmLT.getText().replace(",", ".").trim());
       float kmE = Float.valueOf(ethaKmLT.getText().replace(",", ".").trim());
       
       calculate.setVisible(false);
       
          comparative(valueG, valueE, kmG, kmE);
       
     }catch(NumberFormatException ex)
      {
        JOptionPane.showMessageDialog(this,"Digite somente valores numericos","Error",JOptionPane.ERROR_MESSAGE);
      }
    
    }
        
        
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
            java.util.logging.Logger.getLogger(TelaGasolinaXEtanol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGasolinaXEtanol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGasolinaXEtanol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGasolinaXEtanol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaGasolinaXEtanol().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertEthaKm;
    private javax.swing.JLabel alertEthaValue;
    private javax.swing.JLabel alertGasKm;
    private javax.swing.JLabel alertGasValue;
    private javax.swing.JButton calculate;
    private javax.swing.JLabel eraseAll;
    private javax.swing.JTextField ethaKmLT;
    private javax.swing.JTextField ethaValue;
    private javax.swing.JTextField gasKmLT;
    private javax.swing.JTextField gasValue;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}