package derivada2;

import javax.swing.JOptionPane;


public class Variavel {
    
    private String texto;
    private String texto1;
    private double x;
    private int opc;
    private double opc1;
    private double y;
    
    
    
    
    public void Imprime(String texto){
        JOptionPane.showMessageDialog(null,texto);
    }
    
    
    public String Informar(String texto1){
        return JOptionPane.showInputDialog(texto1);
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

    public double getOpc1() {
        return opc1;
    }

    public void setOpc1(double opc1) {
        this.opc1 = opc1;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

   

    
    
    
}
