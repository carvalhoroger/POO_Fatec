package ex_49;

import java.util.Scanner;

public class ex49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie um programa que solicite que o usuário entre com dois números (inicial e final). 
		 * Ao final o programa deverá apresentar o valor total da soma de todos os números do intervalo digitado pelo usuário
		 */
		
Scanner ler = new Scanner(System.in);
		
		int soma=0;
		
		System.out.printf("Insira o numero inicial: ");
		int ninicial = ler.nextInt();
		System.out.printf("Insira o numero final: ");
		int nfinal = ler.nextInt();
		while(nfinal <= ninicial) 
		{
			System.out.printf("O numero final deve ser maior que o inicial: ");
			nfinal = ler.nextInt();
		}
		for(int x = ninicial; x <= nfinal; x++) 
		{
			soma+=x;
		}
		System.out.printf("A soma da sequencia de numeros entre %d e %d e: %d", ninicial, nfinal, soma);
	
	}

}
