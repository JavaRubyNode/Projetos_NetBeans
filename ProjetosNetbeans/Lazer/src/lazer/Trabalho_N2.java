package trabalho_n2;

import javax.swing.JOptionPane;

/**
 *
 * @author Leo-PC
 */
public class Trabalho_N2 {

    public static void opcoes(Morador morador[][]) {
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada! \n"
                + " \n"
                + "1 - Cadastrar morador \n"
                + "2 - Excluir morador \n"
                + "3 - Pesquisar morador por nome \n"
                + "4 - Mostrar mais informações \n"
                + " \n"));
        if ((escolha < 5) && (escolha > 0)) {
            direcionar_acao(escolha, morador);
        } else {
            JOptionPane.showMessageDialog(null, "Opção invalida!");
            opcoes(morador);
        }

    }

    public static void pesquisar(Morador[][] morador) {
        boolean teste = false;
        String nome = JOptionPane.showInputDialog("Informe o nome do morador");
        for (int i = 0; i < morador.length; i++) {
            for (int j = 0; j < morador[i].length; j++) {
                if (morador[i][j] != null) {
                    if (morador[i][j].getNome().equals(nome)) {
                        JOptionPane.showMessageDialog(null, "O morador mora no apartamento " + (j + 1) + " no andar " + (i + 1));
                        teste = true;
                        break;
                    }
                }
            }
            if (teste == true) {
                break;
            }
        }
        if (teste == false) {
            JOptionPane.showMessageDialog(null, "O morador não foi encontrado!");
        }
        opcoes(morador);
    }

    public static void excluir(Morador morador[][]) {
        int val1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o andar:  ")) - 1;
        int val2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o apartamento:  ")) - 1;
        morador[val1][val2] = null;
        JOptionPane.showMessageDialog(null, "O morador  foi Excluído!");
        opcoes(morador);

    }

    public static void cadastrar(Morador morador[][]) {
        String nome = JOptionPane.showInputDialog("Informe o nome do morador:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do morador:"));
        String sexo = JOptionPane.showInputDialog("Informe o sexo do morador:");
        int apartamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o apartamento:")) - 1;
        int andar = Integer.parseInt(JOptionPane.showInputDialog("Informe o andar:")) - 1;

        boolean verifica1 = false;
        boolean verifica2 = false;

        if (apartamento <= 10) {
            verifica1 = true;
        } else {
            JOptionPane.showMessageDialog(null, "O numero maximo de apartamento por andar e 10!, informe valores menores ou igual a 10");
        }
        if (andar <= 5) {
            verifica2 = true;
        } else {
            JOptionPane.showMessageDialog(null, "O numero maximo de andares e 5!, informe valores menores ou igual a 5");
        }
        if ((verifica2 == true) && (verifica1 == true)) {
            if (morador[andar][apartamento] == null) {
                morador[andar][apartamento] = new Morador(nome, idade, sexo);
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Já há moradores nesse apartamento");
            }
        }
        opcoes(morador);
    }

    public static void direcionar_acao(int resposta, Morador[][] morador) {
        switch (resposta) {
            case 1: {
                cadastrar(morador);
            }
            case 2: {
                excluir(morador);
            }
            case 3: {
                pesquisar(morador);
            }
            case 4: {
                Double quantidadevazios = 0.0;
                Double contador2 =  0.0;
                Double contador4 = 10.0;
                Double mulheres =  0.0;
                int menor =  0;
                int maior =  0;
                Double maior30 =  0.0;
                Double porcentagem =  0.0;
                int i =  0;
                int j =  0;
               int contagem = 0;
                for (i = 0; i < 5; i++) {
                    contagem = 0;
                    for (j = 0; j < 10; j++) {
                        if (morador[i][j] == null) {
                            quantidadevazios++;
                        } else {
                            if (morador[i][j].getIdade() > 30) {
                                maior30++;
                            }
                            if ("Feminino".equals(morador[i][j].getSexo())) {
                                mulheres++;
                            }
                            porcentagem++;
                            contagem++;
                        }
                        if (contagem > contador2) {
                            maior = i;
                        }
                        if (contagem < contador4) {
                            menor = i;
                        }
                        }
                }
                JOptionPane.showMessageDialog(null, "Existe " + quantidadevazios + " apartamentos vazios \n"
                        + "O andar " + (maior) + " e o que mais tem moradores e o " + (menor) + " e o que tem menos \n"
                        + "Existe " + maior30 + " pessoas com mais de 30 anos \n"
                        + "São " + ((porcentagem / 100) * (porcentagem + quantidadevazios)) + "% ocupandos do predio \n"
                        + "A quantidade de mulheres e de  " + mulheres + "\n"
                        + "A média de moradores por andar e de " + (porcentagem / 5) + "\n");
                opcoes(morador);
            }
        }
    }

    public static void main(String[] args) {
        Morador morador[][] = new Morador[5][10];
        opcoes(morador);
    }
}
