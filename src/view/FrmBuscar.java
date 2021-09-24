/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.VeiculoControl;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.StringVaziaException;
import model.Veiculo;

/**
 *
 * @author leleb
 */
public final class FrmBuscar extends javax.swing.JFrame {
        private final VeiculoControl vectrl;
        private boolean op= false;
        private String marca,modelo,placa,cor,ano;
        private static FrmBuscar  frmbuscar = null;
    /**
     * Creates new form FrmBuscar
     */
    private FrmBuscar() {
        initComponents();
        vectrl = new VeiculoControl();
        buscaVeiculos();
        alterar(op);
    }
    
     public static FrmBuscar getInstancia() {
        if(frmbuscar == null){
            frmbuscar = new FrmBuscar();
        }        
        return frmbuscar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeiculos = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        lblSubTitulo = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setText("Tabela de registro de veículos");

        tblVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Placa", "Cor", "Ano de Fabricação"
            }
        ));
        jScrollPane1.setViewportView(tblVeiculos);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblMarca.setText("Marca:");

        lblModelo.setText("Modelo:");

        lblPlaca.setText("Placa:");

        lblCor.setText("Cor:");

        lblAno.setText("Ano de Fabricação:");

        lblSubTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSubTitulo.setText("Altere abaixo os campos que desejar e clique em salvar quando terminar.");

        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(257, 257, 257))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModelo)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlaca))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCor)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAno)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSubTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitulo)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubTitulo)
                    .addComponent(btnAlterar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(lblModelo)
                    .addComponent(lblPlaca)
                    .addComponent(lblCor)
                    .addComponent(lblAno))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        int linhaSelecionada = this.tblVeiculos.getSelectedRow();
        if (linhaSelecionada <0 ) {
            JOptionPane.showMessageDialog(null,"Selecione uma linha da tabela!", null,  JOptionPane.INFORMATION_MESSAGE);
        }  else {
         op = true;
        alterar(op);
        this.txtPlaca.setEditable(false);
        //this.btnAlterar.setVisible(false);
        
        marca = tblVeiculos.getValueAt(linhaSelecionada, 0).toString();
        modelo = tblVeiculos.getValueAt(linhaSelecionada, 1).toString();
        placa = tblVeiculos.getValueAt(linhaSelecionada, 2).toString();
        cor = tblVeiculos.getValueAt(linhaSelecionada, 3).toString();
        ano = tblVeiculos.getValueAt(linhaSelecionada, 4).toString();
        
        this.txtMarca.setText(marca);
        this.txtModelo.setText(modelo);
        this.txtPlaca.setText(placa);
        this.txtCor.setText(cor);
        this.txtAno.setText(ano);
        }
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try{
        if (marca.length()==0)
            throw new StringVaziaException();
        else if (modelo.length()==0)
            throw new StringVaziaException();
        else if (placa.length()==0)
            throw new StringVaziaException();
        else if (cor.length()==0)
            throw new StringVaziaException();
        else if (ano.length()==0)
            throw new StringVaziaException();
        else {
         marca= this.txtMarca.getText();
         modelo= this.txtModelo.getText();
         ano= this.txtAno.getText();
         cor= this.txtCor.getText();
         placa= this.txtPlaca.getText();
          
         vectrl.atualizar(marca, modelo, placa, cor,  Integer.parseInt(ano));
         this.txtMarca.setText(" ");
         this.txtModelo.setText(" ");
         this.txtPlaca.setText(" ");
         this.txtCor.setText(" ");
         this.txtAno.setText(" ");
         JOptionPane.showMessageDialog(null,"Atualizado com sucesso!", null,  JOptionPane.INFORMATION_MESSAGE);
        }
       } catch (StringVaziaException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(), "Obrigatório preencher todos os campos.",  JOptionPane.WARNING_MESSAGE );
       }
        buscaVeiculos();
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBuscar().setVisible(true);
            }
        });
    }
    
    
    public void buscaVeiculos () {
        ArrayList<Veiculo> lista;
        try {
            lista = vectrl.buscar();
            DefaultTableModel dados = (DefaultTableModel) tblVeiculos.getModel();
            dados.setNumRows(0);
            for (Veiculo ve: lista)
            {
                dados.addRow(new Object[]{ve.getMarca(),ve.getModelo(),ve.getPlaca(),ve.getCor(),ve.getAnoFabricacao()});
            }
        } catch (SQLException ex) {
            System.out.println ("Erro na busca " + ex.toString());
            JOptionPane.showMessageDialog(null,"Não foi possivel buscar os veículos! "+ex.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println ("Erro de conexão " + ex.toString());
        }
    }
    
    public void alterar(boolean op) {
        this.lblSubTitulo.setVisible(op);
        this.lblAno.setVisible(op);
        this.lblMarca.setVisible(op);
        this.lblCor.setVisible(op);
        this.lblModelo.setVisible(op);
        this.lblPlaca.setVisible(op);
        this.txtAno.setVisible(op);
        this.txtCor.setVisible(op);
        this.txtMarca.setVisible(op);
        this.txtModelo.setVisible(op);
        this.txtPlaca.setVisible(op);
        this.btnSalvar.setVisible(op);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblVeiculos;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}