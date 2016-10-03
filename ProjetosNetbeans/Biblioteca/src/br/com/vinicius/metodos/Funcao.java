

package br.com.vinicius.metodos;


import javax.swing.JOptionPane;

/**
 *
 * @author VINICIUS
 */
public class Funcao {
    
    //===========================================================
    public void ver (String texto){
        JOptionPane.showMessageDialog(null,texto);
    }//==========================================================
    
    //============================================================
    public String pegar (String texto){
        return JOptionPane.showInputDialog(texto);
    }//===========================================================
    
    
    //============================================================
    public double real(String a){
        return Double.valueOf(a);
    }//===========================================================
    
    
    //===========================================================
    public int inteiro(String a){
        return Integer.valueOf(a);
    }//===========================================================
    
    
    //=============================================================
    public float flutuante(String a){
        return Float.valueOf(a);
    }//============================================================
    
    
    //=============================================================
    public long longo(String a){
        return Long.valueOf(a);
    }//============================================================
    
    
   
    
 
    
}
