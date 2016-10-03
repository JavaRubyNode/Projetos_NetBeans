/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sistema.controle;

import br.com.sistema.bean.Retangulo;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author VINICIUS
 */
public class RetanguloBC {
       Retangulo b = new Retangulo();
    Retangulo c = new Retangulo();
   DecimalFormat calc = new DecimalFormat(" ##.### ");
   DecimalFormat calc1 = new DecimalFormat(" ##.###  m²");
      

     
    
    public double areaR(String a , String c){
 
     
        b.setBase(reais(a));
        b.setAltura(reais(c));
        b.setArea(b.getAltura()*b.getBase());
                
        
        return b.getArea();
    }
    
   
    
    
    
    public double perimetro(String a , String b ){
      
         
         c.setBase(reais(a));
        c.setAltura(reais(b));
         c.setPerimetro((c.getAltura()*2)+(c.getBase()*2));
        
        return c.getPerimetro();
    }
    
    public String resolucao(String a , String b ){
      
        Retangulo d = new Retangulo();
        
        d.setAltura(reais(a));
        d.setBase(reais(b));
         
        String resul;
        
        resul=" Para calcular a área de um retângulo basta utilizar a formula :"+
                "\n A = B.H "+" \n onde A = área total  , B = base , H = altura"+
                " \n Resolvendo --------------------------------------"+
                "\n A =  "+calc.format(d.getBase()) +" . "+ calc.format(d.getAltura())+
                        "\n A = "+calc1.format(areaR(a, b));
        
        

         return resul;
    }
    
    
    
      public double reais(String a){
        return Double.valueOf(a);
    }
    
    public  void ver(String texto){
                JOptionPane.showMessageDialog(null,texto);
    }
    public String pegar(String text){
                return JOptionPane.showInputDialog(text);
    }
    
}
