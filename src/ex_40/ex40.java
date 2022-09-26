package ex_40;

import java.util.Scanner;

public class ex40 {

	/*
	 *  Exibir os vinte primeiros valores da série de Bergamaschi. A série: 1, 1, 1, 3, 5, 9, 17, ...
	 */
	public static void main(String[] args) {
		int soma, a = 1, b = 1, c = 1;
		for(int i = 0; i < 20; i++) {
			int aux = 1;
			if(i < 3) {
				System.out.printf("\n%d",aux);
	
			}
			else {
				soma = a + b + c;
				System.out.printf("\n%d",(soma));
				c = b;
				b = a;
				a = soma;
			}
		}

	}
}
