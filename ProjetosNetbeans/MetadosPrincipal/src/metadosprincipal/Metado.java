
package metadosprincipal;

import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Metado {
    
    
    public void lista (Entrevistado a){
          int quant = 0;
          int cont = 0;
        
        ArrayList<Entrevistado> pegar;   
        pegar = new ArrayList();
        
        for(int i=0;i<10;i++){
          
            a.setNome(pegar(" O nome do entrevistado"));
            a.setIdade(Integer.parseInt(pegar(" Qual a idade do "+a.getNome())));
            a.setRadio(pegar(" Qual a radio Preferida  "));
            a.setSexo(pegar(" Para homem digite H \n Para mulher digite M "));
            pegar.add(a);
            
        }
        
     
        for(int i = 0;i<pegar.size();i++){
            Entrevistado temp = pegar.get(i);
            
            if(temp.getIdade()>=18){
               
               cont++;
                ver("o numero de idade será "+cont);
            }
            
            
            ver(" Lista de pessoas entrevistas"+temp.getNome());
            
        }
        
        
        
        
    }
    
      // metado para usar janelas        
     
    public static void ver (String texto){
          JOptionPane.showMessageDialog(null,texto);
      }   
      public static String pegar (String text){
          return JOptionPane.showInputDialog(text);
      }   
    
}
