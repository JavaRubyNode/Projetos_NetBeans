package cadastroveiculosswing;

import java.util.ArrayList;

public class Sistema {
    // ArrayList que guardará os veículos cadastrados
    private ArrayList<Veiculo> veiculos = new ArrayList();
    
    // método que permite cadastrar um novo veículo
    public void cadastrarVeiculo(Veiculo v){
        this.veiculos.add(v);
    }
    
    // método que retorna a quantidade de veículos cadastrados
    public int quantVeiculosCadastrados(){
        return this.veiculos.size();
    }
    
    // método que retorna uma ArrayList com todos os veículos cadastrados
    public ArrayList<Veiculo> obterVeiculos(){
        return this.veiculos;
    }
}
