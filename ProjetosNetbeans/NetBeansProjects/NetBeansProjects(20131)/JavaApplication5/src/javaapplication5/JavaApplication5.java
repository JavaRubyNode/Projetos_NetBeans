/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javax.swing.JOptionPane;

/**
 *
 * @author vinicius
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(" nome:");
     JOptionPane.showMessageDialog(null,"Olá," + nome + "." + " seu nome possui " + nome.length()+ " letras ");
    }
}
