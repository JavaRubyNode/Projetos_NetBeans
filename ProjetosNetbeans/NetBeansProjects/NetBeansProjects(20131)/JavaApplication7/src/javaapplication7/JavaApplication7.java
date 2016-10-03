/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.Scanner;
/**
 *
 * @author vinicius
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        System.out.println(" informe um numero: ");
        int numero= Integer.parseInt(entrada.nextLine());
        if(numero % 2==0){
            System.out.println(" par ");
                } else{
            System.out.println("impar");
        }
    }
}
        
