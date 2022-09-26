package ex_41;

import java.util.Scanner;

public class ex41 {
	/*
	 * Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” será digitado, deverá ser positivo, mas menor que cem. 
	 * Caso o valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente.
		A seqüência: 2, 5, 10, 17, 26, ....
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int soma = 0, ln = 2, n = 0, seq = 0;
		do {
			System.out.println("\nDigite a quantidade de vezes que a sequencia vai se desenrolar atÃ© a soma (0 > N < 100): ");
			n = ler.nextInt();
			
		}
		while(n >= 100 || n < 1);
		for(int x = 0; x < n; x++) {
				seq += ln;
				soma+= seq;
				ln = 3 + 2 * x;
		}
		System.out.printf("\nA soma dos %d primeiros numeros da sequencia Ã©: %d", n, soma);
}
}
