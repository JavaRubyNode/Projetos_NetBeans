
package osmarexercicio;

import java.text.NumberFormat;
import java.util.Locale;


public class Produto {
    
    private String nome;
    private double preco;

    public Produto() {
    }

    public Produto(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    private double quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
   
    
    @Override 
    
    public String toString(){
        
        
        Locale regiao = new Locale("pt","BR");
        
       NumberFormat calc = NumberFormat.getCurrencyInstance(regiao);
        
        
        
        return " O nome do produrto = "+this.nome+"\n O preço e = "+calc.format(this.preco)+"\n A quantidade = "+this.quantidade;
    }
    
    
}
