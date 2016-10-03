package classe;

import javax.swing.JOptionPane;  

/**
 *
 * @author VINICIUS
 */
public class Produto {
    
    
    static private double a;
    static private double b;
    static private double result;

  
    public static double reais(String a){
        
        return Double.valueOf(a);
    }
    
    public static void produto(){
        
        a =reais(pegar(" De um valor para a "));
        b = reais(pegar(" De um valor para b "));
        
      
        result=a*b;
       
       ver(" o resultado = "+result);
    }
    
    
    public static void ver(String text){
                JOptionPane.showMessageDialog(null, text);
            } 
       
    public static  String pegar(String texto){
                      return JOptionPane.showInputDialog(texto);
       }     
}
