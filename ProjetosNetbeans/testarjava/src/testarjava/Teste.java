package testarjava;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Teste {
	
	//private List lista = new ArrayList();
	
	public static void main(String[] args) {

		while(true){
			
			Integer es = Integer
					.parseInt(pegar(" ::::::::::::::::::: MENU ::::::::::::::::::::::::"
							+ "\n 1- Cadrastrar Produto "
							+ "\n 2- Listar Produto "
							+ "\n 3- Pesquisar Produto  "
							+ "\n 4 - Remover Produto" + "\n 5 - Sair"));
			
			switch (es) {
			case 1:
				//mostarLista(null);
				
				String nomeProduto = pegar("Informe o nome do Produto:");
				Double precoProduto = Double.parseDouble(pegar("Informe o pre�o do Produto:"));
				Integer quantidadeProduto = Integer.parseInt(pegar("Informe a quantidade do Produto:"));
				
				Produto produto = new Produto();
				//ou Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
				produto.setNome(nomeProduto);
				produto.setPreco(precoProduto);
				produto.setQuantidade(quantidadeProduto);
				
				Estoque estoque = new Estoque();
				estoque.mostarLista(produto);
				
				break;
			case 5:
				System.exit(0);
				break;

			}
		}
		

	}
	
	public static String pegar(String text) {
		return JOptionPane.showInputDialog(text);
	}
}