package arraytrabalho;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author VINICIUS
 */
public class Metodo {


    // ------ metodo " LISTA " para iniciar a lista ---------------   
    
    public static void lista(Entrevistado b) {

         int opc = Integer.parseInt(pegar(" Quantos Pessoas quer Entrevistar ? "));

        ArrayList<Entrevistado> lista;
        lista = new ArrayList();

        for (int i = 0; i < opc; i++) {

            Entrevistado d = new Entrevistado();
            d.setNome(pegar(" Informe o nome do Entrevistado "));
            d.setIdade(Integer.parseInt(pegar(" Qual a idade do " + d.getNome())));
            d.setRadio(pegar(" Qual a sua rádio preferida "
                    + "\n Caso não tenha digite NENHUMA"));
            d.setSexo(pegar(" Qual o Sexo do(a) " + d.getNome()
                    + "\n Digite ( Masculino ) "
                    + "\n Digite ( Feminino ) ").charAt(0));
            b = d;
            lista.add(b);
            
        }

//---- um laço FOR para mostar a lista ---------------------------------------------------
       
        for (int i = 0; i < lista.size(); i++) {
            Entrevistado temp = lista.get(i);
            ver(temp.toString());

        }
//----- variaveis para contar as quantidades -----------------------------------------------
        
        DecimalFormat calc = new DecimalFormat(" ##.## %");
          double quantH = 0;
            double quantM = 0;
            double quantIdade = 0;
            double quantNenhuma = 0;
       
        
//------ outro laço FOR para mostar as quantidades ----------------------------------------        
       
            for (int i = 0; i < lista.size(); i++) {

          
            Entrevistado aux = lista.get(i);
            if (aux.getSexo() == 'm') {
                quantH++;
                
                
            }
            if (aux.getSexo() == 'f') {
                quantM++;
                
                
            }
            if (aux.getIdade() >= 18) {
                quantIdade++;
               
            }
            if (aux.getRadio().equalsIgnoreCase("NENHUMA")) {
                quantNenhuma++;
                
            }

        }
        double z = ((quantM / opc));
        double a = ((quantH / opc));
        
        ver(" A quantidade de homens = "+(int)quantH
                        +"\n A porcetagem de homens e = " + calc.format(a)+
                "\n A quantidade de mulher "+(int)quantM+
                        "\n A porcetagem de mulheres e = " + calc.format(z)+ 
                "\n Quantidade de idades acima de 18 = "+(int)quantIdade+
                "\n A Quantidade de pessoas que responderam NENHUMA  =  "+(int)quantNenhuma);
    


    }
    
//-------------- fim do metodo LISTAR ----------------------------------------------------    

      //------ metado para usar janelas ------------------        
    public static void ver(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    public static String pegar(String text) {
        return JOptionPane.showInputDialog(text);
    }

}
