
package metadosprincipal;


import javax.swing.JOptionPane;


public class MetadosPrincipal {
         
    public static void main(String[] args) {
       
        
         Metado a = new Metado();
        
     a.lista(null);
     
        
        
        
        
        
        
        
        
    }
     







// metado para usar janelas        
     
    public static void ver (String texto){
          JOptionPane.showMessageDialog(null,texto);
      }   
      public static String pegar (String text){
          return JOptionPane.showInputDialog(text);
      }   
}
