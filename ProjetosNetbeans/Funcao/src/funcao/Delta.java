

package funcao;

import javax.swing.JOptionPane;

/**
 *
 * @author VINICIUS
 */
public class Delta extends javax.swing.JFrame {

    double a,b,c,delta,x1,x2,xv,yv;
    
    
    
    public Delta() {
        initComponents();
        setLocationRelativeTo(null);
        
        tfdelta.setEditable(false);
        tfVerticex.setEditable(false);
        tfVerticey.setEditable(false);
        tf_equacao.setEditable(false);
        tfraiz1.setEditable(false);
        tfraiz2.setEditable(false);
        tf_equacao.setEditable(false);
        
        setResizable(false);
        
        tfvalor1.setDocument(new Teclas());
        tfvalor2.setDocument(new Teclas());
        tfvalor3.setDocument(new Teclas());
        
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfvalor1 = new javax.swing.JTextField();
        tfvalor2 = new javax.swing.JTextField();
        tfvalor3 = new javax.swing.JTextField();
        tfdelta = new javax.swing.JTextField();
        b_calcular = new javax.swing.JButton();
        b_limpar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfraiz1 = new javax.swing.JTextField();
        tfraiz2 = new javax.swing.JTextField();
        tfVerticey = new javax.swing.JTextField();
        tfVerticex = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_equacao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema para F( x ) = ax² + bx + c ");
        setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setToolTipText("Sistema para Calculo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CALCULAR FUNÇÃO DO 2º GRAU");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Valor para A :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Valor para B :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Valor para C :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Delta =");

        tfvalor1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tfvalor2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tfvalor3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tfdelta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfdelta.setEnabled(false);

        b_calcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_calcular.setText("CALCULAR");
        b_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_calcularActionPerformed(evt);
            }
        });
        b_calcular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b_calcularKeyPressed(evt);
            }
        });

        b_limpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_limpar.setText("LIMPAR");
        b_limpar.setEnabled(false);
        b_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limparActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Sendo uma função do segundo 2° genérica =  ax²  + bx + c  ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("De valores abaixo para achar suas raizes ,");

        tfraiz1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfraiz1.setEnabled(false);
        tfraiz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfraiz1ActionPerformed(evt);
            }
        });

        tfraiz2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfraiz2.setEnabled(false);

        tfVerticey.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfVerticey.setEnabled(false);

        tfVerticex.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfVerticex.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("1º raiz = x1 :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("2° raiz = x2 : ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("x do vertice :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("y do vertice :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("A equação digita foi =");

        tf_equacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_equacao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tf_equacao.setEnabled(false);
        tf_equacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_equacaoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SAIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_equacao, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(b_calcular)
                        .addGap(18, 18, 18)
                        .addComponent(b_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfvalor3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel9)))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfraiz1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(tfraiz2)
                                    .addComponent(tfdelta)
                                    .addComponent(tfVerticey)
                                    .addComponent(tfVerticex))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfraiz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfraiz2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfvalor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfVerticey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfVerticex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_equacao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_calcularActionPerformed
        
        a = Double.parseDouble(tfvalor1.getText()); 
        b = Double.parseDouble(tfvalor2.getText());
        c = Double.parseDouble(tfvalor3.getText());
        
        
        delta = Math.pow(b, 2)-4*a*c;
     
        tfdelta.setText(String.valueOf(delta));
        
        
        if(delta<0){
           
            Ver(" Sendo o Delta negativo não existe solução "+
            "\n no campo dos reais, onde não tem raiz de numero negativo ");
          
       }
        if(delta==0){
            Ver(" Sendo o Delta igual a zero as raizes serão iguais ");
        }
        
        
       x1 = ((-b + Math.sqrt(delta)) / (2 * a));
      x2 = ((-b - Math.sqrt(delta)) / (2 * a));
      
        tfraiz1.setText(String.valueOf(x1));
        tfraiz2.setText(String.valueOf(x2));
        
       xv = (-(b) / (2 * a));
       yv = (-(delta) / (4 * a));
        
        tfVerticex.setText(String.valueOf(xv));
        tfVerticey.setText(String.valueOf(yv));
      
     if((a>0)&&(b>0)&&(c>0)){ // + + +
        tf_equacao.setText(String.valueOf(a+".x² "+" + "+b+".x + "+c));
        }if ((a<0)&&(b<0)&&(c<0)){ // - - -
            tf_equacao.setText(String.valueOf(a+".x² "+b+".x "+c));
        }if((a>0)&&(b<0)&&(c<0)){ // + - - 
            tf_equacao.setText(String.valueOf(a+".x² "+b+".x "+c));
        }if ((a<0)&&(b>0)&&(c<0)){ // - + -
        tf_equacao.setText(String.valueOf(a+".x² "+" + "+ b +".x "+c));
        }if ((a>0)&&(b>0)&&(c<0)){ // + + -
             tf_equacao.setText(String.valueOf(a+".x² "+" + "+b+".x "+c));
        }if((a>0)&&(b<0)&&(c>0)){ // + - +
             tf_equacao.setText(String.valueOf(a+".x² "+ b +".x "+c));
        }if((a<0)&&(b<0)&&(c>0)){ // - - +
             tf_equacao.setText(String.valueOf(a+".x² "+b+".x + "+c));
        }if((a<0)&&(b>0)&&(c>0)){ // - + + 
             tf_equacao.setText(String.valueOf(a+".x² "+" + "+b+".x + "+c));
        }if((a<0)&&(b>0)&&(c==0)){// - +
            tf_equacao.setText(String.valueOf(a+".x² "+" + "+b+".x "));
        }if((a>0)&&(b>0)&&(c==0)){// + +
            tf_equacao.setText(String.valueOf(a+".x² "+" + "+b+".x "));
        }if((a<0)&&(b<0)&&(c==0)){// - - 
            tf_equacao.setText(String.valueOf(a+".x² "+b+".x "));
        }if((a>0)&&(b<0)&&(c==0)){// + -
            tf_equacao.setText(String.valueOf(a+".x² "+b+".x "));
        }
        
        
       
       
        b_limpar.setEnabled(true);
        tfdelta.setEnabled(true);
        tfVerticex.setEnabled(true);
        tfVerticey.setEnabled(true);
        tf_equacao.setEnabled(true);
        tfraiz1.setEnabled(true);
        tfraiz2.setEnabled(true);
        tf_equacao.setEnabled(true);
        
    }//GEN-LAST:event_b_calcularActionPerformed

    private void tfraiz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfraiz1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfraiz1ActionPerformed

    private void b_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limparActionPerformed
        
        tfvalor1.setText("");
        tfvalor2.setText("");
        tfvalor3.setText("");
        tfdelta.setText("");
        tfraiz1.setText("");
        tfraiz2.setText("");
        tf_equacao.setText("");
        tfVerticex.setText("");
        tfVerticey.setText("");
        tfvalor1.requestFocus();
        
        
        b_limpar.setEnabled(false);
         tfdelta.setEnabled(false);
        tfVerticex.setEnabled(false);
        tfVerticey.setEnabled(false);
        tf_equacao.setEnabled(false);
        tfraiz1.setEnabled(false);
        tfraiz2.setEnabled(false);
        tf_equacao.setEnabled(false);
        
    }//GEN-LAST:event_b_limparActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b_calcularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_calcularKeyPressed
       
    }//GEN-LAST:event_b_calcularKeyPressed

    private void tf_equacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_equacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_equacaoActionPerformed

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
            java.util.logging.Logger.getLogger(Delta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_calcular;
    private javax.swing.JButton b_limpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfVerticex;
    private javax.swing.JTextField tfVerticey;
    private javax.swing.JTextField tf_equacao;
    private javax.swing.JTextField tfdelta;
    private javax.swing.JTextField tfraiz1;
    private javax.swing.JTextField tfraiz2;
    private javax.swing.JTextField tfvalor1;
    private javax.swing.JTextField tfvalor2;
    private javax.swing.JTextField tfvalor3;
    // End of variables declaration//GEN-END:variables
}
