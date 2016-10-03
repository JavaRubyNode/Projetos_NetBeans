
package fatorial;
import javax.swing.JOptionPane;

public class Fatorial {
//a = LOGARITIMANDO , b = A BASE DO LOGARITIMO , C = A VALOR DO LOGARITIMO 
    
    public static void main(String[] args) {
        int y,x;
        float fat=1;
        
        x = Integer.parseInt(JOptionPane.showInputDialog(null," Digite um numero para achar fatorial ! "));
        for(y=x;y>1;y--){
            fat=fat*y;
        
        }

        JOptionPane.showMessageDialog(null," O valor sera de " + x + " Fatorial" + " = " +fat);
JOptionPane.showMessageDialog(null," O Logaritmo de " + x + "\n Divido pelo Logaritmo de "+ fat +"= "+ (Math.log10(x)/Math.log10(fat)));     
    
    }
}
