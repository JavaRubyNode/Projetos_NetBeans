/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.vinicius.bean;

import java.io.Serializable;

/**
 *
 * @author VINICIUS
 */
public class Jogador implements Serializable{
    
    private String nome;
    private String posicao;
    private int idade;

    public Jogador(String nome, String posicao, int idade) {
        this.nome = nome;
        this.posicao = posicao;
        this.idade = idade;
    }

    public Jogador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override 
    
    public String toString(){
        
        return " \r\n O nome = "+this.nome+"\r\n A posição do "+this.nome+"= "+this.posicao+"\r\n A idade = "+this.idade;
    }
    
    
}
