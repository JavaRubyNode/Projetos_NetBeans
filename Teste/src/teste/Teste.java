
package teste;
import javax.swing.JOptionPane;


public class Teste {

   
    public static void main(String[] args) {
        float x;
        x = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um numero "));
        if(( x >=0 )&&( x<=1 && x>0)){
        JOptionPane.showMessageDialog(null, " O inverso de " + x + " é \n" + x*(-1) );
        JOptionPane.showMessageDialog(null," O inverso de "+ x + " é \n"+ Math.pow(x,(-1)));
        }else{
        JOptionPane.showMessageDialog(null," O inverso de " + x +" é\n " + x*(-1));   
        }
         
          
      
    }
}
