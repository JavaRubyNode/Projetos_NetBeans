
package sistemaconcurso;

/**
 *
 * @author VINICIUS
 */
public class TeoriaQuadratica extends javax.swing.JInternalFrame {

   public final String[] nome ={"Escolha uma Opção abaixo"," Definição da Função Quadratica "," Situações que aparece a Função Quadratica "," Gráfico da Função"," Raizes da Função",
       "Coordenadas do Vértice da Parábola"," Inequação do 2º grau "};
   
   
   
   
    public TeoriaQuadratica() {
        initComponents();
        setLocation(200, 20);
        
    }

    
    //------------ Metodo Definição---------------------------------------------------------------
    public void definicao(){
        
       String des =" Uma função f: IR -> R chama -se Quadratica quando existem números reais A, B, C"+
               "\n com A sendo diferente de zero tal que f ( x ) = ax² +bx +c  "+
               "\n Exemplo de Função : "
               + "\n 1 - f ( x ) = - x² +100x , onde:  a = -1 , b =100 e c=0"+
               " \n 2 - f( x ) = x² - 4, onde : a = 1 , b = 0 , c = -4"+
               "\n -----------------------------------------------------------------------------------"+
               "\n Para você refletir : Por que as 2  funções abaixo não são quadratica ? "+
               "\n 1 - f( x ) = 2x "+"\n 2 - f( x ) = x³ +2x² +x +1";
        
        texto.setText(des);
        
        
    }//------------------- Fim do Metodo ------------------------------------------------------------
    
    
    public void situacoes(){
        
        String aux="  Na Geometria por exemplo usa - se função Quadratica  "+
                "\n Num poligono convexo pode calcular o numero de diagonais usando a formula :"+
                "\n d ( n ) = n² - 3n / 2 "+"\n Onde : d( n ) = numero de diagonais , n = o numero de lados"+
                "\n -------------------------------------------------------------------------------------------------------"+
                "\n Outro exemplo a ser comentado e Calcular área de um Quadrado regular e de Retângulo "+
                "\n Área de um quadrado e dada por A = L . L -> L² "+
                "\n Área do Retângulo e dada A = B . H ";
        
        texto.setText(aux);
        
    }
    
    
  //-------- Metodo para escolher da Box -----------------
    
  public void escolherOpcao( ){
     
      int index;
      index =box_nome.getSelectedIndex();
            
      switch (index){
          
          case 1:
   
              definicao();
      
              break;
          
          case 2:
             
              situacoes();
              
              break;
              
          case 3:
              
              
              break;
              
          case 4:
              
              
              break;
              
          case 5:
              
              
              break;
              
          
      }
      
      
  }//-------------------------------------------------------------
  
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        box_nome = new javax.swing.JComboBox(nome);
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("TELA DA TEORIA DA EQUAÇÃO DO 2º GRAU");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        box_nome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        box_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_nomeActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mostar Teoria", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(box_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(box_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
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

    private void box_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_nomeActionPerformed
        
        
        escolherOpcao();
        
        
        
        
    }//GEN-LAST:event_box_nomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box_nome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
