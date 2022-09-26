package ex_52;

import java.util.Scanner;

public class ex52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que utilize essa classe para cadastrar 10 produtos 
		 * em uma lista de produtos. Ao final exibir apenas os produtos cujo valor é menor do que 100 reais.
		 */
		
		Scanner ler = new Scanner(System.in);
		Produto52[] listaProdutos = new Produto52[10];
		
		for(int i = 0; i < 10; i++) {
			listaProdutos[i] = new Produto52();
			listaProdutos[i].id = i+1;
			
			System.out.println("Digite a descricao do produto: ");
			listaProdutos[i].descricao = ler.next();
			
			System.out.println("Digite o valor do produto: ");
			listaProdutos[i].valor = ler.nextDouble();
			
			System.out.println("Digite a quantidade do produto: ");
			listaProdutos[i].quantidade = ler.nextDouble();
			
			System.out.printf("\n\n");
		}
		
		System.out.printf("Listando produtos com valor menor que R$ 100,00:\n");
		
		for(int i = 0; i < 10; i++)
			if(listaProdutos[i].valor < 100)
				System.out.printf("ID: %d\nDescricao: %s\nPreco: R$%.2f\nQuantidade: %.2f\n\n",
					listaProdutos[i].id, listaProdutos[i].descricao,
					listaProdutos[i].valor, listaProdutos[i].quantidade
				);
		
		
	}

}
