package ex_50;

import java.util.Scanner;

public class ex50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Elabore um programa que apresente os números pares maiores que 10 no intervalo fechado [A, B]. 
		 * Sendo que A e B serão números inteiros escolhidos pelo usuário. Um número é par quando este satisfaz a seguinte condição: 
		 * (NÚMERO mod 2 = 0)
		 */
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Insira o numero inicial: ");
		int ninicial = ler.nextInt();
		System.out.printf("Insira o numero final: ");
		int nfinal = ler.nextInt();
		
		while(nfinal <= ninicial) 
		{
			System.out.printf("O numero final deve ser maior que o inicial: ");
			nfinal = ler.nextInt();
		}
		System.out.printf("Os numeros pares inteiros maiores que 10 entre %d e %d são:\n", ninicial, nfinal);
		for(int x = ninicial; x <= nfinal; x++) 
		{
			if(x > 10 && (x % 2) == 0) 
			{
			System.out.printf("%d\n", x);
			}
		}
		

	}

}
