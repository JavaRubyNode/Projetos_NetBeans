

package prova;


public class Livro {
   private String titulo;
   private String autor;
   private int pagina;
   private int ano;

    public Livro() {
    }

    public Livro(String titulo, String autor, int pagina, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagina = pagina;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
   
}
