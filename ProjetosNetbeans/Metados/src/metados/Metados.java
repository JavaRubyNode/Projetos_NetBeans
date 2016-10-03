
package metados;

import javax.swing.JOptionPane;

/**
 *
 * @author VINICIUS
 */
public class Metados {
  
    protected int a;
   protected int b; 
  
    public static void main(String[] args) {
      Metados a = new Metados();
      a.a= Integer.parseInt(pegar(""));  
      System.out.println(a.a);
      
    }
   public static void ver(String texto){
    JOptionPane.showMessageDialog(null,texto);
}
public static String pegar(String text){
    return JOptionPane.showInputDialog(text);
}
       
    
}
