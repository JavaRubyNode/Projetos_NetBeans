/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fracao;
import java.text.*;
import javax.swing.JOptionPane;

/**
 *
 * @author VINICIUS
 */
public class Fracao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      NumberFormat y;
        double x;
     
        
       x = Double.parseDouble(pegar(""));
 
      
       y = NumberFormat.getPercentInstance();
        
        ver(""+y.format(x));
        
        
        
    }
    public static void ver(String texto){
        JOptionPane.showMessageDialog(null,texto);
    }
    public static String pegar(String texto2){
        return JOptionPane.showInputDialog(texto2);
    } 
}
