package derivada2;

import javax.swing.JOptionPane;

public class Derivada2 extends Variavel {

    public static void main(String[] args) {

        Variavel b = new Variavel();

        b.setTexto(" Programa para calcular Derivadas !!!!!!!");
        b.Imprime(b.getTexto());

        while (true) {

            b.setOpc(Integer.parseInt(JOptionPane.showInputDialog(" Dadas as funções abaixo: \n "
                    + "\n \" ------Escolha uma para calcular a sua Derivada---------  \" \n"
                    + "\n 1 ->  f ( x ) = x - 1  /  x - 2  "
                    + "\n 2 ->  f ( X ) = 10 x ³ + 5 x ² "
                    + "\n 3 ->  f ( x ) = x - 3  /  2x + 4 "
                    + "\n 4 ->  f ( x ) = 5x - 3 "
                    + "\n 5 ->  Sair")));

            switch (b.getOpc()) {

                case 1:
                    b.Imprime(" Tendo uma divisão na função escolhida usamos a formula :"
                            + "\n ( Derivada do numerador = x - 1 ) . ( Denominador = x - 2 )  - "
                            + " ( numerador = x - 1 ). ( Derivada do denominador = x - 2 )"
                            + "\n divido o ( Denominador ) ² \n "
                            + "\n Derivamos o Denominador x - 2 , ficando : "
                            + "\n f '( x ) = 1 "
                            + "\n Derivamos o Numerador x - 1 , ficando : "
                            + "\n f '( x ) = 1 "
                            + "\n 1.( x - 2 ) - ( x - 1 ).1  /  ( x - 2 )²"
                            + "\n Resolvendo o Cálculo ficando: "
                            + "\n x - 2 - x + 1  /  ( x - 2 )²"
                            + "\n f ' ( x ) = -1  /  ( x - 2 )²");

                    b.setOpc1(Double.parseDouble(JOptionPane.showInputDialog(" Tendo f '( x ) = -1  /  ( x - 2 )² , "
                            + "\n De um valor para X . ")));

                    b.Imprime(" A Derivada f '( x ) =  -1  / ( x - 2 )² ,"
                            + "\n sendo x = " + b.getOpc1()
                            + "\n -1 / ( " + b.getOpc1() + "  -  2 )² "
                            + "\n -1 / " + " x² - 4x + 4 "
                            + " \n Resolvendo fica: "
                            + "\n -1 / " + Math.pow(b.getOpc1(), 2) + " - 4 . " + b.getOpc1() + " + 4 "
                            + "\n -1 / " + ((Math.pow(b.getOpc1(), 2)) - 4 * b.getOpc1() + (4))
                            + "\n Ficando = " + (-1 / ((Math.pow(b.getOpc1(), 2)) - (4 * b.getOpc1()) + (4))));

                    break;

                case 2:

                    b.Imprime(" Tendo a função f ( x ) = 10x³ + 5x² "
                            + "\n na Regra de soma de Derivadas façase-a,\n resolve cada uma por vez "
                            + "\n 1- Derivada 10x³, ficando:  "
                            + "\n 10.3x² == 30x² "
                            + "\n 2- Derivada 5x², ficando: "
                            + "\n 5.2x¹ == 10x "
                            + "\n A Derivada fica f'( x ) = 30X² + 10X ");
                    b.setX(Double.parseDouble(JOptionPane.showInputDialog(" Dada a Derivada f '( x ) = 30X² + 10X², "
                            + "\n De um valor para X ")));

                    b.Imprime(" A Derivada f '( x ) = 30X² + 10X "
                            + "\n sendo X = " + b.getX()
                            + "\n f '( " + b.getX() + " ) = 30." + b.getX() + "² + 10." + b.getX()
                            + "\n f '( " + b.getX() + " ) = " + ((30 * Math.pow(b.getX(), 2)) + (10 * b.getX())));

                    break;

                case 3:

                    b.Imprime("  Como a f ( x ) é uma Divisao teremos a seguinte formula: "
                            + " \n ( Derivada do Numerador) . (Denominador) - ( Numerador ) . ( Derivada do Denominador ) "
                            + " \n divido pelo,( Denominador ) ² . ");
                    b.Imprime("\n Derivamos o Numerador = f ( x )= x - 3 , ficando assim: "
                            + "\n f '( x ) = 1 " + "\n Derivador o Denominador = f ( x ) = 2x + 4, ficando assim: "
                            + " \n f '( x ) = 2 "
                            + "\n( Denominador )² = f( x ) = 2x + 4 , ficando assim : "
                            + "\n 4x² + 16x + 16 "
                            + "\n a derivada de, f( x ) = x - 3  /  2x + 4" + "\n fica : "
                            + " \n 1.( 2x + 4 ) - ( x - 3 ).2  /  4x² + 16x + 16 , \n fazendo o cálculo: "
                            + "\n  2x + 4 - 2x + 6 / 4x² + 16x + 16, ficando:  \n f '( x ) = 10  / 4x² + 16x + 16");
                    b.setY(Double.parseDouble(JOptionPane.showInputDialog(" Tendo a derivada f '( x ) = 10  /  4x² + 16x + 16 "
                            + " \n De um valor para X: ")));
                    b.Imprime(" A Derivada f '( x ) = 10 / 4x² + 16x + 16 "
                            + "\n  f '( " + b.getY() + " ) = " + "10 /  4. " + b.getY() + " ² + 16. " + b.getY() + " + 16 "
                            + "\n sendo x = " + b.getY() + "\n teremos uma resposta =  "
                            + (10 / ((4 * (Math.pow(b.getY(), 2))) + (16 * (b.getY())) + (16))));

                    break;

                case 4:

                    b.Imprime(" Como agora a Função f ( x ) = 5x - 3  e mais simples a sua Derivada ficará :"
                            + "\n f ( x ) = 5x - 3 , assim "
                            + "\n f '( x ) = 5 , como a derivada resultou numa \n "
                            + "função constante pode atribuir qualquer, \n valor que sempre gera um resultado igual a 5");

                    break;

                case 5:
                    System.exit(0);
                    break;

            }

        }

    }

       
}
