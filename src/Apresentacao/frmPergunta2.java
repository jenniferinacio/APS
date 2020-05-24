package Apresentacao;

import Modelo.PerguntasCertasErradas;
import Modelo.Pontos;

public class frmPergunta2 extends javax.swing.JFrame {

    public frmPergunta2() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgResposta2 = new javax.swing.ButtonGroup();
        lblPergunta = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        lblPonto = new javax.swing.JLabel();
        lblAcerto = new javax.swing.JLabel();
        lblResultadoAcerto = new javax.swing.JLabel();
        lblTituloP = new javax.swing.JLabel();
        rbResposta4 = new javax.swing.JRadioButton();
        rbResposta1 = new javax.swing.JRadioButton();
        rbResposta2 = new javax.swing.JRadioButton();
        rbResposta3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblPergunta.setText("Existe Coleta Seletiva em São Paulo?");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        lblPonto.setText("0");

        lblAcerto.setText("Você Acertou:");

        lblResultadoAcerto.setText("0");

        lblTituloP.setText("Pontos");

        bgResposta2.add(rbResposta4);
        rbResposta4.setText("Sim, no Brasil todo");

        bgResposta2.add(rbResposta1);
        rbResposta1.setText("Não");

        bgResposta2.add(rbResposta2);
        rbResposta2.setText("Sim em toda a São Paulo");

        bgResposta2.add(rbResposta3);
        rbResposta3.setText("Sim, mas só em 94 distritos do município de São Paulo ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTituloP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcerto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblResultadoAcerto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbResposta3))
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbResposta1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(rbResposta4))
                            .addComponent(rbResposta2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAcerto)
                        .addComponent(lblResultadoAcerto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTituloP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbResposta1)
                .addGap(8, 8, 8)
                .addComponent(rbResposta2)
                .addGap(18, 18, 18)
                .addComponent(rbResposta3)
                .addGap(18, 18, 18)
                .addComponent(rbResposta4)
                .addGap(54, 54, 54)
                .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:

     if(rbResposta3.isSelected())
        {
            String pontoCerto = "30";
            String perguntaCerta ="1";
            Pontos ponto = new Pontos(pontoCerto);
            PerguntasCertasErradas pCerta = new PerguntasCertasErradas(perguntaCerta);
            
            frmPergunta3 frmPergunta3 = new frmPergunta3();
            frmPergunta3.setLocationRelativeTo(null);
            frmPergunta3.setVisible(true);
            this.dispose();
        }
        else
        {
            frmPergunta4 frmPergunta4 = new frmPergunta4();
            frmPergunta4.setLocationRelativeTo(null);
            frmPergunta4.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btnOKActionPerformed

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
            java.util.logging.Logger.getLogger(frmPergunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPergunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPergunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPergunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPergunta2().setVisible(true);
                 
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgResposta2;
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
