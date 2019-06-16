package visual;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public questionar pQ;
    public Respostas pR;

    public Principal() {
        pQ = new questionar();
        pR = new Respostas();
        this.initComponents();

    }

    private void esconde() {
        this.painelPrincipal.setVisible(false);
        this.pQ.setVisible(false);
        this.pR.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        painelPrincipal = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelFiliacao = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoCpf = new javax.swing.JTextField();
        campoFiliacao = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        botaoReset = new javax.swing.JButton();
        labelFiliacao1 = new javax.swing.JLabel();
        radioMasc = new javax.swing.JRadioButton();
        radioFem = new javax.swing.JRadioButton();
        labelFiliacao2 = new javax.swing.JLabel();
        campoLazer = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        pTxAlvo = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        menuCadastrar = new javax.swing.JMenu();
        itemQuestao = new javax.swing.JMenuItem();
        menuRespostas = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Elementos Visuais");

        painelPrincipal.setBackground(new java.awt.Color(0, 102, 0));
        painelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Meu Trabalho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 1, 24))); // NOI18N

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNome.setText("Nome");

        labelCpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCpf.setText("CPF");

        labelFiliacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelFiliacao.setText("Filiação");

        campoNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        campoCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        campoFiliacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botaoSalvar.setBackground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setFont(new java.awt.Font("Vijaya", 0, 24)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoReset.setBackground(new java.awt.Color(255, 255, 255));
        botaoReset.setFont(new java.awt.Font("Vijaya", 0, 24)); // NOI18N
        botaoReset.setText("Resetar");
        botaoReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResetActionPerformed(evt);
            }
        });

        labelFiliacao1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelFiliacao1.setText("Sexo");

        buttonGroup1.add(radioMasc);
        radioMasc.setText("Masculino");

        buttonGroup1.add(radioFem);
        radioFem.setText("Feminino");

        labelFiliacao2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelFiliacao2.setText("Lazer");

        campoLazer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Televisão ", "Musica ", "Passeio ", " " }));

        pTxAlvo.setColumns(20);
        pTxAlvo.setRows(5);
        jScrollPane1.setViewportView(pTxAlvo);

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(labelNome)
                        .addGap(18, 18, 18)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(labelFiliacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoFiliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                                        .addComponent(labelFiliacao2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoLazer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                                        .addComponent(labelFiliacao1)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioMasc)))
                                .addGap(39, 39, 39)
                                .addComponent(radioFem))))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelPrincipalLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(botaoReset, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(667, Short.MAX_VALUE)))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFiliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoFiliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFiliacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoLazer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioMasc)
                            .addComponent(radioFem)
                            .addComponent(labelFiliacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                    .addContainerGap(362, Short.MAX_VALUE)
                    .addComponent(botaoReset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)))
        );

        menuHome.setText("Home");
        menuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHomeMouseClicked(evt);
            }
        });
        menuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHomeActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuHome);

        menuCadastrar.setText("Cadastrar");

        itemQuestao.setText("Questão");
        itemQuestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemQuestaoActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemQuestao);

        menuRespostas.setText("Respostas");
        menuRespostas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRespostasActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuRespostas);

        jMenuBar1.add(menuCadastrar);

        menuAjuda.setText("Ajuda");
        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed

        String n, c, f, s, l;
        n = campoNome.getText();
        c = campoCpf.getText();
        f = campoFiliacao.getText();
        s = radioFem.isSelected() ? radioFem.getText() : radioMasc.getText();
        l = (String) campoLazer.getSelectedItem();
        pTxAlvo.setText(pTxAlvo.getText() + "\nNome: " + n + "\nCPF: " + c + "\nFiliação: " + f + "\nSexo: " + s + "\nLazer: " + l);
        this.show("Nome: " + n + "\nCpf: " + c + "\nFiliacao: " + f + "\nSexo: " + s + "\nLazer: " + l);
        this.limpa();

    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResetActionPerformed
        this.limpa();

    }//GEN-LAST:event_botaoResetActionPerformed

    private void menuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHomeMouseClicked
        // TODO add your handling code here:
        this.esconde();
        pQ.setVisible(false);
        this.painelPrincipal.setVisible(true);
    }//GEN-LAST:event_menuHomeMouseClicked

    private void menuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuHomeActionPerformed

    private void itemQuestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemQuestaoActionPerformed
        // TODO add your handling code here:
        this.esconde();
        this.painelPrincipal.setVisible(false);
        this.setGlassPane(this.pQ);
        this.add(this.pQ);
        pQ.setVisible(true);
    }//GEN-LAST:event_itemQuestaoActionPerformed

    private void menuRespostasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRespostasActionPerformed
        // TODO add your handling code here:
        this.esconde();
        this.painelPrincipal.setVisible(false);
        this.setGlassPane(this.pR);
        this.add(this.pR);
        pR.setVisible(true);
    }//GEN-LAST:event_menuRespostasActionPerformed

    public void show(String a) {
        JOptionPane.showMessageDialog(null, a);

    }

    public void limpa() {
        campoNome.setText("");
        campoCpf.setText("");
        campoFiliacao.setText("");
        campoLazer.setSelectedIndex(0);
        buttonGroup1.clearSelection();

    }

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
    private javax.swing.JButton botaoReset;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoFiliacao;
    private javax.swing.JComboBox campoLazer;
    private javax.swing.JTextField campoNome;
    private javax.swing.JMenuItem itemQuestao;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelFiliacao;
    private javax.swing.JLabel labelFiliacao1;
    private javax.swing.JLabel labelFiliacao2;
    private javax.swing.JLabel labelNome;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenuItem menuRespostas;
    private javax.swing.JTextArea pTxAlvo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JRadioButton radioFem;
    private javax.swing.JRadioButton radioMasc;
    // End of variables declaration//GEN-END:variables

}
