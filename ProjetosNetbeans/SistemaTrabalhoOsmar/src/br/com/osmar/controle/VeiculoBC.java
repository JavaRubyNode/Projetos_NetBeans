
package br.com.osmar.controle;



import br.com.osmar.bean.Veiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * essa classe estara as regras de negocio ou seja regras de comportamento do objeto
 */
public class VeiculoBC {
    
    // ArrayList que guardará os veículos cadastrados
    private ArrayList<Veiculo> veiculos = new ArrayList();
    
    // método que permite cadastrar um novo veículo
    public void cadastrarVeiculo(Veiculo v){
        this.veiculos.add(v);
    }
    
    
 //================== Função para retornar a quantidade de veiculos ============
    public int quantVeiculosCadastrados(){
        return this.veiculos.size();
 }//============================================================================
    
    
    
 //===== Função para mostar clientes na lista ===============================
    public ArrayList<Veiculo> mostrarLista(){
               return this.veiculos;
    }//=========================================================================
    
    
    //================== Função para cadastrar veiculo na lista ================
      public void adicionarLista(String cor, String marca ,
        String modelo, String ano,String placa){
     
        Veiculo a = new Veiculo();
              
        a.setCor(cor);
        a.setMarca(marca);
        a.setModelo(modelo);
        a.setAno(t(ano));
        a.setPlaca(placa);
        veiculos.add(a);
    }//========================================================================
  
    //================ Função para converter uma String no inteiro ============
    public int t(String a ){
        
        return Integer.valueOf(a);
    }//=========================================================================
 
    
    
    //========== Função para remover da lista ==================================
    public void removerVeiculoLista( ){
        
        String nome;
       Veiculo aux;
               boolean removido = false;
        nome = pegar(" Informe a placa do Veiculo ");
                for(int i=0;i<veiculos.size();i++){
                      aux =veiculos.get(i);
         if(nome.equalsIgnoreCase(aux.getPlaca().toUpperCase())){
                              veiculos.remove(i);
                                removido = true;
                   ver(aux.getPlaca()+" foi removido com sucesso !!! ");
                                     break;
                   }
         if(!removido){
            ver(" Veiculo não Cadrastrado");
        }
        }
    }//=========================================================================
    
    
    
    //====================================== Função para retorna o codigo ====== 
    public int retornaCodigoVeiculo() {
        int cod;
        if (quantVeiculosCadastrados() == 0) {
            cod = 1;
        } else {
            cod = ((veiculos.get(veiculos.size()-1).getCodigo())) + 1;
        }
        return cod;
    }//=========================================================================
    
     //======== Função mostar lista Array ======================================
     public void mostarListaArray(){
               
         Veiculo temp = new Veiculo();
  
         if(veiculos.isEmpty()){
               
             ver(" Lista vazia Cadrastar um VEICULO");
            
         }else{
                      for (Veiculo vel : veiculos) {
            temp = vel;
        }
                     ver(temp.toString());
         }
        
    }//=========================================================================
     
     
     
    //=================  Função para Pesquisar Cliente ========================= 
    public void pesquisarVeiculoLista(){
        String busca;
                Veiculo aux;
        
        busca = pegar(" Informe a placa do veiculo ");
        
        for (Veiculo pr : veiculos) {
            
            aux = pr;
                     
            if(aux.getPlaca().toUpperCase().contains(busca.toUpperCase())){
                
                ver(" O Carro está na lista ");
                break;
                            }else{
                ver(" o Carro não está na lista  ");
                break;
            }
            
        }
        
    }//=========================================================================
    
     
     
     //=============================Função para chamar janela===================
    public String pegar(String texto){
        return JOptionPane.showInputDialog(texto);
    }
    public void ver(String texto1){
      JOptionPane.showMessageDialog(null,texto1);
    }//=========================================================================
    
    
    
}
