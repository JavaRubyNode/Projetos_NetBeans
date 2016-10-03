package retorno;

import javax.swing.JOptionPane;

public class Retorno {

    /**
     *
     */
    public static void main(String[] args) {
        float a, b, c, d, x=0, y , w, i, l, m;

        a = Float.parseFloat(JOptionPane
                .showInputDialog(" Sendo os pontos de uma reta ( a , b ),\n"
                + " Digite o valor de \" A\""));
        b = Float.parseFloat(JOptionPane
                .showInputDialog(" Sendo os pontos de uma reta ( a , b ),\n"
                + " Digite o valor de \" B\""));
        c = Float.parseFloat(JOptionPane
                .showInputDialog(" Sendo os pontos de uma reta ( c , d ),\n"
                + " Digite o valor de \" C\""));
        d = Float.parseFloat(JOptionPane
                .showInputDialog(" Sendo os pontos de uma reta ( c , d ),\n"
                + " Digite o valor de \" D\""));

        i = ((d - b) / (c - a));
        l = (a - c);
        m = (b - d);
        w = (l * l) + (m * m);

        y = i*a+x;
      x = y-(i*x);

        JOptionPane.showMessageDialog(null, " Dados os pontos a Equação sera assim " + " y = " + i + " x "+x);

        JOptionPane.showMessageDialog(null,
                " A distância entre os pontos ( a , b ) e ( c , d ) será = "
                + Math.sqrt(w));


        JOptionPane
                .showMessageDialog(null, " A inclinação da reta será = " + i);
    }
}
