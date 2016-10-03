
package br.com.osmar.controle;

import br.com.osmar.bean.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 *essa classe estara as regras de negocio ou seja regras de comportamento do objeto
 */
public class ClienteBC {
    
    //================ Lista de clientes =======================================
                      ArrayList<Cliente> listaCliente = new ArrayList();
    //==========================================================================
      
   //========================== Função para adicionar na lista ================= 
    public void cadastrarVeiculo(Cliente  c){
        this.listaCliente.add(c);
        ver("Cliente Cadastrado com Sucesso!\n"+c.toString());
    }//=========================================================================
    
    
    //====================== Função para gerar a lista cliente =================
    public void criarLista(String b,String c,String d ){
        
        Cliente p = new Cliente();
       
        p.lancarNome(b);
        p.lancarSexo(c);
        p.lancarCpf(d);
        
        cadastrarVeiculo(p);
        
        ver("Cliente Cadastrado com Sucesso!\n"+p.toString());
    }//=========================================================================
    
    
    
    //================ Função para verificar campos vazios =====================
    public boolean camposVazios( String a , String b ){
                boolean campo = true;
                if(campo){
            
            if(a.isEmpty()||b.isEmpty()){
                ver(" Campos vazio favor preencher ");
                campo = false;
            }
                  }
                return campo;
    }//=========================================================================
    
    
    //================== Função para verifacar campos vazios ===================
    public boolean campoVazios2( boolean m , boolean f){
        boolean campo = true;
                if(campo){
                if(m == false && f== false){
                ver(" Escolha um sexo ");
                campo = false;
                            }
                }
        
        return campo;
    }//=========================================================================
    
    
    //================================ Função para excluir da lista ============
    public void excluirCliente (int posicao) {
        this.listaCliente.remove(posicao);
     }//========================================================================
    
    
    //================== Função para alterar na lista ==========================
    public void alterarCliente(int posicao, Cliente c) {
        this.listaCliente.set(posicao, c);
    }//=========================================================================
 
    
    
    // ==== Função para pegar a quantidade de clientes =========================
    public  int quantidadeLista(){
        return this.listaCliente.size();
    }//=========================================================================
    
    
    //===== Função para mostar clientes na lista ===============================
    public ArrayList<Cliente> mostrarLista(){
               return this.listaCliente;
    }//=========================================================================
    
    
    //========== Função para retorna a posição na lista ========================
    public Cliente retornaPosicao (int posicao) {
        Cliente c = listaCliente.get(posicao);
        return c;
    }//=========================================================================
    
    
    //========== Função para remover da lista ==================================
    public void removerClienteLista( ){
        
        String nome;
       Cliente aux;
               boolean removido = false;
        nome = pegar(" Informe o nome do Cliente ");
                for(int i=0;i<listaCliente.size();i++){
                      aux =listaCliente.get(i);
         if(nome.equalsIgnoreCase(aux.pegarNome().toUpperCase())){
                              listaCliente.remove(i);
                                removido = true;
                   ver(aux.pegarNome()+" foi removido com sucesso !!! ");
                                     break;
                   }
         if(!removido){
            ver(" Produto não Cadrastrado");
        }
        }
    }//=========================================================================
    
    
    //======== Função mostar lista Array =======================================
     public void mostarListaArray(){
               
         Cliente temp = new Cliente();
  
         if(listaCliente.isEmpty()){
               
             ver(" Lista vazia Cadrastar um Cliente");
            
         }else{
                      for (Cliente produ1 : listaCliente) {
            temp = produ1;
        }
                     ver(temp.toString());
         }
        
    }//=========================================================================
    
    
    //=================  Função para Pesquisar Cliente ========================= 
    public void pesquisarClienteLista(){
        String busca;
                Cliente aux;
        
        busca = pegar(" Informe o nome do cliente ");
        
        for (Cliente produ1 : listaCliente) {
            
            aux = produ1;
                     
            if(aux.pegarNome().toUpperCase().contains(busca.toUpperCase())){
                
                ver(" O Cliente encontrado foi = "+busca);
                break;
                            }else{
                ver(" Cliente não encontrado ");
                break;
            }
            
        }
        
    }//=========================================================================
    
    
    //=================================== Função para validar sexo =============
    public String validarSexo( boolean a , boolean b){
        
        String sexo="";
        if(a){
            sexo = " Masculino";
        }else if(b){
            sexo = " Feminino";
        }
        return sexo;
    }//=========================================================================
    
    
    
    //===================== Função para pegar o codigo =========================
     public int codigoCliente(){
        Cliente temp;
        int codigo = 0;
        if(this.listaCliente.isEmpty()){
            codigo = 0;
        }else{
            for (Cliente cliente : this.listaCliente) {
                temp = cliente;
                codigo = temp.pegarCodigo();
            }
        }
        return codigo + 1;
    }//=========================================================================
     
     
   //====================================== Função para retorna o codigo ======= 
    public int retornaCodigoCliente() {
        int cod;
        if (quantidadeLista() == 0) {
            cod = 1;
        } else {
            cod = ((listaCliente.get(listaCliente.size()-1).pegarCodigo())) + 1;
        }
        return cod;
    }//=========================================================================
    
    
    //========================================= Metodo para conversão =========
    public int inteiro(String b){
        
        return Integer.valueOf(b);
    }//=========================================================================
  
    
    //============================================= Função para chamar janela===
    public String pegar(String texto){
        return JOptionPane.showInputDialog(texto);
    }
    public void ver(String texto1){
      JOptionPane.showMessageDialog(null,texto1);
    }//=========================================================================
    
    
    
}
