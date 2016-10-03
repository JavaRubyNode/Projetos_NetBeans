
package br.com.vinicius.controle;

import br.com.vinicius.bean.Jogador;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class JogadorBC {
    
    
    
    
    
    
      static ArrayList<Jogador> jogador = new ArrayList();
static Jogador a = new Jogador();
    
    public static void listaJogadores(){
         
        a.setIdade(inteiro(pegar(" Informe a idade ")));
        a.setNome(pegar(" Informe o nome do Jogodor"));
        a.setPosicao(pegar(" O "+a.getNome() +" esta em qual posição "));
        jogador.add(a);
        ver(" Jogador cadrastrado com sucesso !!!! ");
    }
    
   
    public static void salvar(){
        
        String diretorioUsuario = System.getenv("USERPROFILE");
         try {
            FileOutputStream fos = new FileOutputStream(diretorioUsuario + "\\livros.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(jogador);
            oos.close();
        } 
        catch (Exception ex) {
            ver("Erro: " + ex.toString());
        }
    }
    
    
    public static void carregar(){
       Jogador temp = new Jogador();
        
        String diretorioUsuario = System.getenv("USERPROFILE");
        
        try {
            FileInputStream fis = new FileInputStream(diretorioUsuario + "\\livros.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Jogador> jogador = (ArrayList<Jogador>)ois.readObject();
            ois.close();
            
            // percorre o array list
            for(int i = 0; i < jogador.size(); i++){
               temp = jogador.get(i);
                
            } 
            //ver(temp.toString());
        } 
        catch (Exception ex) {
            ver("Erro: " + ex.toString());
        }
    }
    
    
    
    public static void mostar(){
        
        Jogador b = new Jogador();
         for(int i=0 ; i<jogador.size();i++){
             b=jogador.get(i);
         }
        ver(b.toString());
        
    }
    
    
    public static void menu(){
        
        int opc;
        
        while(true){
            
            opc=inteiro(pegar(" ::::::::: Menu de Opções :::::::::::::::"+
                    "\n 1 - Cadrastar Jogador "+
                    "\n 2 -  Salvar Jogadores "+
                    "\n 3 - Carregar Jogadores  "+
                    "\n 4 - Mostrar Jogadores "+
                    "\n 5 - Sair "));
            
            
            switch (opc){
                
                case 1:
                    
                    listaJogadores();
                    
                    break;
                
                case 2:
                    
                    salvar();
                    
                    break;
                    
                case 3:
                
                    carregar();
                
                    break;
                    
                    
                case 4:
                    mostar();
                    
                    break;
                    
                case 5:
                    
                    
                    System.exit(0);
                    break;
                
                
                
                
            }
        }
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    public static int inteiro(String a){
        
        return Integer.valueOf(a);
    }
    
    
    public static String pegar(String texto){
        return JOptionPane.showInputDialog(texto);
    }
    public static void ver(String texto1){
      JOptionPane.showMessageDialog(null,texto1);
    }
    
}
