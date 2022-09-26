package ex_36;

import java.util.Scanner;

public class ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Entrar via teclado com um valor (X) qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. 
		 * Solicitar o intervalo que o programa que deverá calcular a tabuada do valor digitado, sendo que o segundo valor (B), 
		 * deverá ser maior que o primeiro (A), caso contrário, digitar novamente somente o segundo. Após a validação dos dados, 
		 * exibir a tabuada do valor digitado, no intervalo decrescente, ou seja, a tabuada de X no intervalo de B para A.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int x, a, b;
		
		do {
			System.out.printf("Digite um numero positivo: ");
			x = ler.nextInt();
		}
		while(x <= 0);
		
		System.out.printf("Digite o primeiro valor do intervalo: ");
		a = ler.nextInt();
		
		do {
			System.out.printf("Digite o segundo valor do intervalo (deve ser maior que o primeiro valor): ");
			b = ler.nextInt();
		}
		while(b <= a);
		
		for(; b >= a; b--) {
			System.out.printf("\n%d X %d = %d", b, x, (b*x));
		}

	}

}
