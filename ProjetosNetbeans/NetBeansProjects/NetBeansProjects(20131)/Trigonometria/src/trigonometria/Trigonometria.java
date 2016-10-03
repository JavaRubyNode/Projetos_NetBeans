
package trigonometria;
import javax.swing.JOptionPane;

public class Trigonometria {

    
    public static void main(String[] args) {
        double a,b,c;
  
      b = Double.parseDouble(JOptionPane.showInputDialog(null," Informe o valor de B ( Cateto Oposto ) : "));  
      c = Double.parseDouble(JOptionPane.showInputDialog(null," Informe o valor de C ( Cateto Adjacente ) : "));
        
        a = ((b*b)+(c*c));
        JOptionPane.showMessageDialog(null,"O valor de A ( Hipotenusa ) = " + Math.sqrt(a));
        
        
        
     
        
        
        
        
    }
}
