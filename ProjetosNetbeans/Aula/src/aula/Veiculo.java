/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula;

/**
 *
 * @author VINICIUS
 */
public class Veiculo {
    private String nome;
    private int ano;
    private String cor;

    public Veiculo(String nome, int ano, String cor) {
        this.nome = nome;
        this.ano = ano;
        this.cor = cor;
    }

    public Veiculo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
