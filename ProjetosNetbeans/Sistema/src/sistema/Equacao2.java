
package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author VINICIUS
 */
public class Equacao2 extends javax.swing.JInternalFrame {

    double a,b,c,delta,x1,x2,xv,yv,ver,deltas;
 String raiz1,del;
 
    public Equacao2() {
        initComponents();
        
    
        
// editar o formato de digitação 
        campo_a.setDocument(new Teclas());
        campo_b.setDocument(new Teclas());
        campo_c.setDocument(new Teclas());

// desativar os campos de texto 
           campo_x.setEditable(false);
        campo_y.setEditable(false);
      campo_equacao.setEditable(false);
        campo_x1.setEditable(false);
        campo_x2.setEditable(false);
        campo_delta.setEditable(false);
        texto.setEditable(false);
//        texto2.setEditable(false);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campo_a = new javax.swing.JTextField();
        campo_b = new javax.swing.JTextField();
        campo_c = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campo_x1 = new javax.swing.JTextField();
        campo_x2 = new javax.swing.JTextField();
        campo_delta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campo_y = new javax.swing.JTextField();
        campo_x = new javax.swing.JTextField();
        botao_calcular = new javax.swing.JButton();
        botao_limpar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        campo_equacao = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto2 = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("  CALCULAR RAIZES 2 º GRAU ");
        setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("De valores abaixo para achar suas raizes ,");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Sendo uma função do segundo 2° genérica =  ax²  + bx + c  ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("De o valor pra A : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("De o valor pra B :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("De o valor pra C :");

        campo_a.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        campo_b.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        campo_c.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campo_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("1º raiz = x1 :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("2° raiz = x2 : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Delta =");

        campo_x1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campo_x1.setEnabled(false);

        campo_x2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campo_x2.setEnabled(false);

        campo_delta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campo_delta.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("y do vertice :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("x do vertice :");

        campo_y.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campo_y.setEnabled(false);

        campo_x.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campo_x.setEnabled(false);

        botao_calcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao_calcular.setText("CALCULAR");
        botao_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_calcularActionPerformed(evt);
            }
        });

        botao_limpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao_limpar.setText("LIMPAR");
        botao_limpar.setEnabled(false);
        botao_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_limparActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("A equação digita foi : ");

        campo_equacao.setBackground(new java.awt.Color(204, 204, 204));
        campo_equacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campo_equacao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        campo_equacao.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        campo_equacao.setEnabled(false);
        campo_equacao.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        campo_equacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_equacaoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CÁLCULO DA F ( X ) ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        texto.setRows(5);
        texto.setEnabled(false);
        jScrollPane1.setViewportView(texto);

        texto2.setColumns(20);
        texto2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        texto2.setRows(5);
        texto2.setEnabled(false);
        jScrollPane2.setViewportView(texto2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botao_calcular)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_equacao, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_a, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_b, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_c, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(293, 293, 293)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_x, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_x2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_delta, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campo_x1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_y, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(campo_x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(campo_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(campo_x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(campo_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campo_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(campo_delta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(botao_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(campo_equacao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botao_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cActionPerformed

    private void botao_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_calcularActionPerformed
      
         a = Double.parseDouble(campo_a.getText()); 
        b = Double.parseDouble(campo_b.getText());
        c = Double.parseDouble(campo_c.getText());
        
        
        delta = (int)Math.pow(b, 2)-4*a*c;
        deltas = 4*a*c;
        
        campo_delta.setText(String.valueOf(delta));
        
        
        if(delta<0){
           
            Ver(" Sendo o Delta negativo não existe solução "+
            "\n no campo dos reais, onde não tem raiz de numero negativo ");
          
       }
        if(delta==0){
            Ver(" Sendo o Delta igual a zero as raizes serão iguais ");
        }
        
        
        x1 = ((-b + Math.sqrt(delta)) / (2 * a));
      x2 = ((-b - Math.sqrt(delta)) / (2 * a));
      
      
        campo_x1.setText(String.valueOf(x1));
        campo_x2.setText(String.valueOf(x2));
        
       xv = Math.round(-(b) / (2 * a));
       yv = Math.round(-(delta) / (4 * a));
        
        campo_x.setText(String.valueOf(xv));
        campo_y.setText(String.valueOf(yv));
      
// condiçao para formatar o texto         
        if((x1<0)&&(x2<0)){// - -
            raiz1 = String.valueOf(" Fatorada = "+(int)a+".( x + "+(int)(x1*(-1))+" ). ( x + "+(int)(x2*(-1))+" )");
        }if((x1>0)&&(x2>0)){// + +
            raiz1 = String.valueOf(" Fatorada = "+(int)a+".( x - "+(int)x1+" ). ( x - "+(int)x2+" )");
        }if((x1>0)&&(x2<0)){// + -
             raiz1 = String.valueOf(" Fatorada = "+(int)a+".( x - "+(int)x1+" ). ( x + "+(int)(x2*(-1))+" )");
        }if((x1<0)&&(x2>0)){// - +
            raiz1 = String.valueOf(" Fatorada = "+(int)a+".( x + "+(int)(x1*(-1))+" ). ( x - "+(int)x2+" )");
        }
 // condiçao para formatar a equaçao       
        if((a>0)&&(b>0)&&(c>0)){ // + + +
        campo_equacao.setText(String.valueOf((int)a+ "x² "+" + "+(int)b+"x + "+(int)c));
        }if ((a<0)&&(b<0)&&(c<0)){ // - - -
            campo_equacao.setText(String.valueOf((int)a+ "x² "+(int)b+ "x "+(int)c));
        }if((a>0)&&(b<0)&&(c<0)){ // + - - 
            campo_equacao.setText(String.valueOf((int)a+ "x² "+(int)b+ "x "+(int)c));
        }if ((a<0)&&(b>0)&&(c<0)){ // - + -
        campo_equacao.setText(String.valueOf((int)a+ "x² "+" + "+ (int)b + "x "+(int)c));
        }if ((a>0)&&(b>0)&&(c<0)){ // + + -
            campo_equacao.setText(String.valueOf((int)a+ "x² "+" + "+(int)b+ "x "+(int)c));
        }if((a>0)&&(b<0)&&(c>0)){ // + - +
            campo_equacao.setText(String.valueOf((int)a+ "x² "+ (int)b + "x + "+(int)c));
        }if((a<0)&&(b<0)&&(c>0)){ // - - +
             campo_equacao.setText(String.valueOf((int)a+ "x² "+(int)b+ "x + "+(int)c));
        }if((a<0)&&(b>0)&&(c>0)){ // - + + 
            campo_equacao.setText(String.valueOf((int)a+ "x² "+" + "+(int)b+ "x + "+(int)c));
        }if((a<0)&&(b>0)&&(c==0)){// - +
            campo_equacao.setText(String.valueOf((int)a+ "x² "+" + "+(int)b+ "x "));
        }if((a>0)&&(b>0)&&(c==0)){// + +
            campo_equacao.setText(String.valueOf((int)a+ "x² "+" + "+(int)b+ "x "));
        }if((a<0)&&(b<0)&&(c==0)){// - - 
            campo_equacao.setText(String.valueOf((int)a+" x² "+(int)b+" x "));
        }if((a>0)&&(b<0)&&(c==0)){// + -
            campo_equacao.setText(String.valueOf((int)a+" x² "+(int)b+" x "));
        }
       
        if(deltas>0){
            del = String.valueOf("Delta = "+(int)(b*b)+" - "+(int)deltas);
        }if(deltas<0){
            del = String.valueOf("Delta = "+(int)(b*b)+" + "+(int)(deltas*(-1))); 
        }
       
        
     
        texto.setText(" Tendo a F ( x ) = ax²  + bx + c ,forma genérica  "+
                "\n Ex: Equação seria = x²  + 3x + 4  "+
                "\n formula de Braskara para achar os seus valores :"+
                "\n Mostrando o cálculo da Equação digita : "+
                "\n F ( x ) = "+campo_equacao.getText()+
                "\n --------------------------------------------------------------------"+
                "\n Primeiro fazemos achamos o valor de Delta : "+
                "\n A formula é delta = b² - 4.a.c "+
                "\n ---------------------------------------------------------------------"+
                "\n Delta = "+(int)b+ " ² - 4 . "+(int)a+" . "+(int)c+
                "\n "+del+
                "\n Delta = "+(int)delta);
        
       
        texto2.setText(" Agora que temos o Delta = "+(int)delta+
                "\n acharemos as Raizes x1 , x2 com a formula : "+
                "\n x1 = - b + raiz de delta / 2.a "+
                "\n x2 = - b - raiz de delta / 2.a "+
                "\n ---------------------------------------"+
                "\n x1 = - ( "+(int)b+" ) + "+(int)delta+" / 2. "+(int)a+
                "\n x1 = "+(int)(-1*(b))+" + "+(int)Math.sqrt(delta)+" / "+(int)(2*a)+
                "\n x1 = "+(int)x1+
                "\n ----------------------------------------"+
                "\n x2 = - ( "+(int)b+" ) - "+(int)delta+" / 2. "+(int)a+
                "\n x2 = "+(int)(-1*(b))+" - "+(int)Math.sqrt(delta)+" / "+(int)(2*a)+
                "\n x2 = "+(int)x2+
                "\n -----------------------------------------"+
                "\n A Equação "+campo_equacao.getText()+
                "\n Fatorada fica : a.( x - x1 ).( x - x2 )"+
                "\n"+raiz1);
        
       
        botao_limpar.setEnabled(true);
        campo_delta.setEnabled(true);
        campo_x.setEnabled(true);
        campo_y.setEnabled(true);
        campo_equacao.setEnabled(true);
        campo_x1.setEnabled(true);
        campo_x2.setEnabled(true);
      texto.setEnabled(true);
        texto2.setEnabled(true);
        
        
        
    }                                          

                                       

    private void b_limparActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
       
    }//GEN-LAST:event_botao_calcularActionPerformed

    private void botao_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_limparActionPerformed
       
   
        
// limpar os campos de digitação    
        campo_a.setText("");
        campo_b.setText("");
        campo_c.setText("");
        campo_delta.setText("");
        campo_x1.setText("");
        campo_x2.setText("");
        campo_equacao.setText("");
        campo_x.setText("");
        campo_y.setText("");
         texto.setText("");
        campo_a.requestFocus();
        texto2.setText("");
        
        
// desabilitar os botões e area de texto 
        
        botao_limpar.setEnabled(false);
         campo_delta.setEnabled(false);
        campo_x.setEnabled(false);
       campo_y.setEnabled(false);
        campo_equacao.setEnabled(false);
        campo_x1.setEnabled(false);
        campo_x2.setEnabled(false);
        campo_equacao.setEnabled(false);
         texto.setEnabled(false);
        texto2.setEnabled(false);
        
    }//GEN-LAST:event_botao_limparActionPerformed

    private void campo_equacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_equacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_equacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_calcular;
    private javax.swing.JButton botao_limpar;
    private javax.swing.JTextField campo_a;
    private javax.swing.JTextField campo_b;
    private javax.swing.JTextField campo_c;
    private javax.swing.JTextField campo_delta;
    private javax.swing.JTextField campo_equacao;
    private javax.swing.JTextField campo_x;
    private javax.swing.JTextField campo_x1;
    private javax.swing.JTextField campo_x2;
    private javax.swing.JTextField campo_y;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea texto;
    private javax.swing.JTextArea texto2;
    // End of variables declaration//GEN-END:variables
}
