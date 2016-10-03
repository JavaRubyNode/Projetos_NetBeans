
package cadrastro;

import javax.swing.JOptionPane;

public class Cadrastro extends dadosClientes {

    public static void main(String[] args) {

        int k;

        k = Integer.parseInt(JOptionPane.showInputDialog(" Informe quantos clientes quer cadrastrar !!!! "));
        Cadrastro cliente[] = new Cadrastro[k];

        while ((k > 10)) {

            JOptionPane.showMessageDialog(null, " Valor inválido digite novamente, "
                    + "\n o máximo permitido e 10 clientes !!!! ");
            k = Integer.parseInt(JOptionPane.showInputDialog(" Informe quantos clientes quer cadrastrar !!!! "));
        }

        while (true) {
            int opc = Integer.parseInt(JOptionPane.showInputDialog(" ----Cadrastro de Clientes---- \n "
                    + " \n Escolha uma opção abaixo : \n "
                    + " \n 1- Cadrastrar Clientes \n"
                    + " \n 2- Lista de Clientes Cadrastrados \n "
                    + " \n 3- Quantidade de Clientes Cadrastrados \n"
                    + " \n 4- Alterar Dados Clientes Cadrastrados  \n "
                    + " \n 5- Pesquisar Clintes Cadrastrados \n "
                    + " \n 6- Excluir Cliente Cadrastrado \n "
                    + " \n 7- Sair "));
if (opc > 7){
   JOptionPane.showMessageDialog(null," Valor inválido digite novamente, "+
           " \n o numero de opções vai até 7  !!!!"); 
}
            
switch (opc) {
                
// caso 1 para fazer o cadrastro de clientes 
                              
                case 1:

                    for (int i = 0; i < cliente.length; i++) {
                        k=i;
                        cliente[k] = new Cadrastro();

                        cliente[k].setNome(JOptionPane.showInputDialog(" Nome do cliente "));
                        cliente[k].setSobrenome(JOptionPane.showInputDialog(" Sobrenome do cliente "));
                        cliente[k].setCpf(Float.parseFloat(JOptionPane.showInputDialog(" CPF do cliente ")));
                        cliente[k].setRg(Float.parseFloat(JOptionPane.showInputDialog(" RG do cliente ")));

                    }

                    String ok = "";
                    for (int i = 0; i < cliente.length; i++) {
                        k = i;

                        ok = ok + "\n Nome: " + cliente[k].getNome()
                                + "\n Sobrenome: " + cliente[k].getSobrenome()
                                + "\n CPF : " + cliente[k].getCpf()
                                + "\n RG: " + cliente[k].getRg()+"\n";
                        JOptionPane.showMessageDialog(null, ok);
                    }
                    break;


                    
// caso 2 para listar cadrasto de clientes
                
                case 2:
                    for (int i = 0; i < cliente.length; i++) {
                        k = i;
                        if (cliente[k] != null) {
                            JOptionPane.showMessageDialog(null, "  Nome do Cliente: " + cliente[k].getNome());
                        }
                    }
                    break;

                
// caso 3 para contar quantidade de clientes cadrastados
                
                case 3:
                    JOptionPane.showMessageDialog(null, "  A quantidade de Clientes cadrastrados é : "
                            + Quantidade(cliente));
                    break;

                case 4:
                    
// caso 4 para editar os dados do clientes 
                    
                    JOptionPane.showInputDialog(" Informe o Cpf do cliente para fazer a busca ");
                    int pos = -1;
                    for (int i = 0; i < cliente.length; i++) {
                        if (cliente[i].getCpf() == cliente[i].getCpf()) {
                            pos = i;
                            break;
                        }
                    }
                    if (pos > -1) {
                        JOptionPane.showMessageDialog(null, " Novo Cliente ");
                        String novo = JOptionPane.showInputDialog(" Digite o nome do Cliente ");
                        cliente[pos].setNome(novo);
                        JOptionPane.showMessageDialog(null, " Alteração feita com sucesso !!! ");
                    }

// caso 5 para fazer pesquisa de clientes        
                
                case 5:
                    String pesq = JOptionPane.showInputDialog(" Informe o nome do cliente ");
                    boolean encontrado = false;
                    for (int i = 0; i < cliente.length; i++) {
                        k = i;
                        if (cliente[k] != null) {
                            if (cliente[k].getNome().equals(pesq)) {
                                encontrado = true;
                                String res = "\n Digite o nome do cliente para pesquisar "
                                        + cliente[k].getNome();
                                JOptionPane.showMessageDialog(null, res);

                            }
                        }
                    }
                    if (encontrado == false) {
                        JOptionPane.showMessageDialog(null, " Cliente não cadrastrado");
                    }

                    break;
                
// caso 6 para excluir cliente cadrastrado             
                
                case 6:
           String excluido = JOptionPane.showInputDialog(" Excluir Cliente, "+"\n Informe o nome do cliente ");
                Cadrastro[] zerar = new Cadrastro[k];  
                    Cadrastro anular =null;
                     int x = 0;
                    for (int i=0;i<cliente.length;i++){
                      k=i;
                        if(!cliente[i].getNome().equalsIgnoreCase(excluido)){
                            zerar[x]= cliente[k];
                            
                        }else{
                            anular = cliente[i];
                        }
                        
                    }
                    if (anular != null){
                        cliente = zerar;
                        JOptionPane.showMessageDialog(null, "Cliente excluído: "+anular.getNome());
                        
                    }else {
                        JOptionPane.showMessageDialog(null, "Nenhum cliente foi excluído"+ 
                                "\n Verifique se o nome foi digitado corretamente.");
                    }
                    
                    break;

// caso 7 para sair so sistema              
                
                case 7:
                    System.exit(0);
                    break;

            }
        }

    }

    public static int Quantidade(Cadrastro cliente[]) {
        int quant = 0;

        for (int i = 0; i < cliente.length; i++) {

            if (cliente[i] != null) {
                quant++;
            }
        }

        return quant;
    }
}
