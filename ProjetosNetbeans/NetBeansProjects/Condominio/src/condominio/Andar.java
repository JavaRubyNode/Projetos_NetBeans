package condominio;

public class Andar {
    private int andar; // o número do andar
    private Apartamento apartamentos[]; // uma matriz de objetos da classe Apartamento

    // construtor cheio recebe apenas o número do andar
    public Andar(int andar) {
        this.andar = andar;
        
        // vamos inicializar os objetos da classe Apartamento e numerá-los de 1 até 10
        apartamentos = new Apartamento[10];
        for(int i = 0; i < apartamentos.length; i++){
            apartamentos[i] = new Apartamento(i + 1);
        }
    }

    // construtor vazio
    public Andar() {
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public Apartamento[] getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(Apartamento[] apartamentos) {
        this.apartamentos = apartamentos;
    }
}
