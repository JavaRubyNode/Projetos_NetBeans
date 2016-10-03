/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vinicius.pkg2;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Vinicius2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
        System.out.println("Informe o valor do produto: ");
        double v_produto=Double.parseDouble(entrada.nextLine());
        System.out.println("Informe a quantidade : ");
        int quantidade=Integer.parseInt(entrada.nextLine());
        double total_pagar= v_produto*quantidade;
        System.out.println(total_pagar);
        if (quantidade>5){
        total_pagar= total_pagar*0.95;
        
        }
        System.out.println(" total a pagar : "+total_pagar);   
    }
}
