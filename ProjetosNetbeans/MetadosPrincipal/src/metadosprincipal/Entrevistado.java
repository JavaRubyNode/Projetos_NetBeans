
package metadosprincipal;


import javax.swing.JOptionPane;


public class Entrevistado {
    
    private String nome;
    private String sexo;
    private String radio;
    private int idade;

    public Entrevistado() {
    }

    
    
    public Entrevistado(String nome, String sexo, String radio, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.radio = radio;
        this.idade = idade;
    }

   
         
 
      
      
      
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
