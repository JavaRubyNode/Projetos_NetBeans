package condominio;

import javax.swing.JOptionPane;

public class Condominio {

    public static void main(String[] args) {
        int e, opc,andar,apartamento,idade = 0;   boolean encontrado = false;
                  int num=0;      int quat=0;   int sexo =0,num1=0;
 
Predio c = new Predio();    Morador t = new Morador();          
 
           

        
while (true) {
          
           
           e = (Integer.parseInt(Importar(" ---------- TELA INICIAL -------- \n "
                    + "\n 1 - Cadrastrar Predio "
                    + "\n 2 - Cadrastrar Morador "
                    + "\n 3 - Dados do Morador "
                    + "\n 4 - Sair \n "+
                   "\n Escolha uma das Opções")));

            switch (e) {

                case 1:

                     String nome = Importar(" Qual o nome do Predio ");
                    String endereco = Importar(" Qual o endereço do Predio ");

                    Predio a = new Predio(nome, endereco);
                    Imprimir(" Nome do Predio : " + a.getNome()
                            + "\n Endereço do Predio : " + a.getEndereco());

                    break;

                case 2:
           
                    
// declara o nome do morador
                    
                    String Nome = Importar(" Informe o nome do morador ");
                    
// declara a idade do morador
                    
                    idade = Integer.parseInt(Importar(" Qual idade do morador "));
                    
// declara o sexo do morador
                    
                    sexo = Integer.parseInt(Importar(" 1 - Sexo Masculino "
                            + "\n 2 - Sexo Feminino \n Escolha uma das opções "));
                    if (sexo > 2) {
                        Imprimir(" Valor informado inválido, digite novamente ");
                    }
// declara o telefone do morador
                    String telefone = Importar(" Informe o Telefone ");
                    
// declara o andar que onde reside o morador  
                    
                    andar = Integer.parseInt(Importar(" Informe o andar que -  " +  Nome
                             + "  mora."));
                    if (andar > 5) {
                        Imprimir(" Máximo de andares no Predio e 5 ");
                    }
                    
// declara o apartamento onde reside o morador 
                    
                    apartamento = Integer.parseInt(Importar(" Informe o apartamento que -  " + Nome
                            + "  mora."));
                   if (apartamento>10){
                       Imprimir(" Valor excedido o máximo e 10 ");
                   }
// composição para inicializar o cadrastro                    
                  
                   Morador m = new Morador(Nome, idade, sexo, andar,apartamento, telefone);

                    Morador temp = c.getAndares()[andar - 1].getApartamentos()[apartamento - 1].getMorador();
                    if (temp != null) {
                        JOptionPane.showMessageDialog(null, "Há alguém neste apartamento");
                    } else {
                        c.getAndares()[andar - 1].getApartamentos()[apartamento - 1].setMorador(m);
                        JOptionPane.showMessageDialog(null, "Morador cadastrado com sucesso.");
                    }

                    break;
                case 3:
                    
while(encontrado){
    
    opc = Integer.parseInt(Importar(" ----- Menu dos Dados ------- \n "+
                             "\n 1 - Para quantidade de moradores "+
                            "\n 2 - Quantidade de Homens e Mulheres "+
                            "\n 3 - Quantidade de Moradores por andar "+
                            "\n 4 - Porcentagem de Moradores "+
                            "\n 5 - Comparação de idades "+
                            "\n 6 - Retornar a Tela Inicial \n"+
                            "\n Escolha uma opção: "));
    switch(opc){
        
        case 1:
// fazer a contagem de moradores              
            
            int quantMoradores = 0;
                    for (int i = 0; i < c.getAndares().length; i++) {
                        for (int j = 0; j < c.getAndares()[i].getApartamentos().length; j++) {
                            Morador temp2 = c.getAndares()[i].getApartamentos()[j].getMorador();
                            if (temp2 != null) {
                                quantMoradores++;
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Quantidade de moradores: " + quantMoradores);
            break;
        
        case 2:
          
// concertar o contador !!!!1
           
            if(idade>30){
                quat = quat+1;
                
            }
            
           
                        Imprimir(" A quantidade de homens: "+quat+
                    "\n A quantidade de mulheres: "+num);
                       
                        break;
     
            
// contador de moradores por andar       
        
        case 3:
            
             for (int j = 0; j < c.getAndares()[j].getApartamentos().length; j++) {
            
                 num1++;
                 
             }
            break;
    
// porcentagem que moradores por andar         
        case 4:
            
            
            break;
  
// comparar idades menores que 30           
        case 5:
           
         
     for (int i=0;i<30;i++){
         
     }
   
        
             Imprimir(" a quantidade de idades acima de 30 = ");
            
          
           
            break;

// sair do Menu Dados            
        
        case 6:
            encontrado = true;
            break;
        
        
    }
    
}
                    break;
                case 4:
                    System.exit(0);
                    break;

            }

        }

    }

    public static void Imprimir(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    public static String Importar(String text) {
        return JOptionPane.showInputDialog(text);
    }
  
    
    
}
