/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeconomica;

import java.text.DecimalFormat;

/**
 *
 * @author VINICIUS
 */
public class DescontoComercial extends javax.swing.JFrame {

     public static final String[] tipo = {" Escolha um Cálculo "," Calcular o Desconto "," Calcular o Tempo "};
    public static final String[] acao = {" Oque quer fazer ? ", " Escolher outro Cálculo "," Limpar Dados "};
      public static final String[] acao2 = {" Oque quer fazer ? ", " Escolher outro Cálculo "," Limpar Dados "};
     String nome;
     int valor;
     int valor2;
     int valor3;
     
     public DescontoComercial() {
        initComponents();
        
         setLocationRelativeTo(null);
         campo_taxa2.setEditable(false);
                campo_titulo2.setEditable(false);
                campo_desconto.setEditable(false);
        
        campo_tempo.setEditable(false);
        campo_taxa.setEditable(false);
        campo_titulo.setEditable(false);
        
        campo_desconto.setDocument(new Teclas1());
        campo_taxa.setDocument(new Teclas1());
        campo_taxa2.setDocument(new Teclas1());
        campo_tempo.setDocument(new Teclas1());
        campo_titulo.setDocument(new Teclas1());
        campo_titulo2.setDocument(new Teclas1());
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campo_titulo = new javax.swing.JTextField();
        campo_taxa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campo_tempo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campo_desconto = new javax.swing.JTextField();
        campo_taxa2 = new javax.swing.JTextField();
        campo_titulo2 = new javax.swing.JTextField();
        box_calculo = new javax.swing.JComboBox(tipo);
        box_acao = new javax.swing.JComboBox(acao);
        botao_calcular = new javax.swing.JButton();
        botao_tempo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto2 = new javax.swing.JTextArea();
        box_opcao = new javax.swing.JComboBox(acao2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CALCULAR O DESCONTO COMERCIAL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("OBS: A UNIDADE DE TEMPO E DA TAXA DEVEM ESTAR AS MESMAS .  ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("VALOR DO TITULO :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("VALOR DA TAXA ( % ) :");

        campo_titulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campo_titulo.setEnabled(false);

        campo_taxa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campo_taxa.setToolTipText("");
        campo_taxa.setEnabled(false);
        campo_taxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_taxaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("VALOR DO TEMPO :");

        campo_tempo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campo_tempo.setEnabled(false);
        campo_tempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_tempoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("VALOR JÁ COM DESCONTO :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("VALOR DA TAXA ( % ) :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("VALOR DO TITULO :");

        campo_desconto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campo_desconto.setEnabled(false);
        campo_desconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_descontoActionPerformed(evt);
            }
        });

        campo_taxa2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campo_taxa2.setEnabled(false);

        campo_titulo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campo_titulo2.setEnabled(false);

        box_calculo.setBackground(new java.awt.Color(51, 51, 255));
        box_calculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box_calculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_calculoActionPerformed(evt);
            }
        });

        box_acao.setBackground(new java.awt.Color(51, 51, 255));
        box_acao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box_acao.setEnabled(false);
        box_acao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_acaoActionPerformed(evt);
            }
        });

        botao_calcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_calcular.setText("DESCONTO");
        botao_calcular.setEnabled(false);
        botao_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_calcularActionPerformed(evt);
            }
        });

        botao_tempo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_tempo.setText("TEMPO ");
        botao_tempo.setEnabled(false);
        botao_tempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_tempoActionPerformed(evt);
            }
        });

        texto1.setEditable(false);
        texto1.setBackground(new java.awt.Color(240, 240, 240));
        texto1.setColumns(20);
        texto1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        texto1.setRows(5);
        texto1.setBorder(null);
        jScrollPane1.setViewportView(texto1);

        texto2.setEditable(false);
        texto2.setBackground(new java.awt.Color(240, 240, 240));
        texto2.setColumns(20);
        texto2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        texto2.setRows(5);
        jScrollPane2.setViewportView(texto2);

        box_opcao.setBackground(new java.awt.Color(51, 51, 255));
        box_opcao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box_opcao.setEnabled(false);
        box_opcao.setFocusable(false);
        box_opcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_opcaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(190, 190, 190))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)
                                .addComponent(campo_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(box_acao, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao_calcular)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(box_opcao, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(campo_taxa))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel6))))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_desconto)
                            .addComponent(campo_titulo2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(campo_taxa2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(box_calculo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(box_calculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(campo_desconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_taxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(campo_taxa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(campo_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_opcao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_acao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void box_calculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_calculoActionPerformed
   
        valor = box_calculo.getSelectedIndex();
        
        switch (valor){
            
            case 1:
                box_calculo.setEnabled(false);
                campo_taxa.setEnabled(true);
                campo_tempo.setEnabled(true);
                campo_titulo.setEnabled(true);
                campo_titulo.requestFocus();
                botao_calcular.setEnabled(true);
                campo_titulo.setEditable(true);
                campo_taxa.setEditable(true);
                campo_tempo.setEditable(true);
                
                
                
                break;
            
            case 2:
                 box_calculo.setEnabled(false);
                campo_taxa2.setEnabled(true);
                campo_titulo2.setEnabled(true);
                campo_desconto.setEnabled(true);
                botao_tempo.setEnabled(true);
                 campo_taxa2.setEditable(true);
                campo_titulo2.setEditable(true);
                campo_desconto.setEditable(true);
                break;
        }
        
        
        
    }//GEN-LAST:event_box_calculoActionPerformed

    private void botao_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_calcularActionPerformed
      
        DecimalFormat calc = new DecimalFormat(" R$ ##.###### ");
        Valores a = new Valores();
        
        a.setNominal(Double.parseDouble(campo_titulo.getText()));
        a.setTaxa(Double.parseDouble(campo_taxa.getText()));
        a.setTempo(Double.parseDouble(campo_tempo.getText()));
        
        a.setDesconto(a.getNominal()*a.getTempo()*(a.getTaxa()/100));
        
        a.setLiquido(a.getNominal()- a.getDesconto());
        
        texto1.setText("\n O valor do Titulo = "+a.getNominal()
                +"\n O valor do Desconto = "+calc.format(a.getDesconto())+
                "\n O valor Liquido do Titulo = "+calc.format(a.getLiquido()));
        
        botao_calcular.setEnabled(false);
            campo_tempo.setEditable(false);
        campo_taxa.setEditable(false);
        campo_titulo.setEditable(false);
        box_acao.setEnabled(true);
        
        
    }//GEN-LAST:event_botao_calcularActionPerformed

    private void campo_tempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_tempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_tempoActionPerformed

    private void campo_taxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_taxaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_taxaActionPerformed

    private void box_opcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_opcaoActionPerformed
      valor2 = box_opcao.getSelectedIndex();
      
      switch (valor2){
          
          case 1:
                box_calculo.setEnabled(true);
                campo_taxa2.setEnabled(false);
                campo_titulo2.setEnabled(false);
                campo_desconto.setEnabled(false);
              
              campo_desconto.setText("");
              campo_titulo2.setText("");
              campo_taxa2.setText("");
              texto2.setText("");
              botao_tempo.setEnabled(false);
              box_opcao.setEnabled(false);
              campo_desconto.requestFocus();
              break;
              
          case 2:
               campo_desconto.setText("");
              campo_titulo2.setText("");
              campo_taxa2.setText("");
              texto2.setText("");
              botao_tempo.setEnabled(true);
              box_opcao.setEnabled(false);
               campo_taxa2.setEditable(true);
                campo_titulo2.setEditable(true);
                campo_desconto.setEditable(true);
                 campo_desconto.requestFocus();
              break;
              
      }
      
    }//GEN-LAST:event_box_opcaoActionPerformed

    private void botao_tempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_tempoActionPerformed
        
        Valores b = new Valores ();
        
        b.setNominal2(Double.parseDouble(campo_desconto.getText()));
        b.setTaxa2(Double.parseDouble(campo_taxa2.getText()));
        b.setLiquido2(Double.parseDouble(campo_titulo2.getText()));
        
        b.setTempo2((b.getNominal2()/b.getLiquido2()-1)/(-b.getTaxa2()/100));
        
        texto2.setText("o valor de b "+(b.getTempo2()));
        
        box_opcao.setEnabled(true);
        botao_tempo.setEnabled(false);
    }//GEN-LAST:event_botao_tempoActionPerformed

    private void campo_descontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_descontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_descontoActionPerformed

    private void box_acaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_acaoActionPerformed
        
       valor3 = box_acao.getSelectedIndex();
       
       switch (valor3){
           
           case 1:
               
                 box_calculo.setEnabled(true);
                campo_taxa.setEnabled(false);
                campo_titulo.setEnabled(false);
                campo_tempo.setEnabled(false);
              
              campo_tempo.setText("");
              campo_titulo.setText("");
              campo_taxa.setText("");
              texto1.setText("");
              botao_calcular.setEnabled(false);
              box_acao.setEnabled(false);
              campo_titulo.requestFocus();
               break;
               
               
           case 2:
               
               campo_tempo.setText("");
              campo_titulo.setText("");
              campo_taxa.setText("");
              texto1.setText("");
              botao_calcular.setEnabled(true);
              box_acao.setEnabled(false);
               campo_taxa.setEditable(true);
                campo_titulo.setEditable(true);
                campo_tempo.setEditable(true);
                 campo_titulo.requestFocus();
               
               
               break;
           
           
           
       }
        
    }//GEN-LAST:event_box_acaoActionPerformed

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
            java.util.logging.Logger.getLogger(DescontoComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DescontoComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DescontoComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DescontoComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DescontoComercial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_calcular;
    private javax.swing.JButton botao_tempo;
    private javax.swing.JComboBox box_acao;
    private javax.swing.JComboBox box_calculo;
    private javax.swing.JComboBox box_opcao;
    private javax.swing.JTextField campo_desconto;
    private javax.swing.JTextField campo_taxa;
    private javax.swing.JTextField campo_taxa2;
    private javax.swing.JTextField campo_tempo;
    private javax.swing.JTextField campo_titulo;
    private javax.swing.JTextField campo_titulo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea texto1;
    private javax.swing.JTextArea texto2;
    // End of variables declaration//GEN-END:variables
}