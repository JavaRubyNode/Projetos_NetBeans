/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testarternario;

import javax.swing.JOptionPane;

/**
 *
 * @author VINICIUS
 */
public class TestarTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
       String transporte[] = {"Aquatico","Terrestre"," Areo "};
       
       
       for(String tra : transporte){
                ver("\n Transporte : %s"+tra);
       }
        
        
    }
     //------ metado para usar janelas ------------------        
    public static void ver(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    public static String pegar(String text) {
        return JOptionPane.showInputDialog(text);
    }

}
