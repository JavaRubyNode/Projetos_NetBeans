
package media;
import javax.swing.JOptionPane;

public class Media {

    // calcular o valor de uma populacao de uma cidade A que ela tem 5000000 e a cidade B tem 7000000
// que a cidade A cresce 2% a.a e cidade B cresce 3% a.a tudo em funcao do tempo     
    
    public static void main(String[] args) {
        double pop1,pop2,a=5000000,b=7000000;
        float t;
t = Float.parseFloat(JOptionPane.showInputDialog(null, " Digite o tempo em anos  "));        
        
        pop1=((a*0.02)*t)+a;
        pop2=((b*0.03)*t)+b;
        
JOptionPane.showMessageDialog(null, " A populacao da cidade A era " + a + " e foi para " + pop1 + " em " + t + " anos ");
JOptionPane.showMessageDialog(null, " A populacao da cidade B era " + b + " e foi para " + pop2 + " em " + t + " anos ");        
        
    
    }
}
