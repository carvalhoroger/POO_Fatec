package ex_42;

import java.util.Scanner;

public class ex42 {

	/*
	 * Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” será digitado, deverá ser positivo, 
	 * mas menor que cinqüenta. Caso o valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente.
	 */
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		float somSeq = 0, y = 1;
		
		do {
		System.out.printf("Informe o tamanho da sequencia (1 >= n < 50): ");
		n = ler.nextInt();
		}
		while(n < 1 || n > 49);
		
		for(int x = 0; x < n; x++) {
			somSeq += y/(y+1);
			y++;
		}
		
		System.out.printf("A soma dos primerios %d numeros da sequencia e: %.2f", n, somSeq);

	}
}
