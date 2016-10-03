package javaapplication3;

import javax.swing.JOptionPane;

public class JavaApplication3 {
  public static void main(String[] args) {
    Jogador jogadores[] = new Jogador[5];
    for(int i = 0; i < jogadores.length; i++){
      jogadores[i] = new Jogador();
      jogadores[i].setNome(JOptionPane.showInputDialog("Nome: "));
      jogadores[i].setPosicao(JOptionPane.showInputDialog("Posição: "));
    }
    
    String res = "";
    for(int i = 0; i < jogadores.length; i++){
       res = res + jogadores[i].getNome() +
         " - " + jogadores[i].getPosicao() + "\n";
    }
    
    JOptionPane.showMessageDialog(null, res);
  }
}
