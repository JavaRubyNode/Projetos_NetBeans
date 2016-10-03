package osmar;

public class Veiculo {

    private String nome;
    private String cor;
    private int ano;
    private Veiculo proximo;
    private Veiculo anterior;
    private int posicao;

    public Veiculo getAnterior() {
        return anterior;
    }

    public void setAnterior(Veiculo anterior) {
        this.anterior = anterior;
    }

    public Veiculo() {
    }

    public Veiculo(String nome, String cor, int ano) {
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Veiculo getProximo() {
        return proximo;
    }

    public void setProximo(Veiculo proximo) {
        this.proximo = proximo;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

}
