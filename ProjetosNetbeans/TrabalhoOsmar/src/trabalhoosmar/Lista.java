
package trabalhoosmar;


public class Lista {
    private No primeiro;
    private No ultimo;

Veiculo b = new Veiculo();    
    
 public void inserirComeco(Veiculo v){
       No a = new No();
       a.setVeiculo(v);
       if(primeiro == null){
        primeiro = a;
        ultimo = a;
        a.setProximo(null);
     }
       
   }
}
