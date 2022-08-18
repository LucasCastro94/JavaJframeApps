
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lucas
 */
public class TelaIMC extends javax.swing.JFrame {

    /**
     * Creates new form TelaIMC
     */
    public TelaIMC() {
        initComponents();
        disableTexts();
    }

    private void textOn()
    {
          imcResult.setVisible(true);
        imcStatus.setVisible(true);
        imcTEXT.setVisible(true);
    }
    private void disableTexts()
    {
        imcResult.setVisible(false);
        imcStatus.setVisible(false);
        imcTEXT.setVisible(false);
        alert2.setVisible(false);
        alert3.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        weight = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        alert2 = new javax.swing.JLabel();
        alert3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        imcStatus = new javax.swing.JLabel();
        imcResult = new javax.swing.JLabel();
        imcTEXT = new javax.swing.JLabel();

        jCheckBox2.setText("jCheckBox2");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 227, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Informe sua altura (metro e cm)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, 30));
        jPanel1.add(height, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 227, 20));

        alert2.setForeground(new java.awt.Color(255, 51, 102));
        alert2.setText("jLabel3");
        jPanel1.add(alert2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 230, 20));

        alert3.setForeground(new java.awt.Color(255, 51, 102));
        alert3.setText("jLabel4");
        jPanel1.add(alert3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 220, 20));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Informe seu peso (kg)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 227, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconsIMC/balanca.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconsIMC/regua.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 40, -1));

        calculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconsIMC/bmi.png"))); // NOI18N
        calculate.setText("Calcular");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        jPanel1.add(calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        imcStatus.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        imcStatus.setText("Normal");
        jPanel1.add(imcStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 210, -1));

        imcResult.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        imcResult.setText("27");
        jPanel1.add(imcResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 100, 60));

        imcTEXT.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        imcTEXT.setForeground(new java.awt.Color(0, 153, 51));
        imcTEXT.setText("Seu IMC é:");
        jPanel1.add(imcTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       TelaPrincipal tp = new TelaPrincipal();
       tp.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        sum();
    }//GEN-LAST:event_calculateActionPerformed

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
            java.util.logging.Logger.getLogger(TelaIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaIMC().setVisible(true);
        });
    }
    
    private boolean validateField()
    {
        boolean check = false;
        
        if(weight.getText().isEmpty())
        {
            check=true;
            alert2.setVisible(true);
            alert2.setText("Necessário informar o Peso");
        }
        if(height.getText().isEmpty())
        {
            check=true;
            alert3.setVisible(true);
            alert3.setText("Necessário informar a Altura");
        }
        
        return check;
    }
    
    private void sum()
    {   
        disableTexts();
        validateField();
        
        if(!validateField())
        {    
            try{
                 double weight = Double.parseDouble(this.weight.getText().replace(",", ".").trim());
                 double height = Double.parseDouble(this.height.getText().replace(",", ".").trim());
                 
                 double sum = weight / (height*height);
                 
                 textOn();
                 
                 DecimalFormat format = new DecimalFormat("#,##.#");
                 
                 if(sum < 18.5)
                 {
                  imcTEXT.setForeground(Color.red);
                  imcStatus.setText("MAGREZA");
                 }
                 else if(sum >= 18.5 && sum <= 24.9)
                 {
                    imcTEXT.setForeground(Color.green); 
                     imcStatus.setText("NORMAL");
                 }
                 else if(sum >= 25.0 && sum <= 29.9)
                 {
                     imcTEXT.setForeground(Color.blue);
                      imcStatus.setText("SOBREPESO");
                 }
                 else if(sum >= 30.0 && sum <= 39.9)
                 {
                     imcTEXT.setForeground(Color.ORANGE);
                      imcStatus.setText("OBESIDADE");
                 }
                 else{
                     imcTEXT.setForeground(Color.red);
                      imcStatus.setText("OBESIDADE GRAVE");
                 }
                 
                 
                 imcResult.setText(""+format.format(sum));
                
                 

            }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this,"Informe somente valores numéricos","Error",JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert2;
    private javax.swing.JLabel alert3;
    private javax.swing.JButton calculate;
    private javax.swing.JTextField height;
    private javax.swing.JLabel imcResult;
    private javax.swing.JLabel imcStatus;
    private javax.swing.JLabel imcTEXT;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}