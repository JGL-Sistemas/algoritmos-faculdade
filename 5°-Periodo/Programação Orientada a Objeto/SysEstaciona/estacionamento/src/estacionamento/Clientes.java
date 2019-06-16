/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel; //prova

public class Clientes extends javax.swing.JPanel {

    conectar bd;
    DefaultTableModel tCli;   
    
    public Clientes(conectar BD) {
        bd = BD;
        initComponents();
        tCli = (DefaultTableModel)clienteTab.getModel();
        preencheTabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeTex = new javax.swing.JTextField();
        cpfText = new javax.swing.JTextField();
        telefoneTex = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienteTab = new javax.swing.JTable();
        guardarBt = new javax.swing.JToggleButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Telefone:");

        nomeTex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        cpfText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        telefoneTex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        clienteTab.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clienteTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nome", "CPF", "Telefone", "Excluir", "Alterar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clienteTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clienteTabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clienteTab);

        guardarBt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guardarBt.setForeground(new java.awt.Color(51, 0, 51));
        guardarBt.setText("Guardar");
        guardarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeTex, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(cpfText, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(telefoneTex, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(guardarBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeTex, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telefoneTex, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guardarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clienteTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteTabMouseClicked
        int li = clienteTab.getSelectedRow();
        int col = clienteTab.getSelectedColumn();
        String texto = (String) clienteTab.getValueAt(li, col);
        String id = (String) clienteTab.getValueAt(li, 0);
        idSelect = "";
        if(texto.equals("Exc")){
            excluir(id);
        }else if(texto.equals("Alt")){
            editar(id);
        }
        preencheTabel();
    }//GEN-LAST:event_clienteTabMouseClicked

    private void guardarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtActionPerformed
        String nome, cpf, telefone;
        nome = nomeTex.getText();
        cpf = cpfText.getText();
        telefone = telefoneTex.getText();
        
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(telefone);
        
        //Dieisso add
        bd.persistir("INSERT INTO cliente (nome, cpf, telefone) "
                    + "VALUES('" + nome + "','" + cpf + "','" + telefone + "')");
        try {
            if(idSelect.equals("")){
                bd.persistir("INSERT INTO cliente (nome, cpf, telefone) "
                    + "VALUES('" + nome + "','" + cpf + "','" + telefone + "')");
            }else{
                bd.persistir("update cliente set "
                    + "nome = '" + nome + "'"
                    + ",cpf = '" + cpf + "'"
                    + ",telefone = '" + telefone + "' "
                    + "where id = '"+idSelect+"'");
            }
            preencheTabel();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_guardarBtActionPerformed
 public void preencheTabel() {
        try {
            ResultSet todos = bd.recupera("select * from cliente");
            tCli.setNumRows(0);
            while (todos.next()) {
                String[] Nlinha = {
                    todos.getString("id"),
                    todos.getString("nome"),
                    todos.getString("cpf"),
                    todos.getString("telefone"),
                    "Exc", "Alt"
                };
                tCli.addRow(Nlinha);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
 
  public void excluir(String id){
        bd.persistir("DELETE FROM cliente where id = "+id);
    }
  
    public void editar(String id){
        ResultSet carro;
        try{
        carro =  bd.recupera("SELECT * FROM cliente where id = "+id);
        while(carro.next()){
            this.idSelect = carro.getString("id");
            this.nomeTex.setText(carro.getString("nome"));
            this.cpfText.setText(carro.getString("cpf"));
            this.telefoneTex.setText(carro.getString("telefone"));
        }
            
        }catch(Exception e){
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable clienteTab;
    private javax.swing.JTextField cpfText;
    private javax.swing.JToggleButton guardarBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeTex;
    private javax.swing.JTextField telefoneTex;
    // End of variables declaration//GEN-END:variables
    private String idSelect;
}
