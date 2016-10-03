
package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author VINICIUS
 */
public class Polinomio extends javax.swing.JInternalFrame {

   double a,b,opc,calc1,calc2,calc3,calc4,calc5,calc6;
    
    
    public Polinomio() {
        initComponents();
        
        campo_opc.setDocument(new Teclas3());
        campo_a.setDocument(new Teclas2());
        campo_b.setDocument(new Teclas2());
        texto.setEditable(false);
        
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
        campo_a = new javax.swing.JTextField();
        campo_b = new javax.swing.JTextField();
        botao_ok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campo_opc = new javax.swing.JTextField();
        botao_calcular = new javax.swing.JButton();
        botao_limpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle(" CALCULOS DE POLINÔMIO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("DE UM VALOR PARA \" A \" = ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("DE UM VALOR PARA \" B \" = ");

        botao_ok.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao_ok.setText("OK ? ");
        botao_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_okActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("ESCOLHAS UM DOS POLINÔMIIOS ABAIXO : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("( 1 ) =>    ( a + b ) ²  :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("( 2 ) =>    ( a - b ) ² :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("( 3 ) =>    a² - b² :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("( 4 ) =>   ( a + b ) ³ :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("( 5 ) =>   ( a - b )³ :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("( 6 ) =>    a³ - b³ :");

        campo_opc.setEnabled(false);

        botao_calcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao_calcular.setText("CALCULAR");
        botao_calcular.setEnabled(false);
        botao_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_calcularActionPerformed(evt);
            }
        });

        botao_limpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao_limpar.setText("LIMPAR ");
        botao_limpar.setEnabled(false);
        botao_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_limparActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MOSTAR AS FORMULAS E CALCULOS ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        texto.setRows(5);
        texto.setEnabled(false);
        jScrollPane1.setViewportView(texto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_a, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_b, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(botao_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel5)
                                    .addComponent(campo_opc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botao_calcular)
                                        .addGap(30, 30, 30)
                                        .addComponent(botao_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campo_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(campo_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(campo_opc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_okActionPerformed

        botao_calcular.setEnabled(true);
        campo_opc.setEnabled(true);
        campo_opc.requestFocus();
      campo_a.setEnabled(false);
      campo_b.setEnabled(false);
      
        
    }//GEN-LAST:event_botao_okActionPerformed

    private void botao_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_calcularActionPerformed
       
          a = Double.parseDouble(campo_a.getText());
          b = Double.parseDouble(campo_b.getText());
        
          opc = Double.parseDouble(campo_opc.getText());
          
        if(opc<1){
            Ver(" Opção incorreta !!!  informe a opcção correta ");
            campo_opc.setText("");
            campo_opc.requestFocus();
        }if(opc>6){
            Ver(" Opção incorreta !!!  informe a opcção correta ");
            campo_opc.setText("");
            campo_opc.requestFocus();
        }if(opc==1){
            texto.setText(" Você escolheu ( 1 ) => ( a + b ) ² "+
                    "\n esse Polinômio tem a seguite Fatoração : "+
                    "\n ( a + b ) ² = a² + 2ab + b² "+
                    "\n Jogando o valor de a = "+a+
                    "\n Jogando o valor de b = "+b+
                    "\n ---------------------------------------"+
                    "\n (  "+a+" + "+b+" )² = "+a+"² + 2."+a+"."+b+" + "+b+"²"+
                    "\n (  "+a+" + "+b+" )² = "+(a*a)+" + "+(2*a*b)+" + "+(b*b)+
                    "\n (  "+a+" + "+b+" )² = "+((a*a)+(2*a*b)+(b*b)));
            
        }if(opc==2){
            texto.setText(" Você escolheu ( 2 ) => ( a - b ) ² "+
                    "\n esse Polinômio tem a seguinte Fatoração : "+
                    "\n ( a - b ) ² = a² - 2ab + b² "+
                    "\n Jogando o valor de a = "+a+
                    "\n Jogando o valor de b = "+b+
                    "\n -----------------------------------------"+
                    "\n (  "+a+" - "+b+" )² = "+a+"² - 2."+a+"."+b+" + "+b+"²"+
                    "\n (  "+a+" - "+b+" )² = "+(a*a)+" - "+(2*a*b)+" + "+(b*b)+
                    "\n (  "+a+" - "+b+" )² = "+((a*a)-(2*a*b)+(b*b)));
            
        }if(opc==3){
            texto.setText(" Você escolheu ( 3 ) => a² - b² "+
                    "\n esse Polinômio tem a seguinte Fatoração : "+
                    "\n a² - b² = ( a - b ) . ( a + b )"+
                    "\n Jogando o valor de a = "+a+
                    "\n Jogando o valor de b = "+b+
                    "\n --------------------------------------------"+
                    "\n a² - b² = ( "+a+" - "+b+" ) . ( "+a+" + "+b+" ) "+
                    "\n a² - b² = "+" ("+(a-b)+" ) . ( "+(a+b)+" ) " +
                    "\n a² - b² = "+((a-b)*(a+b)));
            
        }if(opc==4){
            texto.setText(" Você escolheu ( 4 ) => ( a + b ) ³ "+
                    "\n esse Polinômio tem a seguinte Fatoração : "+
                    "\n( a + b ) ³ = a³ + 3a²b + 3ab² + b³"+   
                    "\n Jogando o valor de a = "+a+
                    "\n Jogando o valor de b = "+b+
                    "\n ----------------------------------------------"+
                    "\n ( a + b ) ³ = "+a+"³"+" + 3."+a+"²."+b+" + 3."+a+"."+b+"² + "+b+"³"+
                    "\n ( a + b ) ³ = "+(a*a*a)+" + 3."+(a*a)+"."+b+" + 3."+a+"."+(b*b)+" + "+(b*b*b)+
                    "\n ( a + b ) ³ = "+((a*a*a)+(a*a*3*b)+(3*a*b*b)+(b*b*b)));
            
            
        }if(opc==5){
            texto.setText(" Você escolheu ( 5 ) => ( a - b )³ "+
                    "\n esse Polinômio tem a seguinte Fatoração : "+
                    "\n ( a - b ) ³ = a³ - 3a²b + 3ab² - b³ "+
                    "\n Jogando o valor de a = "+a+
                    "\n Jogando o valor de b = "+b+
                    "\n ----------------------------------------------"+
                    "\n ( a - b ) ³ = "+a+"³"+" - 3."+a+"²."+b+" + 3."+a+"."+b+"² - "+b+"³"+
                    "\n ( a - b ) ³ = "+(a*a*a)+" - 3."+(a*a)+"."+b+" + 3."+a+"."+(b*b)+" - "+(b*b*b)+
                    "\n ( a - b ) ³ = "+((a*a*a)-(a*a*3*b)+(3*a*b*b)-(b*b*b))); 
            
        }if(opc==6){
            texto.setText(" Você escolheu ( 6 ) => a³ - b³ "+
                    "\n esse Polinômio tem a seguinte Fatoração : "+
                    "\n a³ - b³ = ( a + b )  . ( a² - ab + b² )"+
                    "\n Jogando o valor de a = "+a+
                    "\n Jogando o valor de b = "+b+
                    "\n -------------------------------------------------"+
                    "\n a³ - b³ = "+" ( "+a+" + "+b+" ) . ( "+a+"² - "+a+"."+b+" + "+b+"²"+" )"+
                    "\n a³ - b³ = "+" ( "+(a+b)+" ) . ( "+(a*a)+" - "+(a+b)+" + "+(b*b)+" ) "+
                    "\n a³ - b³ = "+(( a+b )*((a*a)-(a-b)+(b*b)))); 
        }
            
     texto.setEnabled(true);
     botao_limpar.setEnabled(true);
        
    }//GEN-LAST:event_botao_calcularActionPerformed

    private void botao_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_limparActionPerformed
        
        campo_a.setText("");
        campo_b.setText("");
        campo_opc.setText("");
        texto.setText("");
        botao_limpar.setEnabled(false);
        campo_a.requestFocus();
        botao_calcular.setEnabled(false);
        campo_opc.setEnabled(false);
        texto.setEnabled(false);
        campo_a.setEnabled(true);
      campo_b.setEnabled(true);
        
    }//GEN-LAST:event_botao_limparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_calcular;
    private javax.swing.JButton botao_limpar;
    private javax.swing.JButton botao_ok;
    private javax.swing.JTextField campo_a;
    private javax.swing.JTextField campo_b;
    private javax.swing.JTextField campo_opc;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
