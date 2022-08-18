
import java.text.DecimalFormat;
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
public class TelaCustoEnergia extends javax.swing.JFrame {

    /**
     * Creates new form TelaCustoEnergia
     * 
     */
    private double watts,horas=0,dias=0;
    
    
    public TelaCustoEnergia() {
        initComponents();
        
        buttonErase.setVisible(false);
       textResult.setVisible(false);
    }
        
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EditTexthoras = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        editTextWatts = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EditTextDias = new javax.swing.JTextField();
        buttonCalculate = new javax.swing.JButton();
        buttonErase = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setText("Qual é a potencia em watts?");

        EditTexthoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTexthorasActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantas horas usa por dia?");

        editTextWatts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextWattsActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantos dias usa por mês?");

        EditTextDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTextDiasActionPerformed(evt);
            }
        });

        buttonCalculate.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        buttonCalculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons-energia/calculadora.png"))); // NOI18N
        buttonCalculate.setText("Calcular");
        buttonCalculate.setBorder(new javax.swing.border.MatteBorder(null));
        buttonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculateActionPerformed(evt);
            }
        });

        buttonErase.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        buttonErase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons-energia/eraser.png"))); // NOI18N
        buttonErase.setText("Limpar");
        buttonErase.setBorder(new javax.swing.border.MatteBorder(null));
        buttonErase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEraseActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons-energia/lighting.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons-energia/chronometer.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons-energia/calendar.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("Conversor de watts em Kw/h");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons-energia/renewable-energy.png"))); // NOI18N

        textResult.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textResult.setForeground(new java.awt.Color(255, 102, 102));
        textResult.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(buttonErase, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EditTexthoras, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editTextWatts, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EditTextDias, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(buttonCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textResult, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(jLabel8))
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editTextWatts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(EditTexthoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(EditTextDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCalculate)
                .addGap(31, 31, 31)
                .addComponent(textResult)
                .addGap(38, 38, 38)
                .addComponent(buttonErase, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EditTexthorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTexthorasActionPerformed
    }//GEN-LAST:event_EditTexthorasActionPerformed

    private void editTextWattsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextWattsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextWattsActionPerformed

    private void EditTextDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTextDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditTextDiasActionPerformed

    private void buttonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateActionPerformed
        somar();
    }//GEN-LAST:event_buttonCalculateActionPerformed

    private void buttonEraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEraseActionPerformed
       eraseFill();
    }//GEN-LAST:event_buttonEraseActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaPrincipal tp;
        tp = new TelaPrincipal();
        tp.setVisible(true);
      
    }//GEN-LAST:event_formWindowClosed

    private void somar()
    {
        double sumWatts, sumDay, sumMonth;
        DecimalFormat format = new DecimalFormat("0.000");
        boolean status = true;
        
  try{
         watts = Double.parseDouble(editTextWatts.getText());
        horas =  Double.parseDouble(EditTexthoras.getText());
        dias =  Double.parseDouble(EditTextDias.getText());
        
  }
  catch(NumberFormatException e){
      
      JOptionPane.showMessageDialog(this,"Falha ao receber os valores","Erro", JOptionPane.ERROR_MESSAGE, null);
      watts =0;
      horas =0;
      dias = 0;
      status = false;
  }
  
  if(status)
  {
     buttonCalculate.setVisible(!status);
     sumWatts = watts / 1000;
     sumDay = sumWatts * horas;
     sumMonth = sumDay * dias; 
     
     buttonErase.setVisible(status);
     textResult.setVisible(status);
     
     textResult.setText("<html>Consumo por hora "+format.format(sumWatts)+"Kwh"
             + ""+(sumDay!=0? "<br>Consumo diario "+format.format(sumDay)+"Kwh" : "" )
             + ""+(sumMonth!=0? "<br>Consumo mensal "+format.format(sumMonth)+"Kwh" : "")
     );
   
  }
      
    }
    
    
    private void eraseFill()
    {
        buttonErase.setVisible(false);
        textResult.setVisible(false);
        buttonCalculate.setVisible(true);
        EditTextDias.setText("");
        EditTexthoras.setText("");
        editTextWatts.setText("");
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
            java.util.logging.Logger.getLogger(TelaCustoEnergia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCustoEnergia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCustoEnergia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCustoEnergia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCustoEnergia().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EditTextDias;
    private javax.swing.JTextField EditTexthoras;
    private javax.swing.JButton buttonCalculate;
    private javax.swing.JButton buttonErase;
    private javax.swing.JTextField editTextWatts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textResult;
    // End of variables declaration//GEN-END:variables
}
