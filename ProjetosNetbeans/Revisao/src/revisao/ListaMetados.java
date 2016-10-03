

package revisao;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaMetados {
    
    static int opc;
   static ArrayList<Imovel> lista = new ArrayList();
    
 //-------------------------------------------------------   
    public static void setlista (Imovel b){
        
        Imovel a = new Imovel();
        
        opc = Integer.parseInt(pegar(" Quantos Imoveis quer Cadrastrar"));
        
        a.setEndereco(pegar(" Qual o endereço da casa "));
       a.setPreco(Double.parseDouble(pegar(" Qual o preço do Imovel ")));
       a.setTipo(Integer.parseInt(pegar("Digite \n 1 - Residencial "+
               "\n 2 - Cormecial ")));
       
       b = a;
       
       lista.add(b); 
        
    }
//------------------------------------------------------------------------   
    
    public static void getlista(){
        
        for(int i=0;i<opc;i++){
            Imovel temp = lista.get(i);
            ver(temp.toString());
            
        }
        
    }
    
 //------------------------------------------------------------------------   
    
    public static void quant(){
        
        int cont = 0;
        
        for(int i=0;i<lista.size();i++){
            cont++;
            
        }
        ver(" A quantidade de Imoveis e = "+cont);
        
    }
    
//-------------------------------------------------------------------    
    public static void porcentagem(){
        DecimalFormat calc = new DecimalFormat(" ##.## %");
        int cont1 = 0;
        for(int i=0;i<lista.size();i++){
        
            Imovel aux = lista.get(i);
            
            if(aux.getPreco()>10000){
                cont1++;
            }
            ver(" A porcetangem = "+calc.format(cont1/opc));
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
