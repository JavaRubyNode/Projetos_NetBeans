/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package raiz;

import javax.swing.*;

public class Raiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      int x = 0;
      int n = 0;
      int i = 0;
      
      x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
      
      while (i <= x){
          x -= i;
          i += 2;
          n++;
      }
      JOptionPane.showMessageDialog(null,"A raiz quadrada é \n"+ n);
    }
}
