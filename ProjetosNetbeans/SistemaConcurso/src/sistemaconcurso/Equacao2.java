
package sistemaconcurso;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author VINICIUS
 */
public class Equacao2 extends javax.swing.JInternalFrame {

 String raiz1=null;
         String del=null;
 
         
         
         
 
 FuncaoQuadritica d = new FuncaoQuadritica();
    DecimalFormat calc = new DecimalFormat(" ##.###");
 
 
    public Equacao2() {
        initComponents();
        
        setLocation(200, 20);
        
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
        texto2.setEditable(false);
    }

    
    
    //-------------- Inicio do Metodo Calcular Delta --------------------------------------------
    
    public double calcularDelta(){
        
        d.setA(Double.parseDouble(campo_a.getText()));
            d.setB(Double.parseDouble(campo_b.getText()));
                 d.setC(Double.parseDouble(campo_c.getText()));
        
        
             d.setValorDelta(Math.pow(d.getB(), 2));
                 d.setValorDelta2(4*d.getA()*d.getC());
        
        
                     d.setDelta((d.getValorDelta()) - (d.getValorDelta2()));
        
        return d.getDelta();
        
    }  //--------------- Fim do Metodo ---------------------------------------------------------
    
  
    
   
    // -------------- Inicio dos Metodos para achar X1 e X2 -----------------------------
    
    public double calcularRaiz1(){
        
        d.setX1(( - d.getB() + Math.sqrt(calcularDelta())) / (2 * d.getA()));
        
        
        return d.getX1();
       
    }//--------------------------------------------------------------------------------------------
    
    public double calcularRaiz2(){
    
    d.setX2(( - d.getB() - Math.sqrt(calcularDelta())) / (2 * d.getA()));
    
    return d.getX2();
    
}//------------- Fim do Metodo --------------------------------------------------------------

    


//--------------- Inicio do Metodo Verificar Existência --------------------------------------
    
    public void verificarExistencia(){
        
               
        if(calcularDelta()>0){
            ver(" Sendo o Delta  = "+calc.format(calcularDelta())+" , positivo terá duas raizes distintas ");
        }if(calcularDelta()<0){
            ver(" Sendo o Delta  = "+calc.format(calcularDelta())+", negativo não existe raizes no Campo do Reais  "+
                    "\n mas terá os valores do XV , XY");
        }if( calcularDelta()==0){
            ver(" Sendo o Delta = "+calc.format(calcularDelta())+" , as suas raizes serão iguais x1 = x2 ");
        }
        
        
    }//----------------- Fim do Metodo ----------------------------------------------------------
  
   
    //----------------- Inicio do Metodo para calcular XV e YV --------------------------------
    
    public double acharXv(){
        
        d.setXv((-(d.getB()) / (2 * d.getA())));
        
        
        return d.getXv();
        
    }//----------------------------------------------------------------------------------------------
    
    
    public double acharYv(){
        
        d.setYv((-(calcularDelta()) / (4 * d.getA())));
        
        return d.getYv();
    }
    
    
    // -------------- Fim do Metodo --------------------------------------------------------------
    
    
    
    
    //-------------- Inicio do Metodo campo texto --------------------------------------------
    
    public void campoTexto(){
        
           campo_delta.setText(String.valueOf(calc.format(calcularDelta())));
         campo_x1.setText(String.valueOf(calc.format(calcularRaiz1())));
        campo_x2.setText(String.valueOf(calc.format(calcularRaiz2())));
           campo_x.setText(String.valueOf(calc.format(acharXv())));
        campo_y.setText(String.valueOf(calc.format(acharYv())));
        
        
        
    } //--------------- Fim do Metodo ----------------------------------------------------------------  
    
    
    
    //---------- Inicio do Metodo para calcular forma fatorada --------------------------------
    
