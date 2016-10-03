package listaligada;

import javax.swing.JOptionPane;

public class ListaLigada {
    public static void main(String[] args) {
      Lista l = new Lista();
      
      Livro a = new Livro("Java", 200);
      l.inserirInicio(a);
      
      Livro b = new Livro("PHP", 210);
      l.inserirInicio(b);
      
      Livro c = new Livro("Delphi", 90);
      l.inserirInicio(c);
      
      l.listar();
        
      /*
      Livro a = new Livro("Java", 200);
      Livro b = new Livro("PHP", 120);
      Livro c = new Livro("Delphi", 90);
      
      No n1 = new No();
      n1.setLivro(a);
      
      No n2 = new No();
      n2.setLivro(b);
      
      No n3 = new No();
      n3.setLivro(c);
      
      n1.setProximo(n2);
      n2.setProximo(n3);
      n3.setProximo(null);
      
      /*
      JOptionPane.showMessageDialog(
         null, n1.getLivro().getTitulo());
      
      JOptionPane.showMessageDialog(
         null, n1.getProximo().getLivro().getTitulo());
      
      JOptionPane.showMessageDialog(
         null, n1.getProximo().
         getProximo().getLivro().getTitulo());
      */
      
      /*
      No temp = n1;
      while(temp != null){
        JOptionPane.showMessageDialog(
         null, temp.getLivro().getTitulo());
        temp = temp.getProximo();
      }
      */
    }
}
