
package br.com.vinicius.metodos;

import java.text.DecimalFormat;


public class Equacao2grau {
    
      //=====================================================================
    public double deltaEquacao2(String a ,String b, String c ){
        
        String format;
        
       DecimalFormat calc = new DecimalFormat(" ##.##### ");
       
       double a1;
        double b1;
        double c1;
        double delta;
    
        Funcao d = new Funcao();
        
        a1 = d.real(a);
        b1 = d.real(b);
        c1 = d.real(c);
        
        delta = Math.pow(b1, 2)-4*a1*c1;
             
        format = calc.format(delta);
        delta = d.real(format);
        
          return  delta;
    }//======================================================================
    
    
    
    //======================================================================
    public String testarDelta(String a ,String b, String c ){
       
        String res ="";
        
         if(deltaEquacao2(a, b, c)<0){
           
            res = " Sendo o Delta negativo não existe solução "+
            "\n no campo dos reais, onde não tem raiz de numero negativo ";
          
       }
        if(deltaEquacao2(a, b, c)==0){
            res = " Sendo o Delta igual a zero as raizes serão iguais ";
        }
        
        return res;
    }//=====================================================================
    
    
    
    //======================================================================
    public double xVertice(String a, String b){
        
        
        Funcao d = new Funcao();
       
        double xv;
         double a1 = d.real(a);
         double b1 = d.real(b);
        
        xv = Math.round( - (b1) / (2 * a1));
                
       return xv;
    }//=======================================================================
    
    
    //========================================================================
    public double yVertice(String a,String b, String c){
         
       
         Funcao d = new Funcao();
         double yv;
         double a1 = d.real(a);
         double b1 = d.real(b);
         double c1 = d.real(c);
        
        
         yv = Math.round(-(deltaEquacao2(a, b, c)) / (4 * a1));
        
        return yv;
    }//======================================================================
    
    
    //======================================================================
    public double primeiraRaiz(String a,String b, String c){
         
       
         Funcao d = new Funcao();
         double x1;
         double b1 = d.real(b);
         double a1 = d.real(a);
        
         double p = Math.sqrt(deltaEquacao2(a, b, c));
         double e = 2 * a1;
                  
         x1 = (-(b1)+ p) / e;
       
         
        return x1;
    }//======================================================================
    
    
    //=======================================================================
    public double segundaRaiz(String a,String b, String c){
         
      
         Funcao d = new Funcao();
         double x2;
         double a1 = d.real(a);
         double b1 = d.real(b);
         double c1 = d.real(c);
         
         double p = Math.sqrt(deltaEquacao2(a, b, c));
         double e = 2 * a1;
                  
         x2 = (-(b1)- p ) / e;
              
         return x2;
         
    }//======================================================================
    
   
    
    //========================================================================
    public String formatarEquacacao(String a1,String b1, String c1){
        
        String equacao ="";
        
         Funcao d = new Funcao();
    
         double a;
         double b;
         double c; 
        
         a = d.real(a1);
         b = d.real(b1);
         c = d.real(c1);
        
        if((a>0)&&(b>0)&&(c>0)){ // + + +
        equacao =(String.valueOf(a+ "x² "+" + "+b+"x + "+c));
        }if ((a<0)&&(b<0)&&(c<0)){ // - - -
            equacao =(String.valueOf(a+ "x² "+b+ "x "+c));
        }if((a>0)&&(b<0)&&(c<0)){ // + - - 
            equacao =(String.valueOf(a+ "x² "+b+ "x "+c));
        }if ((a<0)&&(b>0)&&(c<0)){ // - + -
        equacao =(String.valueOf(a+ "x² "+" + "+ b + "x "+c));
        }if ((a>0)&&(b>0)&&(c<0)){ // + + -
            equacao =(String.valueOf(a+ "x² "+" + "+b+ "x "+c));
        }if((a>0)&&(b<0)&&(c>0)){ // + - +
            equacao =(String.valueOf(a+ "x² "+ b + "x + "+c));
        }if((a<0)&&(b<0)&&(c>0)){ // - - +
            equacao = (String.valueOf(a+ "x² "+b+ "x + "+c));
        }if((a<0)&&(b>0)&&(c>0)){ // - + + 
            equacao =(String.valueOf(a+ "x² "+" + "+b+ "x + "+c));
        }if((a<0)&&(b>0)&&(c==0)){// - +
            equacao = (String.valueOf(a+ "x² "+" + "+b+ "x "));
        }if((a>0)&&(b>0)&&(c==0)){// + +
            equacao = (String.valueOf(a+ "x² "+" + "+(int)b+ "x "));
        }if((a<0)&&(b<0)&&(c==0)){// - - 
            equacao = (String.valueOf(a+" x² "+b+" x "));
        }if((a>0)&&(b<0)&&(c==0)){// + -
            equacao = (String.valueOf(a+" x² "+b+" x "));
        }
        
        return equacao;
    }//=========================================================================
    
    
    
    
    
    
}
