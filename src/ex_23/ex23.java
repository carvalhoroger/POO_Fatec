package ex_23;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.
		 */
		
		Scanner ler = new Scanner(System.in);

		double a, b, c,soma;
				
				System.out.printf("Digite o valor de A: ");
				a = ler.nextDouble();
				
				System.out.printf("Digite o valor de B: ");
				b = ler.nextDouble();
				
				System.out.printf("Digite o valor de C: ");
				c = ler.nextDouble();
				
				soma = a + b;
				
				if(c < soma)
					System.out.printf("A soma de A + B é igual a %.2f e é MAIOR que C= %.2f. ",soma, c);
				else
					System.out.printf("A soma de A + B é igual a %.2f e é MENOR que C= %.2f. ",soma, c);
	}

}
