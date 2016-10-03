
package provaosmar;


public class Candidato {
    private String nome;
    private char sexo;
    private int idade;
    private int voto;

    public Candidato(String nome, char sexo, int idade, int voto) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.voto = voto;
    }

    public Candidato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }
   
    
    @Override 
    
    
    public String toString(){
        
 //---- variaveis ------------------------------------------------       
        
        String sexo1 = null;
        int n=0;
        int n1 =0;

 //----- usando um if para mostrar o sexo -----------------       
        
                
        if(this.sexo == 'f' ){
            
            sexo1 =" Feminino";
        }if(this.sexo == 'm'){
            sexo1 =" Masculino";
        }
        
        
  
 //--- usando um if para contar votos ---------------------------
        
        if(this.voto==1){
            n++;
            
        }if(this.voto==2){
            n1++;
        }
        
        
        return " O nome do Canditado = "+this.nome+"\n Idade do Canditado = "+this.idade+" \n Sexo = "+sexo1+"\n Quantidade de votos a favor = "+n+
                "\n Quantidade de votos contra = "+n1;
    }
}
