
package br.com.vinicius.metodos;

import java.text.DecimalFormat;

public class Calculo {
   
     double x;
        double y;
        double z;
    
    
//===============================================================
    public String raiz(String radicando , String radical){
      
        Funcao o = new Funcao();
        
        DecimalFormat calc = new DecimalFormat(" ##.##### ");
     
       double a;
       double b;
       double c;
       double d;
       String raiz;
        
        a = o.real(radicando);
        b = o.real(radical);
        c = ( Math.log10(a)/ b );
        d =  Math.pow(10,c);
        
        raiz = String.valueOf(calc.format(d));
        
        return raiz;
        
    }//==================================================================
    
    
  
    
    
    
    //======================================================================
        public String fatorial(String a){
        
            Funcao o = new Funcao();
            
            DecimalFormat calc = new DecimalFormat(" ##.##### ");
       
        String result;
        double fat = 1;
        double valor = o.real(a);
        
        for(int i = 1;i<=valor;i++ ){
            fat = fat*i;
        }
        
        result = String.valueOf(calc.format(fat));
        
        
        return result;
    }//===================================================================
        
        
  
        
        
}
