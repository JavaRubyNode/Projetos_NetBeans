/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.osmar.bean;

/**
 *
 * @author VINICIUS
 */
public class Cliente {
    
    
    private int codigo;
    private String nome;
    private String sexo;
    private String cpf;

    public Cliente() {
    }

    public Cliente(int codigo, String nome, String sexo, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
    }
    
    

    public int pegarCodigo() {
        return codigo;
    }

    public void lancarCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String pegarNome() {
        return nome;
    }

    public void lancarNome(String nome) {
        this.nome = nome;
    }

    public String pegarSexo() {
        return sexo;
    }

    public void lancarSexo(String sexo) {
        this.sexo = sexo;
    }

    public String pegarCpf() {
        return cpf;
    }

    public void lancarCpf(String cpf) {
        this.cpf = cpf;
    }
    
   @Override
    public String toString(){
        return " Nome ="+this.nome+"\n Sexo ="+this.sexo+"\n CPF = "+this.cpf ;
   
    }
}
