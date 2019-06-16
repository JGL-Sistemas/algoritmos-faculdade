package visual;

import javax.swing.JOptionPane;

public class Respostas extends javax.swing.JPanel {

    public Respostas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resposta1 = new javax.swing.JLabel();
        resposta3 = new javax.swing.JLabel();
        resposta2 = new javax.swing.JLabel();
        campoResposta1 = new javax.swing.JTextField();
        campoResposta3 = new javax.swing.JTextField();
        campoResposta2 = new javax.swing.JTextField();
        resetResposta = new javax.swing.JButton();
        enviarResposta = new javax.swing.JButton();
        pTxAlvo3 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 0));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Responder Questionario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        resposta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resposta1.setText("Resposta Questão 1 :");

        resposta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resposta3.setText("Resposta Questão 3 :");

        resposta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resposta2.setText("Resposta Questão 2 :");

        resetResposta.setText("Reset");
        resetResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetRespostaActionPerformed(evt);
            }
        });

        enviarResposta.setText("Enviar");
        enviarResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarRespostaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resposta1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoResposta1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resposta3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoResposta3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resetResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(enviarResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resposta2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoResposta2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(pTxAlvo3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resposta1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoResposta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resposta2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoResposta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resposta3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoResposta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviarResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pTxAlvo3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enviarRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarRespostaActionPerformed
        String r1, r2, r3;
        r1 = campoResposta1.getText();
        r2 = campoResposta2.getText();
        r3 = campoResposta3.getText();
        pTxAlvo3.setText(pTxAlvo3.getText() + "\nResposta 1: " + r1 + "\nResposta 2: " + r2 + "\nResposta 3: " + r3);
        this.show("Resposta 1: " + r1 + "\nResposta 2: " + r2 + "\nResposta 3: " + r3);
        this.limpa();
    }

    public void show(String a) {
        JOptionPane.showMessageDialog(null, a);

    }

    public void limpa() {
        campoResposta1.setText("");
        campoResposta2.setText("");
        campoResposta3.setText("");

    }//GEN-LAST:event_enviarRespostaActionPerformed

    private void resetRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetRespostaActionPerformed
        this.limpa();
    }//GEN-LAST:event_resetRespostaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoResposta1;
    private javax.swing.JTextField campoResposta2;
    private javax.swing.JTextField campoResposta3;
    private javax.swing.JButton enviarResposta;
    private javax.swing.JTextField pTxAlvo3;
    private javax.swing.JButton resetResposta;
    private javax.swing.JLabel resposta1;
    private javax.swing.JLabel resposta2;
    private javax.swing.JLabel resposta3;
    // End of variables declaration//GEN-END:variables
}
