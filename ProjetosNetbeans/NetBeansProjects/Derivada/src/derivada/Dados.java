package derivada;

import javax.swing.JOptionPane;


public class Dados {
   private String texto;
   private String texto1;
   private double x; 
   private int opc; 
   
   
   
   public static void Imprime(String texto){
       
       JOptionPane.showInputDialog(texto);
   }
   static String Conversor (String opc){
       String saida="";
       int opc1;
       opc1 = Integer.parseInt(opc);
       return saida;
   }
   
   
    static void Resposta(String texto1){
        JOptionPane.showMessageDialog(null,texto1);
    }
  
   

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto1() {
        return texto1;
    }

    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }
    
    
    
    
}
