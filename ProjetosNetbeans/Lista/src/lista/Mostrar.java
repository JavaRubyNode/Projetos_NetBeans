/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista;



/**
 *
 * @author VINICIUS
 */
public class Mostrar {
    No primeiro;
   No ultimo;
  No quant;
   
   
   // inicializando uma lista vazia 
   public Mostrar(){
       
       this.primeiro = null;
       this.ultimo = null;
   }
   
   public void inserirInicio(Veiculo veiculo){
     No n = new No();
     n.setVeiculo(veiculo);
     if(primeiro == null){
        primeiro = n;
        ultimo = n;
        n.setProximo(null);
     }
     else{
        n.setProximo(primeiro);
        primeiro = n;
     }
   }
   
   
   
   
   
   
   
   public String listar(){
     No temp = primeiro;
     String res = "";
     while(temp != null){
       res += "A cor do Carro = "+temp.getVeiculo().getCor()+"\n";
       temp = temp.getProximo();
     }
     
     return res;
   }
}

        
        
        
    
    
    
    

