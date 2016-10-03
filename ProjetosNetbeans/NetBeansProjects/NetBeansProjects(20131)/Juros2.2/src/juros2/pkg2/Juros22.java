
package juros2.pkg2;

import javax.swing.JOptionPane;


public class Juros22 {
// j= juros,t= tempo em meses, m= montante onde e soma de capital mais juros,c= capital a ser investido 
// t= pode ser a parcelas de uma compra feita parcelada, ou seja, o numero de parcelas     
    
    public static void main(String[] args) {
       double m,c,j,i,t,z;
       c = Float.parseFloat(JOptionPane.showInputDialog(" Informe o Capital da Aplicação "));
       t = Float.parseFloat(JOptionPane.showInputDialog(" Informe o Tempo da Aplicação/Parcelas em Meses "));
       i = Float.parseFloat(JOptionPane.showInputDialog(" Informe a Taxa de juros a ser aplicada em Meses "));
            
       z = (1+i/100);
       m = (c*(Math.pow(z,t)));
       j = m-c;
      
       JOptionPane.showMessageDialog(null," O Montante dessa Aplicação sera = " + m + "\n O Juros que renderão sera = " +j);
JOptionPane.showMessageDialog(null," Voce pagara em "+ t + " vezes de "+ (m/t));
       
    }
}
