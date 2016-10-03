/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array;

import java.util.ArrayList;

/**
 *
 * @author VINICIUS
 */
public class Pedido {
    private int codigo;
    private String data;
    private double valor;
    private double desconto;
    
    private ArrayList <Produto> produto;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public ArrayList < Produto > getProduto() {
        return produto;
    }

    public void setProduto(ArrayList < Produto > produto) {
        this.produto = produto;
    }
}
