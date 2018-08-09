package Telas;

import Modelo.Questao;
import java.util.ArrayList;
import java.util.List;

public class TelaJogo extends javax.swing.JFrame {

    private List<Questao> questoes = new ArrayList<>();
    private int indexQuestaoAtual = 0;
    private Questao questao;
    private int acerto = 0;

    public TelaJogo() {
        initComponents();
    }

    public TelaJogo(List<Questao> listQuestoes) {
        
        initComponents();
        questoes = listQuestoes;
        updateTela();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRespostas = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaQuestao = new javax.swing.JTextArea();
        jRadioButtonRespostas1 = new javax.swing.JRadioButton();
        jRadioButtonRespostas2 = new javax.swing.JRadioButton();
        jRadioButtonRespostas3 = new javax.swing.JRadioButton();
        jRadioButtonRespostas4 = new javax.swing.JRadioButton();
        jButtonNext = new javax.swing.JButton();
        jLabelContador = new javax.swing.JLabel();
        jButtonConcluir = new javax.swing.JButton();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaQuestao.setEditable(false);
        jTextAreaQuestao.setColumns(20);
        jTextAreaQuestao.setFont(new java.awt.Font("aakar", 0, 18)); // NOI18N
        jTextAreaQuestao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaQuestao);

        buttonGroupRespostas.add(jRadioButtonRespostas1);

        buttonGroupRespostas.add(jRadioButtonRespostas2);

        buttonGroupRespostas.add(jRadioButtonRespostas3);

        buttonGroupRespostas.add(jRadioButtonRespostas4);

        jButtonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/if_Next_27860.png"))); // NOI18N
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jLabelContador.setFont(new java.awt.Font("aakar", 0, 24)); // NOI18N
        jLabelContador.setText("Questao 0");

        jButtonConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/if_sign-check_299110.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonConcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNext))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonRespostas4)
                            .addComponent(jRadioButtonRespostas3)
                            .addComponent(jRadioButtonRespostas2)
                            .addComponent(jRadioButtonRespostas1)
                            .addComponent(jLabelContador))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelContador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonRespostas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonRespostas2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonRespostas3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonRespostas4)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNext)
                    .addComponent(jButtonConcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
     
        corrigir();
        indexQuestaoAtual++;
        updateTela();
        
    }//GEN-LAST:event_jButtonNextActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupRespostas;
    private javax.swing.JButton jButtonConcluir;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JLabel jLabelContador;
    private javax.swing.JRadioButton jRadioButtonRespostas1;
    private javax.swing.JRadioButton jRadioButtonRespostas2;
    private javax.swing.JRadioButton jRadioButtonRespostas3;
    private javax.swing.JRadioButton jRadioButtonRespostas4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextAreaQuestao;
    // End of variables declaration//GEN-END:variables

    private void corrigir (){
    
    if(getSelectedRadio()==questao.getCorrectIndex());
    acerto++;
    
    
    }
    
    private int getSelectedRadio(){
    if(jRadioButtonRespostas1.isSelected()) return 0;
    if(jRadioButtonRespostas2.isSelected()) return 1;
    if(jRadioButtonRespostas3.isSelected()) return 2;
    if(jRadioButtonRespostas4.isSelected()) return 3;
    
    
    return -1;
    
    }
    
    
    
    private void updateTela() {
        
        buttonGroupRespostas.clearSelection();

        questao = questoes.get(indexQuestaoAtual);
        jTextAreaQuestao.setText(questao.getEnunciado());
        jRadioButtonRespostas1.setText(questao.getRespostas().get(0));
        jRadioButtonRespostas2.setText(questao.getRespostas().get(1));
        jRadioButtonRespostas3.setText(questao.getRespostas().get(2));
        jRadioButtonRespostas4.setText(questao.getRespostas().get(3));

        jLabelContador.setText(String.valueOf(indexQuestaoAtual + 1));
        
    }

}
