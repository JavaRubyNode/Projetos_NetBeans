
package br.com.vinicius.metodos;

/**
 *
 * @author VINICIUS
 */
public class Equacao1grau {
    
    //=======================================================================
    public String calcularReta(String a , String b , String c, String d){
        Funcao v = new Funcao();
        String valor ="";
        
        
        double a1 = v.real(a);
        double b1 = v.real(b);
        double c1 = v.real(c);
        double d1 = v.real(d); 
       
        double divisao = ((d1 - b1) / (c1 - a1));
        double l = ( a1 - c1 );
        double m = ( b1 - d1 );
        double w = (l * l) + (m * m);
        double x = b1 - (divisao * a1);
   
        if((divisao<0)&&(x<0)){// - -
            valor = " A equacao será = "+divisao+"x "+x;
        }if((divisao>0)&&(x<0)){// + -
            valor =" A equacao será = "+divisao+"x "+x;
        }if((divisao>0)&&(x>0)){// + +
            valor = " A equacao será = "+divisao+"x + "+x;
        }if((divisao<0)&&(x>0)){// - +
            valor = " A equacao será = "+divisao+"x + "+x;
        }
        
        
        return valor;
    }//========================================================================
    
    
    //========================================================================
    public String calcularInclinacao(String a , String b , String c, String d){
        Funcao v = new Funcao();
        String valor;
        
        double a1 = v.real(a);
        double b1 = v.real(b);
        double c1 = v.real(c);
        double d1 = v.real(d); 
       
        double divisao = ((d1 - b1) / (c1 - a1));
        double l = ( a1 - c1 );
        double m = ( b1 - d1 );
        double w = (l * l) + (m * m);
        double x = b1 - (divisao * a1);
        
valor = " A distancia entre os pontos A = ( "+a1+", "+b1+" ) e  B = ( "+c1+", "+d1+" )"+
                "\n Será = "+Math.sqrt(w)+
                "\n A inclinação da reta será = "+divisao;
        
        return valor;
    }//==========================================================================
    
    
    
}
