package Apresentacao;

import Modelo.PerguntasCertasErradas;
import Modelo.Pontos;

public class frmPergunta10 extends javax.swing.JFrame {

    public frmPergunta10() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgResposta10 = new javax.swing.ButtonGroup();
        rbResposta2 = new javax.swing.JRadioButton();
        rbResposta3 = new javax.swing.JRadioButton();
        lblPergunta = new javax.swing.JLabel();
        btnOK2 = new javax.swing.JButton();
        lblTituloP = new javax.swing.JLabel();
        lblPonto = new javax.swing.JLabel();
        lblAcerto = new javax.swing.JLabel();
        lblResultadoAcerto = new javax.swing.JLabel();
        rbResposta4 = new javax.swing.JRadioButton();
        rbResposta1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bgResposta10.add(rbResposta2);
        rbResposta2.setText("O metano");

        bgResposta10.add(rbResposta3);
        rbResposta3.setText("É o Dióxido de Carbono");
        rbResposta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbResposta3ActionPerformed(evt);
            }
        });

        lblPergunta.setText("Qual é o principal gás responsável pelo fenómeno efeito estufa?");

        btnOK2.setText("OK");
        btnOK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOK2ActionPerformed(evt);
            }
        });

        lblTituloP.setText("Pontos");

        lblPonto.setText("0");

        lblAcerto.setText("Você Acertou:");

        lblResultadoAcerto.setText("0");

        bgResposta10.add(rbResposta4);
        rbResposta4.setText("h2o");

        bgResposta10.add(rbResposta1);
        rbResposta1.setText("O oxigénio");
        rbResposta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbResposta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblTituloP)
                .addGap(18, 18, 18)
                .addComponent(lblPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAcerto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultadoAcerto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbResposta1)
                            .addComponent(rbResposta2)
                            .addComponent(rbResposta3)
                            .addComponent(rbResposta4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnOK2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloP)
                    .addComponent(lblPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAcerto)
                    .addComponent(lblResultadoAcerto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbResposta1)
                .addGap(18, 18, 18)
                .addComponent(rbResposta2)
                .addGap(18, 18, 18)
                .addComponent(rbResposta3)
                .addGap(18, 18, 18)
                .addComponent(rbResposta4)
                .addGap(18, 18, 18)
                .addComponent(btnOK2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbResposta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbResposta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbResposta3ActionPerformed

    private void btnOK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOK2ActionPerformed
        // TODO add your handling code here:

        if(rbResposta3.isSelected())
        {
            String pontoCerto = "100";
            String perguntaCerta ="1";
            Pontos ponto = new Pontos(pontoCerto);
            PerguntasCertasErradas pCerta = new PerguntasCertasErradas(perguntaCerta);
            
            frmFinal frmFinal = new frmFinal();
            frmFinal.setLocationRelativeTo(null);
            frmFinal.setVisible(true);

            this.dispose();

        }
        else
        {
            frmFinal frmFinal = new frmFinal();
            frmFinal.setLocationRelativeTo(null);
            frmFinal.setVisible(true);

            this.dispose();
        }
    }//GEN-LAST:event_btnOK2ActionPerformed

    private void rbResposta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbResposta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbResposta1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        lblPonto.setText(String.valueOf(Pontos.resultado));
        lblResultadoAcerto.setText(String.valueOf(PerguntasCertasErradas.respostasResultado));
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmPergunta10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPergunta10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPergunta10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPergunta10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPergunta10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgResposta10;
    private javax.swing.JButton btnOK2;
    private javax.swing.JLabel lblAcerto;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblPonto;
    private javax.swing.JLabel lblResultadoAcerto;
    private javax.swing.JLabel lblTituloP;
    private javax.swing.JRadioButton rbResposta1;
    private javax.swing.JRadioButton rbResposta2;
    private javax.swing.JRadioButton rbResposta3;
    private javax.swing.JRadioButton rbResposta4;
    // End of variables declaration//GEN-END:variables
}
