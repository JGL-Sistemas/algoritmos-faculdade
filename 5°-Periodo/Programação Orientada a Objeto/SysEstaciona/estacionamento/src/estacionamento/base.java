
package estacionamento;

public class base extends javax.swing.JFrame {
    
    public Carros car;
    public Precos pc;
    public Clientes cl;
    public Vagas vg;
    public estacionamentos est;
    public conectar bd;
    public Alugueis alg;
    
    public base() {
        initComponents();
        
        bd = new conectar();
        car = new Carros(bd);
        cl = new Clientes(bd);
        vg = new Vagas(bd);
        est = new estacionamentos(bd);
        pc = new Precos(bd);
        alg = new Alugueis(bd);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        inicial = new javax.swing.JMenu();
        menuClienteCadastrar1 = new javax.swing.JMenu();
        cadastrarEstacionamentos = new javax.swing.JMenuItem();
        cadastro = new javax.swing.JMenu();
        cadastrarCarros = new javax.swing.JMenuItem();
        alugueis = new javax.swing.JMenu();
        cadastrarAluguel = new javax.swing.JMenuItem();
        precos = new javax.swing.JMenu();
        cadastrarPreco = new javax.swing.JMenuItem();
        vagas = new javax.swing.JMenu();
        cadastrarVagas = new javax.swing.JMenuItem();
        menuClienteCadastrar = new javax.swing.JMenu();
        cadastrarClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estacionamento de carro");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/estacionamento.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, Short.MAX_VALUE)
        );

        inicial.setText("Inicial");
        inicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicialMouseClicked(evt);
            }
        });
        jMenuBar1.add(inicial);

        menuClienteCadastrar1.setText("Estacionamentos");
        menuClienteCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteCadastrar1ActionPerformed(evt);
            }
        });

        cadastrarEstacionamentos.setText("Cadastrar");
        cadastrarEstacionamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarEstacionamentosActionPerformed(evt);
            }
        });
        menuClienteCadastrar1.add(cadastrarEstacionamentos);

        jMenuBar1.add(menuClienteCadastrar1);

        cadastro.setText("Carros");
        cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroMouseClicked(evt);
            }
        });
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });

        cadastrarCarros.setText("Cadastro");
        cadastrarCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarCarrosActionPerformed(evt);
            }
        });
        cadastro.add(cadastrarCarros);

        jMenuBar1.add(cadastro);

        alugueis.setText("Alugueis");

        cadastrarAluguel.setText("Cadastrar Aluguel");
        cadastrarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAluguelActionPerformed(evt);
            }
        });
        alugueis.add(cadastrarAluguel);

        jMenuBar1.add(alugueis);

        precos.setText("Preços");
        precos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precosActionPerformed(evt);
            }
        });

        cadastrarPreco.setText("Cadastrar");
        cadastrarPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarPrecoActionPerformed(evt);
            }
        });
        precos.add(cadastrarPreco);

        jMenuBar1.add(precos);

        vagas.setText("Vagas");
        vagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vagasActionPerformed(evt);
            }
        });

        cadastrarVagas.setText("Cadastrar");
        cadastrarVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarVagasActionPerformed(evt);
            }
        });
        vagas.add(cadastrarVagas);

        jMenuBar1.add(vagas);

        menuClienteCadastrar.setText("Clientes");
        menuClienteCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteCadastrarActionPerformed(evt);
            }
        });

        cadastrarClientes.setText("Cadastrar");
        cadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClientesActionPerformed(evt);
            }
        });
        menuClienteCadastrar.add(cadastrarClientes);

        jMenuBar1.add(menuClienteCadastrar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void esconde(){
        car.setVisible(false);
        jPanel1.setVisible(false);
        est.setVisible(false);
        cl.setVisible(false);
        vg.setVisible(false);
        pc.setVisible(false);
        alg.setVisible(false);
    }
    
    private void cadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroMouseClicked
        // TODO add your handling code here:
       // esconde();
        //this.setGlassPane(car);
        //this.add(car);
        //car.setVisible(true);
    }//GEN-LAST:event_cadastroMouseClicked

    private void cadastrarCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarCarrosActionPerformed
        // TODO add your handling code here:
        this.jPanel1.setVisible(false);
        esconde();
        this.setGlassPane(this.car);
        this.add(this.car);
        this.car.setVisible(true);

    }//GEN-LAST:event_cadastrarCarrosActionPerformed

    private void precosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precosActionPerformed
        // TODO add your handling code here:
        this.jPanel1.setVisible(false);
        esconde();
        this.setGlassPane(this.pc);
        this.add(this.pc);
        this.pc.setVisible(true);
    }//GEN-LAST:event_precosActionPerformed

    private void inicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicialMouseClicked
        // TODO add your handling code here:
        esconde();
        jPanel1.setVisible(true);
        
    }//GEN-LAST:event_inicialMouseClicked

    private void cadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClientesActionPerformed
        // TODO add your handling code here:
        this.jPanel1.setVisible(false);
        esconde();
        this.setGlassPane(this.cl);
        this.add(this.cl);
        this.cl.setVisible(true);
    }//GEN-LAST:event_cadastrarClientesActionPerformed

    private void menuClienteCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuClienteCadastrarActionPerformed

    private void cadastrarVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarVagasActionPerformed
        // TODO add your handling code here:
        this.jPanel1.setVisible(false);
        esconde();
        this.setGlassPane(this.vg);
        this.add(this.vg);
        this.vg.setVisible(true);
    }//GEN-LAST:event_cadastrarVagasActionPerformed

    private void cadastrarPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarPrecoActionPerformed
        // TODO add your handling code here:
        this.jPanel1.setVisible(false);
        esconde();
        this.setGlassPane(this.pc);
        this.add(this.pc);
        this.pc.setVisible(true);
    }//GEN-LAST:event_cadastrarPrecoActionPerformed

    private void vagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vagasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vagasActionPerformed

    private void cadastrarEstacionamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarEstacionamentosActionPerformed
        // TODO add your handling code here:
        this.jPanel1.setVisible(false);
        esconde();
        this.setGlassPane(this.est);
        this.add(this.est);
        this.est.setVisible(true);
    }//GEN-LAST:event_cadastrarEstacionamentosActionPerformed

    private void menuClienteCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteCadastrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuClienteCadastrar1ActionPerformed

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroActionPerformed

    private void cadastrarAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAluguelActionPerformed
        // TODO add your handling code here:
        this.jPanel1.setVisible(false);
        esconde();
        this.setGlassPane(this.alg);
        this.add(this.alg);
        this.alg.setVisible(true);
    }//GEN-LAST:event_cadastrarAluguelActionPerformed

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
            java.util.logging.Logger.getLogger(base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new base().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu alugueis;
    private javax.swing.JMenuItem cadastrarAluguel;
    private javax.swing.JMenuItem cadastrarCarros;
    private javax.swing.JMenuItem cadastrarClientes;
    private javax.swing.JMenuItem cadastrarEstacionamentos;
    private javax.swing.JMenuItem cadastrarPreco;
    private javax.swing.JMenuItem cadastrarVagas;
    private javax.swing.JMenu cadastro;
    private javax.swing.JMenu inicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuClienteCadastrar;
    private javax.swing.JMenu menuClienteCadastrar1;
    private javax.swing.JMenu precos;
    private javax.swing.JMenu vagas;
    // End of variables declaration//GEN-END:variables

    private void setGlassPane(Estacionamento est) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
