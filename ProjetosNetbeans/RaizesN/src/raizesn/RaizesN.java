/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raizesn;


import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author VINICIUS
 */
public class RaizesN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        double w;
        double a;
        double b;
        double n;
        
        n = Double.parseDouble(pegar(" O valor de N e Radical "));
        a = Double.parseDouble(pegar(" O valor de A e Radicando  "));
        
       w = ( Math.log10(a)/ n );
       b = Math.pow(10,w);  // no valor de aplica logartimo de b para achar a raiz 
        
      /* if (n==2){
           ver(" A raiz Quadrada de "+Math.round(a)+" será = "+Math.round(b));
       }
       if( n==3){
           ver(" A raiz Cubica de "+Math.round(a)+" será = "+Math.round(b));
       }**/
       
    
     
       
       DecimalFormat calc = new DecimalFormat(" ##.##### ");
     
       
        ver(" A raiz "+calc.format(n)+" de "+calc.format(a)+" será = "+calc.format(b));
        
       
       
    }
      public static void ver(String texto){
        JOptionPane.showMessageDialog(null,texto);
    }
    public static String pegar(String texto2){
        return JOptionPane.showInputDialog(texto2);
    }
       
}
