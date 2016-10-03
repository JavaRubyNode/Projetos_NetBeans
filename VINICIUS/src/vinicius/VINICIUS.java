/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vinicius;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class VINICIUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double n1,n2,n3,media; 
    Scanner entrada = new Scanner (System.in);
        System.out.println(" informe a n1: ");
        n1= Double.parseDouble(entrada.nextLine());
        System.out.println(" informe a n2: ");
        n2= Double.parseDouble(entrada.nextLine());
        System.out.println(" informe a n3: ");
        n3=Double.parseDouble(entrada.nextLine());
        media= (n1+n2+n3)/2;
        
        if (media >=7){
            System.out.println(" ALUNO APROVADO: ");
            
        } else {
            System.out.println(" ALUNO REPROVADO: "); 
        }
                
    }
}
