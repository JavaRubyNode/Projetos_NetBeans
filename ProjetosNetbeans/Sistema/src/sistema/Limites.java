
package sistema;

/**
 *
 * @author VINICIUS
 */
public class Limites extends javax.swing.JInternalFrame {

    double x,y;
  
    public Limites() {
        initComponents();
 texto.setEditable(false);
 campo_1.setDocument(new Teclas2());
 campo_2.setDocument(new Teclas2());
 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campo_2 = new javax.swing.JTextField();
        exemplo_1 = new javax.swing.JButton();
        exemplo_2 = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("LIMITES");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("EXEMPLOS DE LIMITES : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Exemplo 1 - Lim  x² - 9 / x - 3  , de um valor pra X :  ");

        campo_1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Exemplo 2 - Lim  x² -5x + 6 / x - 2 , de um valor para X :  ");

        campo_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        exemplo_1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exemplo_1.setText("EXEMPLO -1 ");
        exemplo_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exemplo_1ActionPerformed(evt);
            }
        });
        exemplo_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exemplo_1KeyPressed(evt);
            }
        });

        exemplo_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exemplo_2.setText("EXEMPLO - 2 ");
        exemplo_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exemplo_2ActionPerformed(evt);
            }
        });

        limpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        limpar.setText("LIMPAR");
        limpar.setEnabled(false);
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MOSTRAR CÁLCULOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campo_1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(exemplo_1)
                                .addGap(33, 33, 33)
                                .addComponent(exemplo_2)
                                .addGap(36, 36, 36)
                                .addComponent(limpar)))
                        .addGap(0, 157, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exemplo_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exemplo_2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exemplo_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exemplo_1ActionPerformed
        x = Double.parseDouble(campo_1.getText());
        
        if (x == 3){
            texto.setText(" O Lim X² - 9 / X - 3 , tendo uma tendência = "+x+
                    "\n irá zera a f( X ), então temos que fatorar essa F ( x )"+
                    "\n -----------------------------------------"+
                    "\n Sabendo que a² - b² = ( x - a ).( x + b )"+
                    "\n X² - 9 = X² - 3² "+
                    "\n então fica : "+
                    "\n ( x - 3 ). ( x + 3 ) / x - 3 "+
                    "\n Cortando os dois x - 3 , ficando apenas x + 3"+
                    "\n Lim x + 3 com tendência x -> "+x+
                    "\n Lim = 6 ");
        }else{
            texto.setText(" O Lim X ² - 9 / X - 3 , tendo uma tendência = "+x+
                    "\n Lim "+x+"² - 9 / "+x+" - 3 "+
                    "\n Lim "+(x*x)+" - 9 / "+(x-3)+
                    "\n Lim "+((x*x)-9)+" / "+(x-3)+
                    "\n Lim = "+((x*x)-9)/(x-3));
        }
        
        limpar.setEnabled(true);
        
        
        
    }//GEN-LAST:event_exemplo_1ActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
      
        campo_1.setText("");
        campo_2.setText("");
        texto.setText("");
        limpar.setEnabled(false);
        campo_1.requestFocus();
    }//GEN-LAST:event_limparActionPerformed

    private void exemplo_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exemplo_2ActionPerformed
       y = Double.parseDouble(campo_2.getText());
       
       if(y==2){
         texto.setText(" O Lim X² -5x + 6 / x - 2 , tendo uma tendência = "+y+
                 "\n irá zera a f( X ), então temos que fatorar essa F ( x )"+
                    "\n -----------------------------------------"+
                 "\n Assim Fatorando a F ( x ) =  x² -5x + 6 , temos : "+
                 "\n Que achar as raizes e jogar na formula a( x - x1 ).( x - x2 )"+
                 "\n Com as raizes x1 = 3 , x2 = 2  fica : "+
                 "\n ( x - 3 ).( x - 2 ) / x - 2 "+
                 "\n Cortamos os dois x - 2 e ficando : x - 3 "+
                 "\n Lim x - 3 , com tendência x -> "+y+
                 "\n Lim = - 1 ");  
       }else{
           texto.setText(" O Lim X² -5x + 6 / x - 2 , tendo uma tendência = "+y+
                   "\n Lim "+(int)y+"² - 5."+(int)y+" + 6 / "+y+" - 2 "+
                   "\n Lim "+(y*y)+" - "+((5*y)+6)+" / "+(y-2)+
                   "\n Lim "+((y*y)-((5*y)+6)+" / "+(y-2))+
                   "\n Lim = "+((y*y)-((5*y)+6))/(y-2));
       }
       
       
       
        
        
        limpar.setEnabled(true);
    }//GEN-LAST:event_exemplo_2ActionPerformed

    private void exemplo_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exemplo_1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_exemplo_1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_1;
    private javax.swing.JTextField campo_2;
    private javax.swing.JButton exemplo_1;
    private javax.swing.JButton exemplo_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpar;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
