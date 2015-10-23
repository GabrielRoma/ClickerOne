package comum;

/**
 * @author João Vitor Poggioli
 * @author Matheus Pedroso
 * @author Gabriel Roma
 */
public class ClickerOne_Sobre extends javax.swing.JDialog {

    public ClickerOne_Sobre() {
        initComponents();
        this.setModal(true);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelFT = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajuda HexGame - Versão 1.0");
        setMinimumSize(new java.awt.Dimension(700, 310));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelTitulo.setText("<html>\nClicker One é um software de perguntas de auditórios:<br>\n<br>\nO palestrante deve cadastrar uma pergunta e liberá-la a seguir para o auditório responder.<br>\n<br>\nEste software foi projetado e implementado somente para fins educacionais.<br>\nNÃO USE este software em qualquer situação onde ele poderia causar risco de morte, lesões ou outros danos.\n</html>");
        jLabelTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ClickerOne", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(378, 219));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(378, 219));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(378, 219));
        jLabelTitulo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 10, 480, 220));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabelFT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.jpg"))); // NOI18N
        jLabelFT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FT - Faculdade de Tecnologia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel1.add(jLabelFT);
        jLabelFT.setBounds(0, 10, 190, 220);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 240));

        jButtonSair.setMnemonic('S');
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 75, 25));

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
            java.util.logging.Logger.getLogger(ClickerOne_Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClickerOne_Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClickerOne_Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClickerOne_Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClickerOne_Sobre dialog = new ClickerOne_Sobre();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelFT;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
