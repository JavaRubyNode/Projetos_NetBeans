
package listaosmar;


public class Lista {
    private No primeiro;
     private No ultimo;
     private int quant;
     
// inicializando a lista vazia 
     
     public void Lista(){
        this.primeiro = null;
         this.ultimo = null;
         this.quant = 0;
     }

// metado para inserir no começo
     
     public void inserirComeco (Veiculo v){
         No novo = new No();
         novo.setVeiculo(v);
         
// verificando se a lista esta vazia 
         
         if(this.primeiro == null ){
             novo.setProximo(null);
             this.primeiro = novo;
             this.ultimo = novo;
             novo.setProximo(null);
             
// senão a lista não esta vazia          
         
         }else{
             novo.setProximo(primeiro);
             this.primeiro = novo;
         }
         
     }
     
// metado para inserir no final da lista      
     
     public void inserirFinal (Veiculo v){
          
        No novo = new No();
        novo.setVeiculo(v);
        
 // Verificar se a lista esta vazia 
        
        if(this.primeiro == null){
            novo.setProximo(null);
            this.primeiro = novo;
            this.ultimo = novo;
            novo.setProximo(null);

// senão a lista não esta vazia             
        }else{
           this.ultimo.setProximo(novo); 
           novo.setProximo(null);
           this.ultimo = novo;
        }
     }
}
