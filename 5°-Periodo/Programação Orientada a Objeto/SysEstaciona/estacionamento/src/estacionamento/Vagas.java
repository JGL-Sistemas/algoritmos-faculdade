/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel; //prova

public class Vagas extends javax.swing.JPanel {
 
    conectar bd;
    DefaultTableModel vg;  
   
    public Vagas(conectar BD) {
        bd = BD;
        idSelect = "";
        initComponents();
        vg = (DefaultTableModel)vagasTab.getModel();
        preencheTabel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numeroTex = new javax.swing.JTextField();
        descricaoText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vagasTab = new javax.swing.JTable();
        guardarBt = new javax.swing.JToggleButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Vagas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("N°:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Descrição:");

        numeroTex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        descricaoText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        descricaoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoTextActionPerformed(evt);
            }
        });

        vagasTab.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vagasTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "N°", "Descrição", "Excluir", "Alterar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vagasTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vagasTabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vagasTab);

        guardarBt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guardarBt.setForeground(new java.awt.Color(51, 0, 51));
        guardarBt.setText("Guardar");
        guardarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numeroTex, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(descricaoText, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(guardarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroTex, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(descricaoText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void vagasTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vagasTabMouseClicked
        int li = vagasTab.getSelectedRow();
        int col = vagasTab.getSelectedColumn();
        String texto = (String) vagasTab.getValueAt(li, col);
        String id = (String) vagasTab.getValueAt(li, 0);
        idSelect = "";
        if(texto.equals("Exc")){
            excluir(id);
        }else if(texto.equals("Alt")){
            editar(id);
        }
        
        preencheTabel();
    }//GEN-LAST:event_vagasTabMouseClicked

    private void guardarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtActionPerformed
        String numero, descricao;
        numero = numeroTex.getText();
        descricao = descricaoText.getText();

        System.out.println(numero);
        System.out.println(descricao);

     
        try {
            if(idSelect.equals("")){
                bd.persistir("INSERT INTO vagas (nome, cpf, telefone) "
                    + "VALUES('" + numero + "','" + descricao + "')");
            }else{
                bd.persistir("update vagas set "
                    + "numero = '" + numero + "'"
                    + "descricao = '" + descricao + "'"
                    + "where id = '"+idSelect+"'");
            }
            idSelect = "";
            preencheTabel();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_guardarBtActionPerformed

    private void descricaoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoTextActionPerformed

    public void preencheTabel() {
        try {
            ResultSet todos = bd.recupera("select * from vagas");
            vg.setNumRows(0);
            while (todos.next()) {
                String[] Nlinha = {
                    todos.getString("id"),
                    todos.getString("numero"),
                    todos.getString("descricao"),
                    "Exc", "Alt"
                };
                vg.addRow(Nlinha);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
 
  public void excluir(String id){
        bd.persistir("DELETE FROM vagas where id = "+id);
    }
  
    public void editar(String id){
        ResultSet vagas;
        try{
        vagas =  bd.recupera("SELECT * FROM vagas where id = "+id);
        while(vagas.next()){
            this.idSelect = vagas.getString("id");
            this.numeroTex.setText(vagas.getString("numero"));
            this.descricaoText.setText(vagas.getString("descricao"));
        }
            
        }catch(Exception e){
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descricaoText;
    private javax.swing.JToggleButton guardarBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numeroTex;
    private javax.swing.JTable vagasTab;
    // End of variables declaration//GEN-END:variables
   private String idSelect;
}
