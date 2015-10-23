package comum;
/**
 * @author João Vitor Poggioli
 * @author Matheus Pedroso
 * @author Gabriel Roma
 */
public class ClickerOne_AjudaSobreClickerOne extends javax.swing.JDialog {
    
    public ClickerOne_AjudaSobreClickerOne() {
        initComponents();
        this.setModal(true);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelFT = new javax.swing.JLabel();
        jPanelFundo = new javax.swing.JPanel();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre Clicke One - Versão 1.0");
        setMinimumSize(new java.awt.Dimension(700, 290));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelTitulo.setText("<html>\n<br>\n<br>\n   UNICAMP - Universidade de Campinas\n<br>\n   FT - Faculdade de Tecnlogia\n<br>\n   Projeto Clicker One\n<br>\n   Clicker One é um programa de perguntas de auditório.\n<br>\n   Versão 1.0\n<br>\n<br>\n   Data de início da implementação: 14 de outubro de 2015\n<br>\n   Data de término da implementação: \n<br>\n<br>\n   Gabriel Roma\n<br>\n   João Pogiolli\n<br>\n   Matheus Pedroso\n<br>");
        jLabelTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ClickerOne", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jLabelTitulo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(205, 10, 480, 210);

        jLabelFT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.jpg"))); // NOI18N
        jLabelFT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FT - Faculdade de Tecnologia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        getContentPane().add(jLabelFT);
        jLabelFT.setBounds(0, 10, 190, 210);

        jPanelFundo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFundo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelFundo.setForeground(new java.awt.Color(102, 0, 153));
        jPanelFundo.setLayout(null);
        getContentPane().add(jPanelFundo);
        jPanelFundo.setBounds(0, 0, 700, 220);

        jButtonSair.setMnemonic('S');
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(310, 230, 75, 25);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     *this method closes the help window about the game
     * @param evt event mouse click
     */
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(ClickerOne_AjudaSobreClickerOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClickerOne_AjudaSobreClickerOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClickerOne_AjudaSobreClickerOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClickerOne_AjudaSobreClickerOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClickerOne_AjudaSobreClickerOne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelFT;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFundo;
    // End of variables declaration//GEN-END:variables
}
