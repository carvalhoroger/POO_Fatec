package ex_43;

import java.util.Scanner;

public class ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” será digitado, deverá ser positivo, 
		 * mas menor que cinqüenta. Caso o valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente.
		 */
		
		Scanner ler = new Scanner(System.in);
		int n;
		float somSeq = 0, p1 = 1;
		double dividido = 0;
		do {
		System.out.printf("Informe o tamanho da sequencia (1 >= n < 50): ");
		n = ler.nextInt();
		}
		while(n < 1 || n > 49);
		
		for(int x = 0; x < n; x++) {
			p1 +=2*x+1;
			somSeq += p1/Math.pow((x+1), 3);
		}
		
		System.out.printf("A soma dos primerios %d numeros da sequencia e: %.2f", n, somSeq);
	
	}

}
