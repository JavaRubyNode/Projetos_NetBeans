
package prova;

import javax.swing.JOptionPane;


public class Prova {

    
    public static void main(String[] args) {
      
       int opc;
       int cont=0;
       
       
       opc= Integer.parseInt(Pegar(" Quantos livros quer cadrastrar ? "));
        
        Livro prova[]= new Livro[opc]; 
        
        
        
        
        for(int i=0;i<prova.length;i++){
            opc=i;
            prova[i]= new Livro();
             prova[i].setPagina(Integer.parseInt(Pegar(" Quantas Páginas tem o livro ?  ")));
             prova[i].setAutor(Pegar(" Qual o autor do livro ? "));
             prova[i].setAno(Integer.parseInt(Pegar(" Qual o ano da publicação ? ")));
             prova[i].setTitulo(Pegar(" Qual o titulo do livro ? "));
             
             
        }
      String res= "";
      for(int i=0;i<prova.length;i++){
        
          if(prova[i]!= null){
             if(prova[i].getAno()>2010){
            cont++;
               
               
          
        } 
             String m = "";
            m= m + " Livros publicados apos 2010 :   "+prova[i].getAno();
            
             Imprimir(m+"\n "+
                     "\n A quantidade de livros "+cont);
          }
           
          
          res= res+" Quantidade de paginas : "+prova[i].getPagina()+
                  "\n O autor do livro : "+prova[i].getAutor()+
                  "\n Ano do livro : "+prova[i].getAno()+
                  "\n Titulo do Livro : "+prova[i].getTitulo()+"\n "+
                  "\n ";
          
         
          
      }
        Imprimir(res);
        
        
        
        
        
    }
    public static void Imprimir(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    public static String Pegar(String text) {
        return JOptionPane.showInputDialog(text);
    }
}
