/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula;

import java.util.ArrayList;

/**
 *
 * @author VINICIUS
 */
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList < Veiculo> lista= new ArrayList();
       
        lista.add(new Veiculo("celta",1999,"vermelho"));
        
        for(int i=0;i<lista.size();i++){
            System.out.println(" a lista e "+lista.get(i).getNome() );
        }
        
        
        
    }
    
}
