
package derivada;

import javax.swing.JOptionPane;


public class Derivada extends Dados {

    
    public static void main(String[] args) {
     
        Dados a = new Dados();
  a.setTexto(" ----- Programa para fazer Calculos com Derivadas -------");
    Dados.Resposta(a.getTexto());
      
       while(true){
           a.setOpc(Integer.parseInt(JOptionPane.showInputDialog(" \" Escolha uma Função para achar a derivada \""
           + " \n 1º - f( x ) = x - 3 / 2x + 4 "+
               " \n 2° - f( x ) = 5x - 3 "+
               " \n 3° - Sair")));
           switch(a.getOpc()){
          
          case 1:
              Dados.Resposta("  Como a f( x ) é uma Divisao teremos a seguinte formula: "+
                      " \n ( Derivada do Numerador) . (Denominador) - ( Numerador ) . ( Derivada do Denominador ) "+ 
                      " \n divido pelo,( Denominador ) ² . ");
              Dados.Resposta("\n Derivamos o Numerador = f( x )= x - 3 , ficando assim: "+ 
                      "\n f'( x ) = 1 "+ "\n Derivador o Denominador = f( x ) = 2x + 4, ficando assim: "
                    + " \n f'( x ) = 2 "+
                      "\n( Denominador )² = f( x ) = 2x + 4 , ficando assim : "+ 
                      "\n 4x² + 16x + 16 "+ 
                      "\n a derivada de, f( x ) = x - 3 / 2x + 4" +"\n fica : " +
                      " \n 1.( 2x + 4 ) - ( x - 3 ).2 / 4x² + 16x + 16 , \n fazendo o cálculo: "+ 
                      "\n  2x + 4 - 2x + 6 / 4x² + 16x + 16, ficando:  \n f'( x ) = 10 / 4x² + 16x + 16");
             a.setX(Double.parseDouble(JOptionPane.showInputDialog(" Tendo a derivada f'( x ) = 10 / 4x² + 16x + 16 "+
                     " \n de um valor para X: ")));
              Dados.Resposta(" 10 / "+" 4. "+a.getX()+" ² + 16. "+a.getX()+" + 16 "+ 
                          "\n sendo x = "+a.getX()+"\n teremos uma resposta =  "
                      +(10 /((4*( Math.pow(a.getX(),2)))+(16*(a.getX()))+(16))));
           break;
             
          case 2:
              Dados.Resposta(" Como agora a Função f( x ) = 5x - 3  e mais simples a sua Derivada ficará :"+
                      "\n f( x ) = 5x - 3 , assim "+ 
                      "\n f'( x ) = 5 , como a derivada resultou numa \n "
                      + "função constante pode atribuir qualquer, \n valor que sempre gera um resultado igual a 5"); 
              
              break;
              
              
          case 3:
              System.exit(0);
              break;
              
              
              
      } 
       }
       
      
      

        
    }
    
}
