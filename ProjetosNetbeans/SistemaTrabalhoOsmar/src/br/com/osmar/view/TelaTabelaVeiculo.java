
package br.com.osmar.view;

import br.com.osmar.bean.Veiculo;
import br.com.osmar.controle.VeiculoBC;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class TelaTabelaVeiculo extends javax.swing.JDialog {
private VeiculoBC m;
   
    public TelaTabelaVeiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
    }

  public void receberClienteBC( VeiculoBC car){
           this.m = car;
       }
     //======== Função para preencher a Tabela Veiculo =========================================
    public void preencherTabela() {
   
        DefaultTableModel tbclientes = (javax.swing.table.DefaultTableModel) tabela.getModel();
        for (int i = tbclientes.getRowCount() -1; i >=0; i--) {
            tbclientes.removeRow(i);
        }
        ArrayList<Veiculo> carros = m.mostrarLista();
        for (Veiculo c : carros) {
  tbclientes.addRow(new Object [] {c.getCor(),c.getMarca(),c.getModelo(),c.getAno(),c.getPlaca()});
        }
    }//===========================================================================================
    
    
    
    //===========================================================================================
    public void apagarTabela(){
         
        DefaultTableModel tbclientes = (javax.swing.table.DefaultTableModel) tabela.getModel();
               
        int linha = this.tabela.getSelectedRow();
        
        tbclientes.removeRow(linha);
        
    }//=========================================================================================
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_mostarArray = new javax.swing.JMenuItem();
        menu_pesquisar = new javax.swing.JMenuItem();
        menu_removerArray = new javax.swing.JMenuItem();
        menu_editar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_mostrar = new javax.swing.JMenuItem();
        menu_remover = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COR ", "MARCA", "MODELO", "ANO", "PLACA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("LISTA ARRAY");

        menu_mostarArray.setText("MOSTRAR VEICULO");
        menu_mostarArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_mostarArrayActionPerformed(evt);
            }
        });
        jMenu1.add(menu_mostarArray);

        menu_pesquisar.setText("PESQUISAR ");
        menu_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_pesquisarActionPerformed(evt);
            }
        });
        jMenu1.add(menu_pesquisar);

        menu_removerArray.setText("REMOVER");
        menu_removerArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_removerArrayActionPerformed(evt);
            }
        });
        jMenu1.add(menu_removerArray);

        menu_editar.setText("EDITAR");
        jMenu1.add(menu_editar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("TABELA");

        menu_mostrar.setText("MOSTRAR TABELA");
        menu_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_mostrarActionPerformed(evt);
            }
        });
        jMenu2.add(menu_mostrar);

        menu_remover.setText("REMOVER VEICULO ");
        menu_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_removerActionPerformed(evt);
            }
        });
        jMenu2.add(menu_remover);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_pesquisarActionPerformed
      
        this.m.pesquisarVeiculoLista();
        
    }//GEN-LAST:event_menu_pesquisarActionPerformed

    private void menu_mostarArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_mostarArrayActionPerformed

         this.m.mostarListaArray();
                      
    }//GEN-LAST:event_menu_mostarArrayActionPerformed

    private void menu_removerArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_removerArrayActionPerformed
       
        this.m.removerVeiculoLista();
        
    }//GEN-LAST:event_menu_removerArrayActionPerformed

    private void menu_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_mostrarActionPerformed
       
        preencherTabela();
       
    }//GEN-LAST:event_menu_mostrarActionPerformed

    private void menu_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_removerActionPerformed
   
        apagarTabela();
        
    }//GEN-LAST:event_menu_removerActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTabelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaTabelaVeiculo dialog = new TelaTabelaVeiculo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menu_editar;
    private javax.swing.JMenuItem menu_mostarArray;
    private javax.swing.JMenuItem menu_mostrar;
    private javax.swing.JMenuItem menu_pesquisar;
    private javax.swing.JMenuItem menu_remover;
    private javax.swing.JMenuItem menu_removerArray;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
