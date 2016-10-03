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
public class Cliente {
    private int codigo;
    private String nome;

   
   
    ArrayList < Pedido > pedidos;
    
    public Cliente(){
        pedidos = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList < Pedido > getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList < Pedido > pedidos) {
        this.pedidos = pedidos;
    }
    
    
}
