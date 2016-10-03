/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teste;

import javax.swing.JOptionPane;

/**
 *
 * @author VINICIUS
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ver(" \r o valor e "+"\bsendo ");
    }
  public static void Ver(String texto){
    JOptionPane.showMessageDialog(null,texto);
}
public static String Pegar(String text){
    return JOptionPane.showInputDialog(text);
}  
}
