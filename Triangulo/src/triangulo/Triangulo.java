package triangulo;
import javax.swing.JOptionPane;

       
public class Triangulo {

    
    public static void main(String[] args) {
        double L1,L2,L3;

L1= Double.parseDouble(JOptionPane.showInputDialog(null," Digite o 1º lado "));        
L2= Double.parseDouble(JOptionPane.showInputDialog(null," Digite o 1º lado "));        
L3= Double.parseDouble(JOptionPane.showInputDialog(null," Digite o 1º lado "));        
        
        if(L1==L2){
            if(L2==L3){
JOptionPane.showMessageDialog(null," Temos um Triangulo Equilatero" );

            }
        }
        
        
        
        
    }
}
