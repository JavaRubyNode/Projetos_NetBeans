package listaligada;



public class Lista {
   No primeiro = null;
   No ultimo = null;
   
   public void inserirInicio(Livro livro){
     No n = new No();
     n.setLivro(livro);
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
       res += temp.getLivro().getTitulo();
       temp = temp.getProximo();
     }
     
     return res;
   }
}
