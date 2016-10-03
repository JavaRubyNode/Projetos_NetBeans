package cadastroveiculosswing;

public class Veiculo {
    private int codigo;
    private String marca;
    private String modelo;
    private double preco;

    // construtor cheio
    public Veiculo(int codigo, String marca, String modelo, double preco) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public Veiculo() {
    }

    // construtor vazio
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
