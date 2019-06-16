package estacionamento;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Carros extends javax.swing.JPanel {

    private final conectar bd;

    private final DefaultTableModel tCar;

    public Carros(conectar BD) {
        bd = BD;
        idSelect = "";
        initComponents();
        tCar = (DefaultTableModel) carrroTab.getModel();
        preencheTabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeTex = new javax.swing.JTextField();
        corText = new javax.swing.JTextField();
        placaTex = new javax.swing.JTextField();
        guardarBt = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        carrroTab = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Carros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Carro");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Cor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Placa");

        nomeTex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        corText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        placaTex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        guardarBt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guardarBt.setForeground(new java.awt.Color(51, 0, 51));
        guardarBt.setText("Guardar");
        guardarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtActionPerformed(evt);
            }
        });

        carrroTab.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        carrroTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Carro", "Placa", "Cor", "Excluir", "Alterar"
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
        carrroTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carrroTabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carrroTab);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(nomeTex, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .add(corText, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .add(placaTex, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .add(guardarBt, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(nomeTex, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(corText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .add(8, 8, 8)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(placaTex, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(guardarBt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 373, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtActionPerformed
        String car, cor, pla;
        car = nomeTex.getText();
        cor = corText.getText();
        pla = placaTex.getText();
        System.out.println(car);
        System.out.println(cor);
        System.out.println(pla);
        try {
            if(idSelect.equals("")){
            bd.persistir("INSERT INTO carro(nome, cor, placa) "
                    + "VALUES('" + car + "','" + cor + "','" + pla + "')");
            }else{
                bd.persistir("update carro set "
                        + "nome = '" + car + "'"
                        + ",cor = '" + cor + "'"
                        + ",placa = '" + pla + "' "
                                + "where id = '"+idSelect+"'");
            }
            idSelect = "";
            preencheTabel();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_guardarBtActionPerformed

    private void carrroTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrroTabMouseClicked
        int li = carrroTab.getSelectedRow();
        int col = carrroTab.getSelectedColumn();
        String texto = (String) carrroTab.getValueAt(li, col);
        String id = (String) carrroTab.getValueAt(li, 0);
        idSelect = "";
        if(texto.equals("Exc")){
            excluir(id);
        }else if(texto.equals("Alt")){
            editar(id);
        }
        preencheTabel();
    }//GEN-LAST:event_carrroTabMouseClicked
    public void excluir(String id){
        bd.persistir("DELETE FROM carro where id = "+id);
    }
    public void editar(String id){
        ResultSet carro;
        try{
        carro =  bd.recupera("SELECT * FROM carro where id = "+id);
        while(carro.next()){
            this.idSelect = carro.getString("id");
            this.nomeTex.setText(carro.getString("nome"));
            this.corText.setText(carro.getString("cor"));
            this.placaTex.setText(carro.getString("placa"));
        }
            
        }catch(Exception e){
            
        }
    }
    
    public void preencheTabel() {
        try {
            ResultSet todos = bd.recupera("select * from carro");
            tCar.setNumRows(0);
            while (todos.next()) {
                String[] Nlinha = {
                    todos.getString("id"),
                    todos.getString("nome"),
                    todos.getString("placa"),
                    todos.getString("cor"),
                    "Exc", "Alt"
                };
                tCar.addRow(Nlinha);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public ResultSet busca() {
        return bd.recupera("select * from carro");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable carrroTab;
    private javax.swing.JTextField corText;
    private javax.swing.JToggleButton guardarBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeTex;
    private javax.swing.JTextField placaTex;
    // End of variables declaration//GEN-END:variables
private String idSelect;
}
