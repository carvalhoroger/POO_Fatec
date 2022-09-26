package ex_51;

import java.util.Scanner;

public class ex51 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que utilize essa classe para cadastrar 5 clientes 
		 * em uma lista de clientes (array). Ao final exibir apenas os clientes que têm idade superior a 18 anos.
		 */
		
		Scanner ler = new Scanner(System.in);
		Cliente51[] listaClientes = new Cliente51[5];
		
		
		for(int i = 0; i < 5; i++) {
			listaClientes[i] = new Cliente51();			
			listaClientes[i].id = i+1;
			
			System.out.println("Digite o nome do cliente: ");
			listaClientes[i].nome = ler.next();
						
			System.out.println("Digite a idade do cliente: ");
			listaClientes[i].idade = ler.nextInt();
			
			System.out.println("Digite o email do cliente: ");
			listaClientes[i].email = ler.next();
		}
		
		System.out.println("Exibindo todos os clientes com mais de 18 anos: ");
		
		for(int i = 0; i < 5; i++)
			if(listaClientes[i].idade > 18)
				System.out.printf("ID: %d\nNome: %s\nIdade: %d\nE-mail: %s\n\n",
						listaClientes[i].id, listaClientes[i].nome,
						listaClientes[i].idade, listaClientes[i].email
				);
	}

}
