/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revisao;


public class Imovel {
    private String endereco;
    private double preco;
    private int tipo;

    public Imovel() {
    }

    public Imovel(String endereco, double preco, int tipo) {
        this.endereco = endereco;
        this.preco = preco;
        this.tipo = tipo;
    }

    
    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    @Override 
    
    public String toString(){
        String tipo = "Comercial";
        if(this.getTipo()==1 ){
            tipo = " Residencial ";
        }
        
        return " O endereço = "+this.endereco+"\n Tipo "+this.tipo+"\n Preço do Imovel "+this.preco;
    }
}
