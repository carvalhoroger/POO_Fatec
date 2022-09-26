package ex_21;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Entrar via teclado com dois valores quaisquer. Após a digitação, exibir um seletor de opções (“menu”) com as seguintes opções: 
		 (Fazer esse exercício utilizando If..Else e/ou Case)

		1 – Multiplicação
		2 – Adição
		3 – Divisão
		4 – Subtração
		5 – Fim de processo (sair do programa)

		Solicitar uma opção por parte do usuário, verificar se é ou não uma opção válida (letras ou números) e processar a respectiva operação. 
		Enviar mensagem de erro se a opção escolhida não existir no seletor.
		Encerrar o programa somente quando o usuário escolher a opção de finalização. 
		Repare que a opção de número três é de divisão e o programa deverá enviar mensagem de erro, (somente nesta opção) se o denominador for zero.

		 */

			Scanner ler = new Scanner(System.in);
			int opc;
			double a,b,op;
			
			do {
				System.out.printf("Digite um valor qualquer: ");
				a = ler.nextDouble();
				
				System.out.printf("Digite um valor qualquer: ");
				b = ler.nextDouble();
				
				System.out.printf("## Menu de Opcões ##");
				System.out.printf("\nOpcão 1 - Multiplicacao.");
				System.out.printf("\nOpcão 2 - Adicao.");
				System.out.printf("\nOpcão 3 - Divisao.");
				System.out.printf("\nOpcão 4 - Subtracao.");
				System.out.printf("\nOpcão 5 - Finalizar processo.");
				System.out.printf("\nDigite a opcao desejada: ");
				opc = ler.nextInt();
				
				switch(opc) {
					case 1:					
						op = a * b;
						System.out.printf("\nMultiplicação entre: %.2f e %.2f =  %.2f.\n", a, b, op);
						break;
						
					case 2:					
						op = a + b;
						System.out.printf("\nAdição entre: %.2f e %.2f = %.2f.\n",a, b, op);
						break;
						
					case 3: 					
						if(b==0) {
							System.out.printf("\nDigite um denominador diferente de 0. (Inválido) \n");
							break;
						}
						else {
						op = a/b;
						System.out.printf("\nO resultado da divisão entre: %.2f e %.2f resulta em: %.2f.\n", a, b, op);
						break;}
						
					case 4:
						
						op = a - b;
						System.out.printf("\nO resultado da subtracao entre: %.2f e %.2f resulta em: %.2f.\n", a, b, op);
						break;
						
					case 5:	
						System.out.printf("\nPrograma Finalizado.\n");
						System.exit(0);					
						break;
						
					default:
						System.out.printf("\nOpção inválida. Escolha novamente.\n");
				}
				
			}while(opc!=5);

		}

	}


