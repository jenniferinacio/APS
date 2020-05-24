package Apresentacao;

import Modelo.PerguntasCertasErradas;
import Modelo.Pontos;

public class frmPergunta4 extends javax.swing.JFrame {

    public frmPergunta4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgResposta4 = new javax.swing.ButtonGroup();
        rbResposta3 = new javax.swing.JRadioButton();
        lblPergunta = new javax.swing.JLabel();
        btnOK2 = new javax.swing.JButton();
        lblPonto = new javax.swing.JLabel();
        lblAcerto = new javax.swing.JLabel();
        lblResultadoAcerto = new javax.swing.JLabel();
        rbResposta4 = new javax.swing.JRadioButton();
        rbResposta1 = new javax.swing.JRadioButton();
        rbResposta2 = new javax.swing.JRadioButton();
        lblTituloP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bgResposta4.add(rbResposta3);
        rbResposta3.setText("Nunca vi isso");

        lblPergunta.setText("Governo de SP firma convênio de R$ 2 milhões para projetos de energia solar");

        btnOK2.setText("OK");
        btnOK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOK2ActionPerformed(evt);
            }
        });

        lblPonto.setText("0");

        lblAcerto.setText("Você Acertou:");

        lblResultadoAcerto.setText("0");

        bgResposta4.add(rbResposta4);
        rbResposta4.setText("Verdade, não só em são paulo como no Brasil todo");

        bgResposta4.add(rbResposta1);
        rbResposta1.setText("Falso");
        rbResposta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbResposta1ActionPerformed(evt);
            }
        });

        bgResposta4.add(rbResposta2);
        rbResposta2.setText("Verdade");

        lblTituloP.setText("Pontos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblTituloP, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lblAcerto)
                        .addGap(18, 18, 18)
                        .addComponent(lblResultadoAcerto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbResposta3)
                                    .addComponent(rbResposta2)
                                    .addComponent(rbResposta1)
                                    .addComponent(rbResposta4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(btnOK2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultadoAcerto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAcerto)
                    .addComponent(lblPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbResposta1)
                .addGap(18, 18, 18)
                .addComponent(rbResposta2)
                .addGap(18, 18, 18)
                .addComponent(rbResposta3)
                .addGap(18, 18, 18)
                .addComponent(rbResposta4)
                .addGap(34, 34, 34)
                .addComponent(btnOK2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOK2ActionPerformed
        // TODO add your handling code here:
        if(rbResposta2.isSelected())
        {
            String pontoCerto = "40";
            String perguntaCerta ="1";
            Pontos ponto = new Pontos(pontoCerto);
            PerguntasCertasErradas pCerta = new PerguntasCertasErradas(perguntaCerta);
            
            frmPergunta5 frmPergunta5 = new frmPergunta5();
            frmPergunta5.setLocationRelativeTo(null);
            frmPergunta5.setVisible(true);
            this.dispose();

        }
        else
        {
            frmPergunta5 frmPergunta5 = new frmPergunta5();
            frmPergunta5.setLocationRelativeTo(null);
            frmPergunta5.setVisible(true);

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
            java.util.logging.Logger.getLogger(frmPergunta4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPergunta4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPergunta4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPergunta4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPergunta4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgResposta4;
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
