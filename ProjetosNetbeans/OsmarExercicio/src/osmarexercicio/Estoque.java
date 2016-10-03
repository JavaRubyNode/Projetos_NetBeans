
package osmarexercicio;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Estoque {
    
    static ArrayList<Produto> produ = new ArrayList();
    
    static int opc = Integer.parseInt(pegar(" Quantos produtos quer  Cadrastrar ? ")); 
    
   
    public static void listaProduto( ){
        
        
        for(int i=0;i<opc;i++){
            
            
            Produto a = new Produto();
    
            
           
            a.setNome(pegar(" Informe o nome do Produto "));
            a.setPreco(Double.parseDouble(pegar(" Qual o preço do(a) , "+a.getNome())));
            a.setQuantidade(Double.parseDouble(pegar(" Quantidade do(a) , "+a.getNome())));
            
            produ.add(a);
        }
        
        
    }
    
    public static void mostarLista(){
        
        Produto temp = new Produto();
  
         if(produ.isEmpty()){
               
             ver(" Lista vazia Cadrastar um Produto ");
            
         }else{
         
             for (Produto produ1 : produ) {
            temp = produ1;
        }
        
             ver(temp.toString());
         }
        
       
        
        
        
    }
    
    
    public static void pesquisarProduto(){
        String busca;
                Produto aux;
        
        busca = pegar(" Informe o nome do produtos ");
        
        for (Produto produ1 : produ) {
            aux = produ1;
            if(busca.equalsIgnoreCase(aux.getNome())){
                ver(" O Produto encontrado foi = "+busca);
                break;
                
                
            }else{
                ver(" Produto não encontrado ");
                break;
            }
        }
        
        
    }
    
    
    
    
    
    public static void removerProduto( ){
        
        String nome;
                Produto aux;
       
        
        boolean removido = false;
        nome = pegar(" Informe o nome do produtos ");
        
        for(int i=0;i<produ.size();i++){
           
           aux =produ.get(i);
           
           if(nome.equalsIgnoreCase(aux.getNome())){
               
               produ.remove(i);
               removido = true;
               
               ver(" O Produto foi removido = ");
                break;
       
              
            }
        }
        
        if(!removido){
            ver(" Produto não Cadrastrado");
        }
    }
    
   
    
    
    public static void menu( ){
        int es;
       
        
        while(true){
            
            
            
             es =Integer.parseInt(pegar(" ::::::::::::::::::: MENU ::::::::::::::::::::::::"+
                "\n 1- Cadrastrar Produto "+
                "\n 2- Listar Produto "+
                "\n 3- Pesquisar Produto  "+
                "\n 4 - Remover Produto"+
                "\n 5 - Sair"));
            
            switch(es){
                
                
                case 1:
                 
                    listaProduto();
                    
                                       
                    break;
                
                
                case 2:
                    
                    mostarLista();
                    
                    break;
                
                
                case 3:
                    
                    pesquisarProduto();
                  
                    break;
                    
                    
                case 4:
                    removerProduto();
                    
                    break;
                    
                    
                case 5:
                    
                    System.exit(0);
                                        
                    break;
                    
                    
            }
            
            
        }
        
        
        
        
    }
    
    
    
    
     //------ metado para usar janelas ------------------        
    public static void ver(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    public static String pegar(String text) {
        return JOptionPane.showInputDialog(text);
    }
 
    
}
