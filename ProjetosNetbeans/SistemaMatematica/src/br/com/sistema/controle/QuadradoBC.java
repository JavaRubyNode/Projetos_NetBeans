
package br.com.sistema.controle;

import br.com.sistema.bean.Quadrado;

import javax.swing.JOptionPane;

/**
 *
 * @author VINICIUS
 */
public class QuadradoBC {

    
      static Quadrado a =new Quadrado( );

    
    
    //------Metodo para calcular a area ----------------
    
    public static double area(String lado){
     
    
   a.setLado(reais(lado));
   a.setArea(a.getLado()*a.getLado());
      
   return a.getArea();
   
    }//-------- Fim do Metodo ---------------------------
    
    
    
    
    
    //----- Metodo para calcular o perimetro ----------------
    
    public static double perimetro(String lado){
        
         a.setLado(reais(lado));
         a.setPerimetro(a.getLado()*4);
         
         
        return a.getPerimetro();
    }//--------- Fim do Metodo ----------------------------------
    
    
    public static double reais(String a){
        return Double.valueOf(a);
    }
    
    public static void ver(String texto){
                JOptionPane.showMessageDialog(null,texto);
    }
    public static String pegar(String text){
                return JOptionPane.showInputDialog(text);
    }
    
    
}



