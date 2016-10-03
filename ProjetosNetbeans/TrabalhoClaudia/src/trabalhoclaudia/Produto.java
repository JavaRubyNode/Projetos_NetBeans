
package trabalhoclaudia;

import java.util.Locale;

import java.text.NumberFormat;


public class Produto {
    
     
    
    
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    public Produto(String nome, double precoCusto, double precoVenda, double margemLucro) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.margemLucro = margemLucro;
    }

    public Produto() {
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }
    
    @Override
    
    public String toString(){
        
        Locale regiao = new Locale("pt","BR");
        
       NumberFormat calc = NumberFormat.getCurrencyInstance(regiao);
     NumberFormat cal = NumberFormat.getPercentInstance();
        
     
        return " O nome do produto  = "+this.nome +"\n"+
                "\n O preço de custo do , "+this.nome+" = "+calc.format(this.precoCusto)+
                "\n A margem de Lucro = "+cal.format(this.margemLucro/100)+
                "\n O Preço de venda sera  = "+calc.format(this.precoVenda);
    }
    
    
    
    
}
