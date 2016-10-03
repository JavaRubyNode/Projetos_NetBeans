package osmar;

import javax.swing.JOptionPane;


public class Osmar {

   int cont = 0;
        int quant;
        Veiculo primeiro;
        Veiculo ultimo;
        
        // inicializando uma lista vazia 
         public Osmar(){
            this.quant = 0;
            this.primeiro = null; 
            this.ultimo = null;
          
        }
       
// metado para inserir no começo da lista   
   public void inserirComeco(String nome, String cor,int ano){
       if(this.quant==0){
       
           // lista vazia 
           
         Veiculo novo = new Veiculo();
         novo.setAno(ano);
         novo.setCor(cor);
         novo.setNome(nome);
         novo.setProximo(primeiro);
         this.primeiro = novo;
           
       }else{
           Veiculo nov = new Veiculo();
           nov.setAno(ano);
         nov.setCor(cor);
         nov.setNome(nome);
         nov.setProximo(primeiro);
         primeiro = nov;
           
       }
       this.quant++;
   }      

   
// metado criado para inserir no final 
   
   public void inserirFinal(String nome, String cor,int ano){
       Veiculo novo = new Veiculo();
       novo.setAno(ano);
       novo.setCor(cor);
       novo.setNome(nome);
       
       if(this.quant==0){
           novo.setProximo(ultimo);
           this.primeiro = novo;
           this.ultimo = novo;
           
       }else{
           ultimo.setProximo(novo);
           ultimo = novo;
           
       }
       this.quant++;
   }
   
   
// metado para pesquisar objeto na lista    
   public void pesquisarElemento(String nome, String cor,int ano){
       Veiculo e = new Veiculo();
       Veiculo aux = this.primeiro;
       e.setNome(pegar(" Informe o nome do Carro para pesquisar"));
       
       while(aux.getProximo()!= null){
           if(aux.getNome().equals(e.getNome())){
               ver(" Carro Encotrado "+e.getNome());
            
           }else{
             ver(" Nome do carro não encontrado ");
           }
             aux = aux.getProximo();
       }
   }
   
   
   
   
   
   
   
   // metado para inserir em qualquer posição
   
   public void inserir(int posicao,String nome, String cor,int ano){
       Veiculo car = new Veiculo();
      
       car.setAno(ano);
       car.setCor(cor);
       car.setNome(nome);
      
       Veiculo aux = new Veiculo();
       
       if(posicao < 0|| posicao>this.quant){
           ver(" valor invalido da posição !!!!"+
                   "\n digite novamente um valor ");
       }
       if(posicao == this.quant){
           this.inserirFinal(nome, cor, ano);
       }else{
           if(posicao == 0){
               this.inserirComeco(nome, cor, ano);
           }else{
               for(int i=0;i<posicao-1;i++){
                   aux = aux.getProximo();
               }
               car.setProximo(aux.getProximo());
               aux.setProximo(car);
               aux = car;
           }
           this.quant++;
       }
       
       
       
   }
   
   

// metado para mostar a lista      
   public void imprimir (){
        if(this.quant==0){
            ver(" A lista esta vazia ");
        }else{
            Veiculo aux = this.primeiro;
            for (int i=0;i<this.quant;i++){
                ver("A cor = "+aux.getCor()+
                    "\nO ano do carro = "+aux.getAno()+
                    "\nO nome do carro = "+aux.getNome()+"\n");
                aux = aux.getProximo();
            }
        }
       
       
   }
   
   
   
   
   
  // metado para usar janelas        
     
    public static void ver (String texto){
          JOptionPane.showMessageDialog(null,texto);
      }   
      public static String pegar (String text){
          return JOptionPane.showInputDialog(text);
      }   
         
         
         
         
    public static void main(String[] args) {
        Osmar a = new Osmar ();
        Veiculo b = new Veiculo();
       
      
        while(true){
             int opc = Integer.parseInt(pegar(" ::: Escolha umas das opções abaixo ::: "+
               "\n 1- Inserir no inicio "+
               "\n 2- Inserir no meio "+
               "\n 3- Inserir no final "+
               "\n 4- Contador de Nós "+
               "\n 5- Mostar a Lista "+
               "\n 6- Sair "));
            
             switch (opc){
      
  // caso 1 e para inserir no inicio da lista                
                case 1:
                      
                     b.setAno(Integer.parseInt(pegar(" Informe um ano ")));
                      b.setCor(pegar(" Informe uma cor "));
                      b.setNome(pegar(" Informe o Nome do Carro "));
     
                      a.inserirComeco(b.getNome(), b.getCor(),b.getAno());
                  
                     break;
                    
 // caso 2 e para inserir em qualquer posição                    
                case 2: 
                   
                      b.setPosicao(Integer.parseInt(pegar(" Informe uma posição para colocar na lista ")));
                    
                        b.setAno(Integer.parseInt(pegar(" Informe um ano ")));
                      b.setCor(pegar(" Informe uma cor "));
                      b.setNome(pegar(" Informe o Nome do Carro "));
                    a.inserir(b.getPosicao(),b.getNome(), b.getCor(), b.getAno());
                    
                    break;
 
 // caso 3 e para inseirir no final da lista                   
                case 3:
                       b.setAno(Integer.parseInt(pegar(" Informe um ano ")));
                      b.setCor(pegar(" Informe uma cor "));
                      b.setNome(pegar(" Informe o Nome do Carro "));
                    a.inserirFinal(b.getNome(), b.getCor(),b.getAno());
                    
                break;
   
// caso 4 e para contar o numeros de Nós                  
                case 4:
               
                    break;
                 
  // caso 5 e para mostrar a lista                   
                case 5:
                    
                    a.imprimir();
                   
                    break;
                    
                case 6:
                    System.exit(0);
                    break;
                    
            }
            
            
        }
        
        
      
      
    
   
    }
    
}
