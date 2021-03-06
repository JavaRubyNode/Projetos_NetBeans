/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.osmar.view;

import br.com.osmar.controle.ClienteBC;
import br.com.osmar.controle.VeiculoBC;

/**
 *
 * @author VINICIUS
 */
public class Start extends javax.swing.JFrame {

    private ClienteBC s = new ClienteBC();
    private VeiculoBC d = new VeiculoBC();
    
    public Start() {
        initComponents();
        
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menu_tabela = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menu_tabelaVeiculo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osmar/pictures/189719_Papel-de-Parede-Binario--189719_1600x1200.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jMenu1.setText("CLIENTES");

        jMenuItem1.setText("CADRASTRAR CLIENTES");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menu_tabela.setText("TABELA DE CLIENTES");
        menu_tabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_tabelaActionPerformed(evt);
            }
        });
        jMenu1.add(menu_tabela);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("VEICULO");

        jMenuItem3.setText("CADRASTRAR VEICULO ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        menu_tabelaVeiculo.setText("TABELA VEICULO");
        menu_tabelaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_tabelaVeiculoActionPerformed(evt);
            }
        });
        jMenu2.add(menu_tabelaVeiculo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("LOCADORA");

        jMenuItem4.setText("LANCAR VENDA");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        TelaCliente a = new TelaCliente(this, true);
        a.receberClienteBC(s);
        a.recebecodigo(this.s.retornaCodigoCliente());
        a.setVisible(true);
         
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        TelaVeiculo a =new TelaVeiculo(this, true);
        a.receberVeiculo(d);
        a.recebecodigo(this.d.retornaCodigoVeiculo());
        a.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menu_tabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_tabelaActionPerformed

        TelaTabelaCliente b = new TelaTabelaCliente(this, true);
        b.receberClienteBC(s);
        b.setVisible(true);
        
    }//GEN-LAST:event_menu_tabelaActionPerformed

    private void menu_tabelaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_tabelaVeiculoActionPerformed
        
         TelaTabelaVeiculo w = new TelaTabelaVeiculo(this, true);
        w.receberClienteBC(d);
        w.setVisible(true);
        
        
    }//GEN-LAST:event_menu_tabelaVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem menu_tabela;
    private javax.swing.JMenuItem menu_tabelaVeiculo;
    // End of variables declaration//GEN-END:variables
}
