
package combustivel;
import javax.swing.JOptionPane;

public class Combustivel {

    
    public static void main(String[] args) {
       // x = valor da gasolina, y = valor do alcool, d = velocidade media  
      // a = distancia percorrida, b = tempo gasto no percurso , v = vantagem, c = quantidade de litros gastos  
                
        float x,y,a,b,v,c=50,d;
        
        a = Float.parseFloat(JOptionPane.showInputDialog(null," Qual a distancia a ser percorrida em KM "));
        b = Float.parseFloat(JOptionPane.showInputDialog(null," Qual o tempo gasto em Horas "));
       
                
        d = (a/b);
        v = (a/c);
        JOptionPane.showMessageDialog(null," O carro faz em media por " + v + " KM/L \n"+" sendo o tanque de combustivel de 50 litros ");
        JOptionPane.showMessageDialog(null," A velocidade Media do carro e " + d + " KM/H ");
        
        y = Float.parseFloat(JOptionPane.showInputDialog(null," O valor do ALCOOL "));
        x = Float.parseFloat(JOptionPane.showInputDialog(null," O valor do GASOLINA "));
        if ( y < ( 0.70*x)){
            JOptionPane.showMessageDialog(null," Coloque alcool "+ " Seu gasto com Alcool sera de = " +(y*c) );
        }else{
            JOptionPane.showMessageDialog(null," Coloque GAsolina" + " Seu gasto com Gasolina sera de = " +(x*c));
        }
        

        
    }
}
