package br.com.vinicius.fila;


import br.com.vinicius.metodos.Funcao;
import java.util.ArrayList;
import java.util.List;


public class Fila < T > {
     
     
     List<Object> lista = new ArrayList<>();
    
    public List< Object > mostrar(){
       toString();
        return this.lista; 
    }
    
    public void cadastrarLista(Object o){
        listaVazia();
        this.lista.add(o);
    }
    
    public int quantidade(){
        listaVazia();
        return this.lista.size();
    }
    
    public void listaVazia(){
       Funcao a = new Funcao();
        
        if(this.lista.isEmpty()){
            a.ver(" Lista vazia ");
        }else{
            a.ver(" Lista não está vazia ");
        }
    }
    
    
    public void pesquisar(){
        Funcao a = new Funcao();
        Object c;
     
        String opc = a.pegar(" Digite oque deseja pesquisar ");
        
        c = (Object)opc;
        for(Object pes:lista){
            
            if(c.equals(pes)){
                a.ver(" Foi encontrado = "+pes);
            }else{
                a.ver(" Não foi encontrado");
            }
            
        }
        
    }
    
     @Override
     public String toString(){
         
         return String.valueOf(this.lista);
     } 
    
   
   
    

//32786090  32334800
}
