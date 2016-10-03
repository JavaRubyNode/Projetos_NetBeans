
package financeiro;

import javax.swing.JOptionPane;


public class Juros extends javax.swing.JFrame {

    Dados real = new Dados();
      int k; 
    
    public Juros() {
        initComponents();
        setLocationRelativeTo(null);
         t_texto.setEditable(false);
         tf_dinheiro.setDocument(new Teclas());
         tf_taxa.setDocument(new Teclas());
         tf_tempo.setDocument(new Teclas());
       
    }
public static void Ver(String texto){
    JOptionPane.showMessageDialog(null,texto);
}
public static String Pegar(String text){
    return JOptionPane.showInputDialog(text);
}



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tf_dinheiro = new javax.swing.JTextField();
        tf_tempo = new javax.swing.JTextField();
        tf_taxa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_texto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b_simples = new javax.swing.JButton();
        b_compostos = new javax.swing.JButton();
        b_limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA BY VINICIUS ");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tf_tempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tempoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CÁLCULO FINANCEIRO ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        t_texto.setColumns(20);
        t_texto.setRows(5);
        jScrollPane1.setViewportView(t_texto);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("INFORME O CAPITAL PARA INVESTIR :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("INFORME O TEMPO ( meses ) DA APLICAÇÃO : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("INFORME A TAXA ( meses ) DE JUROS APLICADA :  ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("SISTEMA PARA CALCULAR JUROS ");

        b_simples.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_simples.setText("JUROS SIMPLES");
        b_simples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_simplesActionPerformed(evt);
            }
        });

        b_compostos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_compostos.setText("JUROS COMPOSTOS");
        b_compostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_compostosActionPerformed(evt);
            }
        });
        b_compostos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b_compostosKeyPressed(evt);
            }
        });

        b_limpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_limpar.setText("LIMPAR ");
        b_limpar.setEnabled(false);
        b_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(167, 167, 167))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tf_dinheiro)
                                                .addGap(197, 197, 197)))
                                        .addComponent(b_compostos))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf_tempo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(b_limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(b_simples, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))))
                                .addGap(38, 38, 38))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_taxa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_dinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_compostos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_simples, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_taxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(b_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

    private void tf_tempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_tempoActionPerformed

    private void b_compostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_compostosActionPerformed
       
        real.setCapital(Double.parseDouble(tf_dinheiro.getText()));
        real.setTaxa(Double.parseDouble(tf_taxa.getText()));
        real.setTempo(Integer.parseInt(tf_tempo.getText()));
        
              real.setY(1+ real.getTaxa()/100);
        real.setX(Math.pow(real.getY(),real.getTempo()));
        real.setJuros(real.getCapital()*real.getX());
         
       real.setZ(Math.round(real.getJuros()));
       
   
    t_texto.setText(" Escolhido o Cálculo de Juros compostos "+
                "\n A resolução fica assim : "+
                "\n ----------------------------------------"+
                "\n A formula de Juros Compostos e a seguinte : "+
                "\n M = C . ( 1 + I ) elevado ao t "+
                "\n M = Montante , C = capital , T = tempo , I = taxa"+
                "\n -----------------------------------------"+
                "\n M = "+real.getCapital()+" . ( 1 + "+real.getTaxa()+" % ) elavando "+real.getTempo()+
                "\n M = "+real.getCapital()+" . ( 1 + "+(real.getTaxa()/100)+" ) elavando "+real.getTempo()+
                "\n M = "+real.getCapital()*real.getX()+
                "\n Aredondando o valor do Montante será : "+
                "\n M = "+real.getZ()); 
         
       b_limpar.setEnabled(true);
         
        
    }//GEN-LAST:event_b_compostosActionPerformed

    private void b_simplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_simplesActionPerformed
      
        real.setCapital(Double.parseDouble(tf_dinheiro.getText()));
        real.setTaxa(Double.parseDouble(tf_taxa.getText()));
        real.setTempo(Integer.parseInt(tf_tempo.getText()));
        
        real.setJuros(real.getCapital()*(real.getTaxa()/100)*real.getTempo());
        
        
        t_texto.setText(" Escolhido o Cálculo de Juros simples "+
                "\n ficando a resolução da seguite forma : "+
                "\n ------------------------------------------"+
                "\n A formula de Juros simples e a seguinte : "+
                "\n J = C.I.T "+ 
                "\n onde C = capital , I = taxa , T = tempo "+
                "\n ------------------------------------------"+
                "\n J = "+real.getCapital()+" . "+real.getTaxa()+" . "+real.getTempo()+
                "\n J = "+real.getCapital()+" . "+real.getTaxa()/100+" . "+real.getTempo()+
                "\n J = "+real.getCapital()*(real.getTaxa()/100)*real.getTempo()+
                "\n ------------------------------------------"+
                "\n Montante = Juros + Capital "+
                "\n Montante = "+(real.getJuros()+real.getCapital()));
        
         b_limpar.setEnabled(true);
        
    }//GEN-LAST:event_b_simplesActionPerformed

    private void b_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limparActionPerformed
       
        t_texto.setText("");
       tf_dinheiro.setText("");
       tf_taxa.setText("");
       tf_tempo.setText("");
       b_limpar.setEnabled(false);
       tf_dinheiro.requestFocus();
    }//GEN-LAST:event_b_limparActionPerformed

    private void b_compostosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_compostosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_compostosKeyPressed

   
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
            java.util.logging.Logger.getLogger(Juros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_compostos;
    private javax.swing.JButton b_limpar;
    private javax.swing.JButton b_simples;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea t_texto;
    private javax.swing.JTextField tf_dinheiro;
    private javax.swing.JTextField tf_taxa;
    private javax.swing.JTextField tf_tempo;
    // End of variables declaration//GEN-END:variables
}
