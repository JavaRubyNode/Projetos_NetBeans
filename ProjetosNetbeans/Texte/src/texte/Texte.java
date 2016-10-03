/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package texte;

import javax.swing.JOptionPane;

/**
 *
 * @author VINICIUS
 */
public class Texte {

    
   
    
    
    
    public static void main(String[] args) {
       
        
       double a = 10;
       double b = 30;
       
      double maior = (a < b ? (a+1):( b+3 ));
        
        ver(String.valueOf(maior));
        
        
        
        
        
        
    }
    
 public static void ver(String texto){
JOptionPane.showMessageDialog(null,texto);
}
    
    public static String pegar(String text){
          return JOptionPane.showInputDialog(text);
    }

}
