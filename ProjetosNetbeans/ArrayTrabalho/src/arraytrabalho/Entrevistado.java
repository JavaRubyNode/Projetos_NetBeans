
package arraytrabalho;

/**
 *
 * @author VINICIUS
 */
public class Entrevistado {
    private String nome;
    private String radio;
    private char sexo;
    private double idade;

    public Entrevistado() {
    }

    public Entrevistado(String nome, String radio, char sexo, int idade) {
        this.nome = nome;
        this.radio = radio;
        this.sexo = sexo;
        this.idade = idade;
    }

    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString(){
        return " Nome : " + this.nome + "\n Idade do(a) "+this.nome+" e : "+ this.idade + "\n Sexo : " + this.sexo+
                " \n Radio Preferida : "+this.radio; 
    }
}
