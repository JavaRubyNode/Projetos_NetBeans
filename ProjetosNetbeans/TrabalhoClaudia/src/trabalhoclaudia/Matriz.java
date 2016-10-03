
package trabalhoclaudia;

import javax.swing.JOptionPane;


public class Matriz {
    
   
      double x;
     int opc = Integer.parseInt(pegar(" Quantos produtos quer lancar ? "));
    
    Produto lis[] = new Produto[opc];
    
    public void lista(){
        
      
        
        for (int i =0;i<lis.length;i++){
            
            lis[i] = new Produto();
            lis[i].setNome(pegar(" Informe o Nome do Produto "));
            lis[i].setMargemLucro(Double.parseDouble(pegar(" Informe a Margem de lucro do "+lis[i].getNome())));
            lis[i].setPrecoCusto(Double.parseDouble(pegar(" Informe o preço de custo do "+lis[i].getNome())));
             
          
        
        x = ((lis[i].getMargemLucro()/100)+1);
        
        
        lis[i].setPrecoVenda((lis[i].getPrecoCusto())*x); 
            
        }
        
        
    }
    
    public void mostar(  Produto aux){
        
        for (Produto li : lis) {
            aux = li;
        }
        
        ver(aux.toString());
        
                
    }
    
    
 
    
     public static void ver(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    public static String pegar(String text) {
        return JOptionPane.showInputDialog(text);
    }

}
