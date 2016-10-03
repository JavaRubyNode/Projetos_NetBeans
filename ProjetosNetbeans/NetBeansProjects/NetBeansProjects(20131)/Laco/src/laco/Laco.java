/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laco;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Laco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int valor,soma=0,cont=0;
     Scanner entrada = new Scanner (System.in);
     for (int i=0; i<10;i++){
         System.out.println(" informe um valor: "); 
         valor = Integer.parseInt(entrada.nextLine());
         if (valor % 2==0){
          soma=soma + valor;   
         }
        
    }
        System.out.println(" A soma e: " +soma );
        
}
}    
    
    
