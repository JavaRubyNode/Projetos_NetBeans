
package conversor;

import javax.swing.JOptionPane;


public class Temperatura extends javax.swing.JFrame {

    Limite a = new Limite();
    
    
    
    public Temperatura() {
        initComponents();
        tf_texto.setEditable(false);
        b_limpar.setEnabled(false);
         setLocationRelativeTo(null);
        tf_x.setDocument(new Teclas());
        tf_z.setDocument(new Teclas());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_texto = new javax.swing.JTextArea();
        b_limite1 = new javax.swing.JButton();
        b_limite2 = new javax.swing.JButton();
        tf_z = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        b_limpar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_x = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE LIMITE ");
        setBackground(new java.awt.Color(0, 0, 255));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText(" Calcular o seguinte Limite  1- Lim x ² - 4 / x-2");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("X -> Z");

        tf_texto.setColumns(20);
        tf_texto.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        tf_texto.setRows(5);
        tf_texto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESOLUÇÃO DO LIMITE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jScrollPane1.setViewportView(tf_texto);

        b_limite1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_limite1.setText("LIMITE ( 1 )");
        b_limite1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limite1ActionPerformed(evt);
            }
        });

        b_limite2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_limite2.setText("LIMITE ( 2 )");
        b_limite2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limite2ActionPerformed(evt);
            }
        });

        tf_z.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("De um valor para Z e achar o limite :");

        b_limpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_limpar.setText("LIMPAR");
        b_limpar.setEnabled(false);
        b_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limparActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("De um valor para Y e achar o limite :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("X -> Y");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Calcular o seguinte Limite 2 - Lim x ²  - 5x  + 6  /  x - 2 ");

        tf_x.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("SISTEMA DE CALCULO DE LIMITES ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(tf_x, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_limite2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(tf_z, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(b_limite1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(b_limite2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(b_limite1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_limite1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limite1ActionPerformed
        a.setX(Float.parseFloat(tf_z.getText()));

        if(a.getX()== 2){

            tf_texto.setText(" Tendo o Lim x ² - 4  /  x - 2 "+
                "\n e usando a tendência x -> "+a.getX()+" Calculando ficando assim :"+
                "\n -----------------------------------"+
                "\n Como essa tendência zera a função temos que fazer fatoração :"+
                "\n Lembrando que a ² - b ² , = ( a - b ) . ( a + b ) "+
                "\n Então ficando o cálculo : "+
                "\n ---------------------------------"+
                "\n Podemos escrever x ² - 4  =  x ² - 2 ² , logo "+
                "\n Lim ( x - 2 ).( x + 2 )  /  x - 2 "+
                "\n Cortamos x - 2 com x - 2 , ficando assim "+
                "\n Lim x + 2 , tendo um resultado : "+
                "\n Lim = 4 , pois 2 + 2 = 4 ");
        }else{
          tf_texto.setText(" Tendo o Lim x ² - 4  /  x - 2 "+
            "\n e usando a tendência x -> "+a.getX()+" Calculando ficando assim :"+
            "\n -----------------------------------"+
            "\n Lim "+(int)a.getX()+" ² - 4  /  "+(int)a.getX()+" - 2 "+
            "\n Lim "+(int)a.getX()*(int)a.getX()+" - 4  /  "+(int)(a.getX()-2)+
            "\n Lim "+((int)a.getX()*a.getX()-4)+"  /  "+(int)(a.getX()-2)+
            "\n Lim  x ² - 4  /  x - 2 , fica  :"+
            "\n Lim = "+((int)a.getX()*(int)a.getX()-4)/((int)a.getX()-2));  
        }

        
        
        
        b_limpar.setEnabled(true);

    }//GEN-LAST:event_b_limite1ActionPerformed

    private void b_limite2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limite2ActionPerformed
        a.setZ(Float.parseFloat(tf_x.getText()));
        
        if ( a.getZ() == 2){
            tf_texto.setText(" Tendo o Lim x ² - 5x + 6  /  x - 2 "+ 
                "\n e usando a tendência x -> "+a.getZ()+"  Calculando ficando assim : "+
                    "\n -------------------------------"+
                    "\n Como a tendência zera a funçao temos que aplicar a regra do Delta "+
                    "\n Onde acha as raizes da função do 2º "+
                    "\n e usando a seguinte formula a.( x - x1 ).( x - x2 )"+
                    "\n Sendo x1 = raiz 1 , e x2 = raiz 2 "+
                    "\n Calculando as raizes de f( x )= x ² - 5x + 6 , fica : "+
                    "\n ---------------------------------"+
                    "\n delta = b² - 4 . a . c "+
                    "\n delta = ( - 5 )² - 4 . 6 . 1  "+
                    "\n delta = 25 - 24 "+
                    "\n delta = 1 "+
                    "\n ---------------------------------"+
                    "\n Calculando as raizes fica : "+
                    "\n x' = - b + 1 / 2 . 1 "+
                    "\n x' = 5 + 1 / 2 "+
                    "\n x' = 3 "+
                    "\n x'' = - b - 1 / 2 . 1 "+
                    "\n x'' = 5 - 1 / 2 "+
                    "\n x'' =  2 "+
                    "\n ----------------------------------"+
                    "\n Substituindo na formula a.( x - x1 ).( x - x2 ), fica : "+
                    "\n ( x - 3 ).( x - 2 )"+
                    "\n Lim x ² - 5x + 6  /  x - 2"+
                    "\n Lim ( x - 3 ).( x - 2 ) / x - 2 "+
                    "\n Lim = cancelando x - 2 com,  x - 2 , fica :  "+
                    "\n Lim x - 3 , ficando "+
                    "\n Lim = - 2 ");
            
        }else {
           tf_texto.setText(" Tendo o Lim x ² - 5x + 6  /  x - 2 "+ 
                "\n e usando a tendência x -> "+a.getZ()+"  Calculando ficando assim : "+
                "\n -----------------------------------"+
                "\n Lim "+a.getZ()+" ² - 5 ."+a.getZ()+" + 6  /  "+a.getZ() +" - 2"+
                "\n Lim "+(a.getZ()*a.getZ())+" - ( "+(a.getZ()*5 )+ " ) + 6  / "+(a.getZ()-2)+
                "\n Lim x ² - 5x + 6  /  x - 2 , fica : "+
                "\n Lim = "+((Math.pow(a.getZ(),2)-(5*a.getZ()+6))/(a.getZ()-2))); 
        }
        
        
        
        
        
        
        
        b_limpar.setEnabled(true);
        
    }//GEN-LAST:event_b_limite2ActionPerformed

    private void b_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limparActionPerformed
        tf_texto.setText("");
        tf_x.setText("");
        tf_z.setText("");
        b_limpar.setEnabled(false);
        tf_x.requestFocus();
    }//GEN-LAST:event_b_limparActionPerformed

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
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Temperatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_limite1;
    private javax.swing.JButton b_limite2;
    private javax.swing.JButton b_limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tf_texto;
    private javax.swing.JTextField tf_x;
    private javax.swing.JTextField tf_z;
    // End of variables declaration//GEN-END:variables
}
