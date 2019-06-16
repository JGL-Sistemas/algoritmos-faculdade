
package estacionamento;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel; //prova

public class Precos extends javax.swing.JPanel {
    conectar bd;
    DefaultTableModel pc;   
    
    public Precos(conectar BD) {
        bd = BD;
        initComponents();
        pc = (DefaultTableModel)precoTab.getModel();
        preencheTabel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        valorHora = new javax.swing.JLabel();
        valorMensal = new javax.swing.JLabel();
        preco = new javax.swing.JLabel();
        valorHoraTex = new javax.swing.JTextField();
        valorMensalText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        precoTab = new javax.swing.JTable();
        guardarBt = new javax.swing.JToggleButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preços", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        valorHora.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        valorHora.setText("Valor Hora:");

        valorMensal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        valorMensal.setText("Valor Mensal:");

        preco.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        valorHoraTex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        valorMensalText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valorMensalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorMensalTextActionPerformed(evt);
            }
        });

        precoTab.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        precoTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Valor Hora", "Valor Mensal", "Excluir", "Alterar"
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
        precoTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                precoTabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(precoTab);

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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(valorMensal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valorMensalText, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(preco)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(valorHora)
                                        .addGap(18, 18, 18)
                                        .addComponent(valorHoraTex, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(guardarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorHora)
                    .addComponent(valorHoraTex, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(preco)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorMensalText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorMensal))
                .addGap(78, 78, 78)
                .addComponent(guardarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
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

    private void precoTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precoTabMouseClicked
        int li = precoTab.getSelectedRow();
        int col = precoTab.getSelectedColumn();
        String texto = (String) precoTab.getValueAt(li, col);
        String id = (String) precoTab.getValueAt(li, 0);
        idSelect = "";
        if(texto.equals("Exc")){
            excluir(id);
        }else if(texto.equals("Alt")){
            editar(id);
        }
        preencheTabel();
    }//GEN-LAST:event_precoTabMouseClicked

    private void guardarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtActionPerformed
        String vh, vm;
        vh = valorHoraTex.getText();
        vm = valorMensalText.getText();
        //pr= precoTex.getText();

        System.out.println(vh);
        System.out.println(vm);
        //System.out.println(pr);

        //Dieisso add
        bd.persistir("INSERT INTO preco (valorHora, valorMensal) "
            + "VALUES('" + vh + "','" + vm + "')");
        try {
            if(idSelect.equals("")){
                bd.persistir("INSERT INTO preco (valorHora, valorMensal) "
                    + "VALUES('" + vh + "','" + vm + "')");
            }else{
                bd.persistir("update precoset "
                    + "valorHora = '" + vh + "'"
                    + ",valorMensal = '" + vm + "'"
                    //+ ",preco = '" + pr + "' "
                    + "where id = '"+idSelect+"'");
            }
            preencheTabel();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_guardarBtActionPerformed

    private void valorMensalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorMensalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorMensalTextActionPerformed

     public void preencheTabel() {
        try {
            ResultSet todos = bd.recupera("select * from preco");
            pc.setNumRows(0);
            while (todos.next()) {
                String[] Nlinha = {
                    todos.getString("id"),
                    todos.getString("valorHora"),
                    todos.getString("valorMensal"),
                    //todos.getString("preco"),
                    "Exc", "Alt"
                };
                pc.addRow(Nlinha);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
 
  public void excluir(String id){
        bd.persistir("DELETE FROM preco where id = "+id);
    }
  
    public void editar(String id){
        ResultSet precoo;
        try{
        precoo =  bd.recupera("SELECT * FROM preco where id = "+id);
        while(precoo.next()){
            this.idSelect = precoo.getString("id");
            this.valorHoraTex.setText(precoo.getString("valorHora"));
            this.valorMensalText.setText(precoo.getString("valorMensal"));
            //this.precoTex.setText(precoo.getString("preco"));
        }
            
        }catch(Exception e){
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton guardarBt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel preco;
    private javax.swing.JTable precoTab;
    private javax.swing.JLabel valorHora;
    private javax.swing.JTextField valorHoraTex;
    private javax.swing.JLabel valorMensal;
    private javax.swing.JTextField valorMensalText;
    // End of variables declaration//GEN-END:variables

    private String idSelect;
}
