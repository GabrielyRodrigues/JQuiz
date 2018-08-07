
package Telas;


import javax.swing.JOptionPane;
import Modelo.Questao;
import java.util.ArrayList;
import java.util.List;


public class Principal extends javax.swing.JFrame {

    
    private List<Questao> questoes = new ArrayList<>();
    
    public Principal() {
        initComponents();
        System.out.println("");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRespostas = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaQuestao = new javax.swing.JTextArea();
        RadioUm = new javax.swing.JRadioButton();
        RadioDois = new javax.swing.JRadioButton();
        RadioTres = new javax.swing.JRadioButton();
        RadioQuarta = new javax.swing.JRadioButton();
        jLabelContador = new javax.swing.JLabel();
        jButtonLimpar = new javax.swing.JButton();
        jButtonJogar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonReiniciar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRespUm = new javax.swing.JTextField();
        jTextFieldRespDois = new javax.swing.JTextField();
        jTextFieldRespTres = new javax.swing.JTextField();
        jTextFieldRespQuatro = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaQuestao.setColumns(20);
        jTextAreaQuestao.setFont(new java.awt.Font("aakar", 0, 18)); // NOI18N
        jTextAreaQuestao.setLineWrap(true);
        jTextAreaQuestao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaQuestao);

        buttonGroupRespostas.add(RadioUm);
        RadioUm.setFont(new java.awt.Font("aakar", 2, 14)); // NOI18N

        buttonGroupRespostas.add(RadioDois);
        RadioDois.setFont(new java.awt.Font("aakar", 2, 14)); // NOI18N

        buttonGroupRespostas.add(RadioTres);
        RadioTres.setFont(new java.awt.Font("aakar", 2, 14)); // NOI18N

        buttonGroupRespostas.add(RadioQuarta);
        RadioQuarta.setFont(new java.awt.Font("aakar", 2, 14)); // NOI18N

        jLabelContador.setFont(new java.awt.Font("Dialog", 2, 36)); // NOI18N
        jLabelContador.setText("OO");

        jButtonLimpar.setFont(new java.awt.Font("aakar", 2, 18)); // NOI18N
        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/if_1_2058800.png"))); // NOI18N
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonJogar.setFont(new java.awt.Font("aakar", 2, 18)); // NOI18N
        jButtonJogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/if_YouTube_570623.png"))); // NOI18N
        jButtonJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJogarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("aakar", 2, 18)); // NOI18N
        jLabel2.setText("Respostas!");

        jButtonAdicionar.setFont(new java.awt.Font("aakar", 2, 14)); // NOI18N
        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/if_plus_1814113.png"))); // NOI18N
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonReiniciar.setFont(new java.awt.Font("aakar", 2, 18)); // NOI18N
        jButtonReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/if_Revert_132070.png"))); // NOI18N
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("aakar", 2, 18)); // NOI18N
        jLabel3.setText("Questoes!");

        jTextFieldRespUm.setFont(new java.awt.Font("aakar", 0, 18)); // NOI18N

        jTextFieldRespDois.setFont(new java.awt.Font("aakar", 0, 18)); // NOI18N

        jTextFieldRespTres.setFont(new java.awt.Font("aakar", 0, 18)); // NOI18N

        jTextFieldRespQuatro.setFont(new java.awt.Font("aakar", 0, 18)); // NOI18N

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextFieldRespTres, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(RadioTres))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldRespUm)
                                        .addComponent(jTextFieldRespDois, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(RadioDois))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(RadioUm)))))
                            .addGap(39, 39, 39))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextFieldRespQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(RadioQuarta))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel2)))
                            .addGap(34, 34, 34)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonReiniciar)
                            .addComponent(jButtonJogar))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelContador, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel3)
                    .addContainerGap(348, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabelContador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldRespUm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RadioUm))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(RadioDois))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldRespDois)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRespTres, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(RadioTres)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RadioQuarta)
                            .addComponent(jTextFieldRespQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonReiniciar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonJogar)))
                .addContainerGap())
            .addComponent(jSeparator2)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel3)
                    .addContainerGap(389, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJogarActionPerformed
            
        if (questoes.size()!=0){
        TelaJogo tg = new TelaJogo(questoes);
        tg.setVisible(true);
        this.dispose();
        }else {
         JOptionPane.showMessageDialog(null, "Insira pelo menos um Registro!");
        }
       
    }//GEN-LAST:event_jButtonJogarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        
        limparCampos();
     
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
      
        String questao = jTextAreaQuestao.getText();
        String respostas1 = jTextFieldRespUm.getText(); 
        String respostas2 = jTextFieldRespDois.getText(); 
        String respostas3 = jTextFieldRespTres.getText(); 
        String respostas4 = jTextFieldRespQuatro.getText(); 
        
        int indexCorreto = getRadioIndexCorreto();
        
        if (questao.isEmpty()||
                respostas1.isEmpty()||
                respostas2.isEmpty()||
                respostas3.isEmpty()||
                respostas4.isEmpty()||
                indexCorreto == -1){
        
            
            JOptionPane.showMessageDialog(null, "Preencha todos os Erros!");
      
        }else{
            
            Questao q = new Questao ();
            q.setEnunciado(questao);
            List<String> respostas = new ArrayList<>();
            respostas.add(respostas1);
            respostas.add(respostas2);
            respostas.add(respostas3);
            respostas.add(respostas4);
            q.setRespostas(respostas);
            q.setCorrectIndex(indexCorreto);
             
            questoes.add(q);
            limparCampos();
            updateContador();
        
        
        
        }
                
                
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReiniciarActionPerformed
     
        int r = JOptionPane.showConfirmDialog(null, "Deseja Reiniciar o jogo ?");
        if (r== JOptionPane.YES_OPTION){
        questoes.clear();
        limparCampos();
        jLabelContador.setText("00");
        
        }
    }//GEN-LAST:event_jButtonReiniciarActionPerformed

   
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioDois;
    private javax.swing.JRadioButton RadioQuarta;
    private javax.swing.JRadioButton RadioTres;
    private javax.swing.JRadioButton RadioUm;
    private javax.swing.ButtonGroup buttonGroupRespostas;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonJogar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelContador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextAreaQuestao;
    private javax.swing.JTextField jTextFieldRespDois;
    private javax.swing.JTextField jTextFieldRespQuatro;
    private javax.swing.JTextField jTextFieldRespTres;
    private javax.swing.JTextField jTextFieldRespUm;
    // End of variables declaration//GEN-END:variables

  
private void limparCampos(){

jTextAreaQuestao.setText("");
jTextFieldRespUm.setText("");
jTextFieldRespDois.setText("");
jTextFieldRespTres.setText("");
jTextFieldRespQuatro.setText("");

buttonGroupRespostas.clearSelection();


}

    private int getRadioIndexCorreto() {
 
        if (RadioUm.isSelected()) return 1;
        if (RadioDois.isSelected()) return 2;
        if (RadioTres.isSelected()) return 3;
        if (RadioQuarta.isSelected()) return 4;
        
        return -1;
        
    }

   private void updateContador(){
    
    jLabelContador.setText(String.valueOf(questoes.size()));
    
    
    
    }

}
