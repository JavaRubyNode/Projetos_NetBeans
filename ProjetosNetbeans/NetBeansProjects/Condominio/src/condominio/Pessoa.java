package condominio;

public class Pessoa {
    private String Nome;
    private int idade;
    private int sexo;

    // construtor cheio
    public Pessoa(String Nome, int idade, int sexo) {
        this.Nome = Nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // construtor vazio
    public Pessoa() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
}
