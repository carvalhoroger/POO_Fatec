
package ex_54;

import java.util.Scanner;

public class ex54 {

		/*
		 * Crie as classes conforme o Diagrama de Classe (UML) abaixo. 
		 * Crie um programa que utilize essas classes para cadastrar 5 clientes em uma lista de clientes 
		 * e pergunte para cada cliente se ele tem ou não conta bancária. Caso o cliente tenha, permita ele cadastrar os dados da conta bancária. 
		 * Ao final exibir todos os clientes e suas respectivas contas bancárias, se houver.
		 */
		
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			Cliente54[] listaClientes = new Cliente54[5];
			String r;
			
			//## Cadastro de clientes: ##
			
			for(int i = 0; i < 5; i++) {
				listaClientes[i] = new Cliente54();
				
				listaClientes[i].id = i;
				
				System.out.printf("Informe o nome do cliente: ");
				listaClientes[i].nome = ler.next();			
				
				System.out.printf("Informe a idade do cliente: ");
				listaClientes[i].idade = ler.nextInt();
				
				System.out.printf("Informe o email do cliente: ");
				listaClientes[i].email = ler.next();
				
				System.out.printf("O cliente possui conta bancaria? (S/N)");
				r = ler.next();
				
				if(r.equalsIgnoreCase("s")){
					ContaBanco54 conta = new ContaBanco54();
					
					System.out.printf("Digite a agencia: ");
					conta.agencia = ler.next();
					
					System.out.printf("Digite o numero da conta: ");
					conta.numero = ler.next();
					
					System.out.printf("Digite o saldo da conta: ");
					conta.saldo = ler.nextDouble();
					
					listaClientes[i].conta = conta;
				}
				System.out.printf("\n");
			}
			
			
			System.out.println("Exibindo dados dos clientes cadastrados:");
			
			for(int i = 0; i < 5; i++) {
				System.out.println("================================");
				System.out.println(listaClientes[i].exibirNomeIdade());
				
				if(listaClientes[i].conta != null)
					System.out.println(listaClientes[i].exibirDadosConta());
			}
	}

}