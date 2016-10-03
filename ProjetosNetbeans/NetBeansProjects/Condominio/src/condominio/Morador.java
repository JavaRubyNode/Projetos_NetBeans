package condominio;

// a classe Morador herda de Pessoa
public class Morador extends Pessoa{
    private String telefone;
    private int andar; // número do andar
    private int apartamento; // número do apartamento
    
   
     public Morador() {
    }
    
    
    public Morador(String Nome, int idade, int sexo, int andar,int apartamento,String telefone) {
        super(Nome, idade, sexo); // chama o construtor da superclasse
        this.apartamento=apartamento;
        this.andar = andar;
        this.telefone = telefone; 
      
    }

   
   

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getApartamento() {
        return apartamento;
    }

    public void setApartamento(int apartamento) {
        this.apartamento = apartamento;
    }
}
