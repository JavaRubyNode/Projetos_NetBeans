
package contador;
import javax.swing.JOptionPane;

public class Contador {
// o usuario informe dois numeros se os dois forem pares faca a soma 
// se ambos forem impares faca a multiplicação
    
    public static void main(String[] args) {
        
        float num1,num2;
num1=Float.parseFloat(JOptionPane.showInputDialog(null," Digite 1° numero "));
num2=Float.parseFloat(JOptionPane.showInputDialog(null," Digite 2° numero "));
        if(num1 % 2==0){
            if(num2 % 2==0){
JOptionPane.showMessageDialog(null," Ambos sao pares.A soma e: "+(num1+num2));                
            }else{
JOptionPane.showMessageDialog(null," 1º e par,2º e impar "+ num2);                
            }
        }else{
            if(num2 % 2!=0){
JOptionPane.showMessageDialog(null," Ambos sao impares.O produto e: "+(num1*num2));                
            }else{
JOptionPane.showMessageDialog(null," 1º e impar,2º e par " +num1);                
            }
                    
        }
  
    }
}
