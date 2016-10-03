package aula_11_03_2014_entrevistados_arraylist;

public class Entrevistado {
    private String nome;
    private int idade;
    private char sexo;
    private String radioFavorita;

    // construtor cheio: Alt + Insert -> Construtor -> Marca todos -> Gerar
    public Entrevistado(String nome, int idade, char sexo, String radioFavorita) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.radioFavorita = radioFavorita;
    }
    
    // construtor vazio: Alt + Insert -> Construtor -> Não marca nenhum -> Gerar
    public Entrevistado() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getRadioFavorita() {
        return radioFavorita;
    }

    public void setRadioFavorita(String radioFavorita) {
        this.radioFavorita = radioFavorita;
    }
}
