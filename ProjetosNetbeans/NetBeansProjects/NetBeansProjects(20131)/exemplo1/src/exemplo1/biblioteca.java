
package exemplo1;

import javax.swing.JOptionPane;

public class biblioteca {
 public static void imprime(String texto)
    {
        System.out.println(texto);
    }
    
    static void imprimeG (String texto)
    {
        JOptionPane.showMessageDialog(null, texto);
    }
    
    static String tabuada(String valor)
    {
    String saida="";
    
    int val = Integer.parseInt(valor);
    for (int x=0;x<=10;x++){
        saida += val +" X "+x+" = "+x*val+"\n";
    }    
    return saida;
    }
}
