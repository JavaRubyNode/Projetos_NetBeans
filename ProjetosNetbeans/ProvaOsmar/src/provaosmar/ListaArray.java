
package provaosmar;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

public class ListaArray {
  
   
  
 static  List<Candidato> voto = new ArrayList<>();
        
      
static  int  opc = Integer.parseInt(pegar(" Quantos Candidatos quer informar "));
    
    
    //------------------------------------------------------------------
    
  
    
    public static void lista(Candidato a ){
       
        
    
        
        
        for(int i=0;i<opc;i++){
                
            Candidato b = new Candidato();
                
                
              b.setNome(pegar (" Qual o nome do Canditado "));
              b.setIdade(Integer.parseInt(pegar(" Qual idade do Candito "+b.getNome())));
              b.setSexo(pegar(" Qual o Sexo do(a) " + b.getNome()
                    + "\n Digite ( Masculino ) "
                    + "\n Digite ( Feminino ) ").charAt(0));
              
              a=b; 
         
              
              voto.add(a);
              
        }

       
        
       
        
        
        
        
        while(true){
            
            
            
            
            
            
        }
        
        
        
        
        
         
    }//-------- final do metodo lista -----------------------------------------------------------------
    
    
   //--------- metodo pesquisar canditado -------------------------------------------------------
    
    
    public static void pesquisar(){
        
        
         String busca;
        
             busca =pegar(" O nome do canditado para pesquisar");
        
        for(int i=0;i<voto.size();i++){
           
                   
            Candidato aux = voto.get(i);
              if(busca.equalsIgnoreCase(aux.getNome())){
                ver(" O canditado encontrado= "+busca);
                break;
       
              
      
            }else{
                  ver(" Candidato não encontrado ");
                  break;
              }
            
                
        }
        
        
    }//----- fim do metodo -------------------------------------------------------------------------
    
    
    //------------------------------------------------------------------------------------------------------
    
    public static void mostarLista(Candidato temp){
        
        
         
            for(int k =0;k<voto.size();k++){
                temp = voto.get(k);
             ver(temp.toString());
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
