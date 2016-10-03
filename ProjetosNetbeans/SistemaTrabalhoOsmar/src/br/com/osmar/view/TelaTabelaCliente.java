/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.osmar.view;

import br.com.osmar.bean.Cliente;
import br.com.osmar.controle.ClienteBC;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VINICIUS
 */
public class TelaTabelaCliente extends javax.swing.JDialog {

    private ClienteBC s;
    
    
    public TelaTabelaCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setLocationRelativeTo(null);
        
        
        
    }
       //========== Função para implentar interface ==============================
        
          public void receberClienteBC( ClienteBC cliente){
           this.s = cliente;
       }//=====================================================================
    
    
    //======== Função para preencher a Tabela Cliente =========================================
    public void preencherTabela() {
   
        DefaultTableModel tbclientes = (javax.swing.table.DefaultTableModel) tabela.getModel();
        for (int i = tbclientes.getRowCount() -1; i >=0; i--) {
            tbclientes.removeRow(i);
        }
        ArrayList<Cliente> clientes = s.mostrarLista();
        for (Cliente c : clientes) {
  tbclientes.addRow(new Object [] {c.pegarCodigo(),c.pegarNome(),c.pegarSexo(),c.pegarCpf()});
        }
    }//===========================================================================================
    
    //========== Função para inserir novos clientes no final ======================================
    public void inserirUltimaPosicao() {
        DefaultTableModel tbclientes = (javax.swing.table.DefaultTableModel) tabela.getModel();
        ArrayList<Cliente> clientes = s.mostrarLista();
        Cliente c = clientes.get(clientes.size()-1);
        tbclientes.addRow(new Object [] {c.pegarCodigo(),c.pegarNome(),c.pegarSexo(),c.pegarCpf()});
    }//==============================================================================================
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menu_buscar = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menu_remover = new javax.swing.JMenuItem();
        menu_mostar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mostrar = new javax.swing.JMenuItem();
        remover = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOME", "SEXO", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jMenu1.setText("DADOS DO CLIENTE");

        jMenu3.setText("NA LISTA");

        menu_buscar.setText("BUSCAR");
        menu_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buscarActionPerformed(evt);
            }
        });
        jMenu3.add(menu_buscar);

        jMenuItem3.setText("EDITAR");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        menu_remover.setText("REMOVER");
        menu_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_removerActionPerformed(evt);
            }
        });
        jMenu3.add(menu_remover);

        menu_mostar.setText("MOSTRAR LISTA");
        menu_mostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_mostarActionPerformed(evt);
            }
        });
        jMenu3.add(menu_mostar);

        jMenu1.add(jMenu3);

        jMenu4.setText("NA TABELA");

        mostrar.setText("MOSTRAR");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        jMenu4.add(mostrar);

        remover.setText("REMOVER");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });
        jMenu4.add(remover);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_removerActionPerformed
        this.s.removerClienteLista();
    }//GEN-LAST:event_menu_removerActionPerformed

    private void menu_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buscarActionPerformed
        this.s.pesquisarClienteLista();
    }//GEN-LAST:event_menu_buscarActionPerformed

    private void menu_mostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_mostarActionPerformed
        this.s.mostarListaArray();
        
    }//GEN-LAST:event_menu_mostarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        this.preencherTabela();
    }//GEN-LAST:event_mostrarActionPerformed

    
    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        DefaultTableModel tbclientes = (javax.swing.table.DefaultTableModel) tabela.getModel();
               
        int linha = this.tabela.getSelectedRow();
        
        tbclientes.removeRow(linha);
        
    }//GEN-LAST:event_removerActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      
        
        
        
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTabelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaTabelaCliente dialog = new TelaTabelaCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem menu_buscar;
    private javax.swing.JMenuItem menu_mostar;
    private javax.swing.JMenuItem menu_remover;
    private javax.swing.JMenuItem mostrar;
    private javax.swing.JMenuItem remover;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
