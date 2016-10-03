
package juros;
import javax.swing.JOptionPane;

public class Juros {
// calcular o juros em uma certa taxa e um certo tempo 
        
    public static void main(String[] args) {
      float t,i,c,j;
      c = Float.parseFloat(JOptionPane.showInputDialog(" Informe o Capital da Aplicação "));
      t = Float.parseFloat(JOptionPane.showInputDialog(" Informe o Tempo para essa Aplicação em Meses  "));  
      i = Float.parseFloat(JOptionPane.showInputDialog(" Informe a Taxa Mensal da Capital "));  
        
        j=((c*i*t)/100);
JOptionPane.showMessageDialog(null," O  Juros da Aplicação sera = " + j + " \n O Montade da Aplicaçao em " + t + " Meses = "+" = "+(j+c));        
       
        
        
    }
}
