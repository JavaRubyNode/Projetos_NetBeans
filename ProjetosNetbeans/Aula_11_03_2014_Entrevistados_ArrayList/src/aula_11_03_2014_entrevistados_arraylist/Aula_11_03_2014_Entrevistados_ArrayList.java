package aula_11_03_2014_entrevistados_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula_11_03_2014_Entrevistados_ArrayList {
    public static void main(String[] args) {
        final int QUANT_ENTREVISTADOS = 3; // constante que permite definir a quantidade de entrevistados
        
        ArrayList<Entrevistado> entrevistados = new ArrayList(); // guarda os entrevistados
        Scanner entrada = new Scanner(System.in); // faz a leitura dos dados
        
        // faz a leitura dos dados
        for(int i = 0; i < QUANT_ENTREVISTADOS; i++){
            System.out.println("Dados do " + (i + 1) + "º entrevistado:");
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Idade: ");
            int idade = Integer.parseInt(entrada.nextLine());
            System.out.print("Sexo: ");
            
            // ATENÇÃO COM ISSO AQUI
            // nextLine() retorna uma String e nós queremos um char. Assim usamos o método
            // charAt() da classe String para retornar o caractere no primeiro índice
            char sexo = entrada.nextLine().charAt(0);
            
            System.out.print("Rádio favorita: ");
            String radio = entrada.nextLine();
            
            // usamos o construtor cheio para criar uma nova instância da classe Entrevistado
            Entrevistado e = new Entrevistado(nome, idade, sexo, radio);
            
            // agora adicionamos o entrevistado na ArrayList
            entrevistados.add(e);
            
            // uma quebra de linha para deixar o programa mais organizado
            System.out.println();
        }
        
        // outro laço...agora para mostrar os dados lidos
        System.out.println("Dados dos entrevistados: ");
        for(int i = 0; i < entrevistados.size(); i++){
            Entrevistado temp = entrevistados.get(i);
            System.out.println("Nome: " + temp.getNome());
            System.out.println("Idade: " + temp.getIdade());
            System.out.println("Sexo: " + temp.getSexo());
            System.out.println("Rádio Favorita: " + temp.getRadioFavorita() + "\n");
        }
        
        // cálculos
        int quantMulheres = 0;
        double porcentagemHomens = 0.0;
        int quantPessoasIgualMaior18 = 0;
        int quantResponderamNenhuma = 0;
        
        // varre todos os entrevistados
        for(int i = 0; i < entrevistados.size(); i++){
            // obtém o entrevistado atual
            Entrevistado temp = entrevistados.get(i);
            
            // é do sexo feminino? Notem que não preciso calcular a quantidade de homens
            // basta subtrair a quantidade de mulheres do total
            if(temp.getSexo() == 'F'){
                quantMulheres++;
            }
            
            // a idade é maior ou igual a 18?
            if(temp.getIdade() >= 18){
                quantPessoasIgualMaior18++;
            }
            
            // respondeu "Nenhuma"?
            if(temp.getRadioFavorita().equalsIgnoreCase("NENHUMA")){ // nenhuma, Nenhuma, NENHUMA
                quantResponderamNenhuma++;
            }
        }
        
        // mostra as estatísticas
        
        // um truque aqui: divisão por inteiros dá zero....é preciso converter um dos valores para double
        porcentagemHomens = ( (QUANT_ENTREVISTADOS - quantMulheres) / (double)QUANT_ENTREVISTADOS ) * 100;
        
        System.out.println("Quantidade de mulheres: " + quantMulheres);
        System.out.println("Porcentagem de homens: " + porcentagemHomens);
        System.out.println("Quantidade de pessoas com idade igual ou maior que 18: " + quantPessoasIgualMaior18);
        System.out.println("Quantidade de pessoas que responderam Nenhuma: " + quantResponderamNenhuma);
    }
}
