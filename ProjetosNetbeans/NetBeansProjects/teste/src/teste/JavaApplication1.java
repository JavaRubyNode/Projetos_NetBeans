package javaapplication1;

import javax.swing.JOptionPane;

public class JavaApplication1 {
    public static void main(String[] args) {
        String titulo = JOptionPane.showInputDialog("Título");
        Livro a = new Livro(titulo, 250);
        JOptionPane.showMessageDialog(null,
           a.getTitulo());
        //a.setTitulo("Delphi");
        //a.setPaginas(250);
    }
}
