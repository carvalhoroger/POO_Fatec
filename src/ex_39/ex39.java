package ex_39;

import java.util.Scanner;

public class ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Exibir os trinta primeiros valores da série de Fibonacci. A série: 1, 1, 2, 3, 5, 8, ...
		 */
		
		int soma = 0, n1 = 1, n2 = 0;
		System.out.printf("SequÃªncia de Finonacci (Os 30 primeiros valores).\n ");
		for(int x = 0; x < 30; x++) {
			soma = n1 + n2;
			
			System.out.printf("\n%d", n1);
			n2 = n1;
			n1 = soma;

	}
	}

}
