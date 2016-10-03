

package sistema;

/**
 *
 * @author VINICIUS
 */
public class Distancia2 extends javax.swing.JInternalFrame {

        
    double a, b, c, d, x, w, i, l, m;
    String num;
        
    public Distancia2() {
        
        initComponents();
        texto1.setEditable(false);
        texto2.setEditable(false);
        
        campo_a.setDocument(new Teclas2());
        campo_b.setDocument(new Teclas2());
        campo_c.setDocument(new Teclas2());
        campo_d.setDocument(new Teclas2());
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campo_a = new javax.swing.JTextField();
        campo_b = new javax.swing.JTextField();
        campo_c = new javax.swing.JTextField();
        campo_d = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto2 = new javax.swing.JTextArea();
        botao_distancia = new javax.swing.JButton();
        botao_equação = new javax.swing.JButton();
        botao_limpar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("( 1 ) - PONTO  DE VALOR DE X : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("( 1 ) - PONTO DE VALOR DE Y : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("( 2 ) - PONTO DE VALOR DE X :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("( 2 ) - PONTO DE VALOR DE Y :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("DIGITE 2 PONTOS DE UMA RETA , EX : 1° ( x , y ) , 2° ( x , y ) = ");

        campo_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_dActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CALCULO DA DISTÂNCIA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        texto1.setColumns(20);
        texto1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        texto1.setRows(5);
        texto1.setEnabled(false);
        jScrollPane1.setViewportView(texto1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CALCULO DA EQUAÇÃO ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        texto2.setColumns(20);
        texto2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        texto2.setRows(5);
        texto2.setEnabled(false);
        jScrollPane2.setViewportView(texto2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );

        botao_distancia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao_distancia.setText("CALCULO DA DISTÂNCIA");
        botao_distancia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao_distancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_distanciaActionPerformed(evt);
            }
        });

        botao_equação.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao_equação.setText("CALCULO DA EQUAÇÃO ");
        botao_equação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_equaçãoActionPerformed(evt);
            }
        });

        botao_limpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botao_limpar.setText("LIMPAR");
        botao_limpar.setEnabled(false);
        botao_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_limparActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/formula.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_a, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_b, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_d, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_c, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39)
                        .addComponent(botao_distancia)
                        .addGap(18, 18, 18)
                        .addComponent(botao_equação)
                        .addGap(57, 57, 57)
                        .addComponent(botao_limpar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botao_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botao_equação, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botao_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campo_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campo_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_dActionPerformed

    private void botao_distanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_distanciaActionPerformed
       
        a = Double.parseDouble(campo_a.getText());
        b = Double.parseDouble(campo_b.getText());
        c = Double.parseDouble(campo_c.getText());
        d = Double.parseDouble(campo_d.getText());

// i = inclinação da reta         
        i = ((d - b) / (c - a));
        l = (a - c);
	m = (b - d);
	w = (l * l) + (m * m);

	x = b - (i * a);
        
        texto1.setText(" Daremos a solução para achar :  "+
                "\n A Inclinação da Reta = "+i+
                "\n A Distância entre os Pontos ( 1 )- ( "+a+" , "+b+" )"+
                "\n e o Ponto ( 2 )- ( "+c+" , "+d+" ) "+
                "\n -----------------------------------------------"+
                "\n Usando a formula acima :  "+
                "\n A Distancia fica = "+Math.sqrt(w));
        
        
        
       texto1.setEnabled(true);
       botao_limpar.setEnabled(true);
       campo_a.setEnabled(false);
       campo_b.setEnabled(false);
       campo_c.setEnabled(false);
       campo_d.setEnabled(false);

    }//GEN-LAST:event_botao_distanciaActionPerformed

    private void botao_equaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_equaçãoActionPerformed
        
        a = Double.parseDouble(campo_a.getText());
        b = Double.parseDouble(campo_b.getText());
        c = Double.parseDouble(campo_c.getText());
        d = Double.parseDouble(campo_d.getText());

// i = inclinação da reta         
        i = ((d - b) / (c - a));
        l = (a - c);
	m = (b - d);
	w = (l * l) + (m * m);

	x = b - (i * a);
        
        if(x<0){
           num = String.valueOf(i+"x - "+(x*(-1)));
        }if(x>0){
            num = String.valueOf(i+"x + "+x);
        }
        
        texto2.setText(" A Equação reta resultante dos pontos :"+
                "\n Equação e ax + b | a = inclinação , b = da equação ="+
                "\n ( 1 )- ( "+a+" , "+b+" )"+
                "\n ( 2 )- ( "+c+" , "+d+" )"+
                "\n Equação será = "+num);
        
       texto2.setEnabled(true);
       botao_limpar.setEnabled(true);
       campo_a.setEnabled(false);
       campo_b.setEnabled(false);
       campo_c.setEnabled(false);
       campo_d.setEnabled(false);
       
    }//GEN-LAST:event_botao_equaçãoActionPerformed

    private void botao_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_limparActionPerformed
        
        campo_a.setText("");
        campo_b.setText("");
        campo_c.setText("");
        campo_d.setText("");
        texto1.setText("");
        texto2.setText("");
       
        botao_limpar.setEnabled(false);
        campo_a.requestFocus();
       
        campo_a.setEnabled(true);
       campo_b.setEnabled(true);
       campo_c.setEnabled(true);
       campo_d.setEnabled(true);
       texto1.setEnabled(false);
       texto2.setEnabled(false);
       
    }//GEN-LAST:event_botao_limparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_distancia;
    private javax.swing.JButton botao_equação;
    private javax.swing.JButton botao_limpar;
    private javax.swing.JTextField campo_a;
    private javax.swing.JTextField campo_b;
    private javax.swing.JTextField campo_c;
    private javax.swing.JTextField campo_d;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea texto1;
    private javax.swing.JTextArea texto2;
    // End of variables declaration//GEN-END:variables
}
