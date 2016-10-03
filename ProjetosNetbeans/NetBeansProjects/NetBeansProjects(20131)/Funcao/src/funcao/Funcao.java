
package funcao;
import javax.swing.JOptionPane;


public class Funcao {
//calcular o valor de uma funcao do 1 grau 
    
    public static void main(String[] args) {
       float a,b,x,y;
      
       a = Float.parseFloat(JOptionPane.showInputDialog(null," O Valor de A "));
       b = Float.parseFloat(JOptionPane.showInputDialog(null," O Valor de B "));
       x = Float.parseFloat(JOptionPane.showInputDialog(null," O Valor de X "));
       
       y = ((a*x)+b);
        
       JOptionPane.showMessageDialog(null," o valor da Equação sera  " + y );
     
                
    }
}
