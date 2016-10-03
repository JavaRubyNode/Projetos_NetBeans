/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testando;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Testando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente clientes[] = new Cliente[1];
        while (true) {
            String indice = "Escolha Opções: \n"
                    + "1) Cadastar Cliente.\n" // ja fiz issoa qui
                    + "2) Pesquisar Cliente.\n" // e esse aqui
                    + "3) Listar Cliente.\n" // ja fiz
                    + "4) Excluir Cliente.\n"// ja fiz
                    + "5) Alterar Cliente.\n" // falta esse aqui
                    + "6) Sair.\n"; // e esse aqui

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(indice));

            switch (opcao) {
                case 1:

                    for (int i = 0; i < clientes.length; i++) {
                        clientes[i] = new Cliente();
                        clientes[i].setNome(JOptionPane.showInputDialog("Nome: "));
                        clientes[i].setSobrenome(JOptionPane.showInputDialog("Sobrenome:"));
                        clientes[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade:")));
                        clientes[i].setCpf(JOptionPane.showInputDialog("CPF:"));
                        clientes[i].setSexo(JOptionPane.showInputDialog("Sexo:"));
                        clientes[i].setTelefone(JOptionPane.showInputDialog("Telefone:"));
                    }
                    String feito = "";
                    for (int i = 0; i < clientes.length; i++) {
                        feito = feito + "\nNome: " + clientes[i].getNome()
                                + "\nSobrenome: " + clientes[i].getSobrenome()
                                + "\nIdade: " + clientes[i].getIdade()
                                + "\nCPF: " + clientes[i].getCpf()
                                + "\nSexo: " + clientes[i].getSexo();

                    }
                    JOptionPane.showMessageDialog(null, feito);
                    break;

                case 2:
                    String nomeClientePesquisar = JOptionPane.showInputDialog("Consultar clientes:");
                    boolean encontrado = false;
                    for (int i = 0; i < clientes.length; i++) {
                        if (clientes[i] != null) {
                            if (clientes[i].getNome().equals(nomeClientePesquisar)) {
                                encontrado = true;
                                String res = "\nNome: " + clientes[i].getNome()
                                        + "\nSobrenome: " + clientes[i].getSobrenome()
                                        + "\nIdade: " + clientes[i].getIdade()
                                        + "\nCPF: " + clientes[i].getCpf()
                                        + "\nSexo: " + clientes[i].getSexo();
                                JOptionPane.showMessageDialog(null, res);
                                break;
                            }
                        }
                    }

                    if (encontrado == false) {
                        JOptionPane.showMessageDialog(null, "Cliente nao encontrado:");

                    }
                    break;
                case 3:

                    String strListaClientes = "..:: Lista de Clientes ::..\n\n";

                    for (int i = 0; i < clientes.length; i++) {
                        if (clientes[i] != null) {
                            strListaClientes += "Cliente --------- " + (i + 1)
                                    + "\nNome: " + clientes[i].getNome()
                                    + "\nSobrenome: " + clientes[i].getSobrenome()
                                    + "\nIdade: " + clientes[i].getIdade()
                                    + "\nCPF: " + clientes[i].getCpf()
                                    + "\nSexo: " + clientes[i].getSexo() + "\n";
                        }
                    }

                    JOptionPane.showMessageDialog(null, strListaClientes);

                    break;

                case 4:
                    String nomeClienteExclusao = JOptionPane.showInputDialog("Excluir Cliente de Nome: ");
                    Cliente[] clienteAux = new Cliente[2];
                    Cliente clienteExcluido = null;
                    int index = 0;
                    for (int i = 0; i < clientes.length; i++) {
                        if (!clientes[i].getNome().equalsIgnoreCase(nomeClienteExclusao)) {
                            clienteAux[index++] = clientes[i];
                        } else {
                            clienteExcluido = clientes[i];
                        }
                    }
                    if (clienteExcluido != null) {
                        clientes = clienteAux;
                        JOptionPane.showMessageDialog(null, "Cliente excluído: " + clienteExcluido.getNome() + "\n"
                                + "CPF: " + clienteExcluido.getCpf());
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhum cliente foi excluído. Verifique se o nome foi digitado corretamente.");
                    }
                    break;


                case 6:
                    String nome = "\nLoudemberg Systemas";
                    String Telefone = "\nContato 62-9363-7142";
                    JOptionPane.showMessageDialog(null, "" + nome + "" + Telefone);
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
                    break;
            }
        }
    }
}
