
package br.com.osmar.bean;

/**
 *
 * @author VINICIUS
 */
public class Veiculo {
    
    private int codigo;
    private String cor;
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
   
    
    public Veiculo() {
    }

    public Veiculo(int codigo, String cor, String marca, String modelo, int ano,String placa) {
        this.codigo = codigo;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    @Override
    public String toString(){
        
        return " A cor = "+this.cor+"\n A Marca = "+this.marca+"\n O Modelo = "+
                this.modelo+"\n O ano = "+this.ano+"\n A placa = "+this.placa;
    }
    
    
}
