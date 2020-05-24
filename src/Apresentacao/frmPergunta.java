package Apresentacao;

import Modelo.PerguntasCertasErradas;
import Modelo.Pontos;

public class frmPergunta extends javax.swing.JFrame {

    public frmPergunta() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgResposta = new javax.swing.ButtonGroup();
        lblPergunta = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        lblPonto = new javax.swing.JLabel();
        rbResposta4 = new javax.swing.JRadioButton();
        rbResposta1 = new javax.swing.JRadioButton();
        rbResposta2 = new javax.swing.JRadioButton();
        rbResposta3 = new javax.swing.JRadioButton();
        lblAcerto = new javax.swing.JLabel();
        lblResultadoAcerto = new javax.swing.JLabel();
        lblTituloP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pergunta");
        setBackground(new java.awt.Color(102, 255, 102));
        setResizable(false);

        lblPergunta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPergunta.setText("O que seria Coleta Seletiva?");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        lblPonto.setText("0");

        bgResposta.add(rbResposta4);
        rbResposta4.setText("Seria Não Separar o Lixo");

        bgResposta.add(rbResposta1);
        rbResposta1.setText("Seria Separar Seu Lixo, por residuos iguais");
        rbResposta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbResposta1ActionPerformed(evt);
            }
        });

        bgResposta.add(rbResposta2);
        rbResposta2.setText("Seria Separa o lixo por cor");

        bgResposta.add(rbResposta3);
        rbResposta3.setText("Seria comer o lixo");

        lblAcerto.setText("Você Acertou:");

        lblResultadoAcerto.setText("0");

        lblTituloP.setText("Pontos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTituloP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAcerto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResultadoAcerto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbResposta3)
                    .addComponent(rbResposta1)
                    .addComponent(rbResposta4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbResposta2)))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAcerto)
                    .addComponent(lblResultadoAcerto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbResposta1)
                .addGap(18, 18, 18)
                .addComponent(rbResposta2)
                .addGap(31, 31, 31)
                .addComponent(rbResposta3)
                .addGap(18, 18, 18)
                .addComponent(rbResposta4)
                .addGap(37, 37, 37)
                .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbResposta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbResposta1ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_rbResposta1ActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        
        if(rbResposta1.isSelected())
        {
            String pontoCerto = "10";
            String perguntaCerta ="1";
            Pontos ponto = new Pontos(pontoCerto);
            PerguntasCertasErradas pCerta = new PerguntasCertasErradas(perguntaCerta);
            frmPergunta2 frmPergunta2 = new frmPergunta2();
      
            frmPergunta2.setLocationRelativeTo(null);            
            frmPergunta2.setVisible(true);
            this.dispose();
        }
        else
        {
            frmPergunta2 frmPergunta2 = new frmPergunta2();
            frmPergunta frmPergunta = new frmPergunta();
            frmPergunta.setResizable(false);
            frmPergunta2.setVisible(true);
            
            this.dispose();

        }
    }//GEN-LAST:event_btnOKActionPerformed
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
            java.util.logging.Logger.getLogger(frmPergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPergunta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgResposta;
    private javax.swing.JButton btnOK;
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