    public String calcularFatorada(){
    
        if((d.getX1()<0)&&(d.getX2()<0)){// - -
            raiz1 = String.valueOf(" Fatorada = "+calc.format(d.getA())+".( x + "+calc.format((d.getX1()*(-1)))+" ). ( x + "+calc.format(d.getX2()*(-1)))+" )";
        }if((d.getX1()>0)&&(d.getX2()>0)){// + +
            raiz1 = String.valueOf(" Fatorada = "+calc.format(d.getA())+".( x - "+calc.format(d.getX1())+" ). ( x - "+d.getX2()+" )");
        }if((d.getX1()>0)&&(d.getX2()<0)){// + -
             raiz1 = String.valueOf(" Fatorada = "+calc.format(d.getA())+".( x - "+calc.format(d.getX1())+" ). ( x + "+calc.format((d.getX2()*(-1)))+" )");
        }if((d.getX1()<0)&&(d.getX2()>0)){// - +
            raiz1 = String.valueOf(" Fatorada = "+calc.format(d.getA())+".( x + "+calc.format((d.getX1()*(-1)))+" ). ( x - "+calc.format(d.getX2())+" )");
        }
 
    return raiz1;
   
    }//-------------- Fim do Metodo ----------------------------------------------------------------


//----------------- Inicio do Metodo montar a Equação -------------------------------------  
    
  public String montarEquacao(){
      
      
      
      String nome=null;
      
       if((d.getA()>0)&&(d.getB()>0)&&(d.getC()>0)){ // + + +
       nome = (String.valueOf(calc.format(d.getA())+ "x² "+" + "+calc.format(d.getB())+"x + "+calc.format(d.getC())));
        }if ((d.getA()<0)&&(d.getB()<0)&&(d.getC()<0)){ // - - -
              nome = (String.valueOf(calc.format(d.getA())+ "x² "+calc.format(d.getB())+ "x "+calc.format(d.getC())));
        }if((d.getA()>0)&&(d.getB()<0)&&(d.getC()<0)){ // + - - 
             nome = (String.valueOf(calc.format(d.getA())+ "x² "+calc.format(d.getB())+ "x "+calc.format(d.getC())));
        }if ((d.getA()<0)&&(d.getB()>0)&&(d.getC()<0)){ // - + -
         nome = (String.valueOf(calc.format(d.getA())+ "x² "+" + "+ calc.format(d.getB()) + "x "+calc.format(d.getC())));
        }if ((d.getA()>0)&&(d.getB()>0)&&(d.getC()<0)){ // + + -
            nome = (String.valueOf(calc.format(d.getA())+ "x² "+" + "+calc.format(d.getB())+ "x "+calc.format(d.getC())));
        }if((d.getA()>0)&&(d.getB()<0)&&(d.getC()>0)){ // + - +
            nome = (String.valueOf(calc.format(d.getA())+ "x² "+ calc.format(d.getB()) + "x + "+calc.format(d.getC())));
        }if((d.getA()<0)&&(d.getB()<0)&&(d.getC()>0)){ // - - +
              nome = (String.valueOf(calc.format(d.getA())+ "x² "+calc.format(d.getB())+ "x + "+calc.format(d.getC())));
        }if((d.getA()<0)&&(d.getB()>0)&&(d.getC()>0)){ // - + + 
              nome = (String.valueOf(calc.format(d.getA())+ "x² "+" + "+calc.format(d.getB())+ "x + "+calc.format(d.getC())));
        }if((d.getA()<0)&&(d.getB()>0)&&(d.getC()==0)){// - +
            nome = (String.valueOf(calc.format(d.getA())+ "x² "+" + "+calc.format(d.getB())+ "x "));
        }if((d.getA()>0)&&(d.getB()>0)&&(d.getC()==0)){// + +
              nome = (String.valueOf(calc.format(d.getA())+ "x² "+" + "+calc.format(d.getB())+ "x "));
        }if((d.getA()<0)&&(d.getB()<0)&&(d.getC()==0)){// - - 
              nome = (String.valueOf(calc.format(d.getA())+" x² "+calc.format(d.getB())+" x "));
        }if((d.getA()>0)&&(d.getB()<0)&&(d.getC()==0)){// + -
             nome = (String.valueOf(calc.format(d.getA())+" x² "+calc.format(d.getB())+" x "));
        }
      
        return nome;
        
  }//-------------------- Fim do Metodo ------------------------------------------------------------------------------------------
  
  
  
  //--------- Inicio do Metodo para mostrar a janela --------------------------------------------
      
