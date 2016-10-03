
package bin;

import javax.swing.JOptionPane;

public class Bin {
// calcular a quantidade de numeros pares num conjunto de 3 elementos  
// a soma deles e logaritmo da soma na base 10.     
  
    public static void main(String[] args) {
       float contador=0,media=0,soma=0,x;
 
 for(float i = 0;i<3;i++){
 x = Float.parseFloat(JOptionPane.showInputDialog(null," Digite Três numeros "));
 if(x % 2==0 ){
  contador++;
  soma = (soma + x);
  
 }
media =(soma/contador);
 }
 JOptionPane.showMessageDialog(null," Quantida de numeros pares e = " + contador+ 
  " \nA soma do numeros pares e = "+ soma);
 JOptionPane.showMessageDialog(null," A media sera de = " + media+ 
         " \nO log de " + soma+ " na base 10 = "+Math.log10(soma)); 
        
        
        
        
        
    }
}
