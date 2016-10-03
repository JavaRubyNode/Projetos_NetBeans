
package temperatura;
import javax.swing.JOptionPane;

public class Temperatura {

    
    public static void main(String[] args) {
        float c,f;
        c = Float.parseFloat(JOptionPane.showInputDialog(" Digite a temperatura em °Celsus"));
        
        f = ((9*c+160)/5); 
        JOptionPane.showMessageDialog(null," A temperatura em Fahrenhit = "+f);
        
        
        
        
        
        
    }
}