   public static void ver(String texto){
    JOptionPane.showMessageDialog(null,texto);
}
public static String pegar(String text){
    return JOptionPane.showInputDialog(text);
    
}//---------- Fim do Metodo ----------------------------------------------------------------------



//-------------- Inicio do Metodo para Texto ------------------------------------------------------

public void texto(){
    
     texto.setText(" Tendo a F ( x ) = ax²  + bx + c ,forma genérica  "+
                "\n Ex: Equação seria = x²  + 3x + 4  "+
                "\n Usando formula de Braskara para achar para achar as raizes  :"+
                "\n --------------------------------------------------------------------"+
                "\n Primeiro fazemos achamos o valor de Delta : "+
                "\n A formula é delta = b² - 4.a.c "+
                "\n ---------------------------------------------------------------------"+
                "\n Delta = "+calc.format(d.getB())+ " ² - 4 . "+calc.format(d.getA())+" . "+calc.format(d.getC())+
                "\n "+formatarDelta()+
                "\n Delta = "+calc.format(calcularDelta()));
    
    
}// ------------------ Fim do Metodo -------------------------------------------------------------


//--------------------- Inicio do Metodo para Texto2 ------------------------------------------ 

public void texto2(){
    
    texto2.setText(" Agora que temos o Delta = "+calc.format(calcularDelta())+
                "\n acharemos as Raizes x1 , x2 com a formula : "+
                "\n x1 = - b + raiz de delta / 2.a "+
                "\n x2 = - b - raiz de delta / 2.a "+
                "\n ---------------------------------------"+
                "\n x1 = - ( "+calc.format(d.getB())+" ) + "+calc.format(calcularDelta())+" / 2. "+calc.format(d.getA())+
                "\n x1 = "+calc.format(-1*d.getB())+" + "+calc.format(Math.sqrt(calcularDelta()))+" / "+calc.format(2*d.getA())+
                "\n x1 = "+calc.format(d.getX1())+
                "\n ----------------------------------------"+
                "\n x2 = - ( "+calc.format(d.getB())+" ) - "+calc.format(calcularDelta())+" / 2. "+calc.format(d.getA())+
                "\n x2 = "+calc.format(-1*(d.getB()))+" - "+calc.format(Math.sqrt(calcularDelta()))+" / "+calc.format((2*d.getA()))+
                "\n x2 = "+calc.format(d.getX2())+
                "\n -----------------------------------------"+
                "\n A Equação "+montarEquacao()+
                "\n Fatorada fica : a.( x - x1 ).( x - x2 )"+
                "\n"+calcularFatorada());
    
}//------------------- Fim do Metodo -----------------------------------------------------------------




//---------- Inicio do Metodo para formatar a Delta ------------------------------------------

public String formatarDelta(){
     
    
    if(d.getValorDelta2()>0){
            del = String.valueOf("Delta = "+calc.format((d.getB()*d.getB()))+" - "+calc.format(d.getValorDelta2()));
        }if(d.getValorDelta2()<0){
            del = String.valueOf("Delta = "+calc.format(d.getB()*d.getB())+" + "+calc.format(d.getValorDelta2()*(-1))); 
        }
           
    return del;
    
}//---------- Fim do Metodo -------------------------------------------------------------------------





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
        campo_y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_yActionPerformed(evt);
            }
        });

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
        jLabel11.setText("CALCULANDO A F ( X )");

        campo_equacao.setBackground(new java.awt.Color(204, 204, 255));
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

        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        texto.setRows(5);
        texto.setEnabled(false);
        jScrollPane1.setViewportView(texto);

        texto2.setColumns(20);
        texto2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        texto2.setRows(5);
        texto2.setEnabled(false);
        jScrollPane2.setViewportView(texto2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
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
                                            .addComponent(campo_c, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(botao_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(campo_x1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(campo_x2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_x, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(campo_delta)
                                    .addComponent(campo_y))
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_equacao, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(botao_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)))))
                .addContainerGap())
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
                    .addComponent(campo_y, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(campo_x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_x, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
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
                            .addComponent(campo_delta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_equacao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addComponent(botao_calcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botao_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cActionPerformed

    private void botao_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_calcularActionPerformed
      
        // --------------- chamando os metodos 
        
        calcularDelta();
        calcularFatorada();
        calcularRaiz1();
        calcularRaiz2();
        
        texto();
        texto2();
        formatarDelta();
        montarEquacao();
        
        campoTexto();
        acharXv();
        acharYv();
        verificarExistencia();
        campo_equacao.setText(montarEquacao());
        campo_a.setEditable(false);
        campo_b.setEditable(false);
        campo_c.setEditable(false);
       
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
        
        campo_a.setEditable(true);
        campo_b.setEditable(true);
        campo_c.setEditable(true);
        
        
        
        
        
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

    private void campo_yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_yActionPerformed


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
