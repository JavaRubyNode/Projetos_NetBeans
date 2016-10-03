
package ano;
import javax.swing.JOptionPane;

public class Ano {

    
    public static void main(String[] args) {
        
  int ano;
ano= Integer.parseInt(JOptionPane.showInputDialog(null," Digite um ano para testar se e bissesto ? \n ( ex: 1999)"));
    if (((ano % 4==0)&&(ano % 100 != 0))||(ano % 400==0)) {
  JOptionPane.showMessageDialog(null," O ano "+ ano +" e bissesto");      
    }else{
  JOptionPane.showMessageDialog(null," O ano " + ano +" não e bissesto ");
    }     
        
        
        
    }
}
